package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Hotel;

import com.example.demo.persistence.Hotel_JPA_Repositary;


@Service
public class Hotel_Service_Implementations implements Hotel_Service_Declarations {
	
	@Autowired
	private Hotel_JPA_Repositary hp;
	public Hotel_Service_Implementations(Hotel_JPA_Repositary hp) {
		this.hp=hp;
	}

	@Override
	@Transactional
	public List<Hotel> displayAll() {
		
		return  hp.findAll();
	}

	@Override
	@Transactional
	public void saveHotel(Hotel hotel) {
          hp.save(hotel);
	}

	@Override
	@Transactional
	public void delete(int hid) {
		hp.deleteById(hid);
	}

	@Override
	@Transactional
	public Hotel fetchById(int hid) {
		Hotel h=hp.findById(hid).get();
		return h;
	}
	@Transactional
	public List<Hotel> searchByName(String name) {
		
		return hp.findByname(name);
		
	}
	public List<Hotel> ucHotel(int hcid){
		return hp.uniqueCategoryHotel(hcid);
		
	}

}
