package com.example.longtv.longtv.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.longtv.longtv.entity.UsersEntity;
import com.example.longtv.longtv.repository.UsersRepository;
 

/**
 * @author LONGTV
 * @version 1.0
 *
 */
@RequestMapping(value = "/api")
@Controller
public class UsersController {
	
	@Autowired
	private UsersRepository usersRepository;
	
	@GetMapping(value = "/addusers")
	private void addUsers() {
		
		UsersEntity usersEntity = new UsersEntity();
		usersEntity.setID(null);
		usersEntity.setUserName("Longtv");
		usersEntity.setPasswordEncr("1223");
		usersRepository.save(usersEntity);
	}
	
}
