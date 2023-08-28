package com.example.demo.service;

import java.util.List;



import com.example.demo.entity.Hotel;



public interface Hotel_Service_Declarations {
	public List<Hotel> displayAll();
	public void saveHotel(Hotel hotel);
	public void delete(int  hid);
	public Hotel fetchById(int hid);
	
	

}
