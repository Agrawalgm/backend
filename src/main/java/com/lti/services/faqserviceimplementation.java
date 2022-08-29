package com.lti.services;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lti.beans.faq;
import com.lti.dao.faqDAO;

@Service("aboutusser")
public class faqserviceimplementation implements faqservice{
	
	@Autowired
	public faqDAO faqdao;
	
	@Override
	@Transactional
	public List<faq> viewlistedfaq() {
		return faqdao.viewlistedfaq();
	}
	@Override
	@Transactional
	public List<faq> addnewfaq() {
		return faqdao.addnewfaq();
	}

	@Override
	@Transactional
	public boolean addcustdoubt(faq f) {

		return faqdao.addcustdoubt(f);
	}

	
}
