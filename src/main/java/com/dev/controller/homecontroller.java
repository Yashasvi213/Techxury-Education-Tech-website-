package com.dev.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.emailservice;
import com.dev.model.emailOTP;
import com.dev.service.user_service;

@RestController
@RequestMapping("/otp")
public class homecontroller {
	int otpp;
	String email;
	
	user_service uservice;
	public homecontroller(user_service uservice) {
		super();
		this.uservice = uservice;
	}



	@Autowired 
	private emailservice o;
	
	@PostMapping("/step1")
	public String OTPsender(@RequestBody emailOTP otp) {
		
		Random random=new Random();
//		otpp=random.nextInt(9999);
//		otp.setOTP(otpp);
     	email=otp.getToemail();
//		String output=o.sendEmail(otp.getToemail(),otpp);
		otpp=1234;
System.out.println(otp);
		return "sent";
		
	}
	
	
	
	@PostMapping("/step2")
	public String OTPChecker(@RequestBody  emailOTP otpc)
	{
		com.dev.model.user user1=new com.dev.model.user();
		user1.setEmail(email);
		//user1.setUserid(userid);
		if(otpp==otpc.getOTP()) {
			int a;
			Random rand=new Random();
		a=rand.nextInt(999);
			String b="@techxury";
	      String userid=a+b;
	      user1.setUserid(userid);
	      
	      uservice.saveuser(user1);
//				
			return userid;
		} 
		else {
			return "failure";
		}
	}
}
