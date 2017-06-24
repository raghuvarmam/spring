package com.refer.beans.using.setget;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmp {

	public static void main(String[] args) {

		ApplicationContext ac= new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Employee e= (Employee) ac.getBean("empset");
		System.out.println(e.getAddr());
		System.out.println(e);
	}

}
