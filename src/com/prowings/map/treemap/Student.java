package com.prowings.map.treemap;

public class Student implements Comparable {
	
	private int rollNumber;
	private String name;
	private String address;
	
	public Student() {
	}
	
	public Student(int rollNumber, String name, String address) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.address = address;
	}
	
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", address=" + address + "]";
	}

	//compare by address
	@Override
	public int compareTo(Object o) {
		Student s = (Student)o;
		return this.address.compareTo(s.address);
		
	}

	//compare by name
//	@Override
//	public int compareTo(Object o) {
//		Student s = (Student)o;
//		return this.name.compareTo(s.name);
//		
//	}

	//compare by roll numbr
//	@Override
//	public int compareTo(Object o) {
//		Student s = (Student) o;
//		
//		if(this.rollNumber == s.rollNumber)
//			return 0;
//		else if(this.rollNumber > s.rollNumber)
//			return 4;
//		else
//			return -3;
//	}
	
	
	
}
