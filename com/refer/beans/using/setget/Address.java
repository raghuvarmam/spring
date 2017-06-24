package com.refer.beans.using.setget;

public class Address {
	private String pno;
	private String email;
	
	public String getPno() {
		return pno;
	}
	public void setPno(String pno) {
		this.pno = pno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Address [pno=" + pno + ", email=" + email + "]";
	}
	
	

}
