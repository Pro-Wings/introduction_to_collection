package com.prowings.collection.arraylist;

import java.util.ArrayList;

public class ArrayListDemp {
	
	public static void main(String[] args) {
		
		ArrayList myArrayList11 = new ArrayList();
		myArrayList11.add("zzz");
		myArrayList11.add("yyy");
		myArrayList11.add("555");

		ArrayList myArrayList = new ArrayList();
		
		myArrayList.add("AAA");
		myArrayList.add("BBB");
		int x = 123;
		myArrayList.add(x);
		myArrayList.add(123.45f);
		myArrayList.add(true);
		myArrayList.add('a');
		
		myArrayList.addAll(myArrayList11);
		
		System.out.println(myArrayList);
		
	}

}
