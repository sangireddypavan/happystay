package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.persistence.User_JPA_Repositary;

@Service
public class User_Service_Implementations implements User_Service_Declarations {
	
	User_JPA_Repositary ur;

	@Autowired
	public User_Service_Implementations(User_JPA_Repositary ur) {
		
		this.ur = ur;
	}

	@Override
	@Transactional
	public List<User> displayAll() {
		// TODO Auto-generated method stub
		return ur.findAll();
	}

	@Override
	@Transactional
	public void saveUser(User user) {
		ur.save(user);
		
	}
	@Transactional
	public User validate(String uemail,String upwd) {
		
		return ur.validation(uemail, upwd);
	}
	
	
	
	
	
	
	

}
