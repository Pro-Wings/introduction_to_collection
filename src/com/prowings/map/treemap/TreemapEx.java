package com.prowings.map.treemap;

import java.util.TreeMap;

public class TreemapEx {
	
	public static void main(String[] args) {
		
		TreeMap treemap = new TreeMap<>();
		
		String s1 = "AAA";
		StringBuffer sb1 = new StringBuffer("BBB");
		StringBuilder sb2 = new StringBuilder("CCC");
		
		treemap.put(sb1, 123);
//		treemap.put(sb2, 123);
		treemap.put(s1, 123);
		
		System.out.println(treemap);
	}

}
