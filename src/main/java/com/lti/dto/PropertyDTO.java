package com.lti.dto;

public class PropertyDTO {
//	private int propertyId;
	
	private String propertyName;
	
	private String propertyLocation;
	
	private double amount;
	
	private int userId;

	public PropertyDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PropertyDTO(String propertyName, String propertyLocation, double amount, int userId) {
		super();
//		this.propertyId = propertyId;
		this.propertyName = propertyName;
		this.propertyLocation = propertyLocation;
		this.amount = amount;
		this.userId = userId;
	}
//
//	public int getPropertyId() {
//		return propertyId;
//	}
//
//	public void setPropertyId(int propertyId) {
//		this.propertyId = propertyId;
//	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public String getPropertyLocation() {
		return propertyLocation;
	}

	public void setPropertyLocation(String propertyLocation) {
		this.propertyLocation = propertyLocation;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	
}