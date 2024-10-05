package com.prowings.map.treemap;

public class Employee implements Comparable {
	
	private int empId;
	private String name;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Object o) {
		Employee e2 = (Employee)o;
		
		//Comparison using EmpId
//		if(this.empId == e2.empId)
//			return 0;
//		else if(this.empId > e2.empId)
//			return 4;
//		else
//			return -3;
		
		//Comparison using Name
		return this.name.compareTo(e2.name);
		
	}
	
}
