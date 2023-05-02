package com.examly.springapp.Service;

import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.Model.UserModel;
import com.examly.springapp.Repository.UserModelRepo;

@Service
public class UserService {

	@Autowired
	private UserModelRepo userRepo;
	
	public UserModel adduser(UserModel user) {
	return userRepo.save(user);
	}

	public List<UserModel> getall(){
	return userRepo.findAll();

	}
	
	public UserModel getUserByEmail(String email){
		return userRepo.findByEmail(email);
	}

	public UserModel edituser(UserModel user) {

	return userRepo.save(user);

	}

	@Transactional
	public void deleteuser(String email) {
	userRepo.deleteById(email);
	}

	public boolean checkLogin(UserModel user) {
//		UserModel userDetails = userRepo.getById(user.getEmail());
		UserModel foundLogin=userRepo.findByEmailAndPassword(user.getEmail(),user.getPassword());
		
	    	
//		if(userDetails.getPassword()==user.getPassword()) {
		if(foundLogin!=null) {
		return true;
		}
		else {
		return false;
		}
		}
	
	
}
