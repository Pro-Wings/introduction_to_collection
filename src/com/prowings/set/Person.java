package com.prowings.set;

public class Person {
	
	private int age;
	private String country;
	private Float weight;

	public Person() {
		super();
	}

	public Person(int age, String country, Float weight) {
		super();
		this.age = age;
		this.country = country;
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Float getWeight() {
		return weight;
	}

	public void setWeight(Float weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", country=" + country + ", weight=" + weight + "]";
	}

	
	
}
