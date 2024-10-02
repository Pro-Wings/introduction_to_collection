package com.prowings.map;

import java.util.HashMap;

public class HashMapDemo2 {
	
	public static void main(String[] args) {
		
		Student s1 = new Student("Ram", 10);
		Student s2 = new Student("Ram", 10);
		
		
		HashMap<Student, Integer> hm = new HashMap<>();
		
		System.out.println(hm.put(s1, 112233));
		System.out.println(hm.put(s2, 445566));
		
		System.out.println(hm);
	}

}
