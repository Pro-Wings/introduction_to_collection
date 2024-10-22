package com.prowings.collection.concurency;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
	
	public static void main(String[] args) {
		
		List<String> myList = new ArrayList<>();
		
		List<String> syncAl = Collections.synchronizedList(myList);
		
		syncAl.add("aaa");
		syncAl.add("aaa");
		syncAl.add("aaa");
		syncAl.add("aaa");
		syncAl.add("aaa");

		
		Iterator<String> itr = syncAl.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
//			syncAl.add("zzz");
		}
		
		CopyOnWriteArrayList<String> cwal = new CopyOnWriteArrayList<>();
		cwal.add("pppp");
		cwal.add("pppp");
		cwal.add("pppp");
		cwal.add("pppp");

		Iterator<String> itr2 = cwal.iterator();
		
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
			cwal.add("qqqqqq");
			cwal.remove("qqqqqq");
		}
		
	}

}
