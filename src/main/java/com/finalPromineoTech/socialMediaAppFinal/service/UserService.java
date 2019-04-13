package com.finalPromineoTech.socialMediaAppFinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalPromineoTech.socialMediaAppFinal.entity.User;
import com.finalPromineoTech.socialMediaAppFinal.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public User createUser(User user) {
		return repo.save(user);
	}
	
	public User createNewUser(User user) {
		return repo.save(user);
	}
	
	public User deleteUser(User userid) {
		return repo.save(userid);
	}
	
	public User login(User user) throws Exception {
		User foundUser = repo.findByUsername(user.getUsername());
		if (foundUser != null && foundUser.getPassword().equals(user.getPassword())) {
				return foundUser;
			} else {
				throw new Exception ("Invalid username or password, sorry charlie.");
			}
		}
	
	
	public User updateProfilePic(Long userId, String url) throws Exception {
		User user = repo.findOne(userId);
		if (user == null) {
			throw new Exception("User does NOT exist.");
		}
		user.setProfilePicUrl(url);
		return repo.save(user);
	}


	
	
	
	
	
}
