package com.finalPromineoTech.socialMediaAppFinal.repository;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;

import com.finalPromineoTech.socialMediaAppFinal.entity.Friends;

//public interface FriendRepository extends CrudRepository<Friends, Long> {
public interface FriendRepository  {
			Set<Friends> findAll();
			Friends findByFirstName(String name);
}
