package com.prowings.array;

import java.util.Arrays;

public class PrintSecondMaxMinElementFromArray {

	public static void main(String[] args) {

		int[] input = { 10, 10, 20, 30, 40, 50,60 };

		printMaxElelement(input);
		printMinElelement(input);

	}

	public static void printMaxElelement(int[] input) {
		if (input != null) {
			if (input.length > 0) {

				int[] uniqElements = removeDuplicateElements(input);
				Arrays.sort(uniqElements);
				System.out.println("Second Max element : " + uniqElements[uniqElements.length - 2]);
			}
			else
				System.out.println("Array size must be non-zero!!");
		}else
			System.out.println("Array should not be null!!");
	}

	public static void printMinElelement(int[] input) {

		if ((input != null) && (input.length > 0)) {

			int[] uniqElements = removeDuplicateElements(input);
			Arrays.sort(uniqElements);
			System.out.println("Second Min element : " + uniqElements[1]);
		} else
			System.out.println("Array should not be null!!");
	}

	public static int[] removeDuplicateElements(int[] numbers) {

		// Sort the array
		Arrays.sort(numbers);

		// Initialize the j pointer
		int j = 0;

		// Start iterating the array from the 1st index
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] != numbers[j]) {
				j++;
				// Move unique element to the next position
				numbers[j] = numbers[i];
			}
		}
		// Return copy of array upto index j without duplicates
		return Arrays.copyOf(numbers, j + 1);
	}

}
