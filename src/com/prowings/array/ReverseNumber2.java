package com.prowings.array;

import java.util.Scanner;

public class ReverseNumber2 {

	public static void main(String[] args) {

		System.out.println("Enter a number to reverse : ");

		Scanner sc = new Scanner(System.in);

		int inputNumber = sc.nextInt();

		System.out.println("You have entered : " + inputNumber);

		System.out.println(reversedNum(inputNumber));

	}

	public static int reversedNum(int inputNumber) {

		String originalNumber = String.valueOf(inputNumber);
		StringBuffer sb = new StringBuffer(originalNumber);
		sb.reverse();
		String revNumber = new String(sb);
		return Integer.parseInt(revNumber);

	}

}
