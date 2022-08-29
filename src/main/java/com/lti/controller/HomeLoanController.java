package com.lti.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lti.beans.IncomeSalaried;
import com.lti.beans.IncomeSelfEmployed;
import com.lti.beans.LoanApplication;
import com.lti.beans.Property;
import com.lti.beans.User;
import com.lti.dto.IncomeSalariedDTO;
import com.lti.dto.IncomeSelfEmployedDTO;
import com.lti.dto.LoanApplicationDTO;
import com.lti.dto.PropertyDTO;
import com.lti.services.HomeLoanService;

@CrossOrigin(origins="*")
@RequestMapping("/homeloanappln")
@RestController
public class HomeLoanController {

	@Autowired
	public HomeLoanService hlservice;
	
//  Registering new User	
//  http://localhost:8090/homeloanappln/adduser
	
	@PostMapping("/adduser")
	public User registerUser(@RequestBody User user) {
		 hlservice.registerUser(user);
		return user;
	}
	
//  User Login
//  http://localhost:8090/homeloanappln/userlogin
	@PostMapping("/userlogin")
	public User userlogin(@RequestBody User user) {
		return hlservice.loginProcess(user);
		
	}
	
	// Adding the details of income salary of registered user	
//  http://localhost:8090/homeloanappln/addincome-salaried		
	
	@PostMapping("/addincome-salaried")
	public boolean AddIncomeSalariedInfo(@RequestBody IncomeSalaried incomeSalaried) {
		return hlservice.addIncomeSalariedInfo(incomeSalaried);
	}
	
//	Adding the details of self employed income of registered user 
//  http://localhost:8090/homeloanappln/addincome-selfemp	
	
	@PostMapping("/addincome-selfemp")
	public boolean AddIncomeSelfEmpInfo(@RequestBody IncomeSelfEmployed incomeSelfEmployed) {
		return hlservice.addIncomeSelfEmployedInfo(incomeSelfEmployed);
	}
	
	// Adding property details of registered user
	// http://localhost:8090/homeloanappln/addpropertydet	
	
	@PostMapping("/addpropertydet")
	public boolean AddPropertyInfo(@RequestBody Property property) {
	return hlservice.addPropertyInfo(property);
	}
	
// Addding the loan application details of registered user	
// http://localhost:8090/homeloanappln/addloanappdet
	@PostMapping("/addloanappdet")
	public boolean addLoanInfo(@RequestBody LoanApplication appln) {
		return hlservice.addLoanInfo(appln);
	}
	
//  Fetching the list of all users	
//	http://localhost:8090/homeloanappln/users
	
	@GetMapping("/users")
	public List<User> getAllUsers() {
		List<User> usrList=hlservice.getAllUsers();
		return usrList;
	}

	
//  Fetching user details through user id	
//  http://localhost:8090/homeloanappln/users/{uid}	
	
	@GetMapping("/users/{uid}")
	public User getUserbyId(@PathVariable("uid")int userId) {
		User u=hlservice.getUserInfobyUserId(userId);
		return u;
	}
	
//  http://localhost:8090/homeloanappln/incomesalariedto	
	
	@PostMapping("/incomesalariedto")
	public IncomeSalaried AddIncomeSalariedInfoDTO(@RequestBody IncomeSalariedDTO incomesalarieddto)
	{
		IncomeSalaried tempIncomeSalaried = new IncomeSalaried();
		tempIncomeSalaried.setRetirementAge(incomesalarieddto.getRetirementAge());
		tempIncomeSalaried.setMonthlySalary(incomesalarieddto.getMonthlySalary());
		tempIncomeSalaried.setOrganization(incomesalarieddto.getOrganization());
		
		User u = new User();
		u.setUserId(incomesalarieddto.getUserId());
		tempIncomeSalaried.setUser(u);
		hlservice.addIncomeSalariedInfo(tempIncomeSalaried);
		return tempIncomeSalaried;
	}
	
//  http://localhost:8090/homeloanappln//selfemployedincomedto
	@PostMapping("/selfemployedincomedto")
	public IncomeSelfEmployed AddSelfIncomeSalariedInfoDTO(@RequestBody IncomeSelfEmployedDTO incomeselfemployeddto) {
		IncomeSelfEmployed incomeSelfEmployed = new IncomeSelfEmployed();
		incomeSelfEmployed.setTurnover(incomeselfemployeddto.getTurnover());
		incomeSelfEmployed.setNatureOfBusiness(incomeselfemployeddto.getNatureOfBusiness());
		
		User u = new User();
		u.setUserId(incomeselfemployeddto.getUserId());
		
		incomeSelfEmployed.setUser(u);
		hlservice.addIncomeSelfEmployedInfo(incomeSelfEmployed);
		return incomeSelfEmployed;
	}
	
//  http://localhost:8090/homeloanappln/propertydto	
	@PostMapping("/propertydto")
	public Property AddPropertyInfoDTO(@RequestBody PropertyDTO propertydto) {
		Property tempProperty = new Property();
		tempProperty.setPropertyName(propertydto.getPropertyName());
		tempProperty.setPropertyLocation(propertydto.getPropertyLocation());
		tempProperty.setAmount(propertydto.getAmount());
		
		User  u = new User();
		u.setUserId(propertydto.getUserId());
		
		tempProperty.setUser(u);
		hlservice.addPropertyInfo(tempProperty);
		
		return tempProperty;
	}
	
//  http://localhost:8090/homeloanappln/loanapplicationdto
	@PostMapping("/loanapplicationdto")
	public LoanApplication AddLoanApplicationInfoDTO(@RequestBody LoanApplicationDTO loanapplicationdto) {
		LoanApplication tempLoanApplication = new LoanApplication();
		tempLoanApplication.setLoanAmount(loanapplicationdto.getLoanAmount());
		tempLoanApplication.setTenure(loanapplicationdto.getTenure());
		tempLoanApplication.setInterest(loanapplicationdto.getInterest());
		tempLoanApplication.setStatus(loanapplicationdto.getStatus());
		
		User  u = new User();
		u.setUserId(loanapplicationdto.getUserId());
		
		tempLoanApplication.setUser(u);
		hlservice.addLoanInfo(tempLoanApplication);
		return tempLoanApplication;
	}
	
	
	

}