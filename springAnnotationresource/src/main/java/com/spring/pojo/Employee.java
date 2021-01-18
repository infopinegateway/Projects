package com.spring.pojo;

import javax.annotation.Resource;

public class Employee {
	private String Id;
	private String name;
	
	@Resource(name ="mycomp")
	private Company company;

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + ", company=" + company + "]";
	}
	
	

	
}
