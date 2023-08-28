package com.example.demo.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Hotel;



@Repository
public interface Hotel_JPA_Repositary extends JpaRepository<Hotel, Integer> {
	
	
	@Query(value="select * from Hotel h where h.hname like %:hname%",nativeQuery=true)
	public List<Hotel> findByname(@Param("hname") String name);
	
	
	@Query(value="select * from Hotel h where h.hcid  like %:hcid%",nativeQuery=true)
	public List<Hotel> uniqueCategoryHotel(@Param("hcid") int hcid);

}
