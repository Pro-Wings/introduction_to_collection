package com.prowings.array;

public class SwapNumbers {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		System.out.println("Before Swapping : a = "+a +"  b = "+b);

		//using 3rd variable
//		int temp = a;
//		a = b;
//		b = temp;

		//without using 3rd variable
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("after Swapping : a = "+a +"  b = "+b);
		
		
		
	}

}
