package com.finalPromineoTech.socialMediaAppFinal.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Comment {
		
	
	
	private Long id;
	
	private String comment;
	
	@JsonIgnore
	private Post post;

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	@ManyToOne
	@JoinColumn(name = "postId")
	public Post getpost() {
		return post;
	}
	
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public void setPost(Post post) {
		this.post = post;
	}
	

	

	
	
	
}
