package com.demo.emp.collection;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmp {

	public static void main(String[] args) {

		ApplicationContext ac= new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Employee e1=(Employee) ac.getBean("emp1");
		Employee e2=(Employee) ac.getBean("emp2");
		
		Collection<Employee> c = new ArrayList<Employee>();
		c.add(e1);
		c.add(e2);
		e2.findEmp(1);
		
		//System.out.println(c);
		c.forEach(v->System.out.println(v));		
		
	}
	

}
