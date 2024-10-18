package com.prowings.collection.generics;

public class BoundedBox<T extends Number> {
	
	private T obj;
	
	public BoundedBox(T obj) {
		this.obj = obj;
	}

	public T getObj()
	{
		return obj;
	}

	public void setObj(T obj)
	{
		this.obj = obj;
	}
	
}
