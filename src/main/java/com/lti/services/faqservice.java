package com.lti.services;
import java.util.List;

import com.lti.beans.faq;
public interface faqservice {

	public List<faq> viewlistedfaq();
	public boolean addcustdoubt(faq f);
	List<faq> addnewfaq();
}
