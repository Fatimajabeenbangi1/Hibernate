package com.Anudip.hibernateonetoonedemo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class student {
	@Id
	private int sid;
	private String sname;
	private String contact;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="laptopid")
	Laptop laptop;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public student() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	

}
