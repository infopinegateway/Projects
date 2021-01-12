package com.spring.di.constructor.bean;

public class StudConst {
	
	private String studName;
	private String studRollNo;	
	private String studClass;
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getStudRollNo() {
		return studRollNo;
	}
	public void setStudRollNo(String studRollNo) {
		this.studRollNo = studRollNo;
	}
	public String getStudClass() {
		return studClass;
	}
	public void setStudClass(String studClass) {
		this.studClass = studClass;
	}
	@Override
	public String toString() {
		return "StudConst [studName=" + studName + ", studRollNo=" + studRollNo + ", studClass=" + studClass + "]";
	}
	public StudConst(String studName, String studRollNo, String studClass) {
		super();
		this.studName = studName;
		this.studRollNo = studRollNo;
		this.studClass = studClass;
	}
	
	
	

}
