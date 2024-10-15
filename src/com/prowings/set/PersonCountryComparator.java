package com.prowings.set;

import java.util.Comparator;

public class PersonCountryComparator implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
		
		return p1.getCountry().compareTo(p2.getCountry());
		
	}

}
