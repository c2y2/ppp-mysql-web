package com.org.c2y2.entity;

import java.util.Date;

import com.org.c2y2.base.Entity;

public class PptpdUser extends Entity{
	private static final long serialVersionUID = 1L;
	/**
	 * 用户id
	 */
	private Integer id;
	/**
	 * 管理员id
	 */
	private Integer mrgid;
	/**
	 * 用户姓名
	 */
	private String username;
	/**
	 * 用户密码
	 */
	private String password;
	/**
	 * 用户状态
	 */
	private Integer status;
	/**
	 * 用户ip（vpn ip）
	 */
	private String clientip;
	/**
	 * 用户服务器端对应ip
	 */
	private String serverip;
	/**
	 * 开始时间
	 */
	private Date startdate;
	/**
	 * 截止时间
	 */
	private Date enddate;
	
	
	
	
	public Integer getMrgid() {
		return mrgid;
	}

	public void setMrgid(Integer mrgid) {
		this.mrgid = mrgid;
	}

	public PptpdUser() {
		super();
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
	public String getClientip() {
		return clientip;
	}
	public void setClientip(String clientip) {
		this.clientip = clientip;
	}
	public String getServerip() {
		return serverip;
	}
	public void setServerip(String serverip) {
		this.serverip = serverip;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	
}
