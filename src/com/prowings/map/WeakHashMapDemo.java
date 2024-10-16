package com.prowings.map;

import java.util.WeakHashMap;

public class WeakHashMapDemo {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(10, "Ram", "Pune");
		Student s2 = new Student(20, "Sham", "Mumbai");
		Student s3 = new Student(30, "Raja", "Latur");
		
		WeakHashMap<Student, Integer> map = new WeakHashMap<>();
		map.put(s1, 111111);
		
		map.put(null, 111111);
		map.put(null, 123132);
		map.put(s2, null);
		map.put(s3, null);

		System.out.println(map);
		s1 = null; // now reference count of student object will become zero!! - this means this is weak key!!
		System.gc(); // invoked GC explicitly!!
		System.out.println(map);
	}

}
