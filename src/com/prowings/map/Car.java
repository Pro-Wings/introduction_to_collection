package com.prowings.map;

import java.util.Objects;

public class Car {
	
	private int id;
	private String compnyName;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(int id, String compnyName) {
		super();
		this.id = id;
		this.compnyName = compnyName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompnyName() {
		return compnyName;
	}
	public void setCompnyName(String compnyName) {
		this.compnyName = compnyName;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", compnyName=" + compnyName + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(compnyName, id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(compnyName, other.compnyName) && id == other.id;
	}
	
	

}
