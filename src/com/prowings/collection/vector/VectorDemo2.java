package com.prowings.collection.vector;

import java.util.Vector;

public class VectorDemo2 {
	
	public static void main(String[] args) {
		
		Vector v1 = new Vector<>(15, 5);
		
		System.out.println("Vector's initial capacity :"+v1.capacity());
		System.out.println("Vector's initial size :"+v1.size());
		v1.addElement(123);
		v1.add(345);
		v1.add(345);
		v1.add(345);
		v1.add(345);
		v1.add(345);
		v1.add(345);
		v1.add(345);
		v1.add(345);
		v1.add(345);
		v1.add(345);
		v1.add(345);
		v1.add(345);
		v1.add(345);
		v1.add(345);
		v1.add(345);
		v1.add(345);
		v1.add(345);
		v1.add(345);
		v1.add(345);
		v1.add(345);

		v1.trimToSize();
		
		v1.ensureCapacity(30);
		System.out.println("Vector's initial capacity :"+v1.capacity());
		System.out.println("Vector's initial size :"+v1.size());
		
		System.out.println("First Elelemnt : "+v1.firstElement());
		System.out.println("Last Elelemnt : "+v1.lastElement());
	}

}
