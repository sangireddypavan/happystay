package com.example.demo.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.HotelBookings;


@Repository
public interface Bookings_JPA_Repositary extends JpaRepository<HotelBookings, Integer> {
	
	
	@Query(value="select * from HotelBookings h where h.uid=:uid",nativeQuery=true)
	public List<HotelBookings> getbyuserid(@Param("uid") int uid);
}

