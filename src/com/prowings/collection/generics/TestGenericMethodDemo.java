package com.prowings.collection.generics;

public class TestGenericMethodDemo {
	
	public static void main(String[] args) {
		
		Integer n1 = 20;
		Integer n2 = 10;
		
		Integer[] nums = {10,20,30};
		String[] words = {"aaa","bbb","ccc"};
		StringBuffer[] words1 = {new StringBuffer("zzz"), new StringBuffer("yyy"),new StringBuffer("xxx")};
		
		GenericMethodDemo obj = new GenericMethodDemo();

		Integer y = obj.division(n1, n2);
		System.out.println(y);
		
		obj.printArray(words1);
		
	}

}
