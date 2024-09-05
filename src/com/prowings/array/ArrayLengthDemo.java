package com.prowings.array;

public class ArrayLengthDemo {
	
	public static void main(String[] args) {
		
		int[] data = new int[5];
		
		System.out.println("Length before adding elements : "+data.length);

		data[0] = 10;
		data[1] = 20;
		data[2] = 30;
		
		System.out.println("Length after adding elements : "+data.length);
	}

}
