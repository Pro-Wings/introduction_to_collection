package com.prowings.map.treemap.comparator;

import java.util.Comparator;

public class CompareCarByMfgYear implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		Car c1 = (Car)o1;
		Car c2 = (Car)o2;
		
		if(c1.getMfgYear() == c2.getMfgYear())
			return 0;
		else if(c1.getMfgYear() > c2.getMfgYear())
			return 4;
		else
			return -4;
	}

}
