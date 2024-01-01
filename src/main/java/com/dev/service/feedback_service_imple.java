package com.dev.service;

import org.springframework.stereotype.Service;

import com.dev.model.feedback;
import com.dev.repository.feedback_repository;

@Service
public class feedback_service_imple implements feedback_service{
	feedback_repository fees;
	
	public feedback_service_imple(feedback_repository fees) {
		super();
		this.fees = fees;
	}
	
	@Override
	public String savefeedback(feedback feeds) {
		fees.save(feeds);
		return "success";
		// TODO Auto-generated method s
	}

}
