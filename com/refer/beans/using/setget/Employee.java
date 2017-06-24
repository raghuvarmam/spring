package com.refer.beans.using.setget;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean,DisposableBean {
	private int eid;
	private String name;
	private Address addr;
	
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", addr=" + addr + "]";
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("enter the employee");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("destroy the employee");
		
	}
	
	
	
	
	

}
