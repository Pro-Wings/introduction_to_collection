package com.prowings.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DemoOfComplexHashMap {

	public static void main(String[] args) {

		// Dept Name - Key
		// All Employees of that Department

		Employee e1 = new Employee(1, "Ram", 99000, "IT");
		Employee e6 = new Employee(1, "Ram", 99000, "IT");
		Employee e2 = new Employee(2, "Sham", 75000, "HR");
		Employee e3 = new Employee(3, "Sachin", 89000, "IT");
		Employee e4 = new Employee(4, "Rohit", 56000, "HR");
		Employee e5 = new Employee(5, "Virat", 75000, "Sales");

		List<Employee> allEmployeesList = new ArrayList<>();
		allEmployeesList.add(e1);
		allEmployeesList.add(e2);
		allEmployeesList.add(e3);
		allEmployeesList.add(e4);
		allEmployeesList.add(e5);
		allEmployeesList.add(e6);

		storeDeptWiseEmployees(allEmployeesList);
	}

	public static void storeDeptWiseEmployees(List<Employee> allEmployeesList) {

		Map<String, Set<Employee>> deptWiseEmpsMap = new LinkedHashMap<>();

		for (Employee e : allEmployeesList) {
			
//			ArrayList<Employee> list = new ArrayList<>();
			HashSet<Employee> list = new HashSet<>();
			list.add(e);

			if (deptWiseEmpsMap.containsKey(e.getDepartment())) {
				
				Set<Employee> existinglist = deptWiseEmpsMap.get(e.getDepartment());
				existinglist.add(e);
				deptWiseEmpsMap.put(e.getDepartment(), existinglist);
			} else
				deptWiseEmpsMap.put(e.getDepartment(), list);

		}

		Set<Entry<String, Set<Employee>>> entries = deptWiseEmpsMap.entrySet();

		for (Entry<String, Set<Employee>> e : entries) {
			System.out.println(e.getKey() + "   " + e.getValue());
		}
	}

}
