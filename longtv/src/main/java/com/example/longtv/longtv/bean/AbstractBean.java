/**
 * AbstractBean
 *
 * @author LONGTV
 * @version 1.0
 * @since Aug 21, 2024
 */
package com.example.longtv.longtv.bean;

import java.beans.JavaBean;
import java.util.Date;

import com.example.longtv.longtv.CommonUtils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;

/**
 * 
 */
@JavaBean
public class AbstractBean {
	
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh24:mi:ss", timezone = CommonUtils.MY_TIME_ZONE)
	private Date lastUpdateDate;
	
	@JsonFormat
	private String lastUpdateBy;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh24:mi:ss", timezone = CommonUtils.MY_TIME_ZONE)
	private Date lastApproveDate;
	
	@JsonFormat
	private String lastApproveBy;

	/**
	 * @param lastUpdateDate
	 * @param lastUpdateBy
	 * @param lastApproveDate
	 * @param lastApproveBy
	 */
	public AbstractBean(Date lastUpdateDate, String lastUpdateBy, Date lastApproveDate, String lastApproveBy) {
		super();
		this.lastUpdateDate = lastUpdateDate;
		this.lastUpdateBy = lastUpdateBy;
		this.lastApproveDate = lastApproveDate;
		this.lastApproveBy = lastApproveBy;
	}

	/**
	 * 
	 */
	public AbstractBean() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the lastUpdateDate
	 */
	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	/**
	 * @param lastUpdateDate the lastUpdateDate to set
	 */
	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	/**
	 * @return the lastUpdateBy
	 */
	public String getLastUpdateBy() {
		return lastUpdateBy;
	}

	/**
	 * @param lastUpdateBy the lastUpdateBy to set
	 */
	public void setLastUpdateBy(String lastUpdateBy) {
		this.lastUpdateBy = lastUpdateBy;
	}

	/**
	 * @return the lastApproveDate
	 */
	public Date getLastApproveDate() {
		return lastApproveDate;
	}

	/**
	 * @param lastApproveDate the lastApproveDate to set
	 */
	public void setLastApproveDate(Date lastApproveDate) {
		this.lastApproveDate = lastApproveDate;
	}

	/**
	 * @return the lastApproveBy
	 */
	public String getLastApproveBy() {
		return lastApproveBy;
	}

	/**
	 * @param lastApproveBy the lastApproveBy to set
	 */
	public void setLastApproveBy(String lastApproveBy) {
		this.lastApproveBy = lastApproveBy;
	}
}


