package com.lti.services;

import java.util.List;

import com.lti.beans.entity.IncomeSalaried;
import com.lti.beans.entity.IncomeSelfEmployed;
import com.lti.beans.entity.LoanApplication;
import com.lti.beans.entity.Property;
import com.lti.beans.entity.User;

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
