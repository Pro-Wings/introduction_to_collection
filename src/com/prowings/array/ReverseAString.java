package com.prowings.array;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {

		System.out.println("main started!!");

		System.out.println("Enter a string : \n");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		System.out.println("Input String is : " + input);

//		String res = reverse(input);
//		System.out.println("Reversed String is : " + res);

		String reversedString = reverseStringUsingArray(input);
		System.out.println("Reversed String is : " + reversedString);

		System.out.println("main ended!!");

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
