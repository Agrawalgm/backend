package com.lti.dto;

public class IncomeSalariedDTO {
//	private int srNo;
	
	private int retirementAge;
	private double monthlySalary;
	private String organization;
	private int userId;
	public IncomeSalariedDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IncomeSalariedDTO(int retirementAge, double monthlySalary, String organization, int userId) {
		super();
//		this.srNo = srNo;
		this.retirementAge = retirementAge;
		this.monthlySalary = monthlySalary;
		this.organization = organization;
		this.userId = userId;
	}
//	public int getSrNo() {
//		return srNo;
//	}
//	public void setSrNo(int srNo) {
//		this.srNo = srNo;
//	}
	public int getRetirementAge() {
		return retirementAge;
	}
	public void setRetirementAge(int retirementAge) {
		this.retirementAge = retirementAge;
	}
	public double getMonthlySalary() {
		return monthlySalary;
	}
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
}
