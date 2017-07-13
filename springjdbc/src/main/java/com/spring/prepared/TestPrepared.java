package com.spring.prepared;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestPrepared {
	public static void main(String[] args) {
	    ApplicationContext ctx=new ClassPathXmlApplicationContext("jdbc.xml");  

		EmployeeDAO ed=  (EmployeeDAO) ctx.getBean("eprepared");
		//EmployeeDAOImpl e1=(EmployeeDAOImpl) ctx.getBean("eprepared");
//		Employee e= new Employee();
//		e.setId(2);
//		e.setName("tarun");
//		e.setSalary(45000);
		//e1.saveEmployeeByPreparedStatement(e);
		//e1.updateEmployeeByPreparedStatement(e);
		//e1.deleteEmployee(4);
		System.out.println(ed.getEmployeebyId(1));
	}
}