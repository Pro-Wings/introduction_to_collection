package com.prowings.map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapDemo {
	
	public static void main(String[] args) {
		
		System.out.println("main started!!");
		
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
		
		System.out.println(lhm.put("AAA", 123));
		System.out.println(lhm.put("DDD", 789));
		System.out.println(lhm.put("BBB", 345));
		System.out.println(lhm.put("CCC", 567));
		
		
		System.out.println(lhm);
		
		System.out.println("--------- Keys ---------");
		
		Set<String> allKeys = lhm.keySet();
		
		for(String key : allKeys)
		{
			System.out.println(key);
		}
		
		System.out.println("--------- Values ---------");

		Collection<Integer> allValues = lhm.values();
		
		for(Integer value : allValues)
		{
			System.out.println(value);
		}
		
		
		System.out.println("--------- Entries ---------");
		
		Set<Entry<String, Integer>> allEntries = lhm.entrySet();
		
		for(Entry<String, Integer> entry : allEntries)
		{
			System.out.println(entry);
		}
		
		
		System.out.println("main ended!!");
		
	}

}
