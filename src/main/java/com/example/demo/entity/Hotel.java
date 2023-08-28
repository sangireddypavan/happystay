package com.example.demo.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;




@Entity
@Table(name="hotel")
public class Hotel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="hid",nullable=true)
	private int hid;
	
	@Column(name="hname")
	private String hname;
	
	@Column(name="himage")
	private String himage;
	
	@Column(name="price")
	private int price;
	
	@Column(name="hcid")
	private int hcid;
	
	@Column(name="hdescription")
	private String hdescription;
	
	
//	@ManyToMany(targetEntity=HotelCategory.class,fetch = FetchType.EAGER) 
//	@JoinColumn(name="hcid",insertable = false, updatable = false)
//	private int hcid;
	
	@Column(name="har")
	private int har;
	
	
	
	@ManyToOne(targetEntity=HotelCategory.class,fetch = FetchType.EAGER)
	@JoinColumn(name="hcid" ,insertable = false, updatable = false,nullable = true)
    private HotelCategory hotelcategory;
	
	
	@OneToMany(mappedBy="hotel")
	private Set<HotelBookings> hotelbookings; 
	
	public Hotel() {
		
	}
	

	
	public Hotel(int hid, String hname, String himage, int price, String hdescription, int hcid, int har) {
		
		this.hid = hid;
		this.hname = hname;
		this.himage = himage;
		this.price = price;
		this.hdescription = hdescription;
		this.har = har;
	}



	public int getHid() {
		return hid;
	}

	public void setHid(int hid) {
		this.hid = hid;
	}

	public String getHname() {
		return hname;
	}

	public void setHname(String hname) {
		this.hname = hname;
	}

	public String getHimage() {
		return himage;
	}

	public void setHimage(String himage) {
		this.himage = himage;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getHdescription() {
		return hdescription;
	}

	public void setHdescription(String hdescription) {
		this.hdescription = hdescription;
	}



	public int getHcid() {
		return hcid;
	}



	public void setHcid(int hcid) {
		this.hcid = hcid;
	}



//	public HotelCategory getHotelcategory() {
//		return hotelcategory;
//	}
//
//
//
//	public void setHotelcategory(HotelCategory hotelcategory) {
//		this.hotelcategory = hotelcategory;
//	}



//	public Set<HotelBookings> getHotelbookings() {
//		return hotelbookings;
//	}



//	public void setHotelbookings(Set<HotelBookings> hotelbookings) {
//		this.hotelbookings = hotelbookings;
//	}



	public int getHar() {
		return har;
	}

	public void setHar(int har) {
		this.har = har;
	}



	@Override
	public String toString() {
		return "Hotel [hid=" + hid + ", hname=" + hname + ", himage=" + himage + ", price=" + price + ", hcid=" + hcid
				+ ", hdescription=" + hdescription + ", har=" + har + "]";
	}



}
