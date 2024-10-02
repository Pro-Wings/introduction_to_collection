package com.prowings.collection.vector;

import java.util.Stack;

public class StackDemo3 {
	
	public static void main(String[] args) {
		
		Stack stack = new Stack<>();
		
		System.out.println(stack.capacity());
		System.out.println(stack.size());
		
		stack.push("abc");
		stack.push("abc");
		stack.push("pqr");
		stack.push("pqr");
		stack.push("pqr");
		stack.push("pqr");
		stack.push("pqr");
		stack.push("pqr");
		stack.push("pqr");
		stack.push("pqr");
		stack.push("xyz");
		
		
		System.out.println(stack);
		
		System.out.println(stack.capacity());
		System.out.println(stack.size());
		
	}

}
