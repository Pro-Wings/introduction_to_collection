package com.prowings.set;

import java.util.HashSet;

public class HashSetDemo {
	
	public static void main(String[] args) {
		
		HashSet hs = new HashSet<>();
		
		System.out.println(hs.add("AAA"));
		System.out.println(hs.add("BBB"));
		System.out.println(hs.add("CCC"));
		System.out.println(hs.add("AAA"));
		System.out.println(hs.add("DDD"));
		System.out.println(hs.add(123));
		System.out.println(hs.add(345));
		System.out.println(hs.add(123));
		
		
		
		System.out.println(hs);
	}

}
