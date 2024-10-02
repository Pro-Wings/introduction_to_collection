package com.prowings.map;

public class TestEqualsHashcode {
	
	public static void main(String[] args) {
		
		Student std1 = new Student("Ram", 10);
		Student std2 = new Student("Ram", 10);
		
		
		System.out.println(std1.equals(std2));
		
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
	}

}
