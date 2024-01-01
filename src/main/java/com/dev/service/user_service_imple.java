package com.dev.service;

import org.springframework.stereotype.Service;

import com.dev.model.user;
import com.dev.repository.user_repository;
@Service
public class user_service_imple implements user_service {

	user_repository ures;
	
	public user_service_imple(user_repository ures) {
		super();
		this.ures = ures;
	}

	@Override
	public String saveuser(user users) {
		ures.save(users);
		return "success";
		// TODO Auto-generated method s
	}

}
