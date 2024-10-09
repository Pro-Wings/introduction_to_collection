package com.prowings.map.treemap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreemapEx3 {
	
	public static void main(String[] args) {
		
		TreeMap treemap = new TreeMap<>();
		
		treemap.put("AAA", 100);
		treemap.put("ZZZ",900);
		treemap.put("QQQ",500);
		treemap.put("RRR",500);
		treemap.put("SSS",500);
		treemap.put("TTT",500);
		
		System.out.println("original treemap : "+treemap);
//		Map subMap = treemap.subMap("QQQ", "TTT");
//		subMap.remove("SSS");
//		System.out.println(subMap);
//		System.out.println("after making change in view"+treemap);
		
//		System.out.println("----headmap() demo-----");
		System.out.println("HeadMap : "+treemap.headMap("RRR"));
		
		System.out.println("TailMap : "+treemap.tailMap("RRR"));
		
		Comparator cmp = treemap.comparator();
		
		System.out.println("Comparator used by this treemap : "+cmp);
		
		System.out.println("First key from treemap : "+treemap.firstKey());
		System.out.println("Last key from treemap : "+treemap.lastKey());
	}

}
