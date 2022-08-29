package com.lti.dao;


import java.util.List;
import com.lti.beans.Admin;
import com.lti.beans.LoanApplication;
import com.lti.excep.LoanApplicationException;



public interface AdminDao {

	public boolean adminLogin(Admin admin);// if there are parameters then it is a post,update and delete method otherwise it is a get  
	public List<LoanApplication> viewPendingApprovals();
	List<LoanApplication> approvedApplications();
	List<LoanApplication> rejectedApplications();
	List<LoanApplication> getAllApplications();
	boolean updatestatus(int applicationId, String status) throws LoanApplicationException;
	LoanApplication findApplicationByUserId(int userId) throws LoanApplicationException;
	
}
