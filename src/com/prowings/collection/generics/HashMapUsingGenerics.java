package com.prowings.collection.generics;

import java.util.HashMap;

public class HashMapUsingGenerics {
	
	public static void main(String[] args) {
		
		
		HashMap<String, Number> pizzaSize = new HashMap<>();
		
		Integer val1 = 1000;
		Float val2 = 100.65f;
		
		pizzaSize.put("aaa", val1);
		pizzaSize.put("bbb", val2);
		
	}

}
