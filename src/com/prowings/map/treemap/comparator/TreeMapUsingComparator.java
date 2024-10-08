package com.prowings.map.treemap.comparator;

import java.util.TreeMap;

public class TreeMapUsingComparator {
	
	public static void main(String[] args) {
		
		Car c1 = new Car(2011, "Mahindra", 120);
		Car c2 = new Car(2024, "Tesla", 250);
		Car c3 = new Car(2021, "Tata", 190);
		Car c4 = new Car(2022, "Audi", 300);
		
		CompareCarByMfgYear sortByMfgYear = new CompareCarByMfgYear();
		
		CarCompanyNameComparator sortByCompanyName = new CarCompanyNameComparator();
		
		CarSpeedComparator sortBySpeed = new CarSpeedComparator();
		
		TreeMap map = new TreeMap(sortBySpeed);
		
		map.put(c3, 444444444);
		map.put(c1, 111111111);
		map.put(null, 999999999);
		map.put(c2, 888888888);
		
		System.out.println(map);
		
	}

}
