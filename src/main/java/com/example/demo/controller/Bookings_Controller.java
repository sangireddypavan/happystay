package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.HotelBookings;
import com.example.demo.service.Bookings_Service_Implementations;

@RestController
@RequestMapping("/bookings")
public class Bookings_Controller {
	
	Bookings_Service_Implementations bsi;

	@Autowired
	public Bookings_Controller(Bookings_Service_Implementations bsi) {
		
		this.bsi = bsi;
	}
	
	@GetMapping("/details")
	public List<HotelBookings> showAll(){
		return bsi.displayAll();
	}
	
	@PostMapping("/roombooking")
	public String addBooking(@RequestBody HotelBookings hotelbookings) {
		hotelbookings.setBid(0);
		return bsi.saveBooking(hotelbookings);

	}
	
	@GetMapping("/bookedroom/{uid}")
	public List<HotelBookings> getBookingsByUid(@PathVariable int uid){
		return bsi.getBookingsUid( uid);
		
	}
	
	
	@PostMapping("/details")
	public void addHotelBooking(@RequestBody HotelBookings hotelbookings) {
		hotelbookings.setBid(0);
		bsi.saveHotelBooking(hotelbookings);

	}
	
	
}
