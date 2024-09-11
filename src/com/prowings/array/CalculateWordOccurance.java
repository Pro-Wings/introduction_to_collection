package com.prowings.array;

public class CalculateWordOccurance {
	public static void main(String[] args) {
		
		System.out.println("main started!!");
		
		String input = "India is my country India has 28 states India is beautiful country";
		
		printEachWordWithOccurance(input);
		
		System.out.println("main ended!!");
		
	}

	public static void printEachWordWithOccurance(String input) {
		
		String[] words = input.split(" ");
		for(int i=0; i<words.length; i++)
		{
			int count = 0;
			for(int j=0; j<words.length; j++)
			{
				if(words[i].equalsIgnoreCase(words[j]))
					count++;
			}
			
			System.out.println(words[i] + "  :  "+ count);
		}
		
		
	}

}
