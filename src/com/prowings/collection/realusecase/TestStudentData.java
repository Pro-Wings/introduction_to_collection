package com.prowings.collection.realusecase;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestStudentData {
	
	public static void main(String[] args) {
		
		Set<String> subjects1 = new HashSet<>();
		subjects1.add("Maths");
		subjects1.add("English");
		subjects1.add("Maths");
		subjects1.add("Marathi");

		Set<String> subjects2 = new HashSet<>();
		subjects2.add("Maths");
		subjects2.add("English");
		subjects2.add("Maths");
		subjects2.add("Sanskrut");

		Set<String> subjects3 = new HashSet<>();
		subjects3.add("Maths");
		subjects3.add("Marathi");
		subjects3.add("Sanskrut");
		
		Map<String, String> subjectWiseTeachers = new TreeMap<String, String>();
		subjectWiseTeachers.put("Maths", "ABC");
		subjectWiseTeachers.put("English", "XYZ");
		subjectWiseTeachers.put("Marathi", "PQR");
		subjectWiseTeachers.put("Sanskrut", "PQR");
		
		Student std1 = new Student(10, "Ram", subjects1, subjectWiseTeachers);

		Student std2 = new Student(20, "Sham", subjects2, subjectWiseTeachers);

		Student std3 = new Student(20, "Sachin", subjects3, subjectWiseTeachers);
		
		List<Student> stdlist = new ArrayList<>();
		stdlist.add(std1);
		stdlist.add(std2);
		stdlist.add(std3);
		
		System.out.println(stdlist);
		
		processSpecifiedSubjectStudents("Marathi", stdlist);
		
	}
	
	public static void processSpecifiedSubjectStudents(String subject, List<Student> stdList)
	{
		System.out.println("---------filtering given stdlist for given subject : "+ subject);
		for(Student s : stdList)
		{
			if(s.getSubjects().contains(subject))
			{
				System.out.println("Student name : "+s.getName());
				System.out.println("Teacher Name : "+s.getSubjectWiseTeacherNames().get(subject));
			}
		}
		System.out.println("----------Processing completed ----------");
	}

}
