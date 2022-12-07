package com.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USERPOJO")
public class UserPojo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="user_id")
	private int uid;
	@Column(name="user_name")
	private String uname;
	@Column(name="dept_id")
	private int deptId;

	/*
	 * public UserPojo(int uid, String uname, int deptId) { super(); this.uid = uid;
	 * this.uname = uname; this.deptId = deptId; }
	 */

	@Override
	public String toString() {
		return "UserPojo [uid=" + uid + ", uname=" + uname + ", deptId=" + deptId + "]";
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

}
