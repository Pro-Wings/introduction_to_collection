package com.prowings.collection.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestBoundedBox {
	
	public static void main(String[] args) {
		
		BoundedBox<Double> box = new BoundedBox<>(100d);
		Double i = box.getObj();
		System.out.println(i);
		
		BoundedBox<Integer> box1 = new BoundedBox<>(100);
		Integer j = box1.getObj();
		System.out.println(j);

		BoundedBox<Float> box2 = new BoundedBox<>(100.50f);
		Float k = box2.getObj();
		System.out.println(k);

		BoundedBox<Long> box3 = new BoundedBox<>(109l);
		Long s = box3.getObj();
		System.out.println(s);

		BoundedBox<Number> box4 = new BoundedBox<>(109l);
		Number x = box4.getObj();
		System.out.println(x);

//		BoundedBox<Object> box5 = new BoundedBox<>(new Object());
//		Object z = box5.getObj();
//		System.out.println(x);
		
		
		List<Double> intList = Arrays.asList(10d,20d,30d);
		List<String> strList = Arrays.asList("aa","bb","cc");
		List<Object> objList = Arrays.asList("aa",100,"cc");
		
//		printList(intList);
	}
	
	public static void printList(List<? super Number> list)
	{
		System.out.println(list);
	}

}
