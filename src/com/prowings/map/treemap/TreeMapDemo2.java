package com.prowings.map.treemap;

import java.util.TreeMap;

public class TreeMapDemo2 {
	
	public static void main(String[] args) {

		Employee emp1 = new Employee(111, "Ram");
		Employee emp2 = new Employee(222, "Sham");
		Employee emp3 = new Employee(333, "Anant");
		Employee emp4 = new Employee(444, "Virat");
		Employee emp5 = new Employee(444, "Mahendra");
		
		TreeMap<Employee, Integer> tm = new TreeMap();
		
		System.out.println(tm.put(emp4, 9999));
		System.out.println(tm.put(emp2, 7777));
		System.out.println(tm.put(emp1, 6666));
		System.out.println(tm.put(emp3, 8888));
		System.out.println(tm.put(emp5, 1212));
		
		
		System.out.println(tm);
		
	}

}
