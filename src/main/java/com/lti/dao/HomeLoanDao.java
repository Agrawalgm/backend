package com.lti.dao;


import com.lti.beans.LoanApplication;

import java.util.List;

import com.lti.beans.IncomeSalaried;
import com.lti.beans.IncomeSelfEmployed;
import com.lti.beans.Property;
import com.lti.beans.User;

public interface HomeLoanDao {

	public boolean registerUser(User user);
	public User loginProcess(User users);
	public boolean addIncomeSalariedInfo(IncomeSalaried incomeSalaried);
	public boolean addIncomeSelfEmployedInfo(IncomeSelfEmployed incomeSelfEmployed);
	public boolean addPropertyInfo(Property property);
	public boolean addLoanInfo(LoanApplication appln);
	public User getUserInfobyUserId(int userId);
	public List<User> getAllUsers();
	public User send(String to);
}
