package com.prowings.set;

import java.util.Comparator;

public class PersonWeightComparator implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
		return p1.getWeight().compareTo(p2.getWeight());
	}

}
