package com.lti.beans.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ABOUTUS")
public class faq {


	@Id
	@SequenceGenerator(name = "que_seq", initialValue = 10005, allocationSize = 1)
	@GeneratedValue(generator = "que_seq", strategy = GenerationType.SEQUENCE)
	@Column(name= "QUESID")
	private int queId;
	@Column(name= "CUSTOMERNAME")
	private String customername;
	@Column(name= "CUSTOMEREMAIL")
	private String customeremail;
	@Column(name= "QUERYDES")
	private String querydes;
	@Column(name= "QUESTION")
	private String question;
	@Column(name= "SOLUTION")
	private String solution;
	
	public faq() {
		super();
	}

	public faq(int queId, String customername, String customeremail, String querydes, String question,
			String solution) {
		super();
		this.queId = queId;
		this.customername = customername;
		this.customeremail = customeremail;
		this.querydes = querydes;
		this.question = question;
		this.solution = solution;
	}

	public int getQueId() {
		return queId;
	}

	public void setQueId(int queId) {
		this.queId = queId;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getCustomeremail() {
		return customeremail;
	}

	public void setCustomeremail(String customeremail) {
		this.customeremail = customeremail;
	}

	public String getQuerydes() {
		return querydes;
	}

	public void setQuerydes(String querydes) {
		this.querydes = querydes;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getSolution() {
		return solution;
	}

	public void setSolution(String solution) {
		this.solution = solution;
	}

	@Override
	public String toString() {
		return "aboutus [queId=" + queId + ", customername=" + customername + ", customeremail=" + customeremail
				+ ", querydes=" + querydes + ", question=" + question + ", solution=" + solution + "]";
	}
	
	
}
