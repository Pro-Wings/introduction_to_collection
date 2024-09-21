package com.prowings.collection.arraylist;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Vector;

public class ArrayListDemo2 {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		int capacity = 0;
		
		Vector vector = new Vector();
		
		vector.add(20);
		vector.add(10);
		vector.add(30);
		
		ArrayList mylist = new ArrayList(vector);
		
		mylist.add(444);
		mylist.add(444);
		
		mylist.trimToSize();
		capacity = getCapacity(mylist);
		
        System.out.println("Capacity: " + capacity);
		System.out.println("size = " + mylist.size());
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
