package com.prowings.array;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {

		System.out.println("main method started!!");

		System.out.println("Enter a string : \n");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		System.out.println("Input String is : " + input);
		sc.close();
//		boolean res = isPalindrome(input);
//		if (res)
//			System.out.println("Given string is Palindrome!!");
//		else
//			System.out.println("Given string is not Palindrome!!");

		String res = isPalindrome(input) ? "Palindrome" : "Not Palindrome";
		System.out.println("Given String is " + res);

		System.out.println("main method ended!!");

	}

	public static boolean isPalindrome(String input) {

		String reversedString = reverseStringUsingArray(input);
//		if(reversedString.equals(input))
//			return true;
//		else
//			return false;

		return reversedString.equalsIgnoreCase(input);
	}

	public static String reverse(String input) {
		String result = null;
		if (input != null) {
			StringBuffer sb = new StringBuffer(input);
			sb.reverse();
			result = new String(sb);
		}
		return result;
	}

	public static String reverseStringUsingArray(String input) {

		char[] chars = input.toCharArray();
		char[] reversedChars = new char[chars.length];
		int counter = 0;
		for (int i = chars.length - 1; i >= 0; i--) {
			reversedChars[counter] = chars[i];
			counter++;
		}
		return new String(reversedChars);
	}

}
