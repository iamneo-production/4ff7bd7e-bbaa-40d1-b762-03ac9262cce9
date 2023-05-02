package com.examly.springapp.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.Model.AdminModel;
import com.examly.springapp.Repository.AdminModelRepo;

@Service
public class AdminService {
	
	@Autowired
	private AdminModelRepo adminRepo;

	public AdminModel addAdmins(AdminModel admin) {

	return adminRepo.save(admin);

	}
	public List<AdminModel> getListAdmin() {
	return adminRepo.findAll();

	}

	@Transactional
	public void deleteProfile(String personId) {
	adminRepo.deleteById(personId);
	}

	public AdminModel updateProfile(AdminModel admin){
	return adminRepo.save(admin);

	}

}
