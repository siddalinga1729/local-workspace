package com.role.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.role.entity.User;

@RestController
public class UserController {
@PostMapping("/add")
	public User addUser(@RequestBody User user) {
		return User.builder().id(user.getId()).name(user.getName()).role(user.getRole()).build();
	}
}
