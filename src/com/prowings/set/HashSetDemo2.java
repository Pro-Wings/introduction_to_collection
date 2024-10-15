package com.prowings.set;

import java.util.HashSet;

public class HashSetDemo2 {
	
	public static void main(String[] args) {

		Student s1 = new Student(10, "Ram");
		Student s2 = new Student(20, "Sham");
		Student s3 = new Student(30, "Sachin");
		Student s4 = new Student(10, "Ram");
		
		
		HashSet hs = new HashSet<>();
		
		System.out.println(hs.add(s1));
		System.out.println(hs.add(s2));
		System.out.println(hs.add(s3));
		System.out.println(hs.add(s4));
		
		System.out.println(hs);
	}

}
