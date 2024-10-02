package com.prowings.collection.set;

import java.util.HashSet;

public class HashSetDemo {
	
	public static void main(String[] args) {
		
		HashSet hs = new HashSet<>();
		
		hs.add("AAA");
		hs.add("BBB");
		hs.add("CCC");
		hs.add("AAA");

		System.out.println(hs);
	}

}
