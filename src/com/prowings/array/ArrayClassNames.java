package com.prowings.array;

public class ArrayClassNames {
	
	public static void main(String[] args) {
		
		byte[] array1 = new byte[5];
		short[] array2 = new short[5];
		char[] array3 = new char[5];
		int[] array4 = new int[5];
		long[] array5 = new long[5];
		float[] array6 = new float[5];
		double[] array7 = new double[5];
		boolean[] array8 = new boolean[5];

		System.out.println("byte[] name : "+array1.getClass().getName());
		System.out.println("short[] name : "+array2.getClass().getName());
		System.out.println("char[] name : "+array3.getClass().getName());
		System.out.println("int[] name : "+array4.getClass().getName());
		System.out.println("long[] name : "+array5.getClass().getName());
		System.out.println("float[] name : "+array6.getClass().getName());
		System.out.println("double[] name : "+array7.getClass().getName());
		System.out.println("boolean[] name : "+array8.getClass().getName());
		
		String[] array9 = new String[5];
		System.out.println("String[] name : "+array9.getClass().getName());

		StringBuffer[] array10 = new StringBuffer[5];
		System.out.println("StringBuffer[] name : "+array10.getClass().getName());

		Integer[] array11 = new Integer[5];
		System.out.println("Integer[] name : "+array11.getClass().getName());
		
	}

}
