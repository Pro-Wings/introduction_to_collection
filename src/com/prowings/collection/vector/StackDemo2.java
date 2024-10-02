package com.prowings.collection.vector;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo2 {
	
	public static void main(String[] args) {
		
		Stack stack = new Stack<>();
		
		stack.push("abc");
		stack.push("pqr");
		stack.push("xyz");
		stack.push("zzz");
		
		System.out.println(stack);
		
		System.out.println(stack.search("pqr"));
		
		Iterator itr = stack.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
