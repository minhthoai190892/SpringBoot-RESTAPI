package com.rest.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.api.entity.User;
import com.rest.api.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController

public class MainController {
	private UserService userService;
	@Autowired
	
	public MainController(UserService userService) {
		super();
		this.userService = userService;
	}

	@GetMapping("/a")
	public List<User> test() {
		// TODO Auto-generated method stub
		return userService.getAll();
	}

@GetMapping("/getAllUser")
public ResponseEntity<List<User>>getAllUser(){
	return new ResponseEntity<>(userService.getAll(),HttpStatus.OK);
}
}
