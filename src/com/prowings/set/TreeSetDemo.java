package com.prowings.set;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<>();
		
		System.out.println(ts.add("DDD"));
		System.out.println(ts.add("AAA"));
		System.out.println(ts.add("CCC"));
		System.out.println(ts.add("BBB"));
		System.out.println(ts.add("AAA"));
		
		System.out.println(ts);
	}
	
}
