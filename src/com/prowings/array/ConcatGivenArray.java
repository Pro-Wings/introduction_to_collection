package com.prowings.array;

public class ConcatGivenArray {

	public static void main(String[] args) {

		int[] data1 = { 10, 30, 40, 50 };
		int[] data2 = { 60, 70, 80,90,100 };

//		int[] result = concatArray(data1, data2);
		int[] result = concatArrayUsingSystem(data1, data2);

		printArray(result);

	}

	public static int[] concatArray(int[] data1, int[] data2) {
		int[] res = new int[data1.length + data2.length];

		for (int i = 0; i < data1.length; i++) {
			res[i] = data1[i];
		}
		int counter = data1.length;
		for(int j=0; j<data2.length; j++)
		{
			res[counter] = data2[j];
			counter++;
		}
		return res;
	}

	public static int[] concatArrayUsingSystem(int[] data1, int[] data2) {
		int[] res = new int[data1.length + data2.length];
		
		System.arraycopy(data1, 0, res, 0, data1.length);
		System.arraycopy(data2, 0, res, data1.length, data2.length);
		
		return res;
	}

	private static void printArray(int[] data) {
		for (int d : data)
			System.out.println(d);
	}

}
