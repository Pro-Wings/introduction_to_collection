package com.prowings.collection.concurency;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
	
	public static void main(String[] args) {
		
		Hashtable<String, Integer> ht = new Hashtable<>();
		ht.put("aaa", 123);
		ht.put("bbb", 123);
		ht.put("ccc", 123);
//		ht.put(null, 123);
//		ht.put("aaa", null);
		System.out.println(ht);
		
		Enumeration<String> allKeys = ht.keys();
		
		while(allKeys.hasMoreElements())
		{
			System.out.println(allKeys.nextElement());
			ht.put("zzz", 2323);
		}
		
		System.out.println("----------------------");
		
		Set<String> keySet = ht.keySet();
		
		Iterator<String> itr = keySet.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
//			ht.put("xxx", 111);
		}
		
		System.out.println("----------------------");
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("aaa", 123);
		hm.put(null, 123);
		hm.put("aaa", null);
		System.out.println(hm);
		
		Map<String, Integer> syncHm = Collections.synchronizedMap(hm);
		
		System.out.println(syncHm);
		
		syncHm.put(null, null);
		
		System.out.println(syncHm);
		
		System.out.println("--------Iterator on syncHm--------------");
		Set<String> keySetOfSynHm = syncHm.keySet();
		
		Iterator<String> itr11 = keySetOfSynHm.iterator();
		
		while(itr11.hasNext())
		{
			System.out.println(itr11.next());
//			syncHm.put("qqq", 1212);
		}
		System.out.println("----------------------");

		
		// ======= both above maps are Blocking in nature due to their synchnonized methods/structure

		ConcurrentHashMap<String, Integer> concHm = new ConcurrentHashMap<>();
		
		concHm.put("aaa", 123);
		concHm.put("bbb", 123);
		concHm.put("ccc", 24334);
//		concHm.put(null, 123);
//		concHm.put("aaa", null);
		System.out.println(concHm);
		
		System.out.println("--------Iterator on concHm--------------");
		Set<String> keySetOfConHm = concHm.keySet();
		
		Iterator<String> itr22 = keySetOfConHm.iterator();
		
		while(itr22.hasNext())
		{
			System.out.println(itr22.next());
			concHm.put("ddd", 24334);
		}
		System.out.println("----------------------");
		
	}

}
