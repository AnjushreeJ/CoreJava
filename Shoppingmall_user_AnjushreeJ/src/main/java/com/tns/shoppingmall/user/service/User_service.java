package com.tns.shoppingmall.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tns.shoppingmall.user.entity.User_entity;
import com.tns.shoppingmall.user.repository.User_repo;

@Service
public class User_service {

	@Autowired
public User_repo sr;
	
	// create 
	
	public User_entity registeruser(User_entity s) {
		return sr.save(s);
	}
	
	// read
	
	public List<User_entity> getuser(){
		return (List<User_entity>) sr.findAll();
	}
	
	//delete
	
	public void deleteuser(Integer sid) {
		sr.deleteById(sid);
	}

}
