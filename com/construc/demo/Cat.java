package com.construc.demo;

public class Cat implements Animal {
	private int legs;
	private int age;
	private String type;
	
	@Override
	public void animalProperties() {
		System.out.println("name is cat");
		System.out.println("it has "+legs+" legs and the age is "+age+" type is "+type);
		
	}
	
	public Cat() {
		super();
	}

	public Cat(int legs, int age, String type) {
		this.legs = legs;
		this.age = age;
		this.type = type;
	}

	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	

}
