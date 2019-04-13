package com.finalPromineoTech.socialMediaAppFinal.controller;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.finalPromineoTech.socialMediaAppFinal.entity.User;
import com.finalPromineoTech.socialMediaAppFinal.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	
	private static String UPLOADED_FOLDER = "./pictures/";
	
	
	@Autowired
	private UserService service;
	
	
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ResponseEntity<Object> register(@RequestBody User user) {
		return new ResponseEntity<Object>(service.createUser(user), HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ResponseEntity<Object> login(@RequestBody User user) {
		try {
			return new ResponseEntity<Object>(service.login(user), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Object>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
	
	
	
	@RequestMapping(value="/{id}/profilePic", method = RequestMethod.POST)
	public ResponseEntity<Object> singleFileUpload(@PathVariable Long id, @RequestParam("file") MultipartFile file) {
		if(file.isEmpty()) {
			return new ResponseEntity<Object>("Upload Your Pic Now", HttpStatus.BAD_REQUEST);
			
			}
	
		try {
			String url = UPLOADED_FOLDER + file.getOriginalFilename();
			byte[] bytes = file.getBytes();
			Path path = Paths.get(url);
			Files.write(path, bytes);
			return new ResponseEntity<Object>(service.updateProfilePic(id, url), HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<Object>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
}
		


}

				


