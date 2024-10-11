package com.prowings.map;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
	
	public static void main(String[] args) {
		
		Car c1 = new Car(111, "aaa");
		Car c2 = new Car(111, "aaa");
		
		
		IdentityHashMap<Car, String> carMap = new IdentityHashMap<>();
		
		System.out.println(carMap.put(c1, "this is Sedan car"));
		System.out.println(carMap.put(c2, "this is SUV car"));
		
		System.out.println(carMap);
		
	}

}
