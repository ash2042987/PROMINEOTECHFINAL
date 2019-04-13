package com.finalPromineoTech.socialMediaAppFinal.service;

import javax.naming.AuthenticationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;

import com.finalPromineoTech.socialMediaAppFinal.entity.AdminUser;
import com.finalPromineoTech.socialMediaAppFinal.entity.AdminUserCREDENTIALS;
import com.finalPromineoTech.socialMediaAppFinal.repository.AdminUserRepository;

@Service
public class AdminUserService {
		
	
	//@Autowired
	private AdminUserRepository repo;
	
	public AdminUser createAdminUser(AdminUser adminuser) {
		//return repo.save(adminuser);
		return null;
	}
	
	public AdminUser updateAdminUser(AdminUser adminuserid) {
		//return repo.save(adminuserid);
		return null;
	}
	
	public AdminUser deleteAdminUser(AdminUser adminuserid) {
		//return repo.save(adminuserid);
		return null;
	}
	
	
	
	public AdminUser AdminUserService(AdminUserCREDENTIALS cred) throws AuthenticationException {
		AdminUser foundAdminUser = repo.findByAdminUser_ID(cred.getAdminUserPassword());
		if(foundAdminUser != null && BCrypt.checkpw(cred.getAdminUserId(), foundAdminUser.getAdminUserHash())) {
			return foundAdminUser;
		}
		throw new AuthenticationException("Sorry charlie, try again. ");
		}

	public MultiValueMap<String, String> login(AdminUserCREDENTIALS cred) {
		// TODO Auto-generated method stub
		return null;
	}
}
