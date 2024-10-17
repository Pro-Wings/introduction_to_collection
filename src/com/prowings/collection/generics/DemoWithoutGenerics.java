package com.prowings.collection.generics;

import java.util.ArrayList;

public class DemoWithoutGenerics {
	
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList<>();
		
		list.add("aaa");
		list.add(new StringBuffer("bbb"));
	
		
		String s = (String) list.get(1);
		
		System.out.println(s);
		
		
	}

}
