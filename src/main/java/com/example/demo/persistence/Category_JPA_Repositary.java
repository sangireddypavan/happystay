package com.example.demo.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.HotelCategory;


@Repository
public interface Category_JPA_Repositary extends JpaRepository<HotelCategory, Integer> {

}
