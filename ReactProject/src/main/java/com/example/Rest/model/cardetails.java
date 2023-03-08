package com.example.Rest.model;

import jakarta.persistence.*;

@Entity
@Table(name="cardetails")
public class cardetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int carid;
	private String carname;
	private int carprize;
	private String fueltype;
	public int getCarid() {
		return carid;
	}
	public void setCarid(int carid) {
		this.carid = carid;
	}
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public int getCarprize() {
		return carprize;
	}
	public void setCarprize(int carprize) {
		this.carprize = carprize;
	}
	public String getFueltype() {
		return fueltype;
	}
	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}
	public cardetails(int carid, String carname, int carprize, String fueltype) {
		super();
		this.carid = carid;
		this.carname = carname;
		this.carprize = carprize;
		this.fueltype = fueltype;
	}
	
	public cardetails()
	{
		
	}
	
	

}
