package com.prowings.collection.arraylist;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		int capacity = 0;
		
		ArrayList mylist = new ArrayList(20);
		capacity = getCapacity(mylist);
        System.out.println("Capacity: " + capacity);
		System.out.println("size = " + mylist.size());

		mylist.add(123);
		mylist.add(123);
		mylist.add(123);
		mylist.add(123);
		mylist.add(123);
		mylist.add(123);
		mylist.add(123);
		mylist.add(123);
		mylist.add(123);
		mylist.add(123);
		mylist.add(123);
		mylist.add(123);
		mylist.add(123);
		mylist.add(123);
		mylist.add(123);
		mylist.add(123);
		mylist.add(123);
		mylist.add(123);
		mylist.add(123);
		mylist.add(123);
		mylist.add(123);
		capacity = getCapacity(mylist);
        System.out.println("after adding  element : Capacity: " + capacity);
        System.out.println("after adding  element : size = " + mylist.size());


		System.out.println(mylist);

	}

    public static int getCapacity(ArrayList<?> list)
            throws NoSuchFieldException, IllegalAccessException {
        Field dataField = ArrayList.class.getDeclaredField("elementData");
        dataField.setAccessible(true); 

        Object[] elementData = (Object[]) dataField.get(list);

        return elementData.length;
    }

}
