package com.prowings.array;

import java.util.Arrays;

public class MaxMinElementFromArray {

	public static void main(String[] args) {

		int[] input = null;

//		printMaxElelement(input);
		printMinElelement(input);

	}

	public static void printMaxElelement(int[] input) {
		if (input != null) {
			if (input.length > 0) {
				Arrays.sort(input);
				System.out.println("Max element : " + input[input.length - 1]);
			}
			else
				System.out.println("Array size must be non-zero!!");
		}else
			System.out.println("Array should not be null!!");
	}

	public static void printMinElelement(int[] input) {

		if ((input != null) && (input.length > 0)) {
			if (input.length > 0) {
				Arrays.sort(input);
				System.out.println("Min element : " + input[0]);
			}
		}
		else
			System.out.println("Array should not be null!!");
	}

}
