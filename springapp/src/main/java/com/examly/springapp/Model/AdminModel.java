package com.examly.springapp.Model;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class AdminModel {
	@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
	//Long id;
//	@GenericGenerator(name="uuid2", strategy = "uuid2")
	String personId;
	String personName;
	String personAddress;
	String personExp;
	String personPhone;
	String personEmail;
	
	@OneToOne(targetEntity=JobModel.class,cascade=CascadeType.ALL)
	@JoinColumn(referencedColumnName ="jobid")
	private JobModel jobobj;

	public AdminModel() {
		super();
		}

	public AdminModel(String personId, String personName, String personAddress, String personExp, String personPhone,
			String personEmail, JobModel jobobj) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.personAddress = personAddress;
		this.personExp = personExp;
		this.personPhone = personPhone;
		this.personEmail = personEmail;
		this.jobobj = jobobj;
	}

	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getPersonAddress() {
		return personAddress;
	}

	public void setPersonAddress(String personAddress) {
		this.personAddress = personAddress;
	}

	public String getPersonExp() {
		return personExp;
	}

	public void setPersonExp(String personExp) {
		this.personExp = personExp;
	}

	public String getPersonPhone() {
		return personPhone;
	}

	public void setPersonPhone(String personPhone) {
		this.personPhone = personPhone;
	}

	public String getPersonEmail() {
		return personEmail;
	}

	public void setPersonEmail(String personEmail) {
		this.personEmail = personEmail;
	}

	public JobModel getJobobj() {
		return jobobj;
	}

	public void setJobobj(JobModel jobobj) {
		this.jobobj = jobobj;
	}

	@Override
	public String toString() {
		return "AdminModel [personId=" + personId + ", personName=" + personName + ", personAddress=" + personAddress
				+ ", personExp=" + personExp + ", personPhone=" + personPhone + ", personEmail=" + personEmail
				+ ", jobobj=" + jobobj + "]";
	}
	
	
	
	
	
	
	

}
