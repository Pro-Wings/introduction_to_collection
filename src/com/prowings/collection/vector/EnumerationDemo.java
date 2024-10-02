package com.prowings.collection.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class EnumerationDemo {
	public static void main(String[] args) {
		
		Vector vector = new Vector<>();
		
		vector.addElement(123);
		vector.addElement(345);
		vector.addElement(567);
		vector.addElement(789);
		
		System.out.println(vector);
		
		System.out.println("--------Using Iterator--------");
		
//		Iterator itr = vector.iterator();
//		
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//			vector.addElement("abc");
//		}

		System.out.println("--------Using ListIterator--------");
		
//		ListIterator ltr = vector.listIterator();
//		
//		while(ltr.hasNext())
//		{
//			System.out.println(ltr.next());
//			vector.addElement("abc");
//		}

		System.out.println("--------Using Enumeration--------");
		
		Enumeration en = vector.elements();
		
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
			vector.addElement("abc");
		}
		
	}

}
