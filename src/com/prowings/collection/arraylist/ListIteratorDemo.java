package com.prowings.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorDemo {
	
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add("abc");
		list.add(345);
		list.add(123);
		list.add(678);
		list.add(123);
		System.out.println(list);
		
		ListIterator ltr = list.listIterator();
		
		
		while(ltr.hasNext())
		{
			Object o = ltr.next();
			System.out.println(o);
//			ltr.remove();
//			ltr.add("zzz");
			if(o == "abc")
				ltr.set("WWW");
			
		}
		
		System.out.println(list);

	}

}
