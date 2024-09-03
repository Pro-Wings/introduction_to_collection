package com.prowings.array;

public class HeterogenousArray {
	
	public static void main(String[] args) {
		
		int[] array = new int[5];
		
		array[0] = 10;
//		array[1] = "Hi";
		
//		int[] arr = {10, "Hi"};
		
		Object[] heterogenousArray = new Object[5];
		heterogenousArray[0] = 10;
		heterogenousArray[1] = "Hii";
		heterogenousArray[2] = new StringBuffer("HelloSB");
		heterogenousArray[3] = "Hello";
		heterogenousArray[4] = 10.5f;
		
		for(int i=0; i<heterogenousArray.length; i++)
		{
			if(heterogenousArray[i] instanceof String)
				System.out.println(heterogenousArray[i]);
		}
		
		String s = (String) heterogenousArray[1];
		
	}

}
