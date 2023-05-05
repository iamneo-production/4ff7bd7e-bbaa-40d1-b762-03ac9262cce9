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

import com.examly.springapp.Model.UserModel;
import com.examly.springapp.Repository.UserModelRepo;
import com.examly.springapp.Service.UserService;

@RestController
//@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private UserModelRepo userRepo;

	@PostMapping("user/signup")
	public UserModel AddUser(@RequestBody UserModel data) {
	return userService.adduser(data);
	}

	@GetMapping("user/list")
	public List<UserModel> getUser(){
	return userService.getall();

	}
	@GetMapping("/{email}")
	public UserModel getUserByEmail(@PathVariable String email){
	return userService.getUserByEmail(email);

	}

	@PutMapping("/edit/{email}")
	public UserModel EditUser(@RequestBody UserModel user1, @PathVariable String email) {
	return userService.edituser(user1);
	}

	@DeleteMapping("/delete/{email}")
	public void DeleteUser(@PathVariable String email) {
	userService.deleteuser(email);
	}

	@PostMapping("/login")
	public boolean isUserPresent(@RequestBody UserModel user) {
	return userService.checkLogin(user);
	}

}
