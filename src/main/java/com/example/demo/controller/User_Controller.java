package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.User;
import com.example.demo.service.User_Service_Implementations;

@RestController
@RequestMapping("/users")
public class User_Controller {
	
	private User_Service_Implementations usr;

	public User_Controller(User_Service_Implementations usr) {
		
		this.usr = usr;
	}
	@GetMapping("/details")
	public List<User> showAll(){
		return usr.displayAll();
	}
	
	
	@PostMapping("/details")
	public void addUser(@RequestBody User user) {
		user.setUid(0);
		usr.saveUser(user);

	}
	@GetMapping("/validations/{uemail}/{upwd}")
	public User validation(String uemail,String upwd) {
		if(usr.validate(uemail, upwd)!=null) {
			return (User) usr.validate(uemail, upwd);
		}
		else {
			return null;
		}
		
		
		
		
	}
	

}
