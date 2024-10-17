package com.prowings.collection.generics;

public class TestBox {
	
	public static void main(String[] args) {
		
		Box<Integer> obj = new Box();
		
		obj.set(100);
		
		Integer s = obj.get();
		
		System.out.println(s);
		
	}

}
