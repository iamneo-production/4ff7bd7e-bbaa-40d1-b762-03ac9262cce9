package com.examly.springapp.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class JobModel {
	@Id
	String jobId;
	String jobDescription;
	String  jobLocation;
	String fromDate;
	String toDate;
	String wagePerDay;
	
	public JobModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JobModel(String jobId, String jobDescription, String jobLocation, String fromDate, String toDate,
			String wagePerDay) {
		super();
		this.jobId = jobId;
		this.jobDescription = jobDescription;
		this.jobLocation = jobLocation;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.wagePerDay = wagePerDay;
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public String getJobDescription() {
		return jobDescription;
	}
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}
	public String getJobLocation() {
		return jobLocation;
	}
	public void setJobLocation(String jobLocation) {
		this.jobLocation = jobLocation;
	}
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	public String getWagePerDay() {
		return wagePerDay;
	}
	public void setWagePerDay(String wagePerDay) {
		this.wagePerDay = wagePerDay;
	}
	
	@Override
	public String toString() {
		return "JobModel [jobId=" + jobId + ", jobDescription=" + jobDescription + ", jobLocation=" + jobLocation
				+ ", fromDate=" + fromDate + ", toDate=" + toDate + ", wagePerDay=" + wagePerDay + "]";
	}
	 
	

}
