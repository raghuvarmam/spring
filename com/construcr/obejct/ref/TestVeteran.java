package com.construcr.obejct.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestVeteran {

	public static void main(String[] args) {
		ApplicationContext ac= new ClassPathXmlApplicationContext("ApplicationContext.xml");
		VeteranDoctor vd=(VeteranDoctor) ac.getBean("veterandoctor");
		vd.checkAnimal();
		System.out.println(vd);
	}

}
