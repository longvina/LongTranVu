/**
 * UserBean
 *
 * @author LONGTV
 * @version 1.0
 * @since Aug 21, 2024
 */
package com.example.longtv.longtv.bean;

import java.beans.JavaBean;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author LONGTV
 */

public class UserBean extends AbstractBean  {
	
	@JsonFormat
	private Long ID;
	
	@JsonFormat
	private String userName;
	
	@JsonFormat
	private String password;


	/**
	 * 
	 */
	public UserBean() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param lastUpdateDate
	 * @param lastUpdateBy
	 * @param lastApproveDate
	 * @param lastApproveBy
	 */
	public UserBean(Date lastUpdateDate, String lastUpdateBy, Date lastApproveDate, String lastApproveBy) {
		super(lastUpdateDate, lastUpdateBy, lastApproveDate, lastApproveBy);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param lastUpdateDate
	 * @param lastUpdateBy
	 * @param lastApproveDate
	 * @param lastApproveBy
	 * @param ID
	 * @param userName
	 * @param password
	 */
	public UserBean(Date lastUpdateDate, String lastUpdateBy, Date lastApproveDate, String lastApproveBy, Long ID,
			String userName, String password) {
		super(lastUpdateDate, lastUpdateBy, lastApproveDate, lastApproveBy);
		this.ID = ID;
		this.userName = userName;
		this.password = password;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @return the iD
	 */
	public Long getID() {
		return this.ID;
	}

	/**
	 * @param iD the iD to set
	 */
	public void setID(Long ID) {
		this.ID = ID;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}
