package com.prowings.array;

import java.util.Scanner;

public class CheckPalindromeNumber {

	public static void main(String[] args) {

		System.out.println("Enter a number : ");

		Scanner sc = new Scanner(System.in);

		int originalNumber = sc.nextInt();

		System.out.println("You have entered : " + originalNumber);

		int reversedNumber = reversedNum(originalNumber);

		String res = (originalNumber == reversedNumber) ? "Palindrome" : "Not Palindrome";
		
		System.out.println("The specified number is "+ res);
		
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
