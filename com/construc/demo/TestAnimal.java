package com.construc.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnimal {
	ApplicationContext context= new ClassPathXmlApplicationContext("ApplicationContext.xml");

	Animal a= (Animal) context.getBean("animal");
	a.animalProperties();

}
