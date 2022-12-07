package com.user.controller;

import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.entity.UserPojo;
import com.user.service.UserService;
import com.user.vo.ResponseTemplateVO;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/addUser")
	public UserPojo addUser(@RequestBody UserPojo user) {
		return userService.addUser(user);
	}

	@GetMapping("/getAllUsers")
	public List<UserPojo> getUsers() {
		return userService.getUsers();
	}

	@GetMapping("/{uid}")
	public ResponseTemplateVO getUserWithDept(@PathVariable("uid") Integer uid) {
		return userService.getUserWithDept(uid);
	}

}
