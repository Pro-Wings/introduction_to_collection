package com.prowings.array;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		System.out.println("main started!!");
		String str1 = " Listen";
		String str2 = "silent ";
		String res = isAnagram(str1, str2) ? "Anagram" : "Not Anagram";
		System.out.println(str1 + " is " + res + " of " + str2);
		System.out.println("main ended!!");

	}

	public static boolean isAnagram(String str1, String str2) {
		boolean result = false;
		if ((str1 != null) && (str2 != null)) {
			str1 = str1.trim();
			str2 = str2.trim();

			if (str1.length() == str2.length()) {
				str1 = str1.toLowerCase();
				str2 = str2.toLowerCase();
				char[] str1Chars = str1.toCharArray();
				char[] str2Chars = str2.toCharArray();
				Arrays.sort(str1Chars);
				Arrays.sort(str2Chars);
				result = Arrays.equals(str1Chars, str2Chars);
			}
		}
		return result;
	}

}
