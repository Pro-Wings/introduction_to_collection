package com.prowings.array;

public class CopyArray2 {
	
	public static void main(String[] args) {
		
		int[] data = {10,20,30,40,50};
		
		int[] result = copyArrayUsingClone(data);
		
		System.out.println("data[] : ");
		printArray(data);

		System.out.println("result[] : ");
		printArray(result);
		
		System.out.println(data == result);
		
	}

	private static void printArray(int[] data) {
		
		for(int d : data)
			System.out.println(d);
		
	}

	public static int[] copyArray(int[] input) {
		int[] res = new int[input.length];
		for(int i=0; i<res.length; i++)
			res[i] = input[i];
		return res;
	}
	
	public static int[] copyArrayUsingClone(int[] input) {
		return input.clone();
	}

}
