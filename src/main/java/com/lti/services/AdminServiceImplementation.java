package com.lti.services;

import java.util.List;


import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lti.beans.Admin;
import com.lti.beans.LoanApplication;
import com.lti.dao.AdminDao;
import com.lti.excep.LoanApplicationException;


@Service("adminService")
public class AdminServiceImplementation implements AdminService {

	@Autowired
	public AdminDao admindao;
	
	@Transactional
	public boolean adminLogin(Admin admin) {
		return admindao.adminLogin(admin);
	}

	@Override
	@Transactional
	public List<LoanApplication> viewPendingApprovals() {
		return admindao.viewPendingApprovals();
	}

	@Override
	@Transactional
	public List<LoanApplication> approvedApplications() {
		return admindao.approvedApplications();
	}

	@Override
	@Transactional
	public List<LoanApplication> rejectedApplications() 
	{
		return admindao.rejectedApplications();
	}
	
	@Override
	@Transactional
	public List<LoanApplication> getAllApplications() 
	{
		return admindao.getAllApplications();
	}


	@Override
	public boolean updatestatus(int applicationId, String status) throws LoanApplicationException 
	{
		return admindao.updatestatus(applicationId, status);
	}

	@Override
	public LoanApplication findApplicationByUserId(int userId) throws LoanApplicationException 
	{
		return admindao.findApplicationByUserId(userId);
	}	
}
