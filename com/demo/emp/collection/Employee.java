package com.demo.emp.collection;

import java.util.Collection;

public class Employee {
	
	private int eid;
	private String ename;
	private int sal;
	
	public Employee findEmp(int id){
		Collection<Employee> list=null;
		System.out.println("finemp called");
		for(Employee var:list){
			if(var.getEid()==id)
				return var;
		}	
		return null;	
	}


	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
	public Employee(int eid, String ename, int sal) {
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", sal=" + sal + "]";
	}
	
	

}
