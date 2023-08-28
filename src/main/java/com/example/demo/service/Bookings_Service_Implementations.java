package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Hotel;
import com.example.demo.entity.HotelBookings;
import com.example.demo.persistence.Bookings_JPA_Repositary;


@Service
public class Bookings_Service_Implementations implements Bookings_Service_Declarations {
	
	Bookings_JPA_Repositary bj;
	

	public Bookings_Service_Implementations(Bookings_JPA_Repositary bj) {
		
		this.bj = bj;
	}


	@Override
	@Transactional
	public List<HotelBookings> displayAll() {
		// TODO Auto-generated method stub
		return bj.findAll();
	}

	
	@Transactional
	public  String saveBooking(HotelBookings hotelbokings) {
         bj.save(hotelbokings);
         return "bookeed";
	}
	
	@Transactional
	public List<HotelBookings> getBookingsUid(int uid) {
		
		return bj.getbyuserid(uid);
 	}
	
	@Transactional
	public void saveHotelBooking(HotelBookings hotelbookings) {
          bj.save(hotelbookings);
	}

	

}
