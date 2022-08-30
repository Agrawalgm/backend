package com.lti.dao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import com.lti.beans.entity.Admin;
import com.lti.beans.entity.LoanApplication;
import com.lti.excep.LoanApplicationException;




@Repository("adminDao")
public class AdminDaoImplementation implements AdminDao {

	@PersistenceContext
	EntityManager entitymanager;
	//Function used to check that admin login credentials are valid or not.
	@Transactional
	public boolean adminLogin(Admin admin)
	 {
		boolean flag = false;
		Admin a = null;
		 try 
		     {			
				String username =  admin.getUserName();
				String password = admin.getPassword();	
				a = (Admin)entitymanager.createQuery("select a from Admin a where a.userName=:userName").setParameter("userName", username).getSingleResult();
				if(( a.getUserName().equals(username) ) && ( a.getPassword().equals(password) ) ) 
				{	
					flag = true;
				}
				else 
					flag = false;
		    }
		    catch(Exception e) { 
		    	System.out.println("Error:"+e);	 
			}
		return flag;
	 }
               

	public List<LoanApplication> viewPendingApprovals() 
	 {
		//String prm ="pending";
		//TypedQuery<Product> qr = em.createQuery("select p from Product p where p.category.id=:category_id",Product.class);
		Query qry0 = entitymanager.createQuery("Select la from LoanApplication la where status=:prm");
		qry0.setParameter("prm", "pending");
		List<LoanApplication> pending_app_list=qry0.getResultList();
		return pending_app_list;
	 }

	@Override
	public List<LoanApplication> approvedApplications() 
	 {
		Query qry2 = entitymanager.createQuery("Select la from LoanApplication la where status=:prm");
		qry2.setParameter("prm", "Approved");
		List<LoanApplication> approved_app_list =qry2.getResultList();
		return approved_app_list;
	 }


	@Override
	public List<LoanApplication> rejectedApplications() 
	 {
		Query qry3 = entitymanager.createQuery("Select la from LoanApplication la where status=:prm");
		qry3.setParameter("prm", "Rejected");
		List<LoanApplication> rejected_app_list=qry3.getResultList();
		return rejected_app_list;
	 } 
	

	@Override
	public List<LoanApplication> getAllApplications() 
	 {	
		Query qry1=entitymanager.createQuery("Select la from LoanApplication la",LoanApplication.class);
		List<LoanApplication> all_app_list=qry1.getResultList();
		return all_app_list;
	 }

	@Override
	@Transactional
	public boolean updatestatus(int applicationId, String status) throws LoanApplicationException
	 {
		System.out.println("dao layer");
		LoanApplication updates=entitymanager.find(LoanApplication.class,applicationId);
		updates.setStatus(status);
		LoanApplication Emp=entitymanager.merge(updates);
		return true;

	 }
	
	@Override
	@Transactional
	public LoanApplication findApplicationByUserId(int userId) throws LoanApplicationException 
	 {	
		TypedQuery<LoanApplication> qry = entitymanager.createQuery("Select a from LoanApplication a join a.user u where u.userId=:userId", LoanApplication.class);
		qry.setParameter("userId", userId);
		LoanApplication a = (LoanApplication)qry.getSingleResult();
		return a;
	 }
	
	@Override
	@Transactional
	public LoanApplication findApplicationByEmailId(String email) throws LoanApplicationException 
	 {	
		TypedQuery<LoanApplication> qry = entitymanager.createQuery("Select a from LoanApplication a join a.user u where u.email=:email", LoanApplication.class);
		qry.setParameter("email", email);
		LoanApplication a = (LoanApplication)qry.getSingleResult();
		return a;
	 }
	
}