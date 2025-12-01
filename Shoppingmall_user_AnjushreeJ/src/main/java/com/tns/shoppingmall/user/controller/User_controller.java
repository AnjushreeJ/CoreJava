package com.tns.shoppingmall.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tns.shoppingmall.user.entity.User_entity;
import com.tns.shoppingmall.user.service.User_service;

@RestController
@RequestMapping("/user")
public class User_controller {

	@Autowired
public User_service ss;
	
	@PostMapping("/add") // save
	public User_entity registeruser(@RequestBody User_entity s) {
		return ss.registeruser(s);
	}
	
	@GetMapping("/getuser") // get
	public List<User_entity> getuser()
	{
		return ss.getuser();
	}
	
	@DeleteMapping("/deleteuser/{sid}")// delete 
	public void deleteuser(@PathVariable("sid") Integer id) {
		ss.deleteuser(id);
	}
}
 // update - putmapping
