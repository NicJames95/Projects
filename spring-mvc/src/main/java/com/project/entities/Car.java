package com.project.entities;

public class Car {

	private String make;
	
	private String model;
	
	private String color;
	
	private int year;
	
	private String price;
	
	private String mileage;
	
	private int daysInInventory;
	

	public Car(String make, String model, String color, int year, String price, String mileage, int daysInInventory) {
		super();
		this.make = make;
		this.model = model;
		this.color = color;
		this.year = year;
		this.price = price;
		this.mileage = mileage;
		this.daysInInventory = daysInInventory;
	
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public String getColor() {
	    return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getMileage() {
		return mileage;
	}

	public void setMileage(String mileage) {
		this.mileage = mileage;
	}
	
	public int getDaysInInventory() {
		return daysInInventory;
	}
	
	public void setDaysInInventory(int daysInInventory) {
		this.daysInInventory = daysInInventory;
	}
	
	
	
}
