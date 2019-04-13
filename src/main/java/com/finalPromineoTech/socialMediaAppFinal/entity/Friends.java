package com.finalPromineoTech.socialMediaAppFinal.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



public class Friends {
		
	
	private long userId;
	
	private List<Friends> friends;
	
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Friends> getFriends() {
		return friends;
	}

	public void setFriends(List<Friends> friends) {
		this.friends = friends;
	}
		
}
