package com.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.user.entity.UserPojo;
import com.user.repo.UserRepo;
import com.user.vo.Department;
import com.user.vo.ResponseTemplateVO;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;

	@Autowired
	private RestTemplate restTemplate;

	public UserPojo addUser(UserPojo user) {
		return userRepo.save(user);
	}

	public List<UserPojo> getUsers() {
		return userRepo.findAll();
	}

	public ResponseTemplateVO getUserWithDept(Integer uid) {
		ResponseTemplateVO vo = new ResponseTemplateVO();
		UserPojo user = userRepo.findByDeptId(uid);
		String uri = "http://192.168.189.34:8600/dept/" + user.getUid();
		Department dept = (Department) restTemplate.getForObject(uri, Department.class);
		vo.setUser(user);
		vo.setDept(dept);
		return vo;
	}

}
