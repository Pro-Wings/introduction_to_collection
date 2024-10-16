package com.prowings.collection.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionToArray2 {
	
	public static void main(String[] args) {
		
		Laptop l1 = new Laptop("Lenovo", 98000, "Black");
		Laptop l2 = new Laptop("HP", 80000, "Silver");
		Laptop l3 = new Laptop("Apple", 99000, "Gold");
		
		List<Laptop> laptopList = new ArrayList<Laptop>();
		
		laptopList.add(l1);
		laptopList.add(l2);
		laptopList.add(l3);
		
		System.out.println("List of Laptops : "+laptopList);
		
		
//		Object[] laps = laptopList.toArray();
//		
//		for(Object l : laps)
//		{
//			Laptop ll = (Laptop) l; //casting may lead to Bugs
//			if(ll.getColor().equals("Silver"))
//				System.out.println(l);
//		}

		Laptop[] laps = laptopList.toArray(new Laptop[0]);
		
		for(Laptop l : laps)
		{
			if(l.getColor().equals("Silver"))
				System.out.println(l);
		}
		
		
		
	}

}
