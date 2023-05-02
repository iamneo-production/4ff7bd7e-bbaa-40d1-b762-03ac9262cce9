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

import com.examly.springapp.Model.AdminModel;
import com.examly.springapp.Service.AdminService;

@RestController
//@RequestMapping("/admin")
@CrossOrigin(origins = "http://localhost:4200")
public class AdminController {

	@Autowired
	private AdminService adminservice;

	@PostMapping("/admin/addProfile")
	public AdminModel addAdmin(@RequestBody AdminModel admin) {
	return adminservice.addAdmins(admin);
	}

	@GetMapping("/list")
	public List<AdminModel> getAdmin(){
	return adminservice.getListAdmin();
	}

	@DeleteMapping("/admin/deleteProfile/{personId}")
	public void DeleteProfile(@PathVariable String personId) {
	adminservice.deleteProfile(personId);

	}

	@PutMapping("/editProfile/{personId}")
	public AdminModel UpdateAdmin(@RequestBody AdminModel admin , @PathVariable String personId) {
	return adminservice.updateProfile(admin);

	}
}
