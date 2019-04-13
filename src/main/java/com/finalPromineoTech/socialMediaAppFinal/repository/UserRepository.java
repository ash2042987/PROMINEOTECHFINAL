package com.finalPromineoTech.socialMediaAppFinal.repository;

import org.springframework.data.repository.CrudRepository;

import com.finalPromineoTech.socialMediaAppFinal.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {
	
	public User findByUsername(String username);

}
