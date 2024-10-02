package com.prowings.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMethodsDemo2 {
	
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add(123);
		list.add("abc");
		list.add(345);
		
		System.out.println("List 1 : "+list);
		
		for(Object o : list)
		{
			System.out.println(o);
		}
		
		System.out.println("=======================");
		//cursor - Iterator
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext()) {
			if(itr.next()=="abc")
			itr.remove();
		}

		System.out.println("=======================");

		System.out.println(list);
		
	}

}
