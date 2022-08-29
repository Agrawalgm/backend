package com.lti.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import com.lti.beans.faq;
import com.lti.services.faqservice;

@CrossOrigin(origins="*")
@RequestMapping("/faq")
@RestController
public class faqController {

	@Autowired
	public faqservice fsimple;
	
	
	@GetMapping(value="/faqlist")
	public List<faq> viewlistedfaq()
	{
		List<faq> faq_list=fsimple.viewlistedfaq();
		return faq_list;
	}
	
	
	@PostMapping(value="/icustdoubt")
	public faq addcustdoubt(@RequestBody faq faq5) {
//		faq f = new faq();
//		f.setCustomeremail(faq5.getCustomeremail());
//		f.setCustomername(faq5.getCustomername());
//		f.setQuerydes(faq5.getQuerydes());
		fsimple.addcustdoubt(faq5);
		return faq5;
		
	}
}
