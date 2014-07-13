package com.ru.spring.login.domain;

import java.sql.Timestamp;

/**
 * TLoginLog entity. @author MyEclipse Persistence Tools
 */

public class TLoginLog implements java.io.Serializable {

	// Fields

	private Integer loginLogId;
	private String userId;
	private String ip;
	private Timestamp loginDatatime;

	// Constructors

	/** default constructor */
	public TLoginLog() {
	}

	/** full constructor */
	public TLoginLog(String userId, String ip, Timestamp loginDatatime) {
		this.userId = userId;
		this.ip = ip;
		this.loginDatatime = loginDatatime;
	}

	// Property accessors

	public Integer getLoginLogId() {
		return this.loginLogId;
	}

	public void setLoginLogId(Integer loginLogId) {
		this.loginLogId = loginLogId;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Timestamp getLoginDatatime() {
		return this.loginDatatime;
	}

	public void setLoginDatatime(Timestamp loginDatatime) {
		this.loginDatatime = loginDatatime;
	}

}