package com.prowings.array;

public class CopyArray {
	
	public static void main(String[] args) {
		
		int[] data = {10,20,30,40,50,100,200,300,400,500};
		
//		int[] result = copyArrayWithSpecificIndexes(data);
		int[] result = copyArrayWithSpecificIndexesUsingSystemClass(data);
		
		System.out.println("data[] : ");
		printArray(data);

		System.out.println("result[] : ");
		printArray(result);
		
		System.out.println(data == result);
		
	}

	private static int[] copyArrayWithSpecificIndexes(int[] data) {
		
		int[] res = new int[5];
		int startPositionFromSource = 5;
		int startPositionFromRes = 0;
		
		for(int i=startPositionFromSource; i<data.length; i++)
		{
			res[startPositionFromRes] = data[i];
			startPositionFromRes++;
		}
		
		return res;
	}

	private static int[] copyArrayWithSpecificIndexesUsingSystemClass(int[] data) {
		int[] res = new int[5];
		System.arraycopy(data, 5, res, 0, 5);
		return res;
	}

	private static void printArray(int[] data) {
		
		for(int d : data)
			System.out.println(d);
		
	}


}
