/**
 * UserService
 *
 * @author LONGTV
 * @version 1.0
 * @since Aug 21, 2024
 */
package com.example.longtv.longtv.service;

import java.util.Date;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

import org.apache.logging.log4j.LogBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.longtv.longtv.bean.UserBean;
import com.example.longtv.longtv.entity.UsersEntity;
import com.example.longtv.longtv.mapping.UserMappingBeanService;
import com.example.longtv.longtv.repository.UsersRepository;
import com.example.longtv.longtv.repository.impl.UserRepositoryImpl;

/**
 * @author LONGTV
 * @apiNote redirect from 
 */
@Service
public abstract class UserService {
	
	private LogBuilder log;
	
	@Autowired
	private UserRepositoryImpl userRepositoryImpl;
	
	@Autowired
	private UserMappingBeanService userMappingBeanService;
	
	public void addUserService (UserBean userBean) throws Exception {
	 	userBean.setID(userBean.getID());
	 	userBean.setUserName(userBean.getUserName());
	 	try {
		 	KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", userBean.getPassword());
		    keyGenerator.init(256);
		    SecretKey key = keyGenerator.generateKey();
		    userBean.setPassword(key.toString());
	 	} catch (Exception e) {
	 		log.log("Exception when Encrypt password:" + e);
	 	}
	    userBean.setLastUpdateBy("System");
	    userBean.setLastUpdateDate(new Date());
	    userBean.setLastApproveBy("System");
	    userBean.setLastApproveDate(new Date());
	    userRepositoryImpl.save(userMappingBeanService.mappingUsers(userBean));
	}
}
