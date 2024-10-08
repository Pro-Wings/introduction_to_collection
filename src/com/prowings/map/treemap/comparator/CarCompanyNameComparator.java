package com.prowings.map.treemap.comparator;

import java.util.Comparator;

public class CarCompanyNameComparator implements Comparator<Car>{

	@Override
	public int compare(Car c1, Car c2) {
		
		return c1.getCompanyName().compareTo(c2.getCompanyName());
		
	}

}
