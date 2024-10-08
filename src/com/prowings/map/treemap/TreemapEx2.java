package com.prowings.map.treemap;

import java.util.TreeMap;

public class TreemapEx2 {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(80, "AAA", "Zharkhand");
		Student s2 = new Student(10, "BBB", "Kolhapur");
		Student s3 = new Student(5, "CCC", "Pune");
		
		
		TreeMap treemap = new TreeMap<>();
		
		treemap.put(s1, 123);
		treemap.put(s3, 123);
		treemap.put(s2, 123);
		
		System.out.println(treemap);
	}

}
