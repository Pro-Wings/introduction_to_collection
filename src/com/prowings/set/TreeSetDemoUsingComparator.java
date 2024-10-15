package com.prowings.set;

import java.util.TreeSet;

public class TreeSetDemoUsingComparator {

	public static void main(String[] args) {

		Person p1 = new Person(37, "Zimbabwe", 78.5f);
		Person p2 = new Person(52, "India", 64.3f);
		Person p3 = new Person(78, "US", 58.2f);
		Person p4 = new Person(17, "Zimbabwe", 64.3f);
		
		PersonAgeComparator ageComparator = new PersonAgeComparator();
		
		TreeSet<Person> ts = new TreeSet<>(ageComparator);
		
		System.out.println(ts.add(p3));
		System.out.println(ts.add(p2));
		System.out.println(ts.add(p1));
		System.out.println(ts.add(p4));
		
		System.out.println("After sorting by Age : ");
		System.out.println(ts);
		
		PersonWeightComparator weightComparator = new PersonWeightComparator();
		
		TreeSet<Person> tsByWeight = new TreeSet<>(weightComparator);
		
		System.out.println(tsByWeight.add(p3));
		System.out.println(tsByWeight.add(p2));
		System.out.println(tsByWeight.add(p1));
		System.out.println(tsByWeight.add(p4));
		
		System.out.println("After sorting by weight : ");
		System.out.println(tsByWeight);
		
		PersonCountryComparator countryComparator = new PersonCountryComparator();
		
		TreeSet<Person> tsByCountry = new TreeSet<>(countryComparator);
		
		System.out.println(tsByCountry.add(p3));
		System.out.println(tsByCountry.add(p2));
		System.out.println(tsByCountry.add(p1));
		System.out.println(tsByCountry.add(p4));
		
		System.out.println("After sorting by country : ");
		System.out.println(tsByCountry);

		
	}
	
}
