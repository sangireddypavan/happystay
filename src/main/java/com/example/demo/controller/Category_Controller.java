package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Hotel;
import com.example.demo.entity.HotelCategory;
import com.example.demo.service.Category_Service_Implementations;

@RestController
@RequestMapping("/categories")
public class Category_Controller {
	
	 Category_Service_Implementations ci;
	 
	 private  Hotel hotel;
	 
	 @Autowired
	 public Category_Controller(Category_Service_Implementations ci) {
		 this.ci=ci;
	 }
	 
	 
	 @GetMapping("/details")
	 public List<HotelCategory> showAll(){
		 return ci.displayAll();
	 }
	 @GetMapping("/details/{hcid}")
	 public HotelCategory   getCategory(@PathVariable int hcid) {
		 HotelCategory hc=ci.getCategory(hcid);
		 if(hc==null)
				throw new RuntimeException("product not found with given id : "+hcid+" ");
		 return hc;
	 }
	 
	 public List<Hotel> uniqueCategoryHotel(){
		 
		 
		 return null;
	 }
	 

}
