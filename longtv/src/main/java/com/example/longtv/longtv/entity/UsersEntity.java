/**
 * 
 */
package com.example.longtv.longtv.entity;

import java.beans.beancontext.BeanContext;
import java.io.Serializable;
import java.util.Date;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

/**
 * @author LONGTV
 *
 */
@Entity
@Table(name = "Users")
@DynamicUpdate
@NamedQuery(name = "UsersEntity.findAll", query = "SELECT u FROM UsersEntity u")
public class UsersEntity implements Serializable {
   
	private static final long serialVersionUID = 4460535812097696255L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ID;
	
	@Column
	private String userName;
	
	@Column
	private String password;
	
	@Column
	private Date lastupdateDate;
	
	@Column
	private Date lastapproveDate;
	
	@Column
	private String lastupdateBy;
	
	@Column
	private String lastappoveBy;
	
	public UsersEntity(long ID, String userName, String password) {
		super();
		this.ID = ID;
		this.userName = userName;
		this.password = password;
	}
	
	public UsersEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getID() {
		return ID;
	}

	public void setID(Long ID) {
		this.ID = ID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}
