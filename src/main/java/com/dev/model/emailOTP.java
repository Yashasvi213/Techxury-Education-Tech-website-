package com.dev.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class emailOTP {
	@Id
	@GeneratedValue
	int eid;
	String toemail;
	String subject;
	String body;
	int OTP;
	public emailOTP(String toemail, String subject, String body, int oTP) {
		super();
		this.toemail = toemail;
		this.subject = subject;
		this.body = body;
		OTP = oTP;
	}
	public emailOTP() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "emailOTP [toemail=" + toemail + ", subject=" + subject + ", body=" + body + ", OTP=" + OTP + "]";
	}
	public String getToemail() {
		return toemail;
	}
	public void setToemail(String toemail) {
		this.toemail = toemail;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public int getOTP() {
		return OTP;
	}
	public void setOTP(int oTP) {
		OTP = oTP;
	}
}
