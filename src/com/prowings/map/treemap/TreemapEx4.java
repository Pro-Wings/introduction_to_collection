package com.prowings.map.treemap;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreemapEx4 {
	
	public static void main(String[] args) {
		
		TreeMap treemap = new TreeMap<>();
		
		treemap.put(50, "EEE");
		treemap.put(30, "CCC");
		treemap.put(20, "BBB");
		treemap.put(10, "AAA");
		treemap.put(40, "DDD");
		
		System.out.println("original treemap : "+treemap);
		
		System.out.println(treemap.lowerKey(27));
		System.out.println(treemap.lowerEntry(27));
		
		System.out.println(treemap.higherKey(39));
		System.out.println(treemap.higherEntry(39));
		
		System.out.println(treemap.ceilingKey(45));
		System.out.println(treemap.ceilingEntry(45));
		
		System.out.println(treemap.floorKey(45));
		System.out.println(treemap.floorEntry(45));
		
		System.out.println("Original treemap : "+ treemap);
		System.out.println(treemap.pollFirstEntry());
		System.out.println(treemap.pollLastEntry());
		System.out.println("treemap after polling methods: "+ treemap);
		
		
		Set allKeys = treemap.descendingKeySet();
		
		System.out.println(allKeys);
		
	}

}
