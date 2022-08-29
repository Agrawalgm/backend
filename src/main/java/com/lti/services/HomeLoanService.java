package com.lti.services;

import com.lti.beans.LoanApplication;

import java.util.List;

import com.lti.beans.IncomeSalaried;
import com.lti.beans.IncomeSelfEmployed;

import com.lti.beans.Property;
import com.lti.beans.User;

public interface HomeLoanService {

	public boolean registerUser(User users);
	public User loginProcess(User user);
	public boolean addIncomeSalariedInfo(IncomeSalaried incomeSalaried);
	public boolean addIncomeSelfEmployedInfo(IncomeSelfEmployed incomeSelfEmployed);
	public boolean addPropertyInfo(Property property);
	public boolean addLoanInfo(LoanApplication appln);
	public User getUserInfobyUserId(int userId);
	public List<User> getAllUsers();
	
}
