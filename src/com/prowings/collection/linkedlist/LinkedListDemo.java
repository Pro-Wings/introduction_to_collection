package com.prowings.collection.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	
	/**
	 * This is my LinkedListDemo class's main method!!
	 * @param args
	 */
	public static void main(String[] args) {
		
		LinkedList myList = new LinkedList<>();
		
		myList.add(123);
		myList.add(null);
		myList.add(234);
		myList.add(234);
		myList.add(null);
		myList.add(456);

		myList.addFirst("aaa");
		myList.addLast("zzz");
		
		System.out.println(myList);
		
		System.out.println(myList.element());
		
		System.out.println(myList.get(2));
		System.out.println(myList.getFirst());
		System.out.println(myList.getLast());
		
		System.out.println(myList.offer("zzz999"));
		System.out.println(myList.offerFirst("aaa999"));
		System.out.println(myList.offerLast("ZZZ"));
		
		System.out.println(myList.peek());
		System.out.println(myList.peekFirst());
		System.out.println(myList.peekLast());
		
		System.out.println(myList.poll());
		System.out.println(myList.pollFirst());
		System.out.println(myList.pollLast());
		
		System.out.println(myList);

		myList.push("ABC");
		myList.addFirst("XYZ");
		
		System.out.println(myList);
		
		System.out.println("=================================");
		
		Iterator itr = myList.descendingIterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
