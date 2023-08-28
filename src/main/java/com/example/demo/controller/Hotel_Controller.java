package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Hotel;

import com.example.demo.service.Hotel_Service_Implementations;


@RestController
@RequestMapping("/hotel")
public class Hotel_Controller {
	
		private Hotel_Service_Implementations hsi;

		@Autowired
		public Hotel_Controller(Hotel_Service_Implementations hsi) {
			
			this.hsi = hsi;
		}
		
		@GetMapping("/details")
		public List<Hotel> fetchAll(){
		   return hsi.displayAll();
		}
		
		@GetMapping("/searchbyid/{hid}")
		public Hotel receiveById(@PathVariable int hid) {
			
			Hotel p=hsi.fetchById(hid);
			if(p==null)
				throw new RuntimeException("product not found with given id : "+hid+" ");
			return p;
		}
		
		
		
		@PutMapping("/details")
		public void updateHotel(@RequestBody Hotel hotel)
		{
			hsi.saveHotel(hotel);
		}
		
		
		
		@DeleteMapping("/delete/{hid}")
		public void deleteHotel(@PathVariable int hid)
		{
			//Hotel h=hsi.fetchById(hid);
//			if(h==null)
//				throw new RuntimeException("product not found with given id : "+hid+" ");
			
			hsi.delete(hid);
			//return h;
			
		}
		
		
		@PostMapping("/details")
		public void addHotel(@RequestBody Hotel hotel) {
			hotel.setHid(0);
			hsi.saveHotel(hotel);

		}
		
		@GetMapping("/searchbyname/{hname}")
		public List<Hotel> searchByName(@PathVariable String hname) {
			return hsi.searchByName(hname);
		}
		@GetMapping("/searchbycategory/{hcid}")
		public List<Hotel> uniqueCategoryHotel(@PathVariable int hcid){
		   return hsi.ucHotel(hcid);
		}
		

	
}
