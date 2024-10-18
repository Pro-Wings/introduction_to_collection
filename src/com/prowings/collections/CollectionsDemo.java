package com.prowings.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
	
	public static void main(String[] args) {
		
		List<String> myList = new ArrayList<>();
		
		myList.add("ddd");
		myList.add("aaa");
		myList.add("ccc");
		myList.add("bbb");
		
		System.out.println(myList);
		
		Collections.sort(myList);
		
		System.out.println(myList);
		
		Dog d1 = new Dog(10, "Lab");
		Dog d2 = new Dog(20, "GermanShepherd");
		Dog d3 = new Dog(30, "Hound");
		
		List<Dog> dogsList = new ArrayList<>();
		
		dogsList.add(d3);
		dogsList.add(d1);
		dogsList.add(d2);
		
		System.out.println(dogsList);
		Collections.sort(dogsList);
		System.out.println("After sorting : "+dogsList);
		
		System.out.println(Collections.min(dogsList));
		System.out.println(Collections.max(dogsList));
	}

}
