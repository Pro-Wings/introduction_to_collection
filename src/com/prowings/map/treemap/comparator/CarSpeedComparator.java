package com.prowings.map.treemap.comparator;

import java.util.Comparator;

public class CarSpeedComparator implements Comparator<Car>{

	@Override
	public int compare(Car c1, Car c2) {
		
		if(c1.getSpeed() == c2.getSpeed())
			return 0;
		else if(c1.getSpeed() > c2.getSpeed())
			return 9;
		else
			return -2;
	}

}
