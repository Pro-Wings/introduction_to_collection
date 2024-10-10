package com.prowings.map.legacyclasses;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class HashtableDemo {
	
	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		
		Hashtable table = new Hashtable<>();
		
		System.out.println(table.put("AAA", 1111));
		System.out.println(table.put("BBB", 2222));
		System.out.println(table.put("CCC", 9999));
		System.out.println(table.put("DDD", 1111));

		System.out.println("-------keys enumeration------");
		Enumeration allKeys = table.keys();
		
		while(allKeys.hasMoreElements())
			System.out.println(allKeys.nextElement());

		System.out.println("-------values enumeration------");
		
		Enumeration allValues = table.elements();
		while(allValues.hasMoreElements())
			System.out.println(allValues.nextElement());
		
		System.out.println("-----------entryset----------");
		
		Set<Entry> allEntries = table.entrySet();
		
		for(Entry e : allEntries)
			System.out.println(e);
	}

}
