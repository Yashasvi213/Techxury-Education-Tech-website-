package com.dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.emailservice;
import com.dev.model.emailOTP;

@RestController
@RequestMapping("/otp")
public class homecontroller {
	int otpp;
	@Autowired 
	private emailservice o;
	
	@PostMapping("/step1")
	public String OTPsender(@RequestBody emailOTP otp) {
		Random random=new Random();
		otpp=random.nextInt(9999);
		otp.setOTP(otpp);
		
		String output=o.sendEmail(otp.getToemail(),otpp);
System.out.println(otp);
		return output;
		
	}
	
	
	
	@PostMapping("/step2")
	public String OTPChecker(@RequestBody  emailOTP otpc)
	{	
		int a;
	    Random random=new Random();
		a=random.nextInt(999);
		String b="@techxury";
		String userid =a+b;
		if(otpp==otpc.getOTP()) {
			return userid;
		} 
		else {
			return "failure";
		}
	}
}
