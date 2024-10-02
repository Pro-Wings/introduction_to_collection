package com.prowings.collection.arraylist;

import java.util.ArrayList;

public class ArrayListMethodsDemo {
	
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add(123);
		list.add("abc");
		list.add(345);
		list.add("abc");
		list.add("pqr");
		list.add(123);
		
		System.out.println("List 1 : "+list);
		
		ArrayList list2 = new ArrayList();
		list2.add(888);
		list2.add("qqq");
		list2.add("123");
		System.out.println("List 2 : "+list2);
		
		list.addAll(list2);
		System.out.println("List 1 after adding list2: "+list);
		
//		list.remove("abc");
		list.removeAll(list2);
		System.out.println("List 1 after remove: "+list);
		
		System.out.println("List 1 elements : "+list);
		System.out.println("List 2 elements : "+list2);
		System.out.println("List 1 contains pqr ? : "+list.contains("pqrs"));
		System.out.println("List 1 contains pqr ? : "+list.containsAll(list2));
		
		System.out.println(">>>>>>>>>>>>><<<<<<<<<<<<<");
		ArrayList list3 = new ArrayList();
		list3.add(123);
		list3.add("aaa");
		list3.add(345);
		list3.add("bbb");
		System.out.println("List 3 elements :" + list3);

		ArrayList list4 = new ArrayList();
		list4.add(123);
		list4.add("aaa");
		System.out.println("List 4 elements :" + list4);

		list3.retainAll(list4);
		System.out.println("List 3 elements after retainAll:" + list3);
		
		list3.clear();
		
		System.out.println("List3 current size : "+list3.size());
		System.out.println("List3 is empty : "+list3.isEmpty());
		
		System.out.println(">>>>>>>>>>>>><<<<<<<<<<<<<");
		
		ArrayList list5 = new ArrayList();
		list5.add(123);
		list5.add("abc");
		ArrayList list6 = new ArrayList();
		list6.add(123);
		list6.add("abc");
		System.out.println(list5.equals(list6));
		
		System.out.println(list5.hashCode());
		System.out.println(list6.hashCode());
	}

}
