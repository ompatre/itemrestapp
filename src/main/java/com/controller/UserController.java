package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dao.UserDAO;
import com.model.UserTable;

import java.util.*;

@RestController
public class UserController {
	@Autowired
	UserDAO dao;
	
	@GetMapping("/getusers")
	public List<UserTable> getusers() {
		return dao.findAll();
	}
	
	@PostMapping("/adduser")
	public String adduser(@RequestBody UserTable user) {
		dao.save(user);
		return "added";
	}
}
