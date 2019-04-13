package com.finalPromineoTech.socialMediaAppFinal.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalPromineoTech.socialMediaAppFinal.entity.Comment;
import com.finalPromineoTech.socialMediaAppFinal.entity.Post;
import com.finalPromineoTech.socialMediaAppFinal.entity.User;
import com.finalPromineoTech.socialMediaAppFinal.repository.CommentRepository;
import com.finalPromineoTech.socialMediaAppFinal.repository.PostRepository;
import com.finalPromineoTech.socialMediaAppFinal.repository.UserRepository;

@Service
public class CommentService {
	
	@Autowired
	private CommentRepository repo;
	
	@Autowired
	private PostRepository postRepo;
	
	public Comment createComment(Comment comment, Long userId, Long postId) throws Exception {
		User user = userRepo.findOne(userId);
		Post newpost = postRepo.findOne(postId);
//		Set<Comment> comments = newpost.getComments();
//		if(comments == null) {
//			comments = new HashSet<Comment>();
//		}
//		comments.add(comment);
//		newpost.setComments(comments);
//		postRepo.save(newpost);
		if (user == null || newpost == null) {
			throw new Exception("Your User or Post doesn't exist, Sorry Charlie.");
		}
		comment.setPost(newpost);
		return repo.save(comment);
		
		
	}
		public Iterable<Comment> getComments() {
			return repo.findAll();
		}
	
	@Autowired UserRepository userRepo;
	
	public void deleteComment (Long comment) {
		repo.delete(comment);
	}

	
}
