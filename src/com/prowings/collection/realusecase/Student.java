package com.prowings.collection.realusecase;

import java.util.Map;
import java.util.Set;

public class Student {

	private int roll;
	private String name;
	private Set<String> subjects;
	private Map<String, String> subjectWiseTeacherNames;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int roll, String name, Set<String> subjects, Map<String, String> subjectWiseTeacherNames) {
		super();
		this.roll = roll;
		this.name = name;
		this.subjects = subjects;
		this.subjectWiseTeacherNames = subjectWiseTeacherNames;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(Set<String> subjects) {
		this.subjects = subjects;
	}

	public Map<String, String> getSubjectWiseTeacherNames() {
		return subjectWiseTeacherNames;
	}

	public void setSubjectWiseTeacherNames(Map<String, String> subjectWiseTeacherNames) {
		this.subjectWiseTeacherNames = subjectWiseTeacherNames;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", subjects=" + subjects + ", subjectWiseTeacherNames="
				+ subjectWiseTeacherNames + "]";
	}

}
