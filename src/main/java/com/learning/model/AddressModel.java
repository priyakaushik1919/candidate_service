package com.learning.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class AddressModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String city;
	
	private String houseNo;
	
	private String galiNo;

	public AddressModel() {
		super();
	}

	public AddressModel(int id, String city, String houseNo, String galiNo) {
		super();
		this.id = id;
		this.city = city;
		this.houseNo = houseNo;
		this.galiNo = galiNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getGaliNo() {
		return galiNo;
	}

	public void setGaliNo(String galiNo) {
		this.galiNo = galiNo;
	}
	
}
