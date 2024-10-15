package com.prowings.set;

import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(10, "AAA", "IT");
		Employee emp2 = new Employee(20, "BBB", "HR");
		Employee emp3 = new Employee(30, "ZZZ", "Support");
		
		TreeSet<Employee> ts = new TreeSet<>();
		
		System.out.println(ts.add(emp3));
		System.out.println(ts.add(emp1));
		System.out.println(ts.add(emp2));
		
		System.out.println(ts);
	}
	
}
