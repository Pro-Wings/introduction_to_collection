package com.prowings.collections;

public class Dog implements Comparable<Dog> {
	
	private int id;
	private String name;
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dog(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Dog [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Dog o) {
		
		return this.getName().compareTo(o.getName());
	}
	
}
