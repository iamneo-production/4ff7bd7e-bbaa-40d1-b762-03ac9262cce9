package com.examly.springapp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.Model.JobModel;
import com.examly.springapp.Repository.JobModelRepo;

@Service
public class JobService {

	@Autowired
	private JobModelRepo jobrepo;

	public JobModel addJobs(JobModel job) {
	return jobrepo.save(job);
	}
	
	public List<JobModel> getListJobs() {
	return jobrepo.findAll();
	}
	
	public JobModel updateJob(JobModel job , String JobId) {
	return jobrepo.save(job);
	}

	public void Deletejob(String JobId) {
	jobrepo.deleteById(JobId);

	}
}
