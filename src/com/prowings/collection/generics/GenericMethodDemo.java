package com.prowings.collection.generics;

public class GenericMethodDemo {
	
	
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    
    
    
	public Integer division(Integer n1, Integer n2)
	{
		int result = n1 / n2;
		System.out.println("Division is : "+result);
		return result;
	}

}
