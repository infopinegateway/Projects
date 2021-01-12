package com.spring.ioc.bean;

import java.math.BigDecimal;

public class EmployeeBean {
	
	private String empId;
	private String empName;
	private BigDecimal empSalary;
	
	public EmployeeBean() {
		super();
		this.empId = "";
		this.empName = "";
		this.empSalary = new BigDecimal(0);
	}
	
	@Override
	public String toString() {
		return "EmployeeBean [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	
	public EmployeeBean(String empId, String empName, BigDecimal empSalary) {		
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public BigDecimal getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(BigDecimal empSalary) {
		this.empSalary = empSalary;
	}
	
}
