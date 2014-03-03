package com.org.c2y2.entity;

import com.org.c2y2.base.Entity;

/**
 * 
 * @author c2y2
 */
public class PptpdAdmin extends Entity{
	private static final long serialVersionUID = 1L;
	/**
	 * 管理员id
	 */
	private Integer id;
	/**
	 * 管理员姓名
	 */
	private String username;
	/**
	 * 管理员密码
	 */
	private String password;
	/**
	 * 管理员类型（1，超级管理员,2,普通管理员）
	 */
	private Integer usertype;
	/**
	 * 启用状态(0,启用，1，禁用)
	 */
	private Integer status;
	/**
	 * 备注说明
	 */
	private String memo;
	
	public final static Integer supperAdmin=1;
	public final static Integer generalAdmin=2;
	
	
	public PptpdAdmin() {
		super();
	}
	
	
	
	public Integer getUsertype() {
		return usertype;
	}



	public void setUsertype(Integer usertype) {
		this.usertype = usertype;
	}



	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	

	
}
