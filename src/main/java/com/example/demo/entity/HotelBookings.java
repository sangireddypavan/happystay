package com.example.demo.entity;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="hotelbookings")
public class HotelBookings {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="bid")
	private int bid;
	
	@Column(name="hid",nullable = true)
    private int hid;
    
	@Column(name="uid",nullable = true)
    private int uid;
	
	@Column(name="fromdate")
	private Date fromdate;

	@Column(name="todate")
	private Date todate;
	
	@Column(name="pricepaid")
	private int pricepaid;
	
	@Column(name="statusofbooking")
	private String statusofbooking;

	@Column(name="roomno")
	private int roomno;
	
	
	


	@ManyToOne(targetEntity=Hotel.class,fetch = FetchType.EAGER) 
	@JoinColumn(name="hid",insertable = false, updatable = false,nullable = true)
	private Hotel hotel;
	
	@ManyToOne(targetEntity=User.class,fetch = FetchType.EAGER) 
	@JoinColumn(name="uid",insertable = false, updatable = false,nullable = true)
	private User user;
	
	public HotelBookings() {
		
	}

	public HotelBookings(int bid, int hid, int uid, Date fromdate, Date todate, int pricepaid, String statusofbooking,
			int roomno) {
		
		this.bid = bid;
		this.hid = hid;
		this.uid = uid;
		this.fromdate = fromdate;
		this.todate = todate;
		this.pricepaid = pricepaid;
		this.statusofbooking = statusofbooking;
		this.roomno = roomno;
	
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public int getHid() {
		return hid;
	}

	public void setHid(int hid) {
		this.hid = hid;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	

	public int getPricepaid() {
		return pricepaid;
	}

	public void setPricepaid(int pricepaid) {
		this.pricepaid = pricepaid;
	}

	public String getStatusofbooking() {
		return statusofbooking;
	}

	public void setStatusofbooking(String statusofbooking) {
		this.statusofbooking = statusofbooking;
	}

	public int getRoomno() {
		return roomno;
	}

	public void setRoomno(int roomno) {
		this.roomno = roomno;
	}


	public Date getFromdate() {
		return fromdate;
	}

	public void setFromdate(Date fromdate) {
		this.fromdate = fromdate;
	}

	public Date getTodate() {
		return todate;
	}

	public void setTodate(Date todate) {
		this.todate = todate;
	}

	@Override
	public String toString() {
		return "HotelBookings [bid=" + bid + ", hid=" + hid + ", uid=" + uid + ", fromdate=" + fromdate + ", todate="
				+ todate + ", pricepaid=" + pricepaid + ", statusofbooking=" + statusofbooking + ", roomno=" + roomno
				+ "]";
	}
	
	


	



	
	

	
}
