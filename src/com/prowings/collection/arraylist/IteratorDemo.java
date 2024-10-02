package com.prowings.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
	
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add("abc");
		list.add(345);
		list.add(123);
		list.add(678);
		list.add(123);
		System.out.println(list);
		
		for(Object o : list)
		{
			System.out.println(o);
		}
		
		System.out.println("========================");
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext())
		{
			Object o = itr.next();
			System.out.println(o);
			if(o == "abc")
			  itr.remove();
		}
		System.out.println(list);
	}

}
