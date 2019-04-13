package com.finalPromineoTech.socialMediaAppFinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalPromineoTech.socialMediaAppFinal.entity.Friends;
import com.finalPromineoTech.socialMediaAppFinal.entity.User;
import com.finalPromineoTech.socialMediaAppFinal.repository.UserRepository;

@Service
public class FriendsService {
		
	
	@Autowired
	private UserRepository repo;
		
	public Iterable<User> getAllFriends() {
		return repo.findAll();
	}
}
