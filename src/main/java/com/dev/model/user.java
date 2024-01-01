package com.dev.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class user {
	@Id
	@GeneratedValue
	int uid;
	String name;
	String email;
	String mob;
	String userid;
	public user(int uid, String name, String email, String mob, String userid) {
		super();
		this.uid = uid;
		this.name = name;
		this.email = email;
		this.mob = mob;
		this.userid = userid;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	@Override
	public String toString() {
		return "user [uid=" + uid + ", name=" + name + ", email=" + email + ", mob=" + mob + ", userid=" + userid + "]";
	}
	public user(int uid, String name, String email, String mob) {
		super();
		this.uid = uid;
		this.name = name;
		this.email = email;
		this.mob = mob;
	}
	public user() {
		super();
		// TODO Auto-generated constructor stub
	}

}
