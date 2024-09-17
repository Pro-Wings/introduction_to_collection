package com.prowings.array;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		System.out.println("Enter a number to reverse : ");

		Scanner sc = new Scanner(System.in);

		int inputNumber = sc.nextInt();

		System.out.println("You have entered : " + inputNumber);

		System.out.println(reversedNum(inputNumber));

	}

	public static int reversedNum(int inputNumber) {
		int reversedNumber = 0;
		// Reverse the digits of the number
		while (inputNumber != 0) {
			int digit = inputNumber % 10;
			reversedNumber = reversedNumber * 10 + digit;
			inputNumber /= 10;
		}
		return reversedNumber;
	}

}
