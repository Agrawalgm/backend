package com.lti.dto;

public class IncomeSelfEmployedDTO {
//	private int srNo;
	private double turnover;
	private String natureOfBusiness;
	private int userId;
	public IncomeSelfEmployedDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IncomeSelfEmployedDTO(double turnover, String natureOfBusiness, int userId) {
		super();
//		this.srNo = srNo;
		this.turnover = turnover;
		this.natureOfBusiness = natureOfBusiness;
		this.userId = userId;
	}
//	public int getSrNo() {
//		return srNo;
//	}
//	public void setSrNo(int srNo) {
//		this.srNo = srNo;
//	}
	public double getTurnover() {
		return turnover;
	}
	public void setTurnover(double turnover) {
		this.turnover = turnover;
	}
	public String getNatureOfBusiness() {
		return natureOfBusiness;
	}
	public void setNatureOfBusiness(String natureOfBusiness) {
		this.natureOfBusiness = natureOfBusiness;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
}