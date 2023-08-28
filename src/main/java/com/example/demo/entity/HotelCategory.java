package com.example.demo.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="hotelcategory")
public class HotelCategory {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="hcid",nullable=true)
	private int hcid;
	
	
	@Column(name="hename")
	private String hename;
	
	
	@Column(name="hcimage")
    private  String hcimage;

	
	@OneToMany(mappedBy="hotelcategory")
	private Set<Hotel> hotel;
	
	
	
		
	
	public HotelCategory() {
		
	}


	public HotelCategory(int hcid, String hename,String hcimage) {
		
		this.hcid = hcid;
		this.hename = hename;
		this.hcimage=hcimage;
	}


	public int getHcid() {
		return hcid;
	}


	public void setHcid(int hcid) {
		this.hcid = hcid;
	}


	public String getHename() {
		return hename;
	}


	public void setHename(String hename) {
		this.hename = hename;
	}


	public String getHcimage() {
		return hcimage;
	}


	public void setHcimage(String hcimage) {
		this.hcimage = hcimage;
	}


	@Override
	public String toString() {
		return "HotelCategory [hcid=" + hcid + ", hename=" + hename + ", hcimage=" + hcimage + "]";
	}
	
	

}
