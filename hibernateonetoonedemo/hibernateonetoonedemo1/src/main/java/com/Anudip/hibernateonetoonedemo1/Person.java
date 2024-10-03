package com.Anudip.hibernateonetoonedemo1;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="person")

public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long street;
	private String country;
	@OneToOne(cascade = CascadeType.ALL)
	Student1 student1;
	public long getStreet() {
		return street;
	}
	public void setStreet(long string) {
		this.street = string;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Student1 getStudent1() {
		return student1;
	}
	public void setStudent1(Student1 student1) {
		this.student1 = student1;
	}
	public Person() {
		
		// TODO Auto-generated constructor stub
	}
	public void setStreet(String string) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}