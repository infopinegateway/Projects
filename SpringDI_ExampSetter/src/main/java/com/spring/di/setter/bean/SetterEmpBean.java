package com.spring.di.setter.bean;

public class SetterEmpBean {
	
	private String empName;
	private int empAge;
	private String empEmail;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	@Override
	public String toString() {
		return "SetterEmpBean [empName=" + empName + ", empAge=" + empAge + ", empEmail=" + empEmail + "]";
	}
	
	
	

}
