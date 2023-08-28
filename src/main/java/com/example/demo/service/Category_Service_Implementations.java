package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.HotelCategory;
import com.example.demo.persistence.Category_JPA_Repositary;


@Service
public class Category_Service_Implementations implements Category_Service_Declarations {

	Category_JPA_Repositary cr;
	
	
	@Autowired
	public Category_Service_Implementations(Category_JPA_Repositary cr) {
		this.cr=cr;
	}
	
	@Override
	@Transactional
	public List<HotelCategory> displayAll() {
		// TODO Auto-generated method stub
		return cr.findAll();
	}
	@Transactional
	public HotelCategory getCategory(int hcid) {
		HotelCategory hc=cr.findById(hcid).get();
		return hc;
	}

}
