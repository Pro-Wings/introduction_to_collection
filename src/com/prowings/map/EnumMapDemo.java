package com.prowings.map;

import java.util.EnumMap;
import java.util.Iterator;
import java.util.Set;

enum Days
{
	TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY,MONDAY
}

enum Size
{
	SMALL,MEDIUM,LARGE,EXTRALARGE;
}

public class EnumMapDemo {
	
	public static void main(String[] args) {
		
		
		EnumMap<Days, Integer> daysMap = new EnumMap(Days.class);
		
		daysMap.put(Days.SUNDAY, 1);
		daysMap.put(Days.MONDAY, 2);
		daysMap.put(Days.TUESDAY, 3);
		daysMap.put(Days.WEDNESDAY, 4);
		daysMap.put(Days.THURSDAY, 5);
		daysMap.put(Days.FRIDAY, 6);
		daysMap.put(Days.SATURDAY, 7);
//		daysMap.put(null, 8);
//		daysMap.put(Size.LARGE, null);
		
		System.out.println(daysMap);
		
		Set<Days> allDays = daysMap.keySet();
		
		Iterator<Days> itr = allDays.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		System.out.println("---------------------------");
		
		EnumMap<Size, Integer> pizzaSize = new EnumMap<>(Size.class);
		
		pizzaSize.put(Size.SMALL, 10);
		pizzaSize.put(Size.LARGE, 30);
		pizzaSize.put(Size.MEDIUM, 20);
		pizzaSize.put(Size.EXTRALARGE, 40);
		
		System.out.println(pizzaSize);
		
	}

}
