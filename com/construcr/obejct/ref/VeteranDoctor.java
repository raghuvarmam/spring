package com.construcr.obejct.ref;

public class VeteranDoctor extends Doctor {
	private String patient;
	private Animal animal;
	
	public VeteranDoctor(String name,String patient, Animal animal) {
		super(name);
		this.patient = patient;
		this.animal = animal;
	}

	public String getPatient() {
		return patient;
	}

	public void setPatient(String patient) {
		this.patient = patient;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	@Override
	public void checkAnimal(){
		super.checkAnimal();
		System.out.println("veteran doctor treats animals");
		animal.disease();
		animal.checkEyes();
	}

	@Override
	public String toString() {
		return "VeteranDoctor [patient=" + patient + ", animal=" + animal + "]";
	}
	
	

}
