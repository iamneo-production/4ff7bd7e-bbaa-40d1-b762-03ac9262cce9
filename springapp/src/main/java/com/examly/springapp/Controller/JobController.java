package com.examly.springapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.Model.JobModel;
import com.examly.springapp.Service.JobService;

@RestController
//@RequestMapping("/job")
//@CrossOrigin
@CrossOrigin(origins="http://localhost:4200")
public class JobController {
	
	@Autowired
	private JobService jobservice;
	
	@PostMapping("/job/addjobs")
	public JobModel addJob(@RequestBody JobModel job) {
	return jobservice.addJobs(job);

	}

	@GetMapping("/lists")
	public List<JobModel> getJob(){
	return jobservice.getListJobs();

	}

	@PutMapping("/admin/editJob/{JobId}")
	public JobModel EditJob(@RequestBody JobModel job, @PathVariable String JobId) {
	return jobservice.updateJob(job, JobId);

	}

	@DeleteMapping("/job/deleteJob/{JobId}")
	public void DeleteJob(@PathVariable String JobId) {
	jobservice.Deletejob(JobId);

	}

}
