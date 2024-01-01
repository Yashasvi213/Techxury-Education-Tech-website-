package com.dev.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class feedback {
	@Id
	@GeneratedValue
	int uid;
	String feed;
	public feedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	public feedback(int uid, String feed) {
		super();
		this.uid = uid;
		this.feed = feed;
	}
	@Override
	public String toString() {
		return "feedback [uid=" + uid + ", feed=" + feed + "]";
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getFeed() {
		return feed;
	}
	public void setFeed(String feed) {
		this.feed = feed;
	}
	

}
