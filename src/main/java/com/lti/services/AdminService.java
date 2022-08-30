package com.lti.services;


import java.util.List;

import com.lti.beans.entity.Admin;
import com.lti.beans.entity.LoanApplication;
import com.lti.excep.LoanApplicationException;



public interface AdminService {

	public boolean adminLogin(Admin admin);// if there are parameters then it is a post,update and delete method otherwise it is a get  
	public List<LoanApplication> viewPendingApprovals();
	List<LoanApplication> approvedApplications();
	List<LoanApplication> rejectedApplications();
	List<LoanApplication> getAllApplications();
	boolean updatestatus(int applicationId, String status) throws LoanApplicationException;
	LoanApplication findApplicationByUserId(int userId) throws LoanApplicationException;
	LoanApplication findApplicationByEmailId(String email) throws LoanApplicationException;

	
}
