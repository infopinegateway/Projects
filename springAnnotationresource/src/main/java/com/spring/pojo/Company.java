package com.spring.pojo;

public class Company {
	private String cname;
	private String clocation;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getClocation() {
		return clocation;
	}
	public void setClocation(String clocation) {
		this.clocation = clocation;
	}
	@Override
	public String toString() {
		return "Company [cname=" + cname + ", clocation=" + clocation + "]";
	}
	
	

}
