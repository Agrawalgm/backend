package com.lti.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.LoanApplication;

import com.lti.beans.IncomeSalaried;
import com.lti.beans.IncomeSelfEmployed;

import com.lti.beans.Property;
import com.lti.beans.User;
import com.lti.dao.HomeLoanDao;



@Service("homeLoanService")
public class HomeLoanServiceImpl implements HomeLoanService {

	@Autowired
	public HomeLoanDao homeLoanDao;
	
	
	@Transactional
	public boolean registerUser(User user) {
		
		return homeLoanDao.registerUser(user);
	}
	

	@Transactional
	public User loginProcess(User users) {

		return homeLoanDao.loginProcess(users);
	}

	@Transactional
	public boolean addIncomeSalariedInfo(IncomeSalaried incomeSalaried) {
		return homeLoanDao.addIncomeSalariedInfo(incomeSalaried);
	}

	@Transactional
	public boolean addIncomeSelfEmployedInfo(IncomeSelfEmployed incomeSelfEmployed) {
		return homeLoanDao.addIncomeSelfEmployedInfo(incomeSelfEmployed);
	}

	@Transactional
	public boolean addPropertyInfo(Property property) {
		return homeLoanDao.addPropertyInfo(property);
	}

	@Transactional
	public boolean addLoanInfo(LoanApplication appln) {
		return homeLoanDao.addLoanInfo(appln);
	}

	@Override
	public User getUserInfobyUserId(int userId) {
		// TODO Auto-generated method stub
		return homeLoanDao.getUserInfobyUserId(userId);
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return homeLoanDao.getAllUsers();	
		
	}

	

	
	
	
}
