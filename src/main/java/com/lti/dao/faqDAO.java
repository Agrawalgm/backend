package com.lti.dao;
import java.util.List;

import com.lti.beans.entity.faq;
public interface faqDAO {

	public List<faq> viewlistedfaq();
	public boolean addcustdoubt(faq f);
	List<faq> addnewfaq();
	
}
