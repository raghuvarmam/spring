package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {  
	    ApplicationContext ctx=new ClassPathXmlApplicationContext("jdbc.xml");  
	      
	    EmployeyDAO dao=(EmployeyDAO)ctx.getBean("edao");  
	    int status=dao.saveEmployee(new Employee(103,"Ajay",25000));  
	    System.out.println(status);  
	}

}
