package com.prowings.map;

public class TestEqualsHashcode {
	
	public static void main(String[] args) {
		
		Student std1 = new Student(10, "Ram","Pune");
		
		System.out.println(std1);
		
		System.out.println("earlier hashcode : "+std1.hashCode());
		
		System.out.println("changing the internal state of object std1");
		
		std1.setAddress("Mumbai");
		
		System.out.println("updated std1 : "+std1);
		System.out.println("updated hashcode : "+std1.hashCode());
		
		
	}

}
