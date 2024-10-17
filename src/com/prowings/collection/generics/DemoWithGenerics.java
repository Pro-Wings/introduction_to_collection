package com.prowings.collection.generics;

import java.util.ArrayList;

public class DemoWithGenerics {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("aaa");
//		list.add(new StringBuffer("bbb"));
	
		
//		String s = (String) list.get(1); //when we use generics - casting not at all needed
		String s = list.get(0);
		
		System.out.println(s);
		
		
	}

}
