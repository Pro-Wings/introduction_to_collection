package com.prowings.array;

import java.util.Arrays;

public class SortArray3 {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(10, "AAA", 18);
		Student s2 = new Student(20, "BBB", 28);
		Student s3 = new Student(30, "CCC", 38);
		
		Student[] originalArray = {s2,s1,s3};
		
		System.out.println("Original Array : "+ Arrays.toString(originalArray));
		
		Arrays.sort(originalArray);

		System.out.println("Original Array after sorting: "+ Arrays.toString(originalArray));
	}
}
