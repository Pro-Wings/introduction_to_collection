package com.prowings.collection.vector;

import java.util.Vector;

public class VectorDemo {
	
	public static void main(String[] args) {
		
		Vector v1 = new Vector(15);
		
		System.out.println("Vector's initial capacity :"+v1.capacity());
		System.out.println("Vector's initial size :"+v1.size());
		
		v1.add("abc");
		v1.addElement("123");
		v1.addElement("123");
		v1.addElement("123");
		v1.addElement("123");
		v1.addElement("123");
		v1.addElement("123");
		v1.addElement("123");
		v1.addElement("123");
		v1.addElement("123");
		v1.addElement("123");
		v1.addElement("123");
		v1.addElement("123");
		v1.addElement("123");
		v1.addElement("123");
		v1.addElement("123");
		
		System.out.println("Vector's capacity :"+v1.capacity());
		System.out.println("Vector's size :"+v1.size());
		
		Vector v2 = new Vector<>(v1);
		v2.addElement("999");
		
		System.out.println(v2);
		System.out.println("Vector V2 capacity :"+v2.capacity());
		System.out.println("Vector V2 size :"+v2.size());
	}

}
