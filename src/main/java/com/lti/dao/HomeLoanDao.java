package com.lti.dao;


import java.util.List;

import com.lti.beans.entity.IncomeSalaried;
import com.lti.beans.entity.IncomeSelfEmployed;
import com.lti.beans.entity.LoanApplication;
import com.lti.beans.entity.Property;
import com.lti.beans.entity.User;

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
