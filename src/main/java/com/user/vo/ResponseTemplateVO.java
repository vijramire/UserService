package com.user.vo;

import java.util.Optional;

import com.user.entity.UserPojo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {

	private UserPojo user;
	private Department dept;
	public UserPojo getUser() {
		return user;
	}
	public void setUser(UserPojo user2) {
		this.user = user2;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "ResponseTemplateVO [user=" + user + ", dept=" + dept + "]";
	}
	
}
