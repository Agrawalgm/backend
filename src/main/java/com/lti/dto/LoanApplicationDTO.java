package com.lti.dto;

public class LoanApplicationDTO {
	private double loanAmount;
	
	private int tenure;
	
	private int interest;
	private String status;
	private int userId;
	
	
	public LoanApplicationDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public LoanApplicationDTO(double loanAmount, int tenure, int interest, String status, int userId) {
		super();
		this.loanAmount = loanAmount;
		this.tenure = tenure;
		this.interest = interest;
		this.status = status;
		this.userId = userId;
	}


   public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public int getInterest() {
		return interest;
	}
	public void setInterest(int interest) {
		this.interest = interest;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
}