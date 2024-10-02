package com.prowings.map;

import java.util.Objects;

public class Student {
	
	private String name;
	private int roll;

	public Student() {
	}

	public Student(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + "]";
	}

	@Override
	public int hashCode() {
		int result = 1;
		result = 31 * result + this.name.hashCode();
		result = result + this.roll;
		
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		boolean res = false;
		Student s2 = (Student) obj;
		
		if(this.name.equals(s2.name))
		{
			if(this.roll == s2.roll)
				res = true;
		}
		return res;
	}

	
	

}
