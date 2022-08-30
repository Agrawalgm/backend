package com.lti.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lti.beans.entity.Admin;
import com.lti.beans.entity.LoanApplication;
import com.lti.excep.LoanApplicationException;
import com.lti.services.AdminServiceImplementation;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	public AdminServiceImplementation adminsint;
	
	//THIS METHOD IS USED FOR ADMIN LOGIN IN WHICH WE ARE 
	//POSTING THE DATA
	//http://localhost:8090/admin/adminlogin
	@PostMapping(value="/adminlogin")
	public boolean adminlogin(@RequestBody Admin admin) 
	{
		return adminsint.adminLogin(admin);
	}
	
	//Function will return the pending applications on admin's dashboard. 
	@GetMapping(value="/pendingapplns")
	public List<LoanApplication> getPendingList()
	{
		List<LoanApplication> pending_list=adminsint.viewPendingApprovals();
		return pending_list;
	}
	
	//Function will return the approved applications on admin's dashboard.
	@GetMapping(value="/approvedapplns")
	public List<LoanApplication> getApprovedList()
	{
		List<LoanApplication> approved_list=adminsint.approvedApplications();
		return approved_list;	
	}
	
	//Function will return the rejected applications on admin's dashboard.
	@GetMapping(value="/rejectedapplns")
	public List<LoanApplication> getRejectedList(){
		List<LoanApplication> rejected_list=adminsint.rejectedApplications();
		return rejected_list;
		
	}
	
	//Function will return all applications on admin's dashboard.
	@GetMapping(value="/allapplns")
	public List<LoanApplication> getApplnList(){
		List<LoanApplication> all_application_list=adminsint.getAllApplications();
		return all_application_list;
		
	}
	
	//Function will use to update the status of application using application id.
	@PutMapping("/update-application-status/{application_id}/{status}")
	public boolean updateEmp(@PathVariable("application_id") int applicationId, @PathVariable("status") String status)
			throws LoanApplicationException 
	{
		boolean response = adminsint.updatestatus(applicationId, status);
		return response;
	}
	
	//Function will be used to return the application data with user id.
	@GetMapping(path = "/get-application-by-userId/{userId}")
	public LoanApplication findApplicationByUserId(@PathVariable("userId") int userId) throws LoanApplicationException 
	{
		System.out.println(userId+"controller");
		LoanApplication application = adminsint.findApplicationByUserId(userId);
		System.out.println(application);
	    return application;
	}
	
	//Function will be used to return the application data with user id.
		@GetMapping(path = "/get-application-by-email/{email}")
		public LoanApplication findApplicationByEmailId(@PathVariable("email") String email) throws LoanApplicationException 
		{
			System.out.println(email+"controller");
			LoanApplication application = adminsint.findApplicationByEmailId(email);
			System.out.println(application);
		    return application;
		}
}
