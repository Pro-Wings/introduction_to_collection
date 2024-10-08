package com.prowings.map.treemap.comparator;

public class Car {
	
	private int mfgYear;
	private String companyName;
	private int speed;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(int mfgYear, String companyName, int speed) {
		super();
		this.mfgYear = mfgYear;
		this.companyName = companyName;
		this.speed = speed;
	}
	public int getMfgYear() {
		return mfgYear;
	}
	public void setMfgYear(int mfgYear) {
		this.mfgYear = mfgYear;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	@Override
	public String toString() {
		return "Car [mfgYear=" + mfgYear + ", companyName=" + companyName + ", speed=" + speed + "]";
	}
	
}
