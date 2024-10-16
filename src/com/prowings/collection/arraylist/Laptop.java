package com.prowings.collection.arraylist;

public class Laptop {
	
	private String compnyName;
	private double price;
	private String color;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(String compnyName, double price, String color) {
		super();
		this.compnyName = compnyName;
		this.price = price;
		this.color = color;
	}
	public String getCompnyName() {
		return compnyName;
	}
	public void setCompnyName(String compnyName) {
		this.compnyName = compnyName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Laptop [compnyName=" + compnyName + ", price=" + price + ", color=" + color + "]";
	}

	
	
}
