package com.finalPromineoTech.socialMediaAppFinal.repository;



import org.springframework.data.repository.CrudRepository;

import com.finalPromineoTech.socialMediaAppFinal.entity.AdminUser;

//public interface AdminUserRepository extends CrudRepository<AdminUser, Long> {
public interface AdminUserRepository {
	public AdminUser findByAdminUser_ID(String adminUser_ID);	

	public AdminUser findByAdminUser_ID1(Long password);
	

}


