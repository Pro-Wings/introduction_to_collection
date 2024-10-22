package com.prowings.collection.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UnModifiableListDemo {
	
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(10, "AAA", 99000l, 4);
		Employee e2 = new Employee(20, "BBB", 88000l, 5);
		Employee e3 = new Employee(30, "CCC", 75000l, 2);
		Employee e4 = new Employee(40, "DDD", 56000l, 3);
		Employee e5 = new Employee(50, "EEE", 9000l, 1);
		
		List<Employee> empsList = Arrays.asList(e1,e2,e3,e4,e5);
		
		List<Employee> syncEmpList = Collections.synchronizedList(empsList);
		
		System.out.println("All Employees : " + empsList);
		
		List<Employee> bestEmployees = filterBestPerformanceEmployees(empsList);
		
		bestEmployees.remove(0);
		System.out.println("Best Employees : " + bestEmployees);
	}
	
	
	public static List<Employee> filterBestPerformanceEmployees(List<Employee> empList)
	{
		List<Employee> bestEmployees = new ArrayList<>();
		
		for(Employee e : empList)
		{
			if(e.getRating() >= 4)
				bestEmployees.add(e);
		}
		
		return Collections.unmodifiableList(bestEmployees);
	}

}
