package com.finalPromineoTech.socialMediaAppFinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalPromineoTech.socialMediaAppFinal.entity.Post;
import com.finalPromineoTech.socialMediaAppFinal.entity.User;
import com.finalPromineoTech.socialMediaAppFinal.repository.PostRepository;
import com.finalPromineoTech.socialMediaAppFinal.repository.UserRepository;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	
	@Autowired
	private UserRepository userRepo;
	
	public Iterable<Post> getAllPosts(){
		return repo.findAll();
	}
	
	public Post getPost(Long id) {
		return repo.findOne(id);
	}
	
	public Post updatePost(Post post, Long id) throws Exception {
		Post foundPost = repo.findOne(id);
		if (foundPost == null) {
			throw new Exception("Post can NOT be found.");
		}
		foundPost.setContent(post.getContent());
		return repo.save(foundPost);
	}
	
	public Post createPost(Post post, Long userId) throws Exception {
		User user = userRepo.findOne(userId);
		if (user == null) {
			throw new Exception("User NOT found.");
		}
		post.setUser(user);
		return repo.save(post);
	}
	
		
	}

