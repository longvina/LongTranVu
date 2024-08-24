package com.example.longtv.longtv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.annotation.ApplicationScope;

import com.example.longtv.longtv.bean.UserBean;
import com.example.longtv.longtv.service.UserService;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author LONGTV
 * @version 1.0
 *
 */
@RequestMapping(value = "/api")
@Controller
public class AbstractController {
	
	private UserService userService;
	
	/**
	 * @author LONGTV
	 * @return 
	 * @throws Exception 
	 * 
	 */
	@PostMapping(value = "/addusers", produces="application/json")
	public void addUsers(@RequestBody UserBean userBean) throws Exception {
		String [] array = {"fd"};
		String s = "lsjdfiewj";
		String trim = s.;
		userService.addUserService(userBean);
	}

}
