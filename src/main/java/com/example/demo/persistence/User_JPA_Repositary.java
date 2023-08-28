package com.example.demo.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.example.demo.entity.User;


@Repository
public interface User_JPA_Repositary extends JpaRepository<User, Integer> {
	
	
	@Query(value="select * from User u where u.uemail=:uemail and u.upwd=:upwd",nativeQuery=true)
	public User validation(@Param("uemail") String uemail,@Param("upwd") String upwd);

}
