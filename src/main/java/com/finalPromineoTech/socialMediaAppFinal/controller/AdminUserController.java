package com.finalPromineoTech.socialMediaAppFinal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.finalPromineoTech.socialMediaAppFinal.entity.AdminUserCREDENTIALS;
import com.finalPromineoTech.socialMediaAppFinal.service.AdminUserService;

@RestController
@RequestMapping("/adiminusers")
public class AdminUserController {
	
	@Autowired
	private  AdminUserService AdminUserService;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ResponseEntity<Object> login(@RequestBody AdminUserCREDENTIALS cred) {
		try {
			return new ResponseEntity<Object>(AdminUserService.login(cred), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Object>(e.getMessage(), HttpStatus.UNAUTHORIZED);
		}
	}
	
	
	
	
	
	
	
	

}
