package com.prowings.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	
	public static void main(String[] args) {
		System.out.println("main started");
		HashMap<String, Integer> hm = new HashMap<>();
		
		System.out.println(hm.put("AAA", 100));
		System.out.println(hm.put("BBB", 700));
		System.out.println(hm.put("CCC", 300));
		System.out.println(hm.put("DDD", 400));
		System.out.println(hm.put("AAA11", 900));
		System.out.println(hm.put("AAA22", 700));

		System.out.println(hm);
		System.out.println("----------keyset start-------------");
		Set allKeys =  hm.keySet();
		
		Iterator<String> itr = allKeys.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println("----------keyset  end-------------");

		System.out.println("----------entrySet start-------------");
		Set<Entry<String,Integer>> allEntries =  hm.entrySet();
		
		for(Entry<String, Integer> e : allEntries)
		{
			System.out.println("Key : "+e.getKey() + " and "+"Value : "+e.getValue());
		}
		System.out.println("----------entrySet  end-------------");

		System.out.println("----------Values  start-------------");
		
		Collection<Integer> allValues = hm.values();
		
		for(Integer i : allValues)
		{
			System.out.println(i);
		}
		
		System.out.println("----------Values  end-------------");
		
		
		System.out.println("Contains key : "+hm.containsKey("ZZZ"));
		System.out.println("Contains value : "+hm.containsValue(123));
		
		System.out.println(hm.get("AAA"));
		
		System.out.println("Result of remove : "+hm.remove("MMM"));
		
		System.out.println("after removing AAA key :" +hm);
		System.out.println("main method ended!!");
	}

}
