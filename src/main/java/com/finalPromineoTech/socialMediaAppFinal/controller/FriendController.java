package com.finalPromineoTech.socialMediaAppFinal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finalPromineoTech.socialMediaAppFinal.entity.Friends;
import com.finalPromineoTech.socialMediaAppFinal.entity.User;
import com.finalPromineoTech.socialMediaAppFinal.service.FriendsService;

@RestController
@RequestMapping("/users/{fistname}")
public class FriendController {
		
	 @Autowired
	 FriendsService friendsService;

	@RequestMapping("/myfriends")
	public Iterable<User> getAllFriends() {
		return friendsService.getAllFriends();
	}
	}
	
