package com.prowings.map;

import java.util.HashMap;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		System.out.println(hm.put("AAA", 100));
		System.out.println(hm.put("BBB", 700));
		System.out.println(hm.put("CCC", 300));
		System.out.println(hm.put("DDD", 400));
		System.out.println(hm.put("AAA", 900));
		System.out.println(hm.put("AAA", 700));

		System.out.println(hm);
		
		System.out.println(hm.get("AAA"));
		
	}

}
