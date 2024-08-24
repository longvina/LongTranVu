/**
 * UserMappingBeanService
 *
 * @author LONGTV
 * @version 1.0
 * @since Aug 22, 2024
 */
package com.example.longtv.longtv.mapping;

import com.example.longtv.longtv.bean.UserBean;
import com.example.longtv.longtv.entity.UsersEntity;

/**
 * @author LONGTV
 * @see
 */
public class UserMappingBeanService {
	
	public UsersEntity mappingUsers(UserBean source) {
		UsersEntity usersEntity = new UsersEntity();
		usersEntity.setID(source.getID());
		usersEntity.setPassword(source.getPassword());
		usersEntity.setUserName(source.getUserName());
		return usersEntity;
	}
}
