package com.example.demo.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="uid",nullable=true)
	private int uid;
	
	@Column(name="uname")
	private String uname;
	
	@Column(name="uphno")
	private long  uphno;
	
	@Column(name="uemail")
	private String uemail;
	
	@Column(name="upwd")
	private String upwd;
	
	@Column(name="utype")
	private String utype;
	
	
	@OneToMany(mappedBy="user")
	private Set<HotelBookings> hotelbookings;
	
	public User() {
		
	}

	public User(int uid, String uname, long uphno, String uemail, String upwd, String utype) {
		
		this.uid = uid;
		this.uname = uname;
		this.uphno = uphno;
		this.uemail = uemail;
		this.upwd = upwd;
		this.utype = utype;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public long getUphno() {
		return uphno;
	}

	public void setUphno(long uphno) {
		this.uphno = uphno;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public String getUpwd() {
		return upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

	public String getUtype() {
		return utype;
	}

	public void setUtype(String utype) {
		this.utype = utype;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", uphno=" + uphno + ", uemail=" + uemail + ", upwd=" + upwd
				+ ", utype=" + utype + "]";
	}
	

}
