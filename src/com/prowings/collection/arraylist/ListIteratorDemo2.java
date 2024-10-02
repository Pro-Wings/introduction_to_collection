package com.prowings.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorDemo2 {
	
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add("abc");
		list.add(345);
		list.add(123);
		list.add(678);
		list.add(123);
		System.out.println(list);
		
		ListIterator ltr = list.listIterator(list.size());
		
		while(ltr.hasPrevious())
		{
			System.out.println(ltr.previous());
			System.out.println(ltr.previousIndex());
		}
		
		System.out.println(list);

	}

}
