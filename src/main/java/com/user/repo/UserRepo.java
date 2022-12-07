package com.user.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.entity.UserPojo;

@Repository
public interface UserRepo extends JpaRepository<UserPojo, Integer>{

	public UserPojo findByDeptId(Integer uid);

}
