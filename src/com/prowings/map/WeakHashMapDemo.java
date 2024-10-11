package com.prowings.map;

import java.util.WeakHashMap;

public class WeakHashMapDemo {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(10, "Ram", "Pune");
		
		WeakHashMap<Student, Integer> map = new WeakHashMap<>();
		map.put(s1, 111111);
		System.out.println(map);
		s1 = null; // now reference count of student object will become zero!! - this means this is weak key!!
		System.gc(); // invoked GC explicitly!!
		System.out.println(map);
	}

}
