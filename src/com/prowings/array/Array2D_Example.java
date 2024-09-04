package com.prowings.array;

public class Array2D_Example {
	
	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		int[][] data = new int[3][4];
		
		data[0][0] = 10;
		data[1][2] = 20;
		data[1][3] = 40;
		data[2][3] = 30;
		
		System.out.println(">>>>>>>2D Array Printing<<<<<<<");
		
		for(int i=0; i<data.length; i++)//this will iterate each row
		{
			for(int j=0; j<data[i].length; j++)//this will iterate each column
			{
				System.out.println(data[i][j]);
			}
		}
		
		
		System.out.println(">>>>>>>2D Array Printing<<<<<<<");
		
		
		System.out.println(">>>>>>>1D Array Printing<<<<<<<");
		int num[] = {10,30,50,70};
		
		for(int i =0; i<num.length; i++)
		{
			System.out.println(num[i]);
		}
		
		System.out.println(">>>>>>>1D Array Printing<<<<<<<");
		
		System.out.println("main method ended!!");
		
		
		
		
	}

}
