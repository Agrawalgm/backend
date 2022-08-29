package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.beans.LoanApplication;
import com.lti.beans.faq;

@Repository("aboutusdao")
public class faqDAOimplementation implements faqDAO{
	@PersistenceContext
	EntityManager entitymanager;
	

	@Override
	public List<faq> viewlistedfaq() {
		Query qry = entitymanager.createQuery("Select au from faq au",faq.class);
		List<faq> faq_list=qry.getResultList();
		return faq_list;
	}


	@Override
	public boolean addcustdoubt(faq q) {
		 boolean flag=false;
		    try {
			   
				entitymanager.persist(q);
				
				System.out.println("end");
				flag=true;
		    }
		    catch(Exception e) { 
		    	System.out.println("Error:"+e);
		    }
		    return flag;
	}


	@Override
	public List<faq> addnewfaq() {
		return null;
	}
}
