package com.prowings.map.treemap;

import java.util.TreeMap;

public class TreeMapDemo {
	
	public static void main(String[] args) {
		
		TreeMap<String, Integer> tm = new TreeMap();
		
		
		tm.put("DDD", 444);
		tm.put("AAA", 111);
		tm.put("CCC", 333);
		tm.put("BBB", 222);
		
		System.out.println(tm);
		
	}

}
