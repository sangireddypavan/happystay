package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.User;

public interface User_Service_Declarations {
	public List<User> displayAll();
	public void saveUser(User user);

}
