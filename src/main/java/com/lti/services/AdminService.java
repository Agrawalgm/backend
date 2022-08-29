package com.lti.services;

import java.util.List;

import com.lti.beans.Admin;
import com.lti.beans.LoanApplication;
import com.lti.excep.LoanApplicationException;



public interface AdminService {

	public boolean adminLogin(Admin admin);
	
	public List<LoanApplication> viewPendingApprovals();
	List<LoanApplication> approvedApplications();
	List<LoanApplication> rejectedApplications();
	List<LoanApplication> getAllApplications();
	boolean updatestatus(int applicationId, String status) throws LoanApplicationException;
	LoanApplication findApplicationByUserId(int userId) throws LoanApplicationException;
}
