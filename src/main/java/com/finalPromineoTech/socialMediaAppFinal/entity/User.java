package com.finalPromineoTech.socialMediaAppFinal.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class User {
	
	private Long userID;
	private Long id;
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private String isAdmin;
	private String profilePicUrl;
	
	
	@JsonIgnore
	private Set<Post> posts;
	
	
	@JsonIgnore
	private Set<User> following;
	
	public Long getUserID() {
		return userID;
	}
	
	
	public void setUserID(Long userID) {
		this.userID = userID;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public String getProfilePicUrl() {
		return profilePicUrl;
	}
	public void setProfilePicUrl(String profilePicUrl) {
		this.profilePicUrl = profilePicUrl;
	}
	
	
	
	
		
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getIsAdmin() {
		return isAdmin;
	}


	public void setIsAdmin(String isAdmin) {
		this.isAdmin = isAdmin;
	}



	@JsonIgnore
	public String getPassword() {
		return password;
	}
	
	@JsonProperty
	public void setPassword(String password) {
		this.password = password;
	}
	
	@OneToMany(mappedBy = "user")
	public Set<Post> getPosts() {
		return posts;
	}
	public void setPosts(Set<Post> Posts) {
		this.posts = Posts;
	}
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "following",
				joinColumns = @JoinColumn(name = "userId", referencedColumnName = "id"),
				inverseJoinColumns = @JoinColumn(name = "followingId", referencedColumnName = "id"))
	public Set<User> getFollowing() {
		return following;
	}
	
	public void setFollowing(Set<User> following) {
		this.following = following;
	}
	
	
	   
}