package com.training.qn38;

public class Trainee {
	private static final String BATCH_CODE = "CHNFSD";
	int employeeId;
	String employeeName;
	
	
	public Trainee(int employeeId,String employeeName) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	
	public void display() {
		
		System.out.println(getEmployeeId() + " " + getEmployeeName() +" " + BATCH_CODE);
	}
	

}
