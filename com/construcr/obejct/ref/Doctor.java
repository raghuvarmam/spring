package com.construcr.obejct.ref;

public class Doctor {
	private String name;
	
	
	public Doctor(String dname) {
		this.name=dname;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void checkAnimal(){
		System.out.println("cure the disease");
	}

}
