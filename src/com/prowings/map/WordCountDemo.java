package com.prowings.map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class WordCountDemo {
	
	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		String input = "India is my country India has 28 states India is beautiful India is biggest country in asia";
		printEachWordWithOccurance(input);
		System.out.println("main method ended!!");
		
	}

	public static void printEachWordWithOccurance(String input) {
		System.out.println("printEachWordWithOccurance() started!!");
		System.out.println("Input line is : "+input);
		String[] words = input.split(" ");
		HashMap<String, Integer> wordCountMap = new HashMap<>();
		for(String word : words)
		{
			if(wordCountMap.containsKey(word))
				wordCountMap.put(word, wordCountMap.get(word)+1);
			else
				wordCountMap.put(word, 1);
		}
		Set<Entry<String, Integer>> entries = wordCountMap.entrySet();
		for(Entry entry : entries)
			System.out.println("Word :"+entry.getKey() +"  "+"Count : "+entry.getValue());
		System.out.println("printEachWordWithOccurance() ended!!");
	}

}
