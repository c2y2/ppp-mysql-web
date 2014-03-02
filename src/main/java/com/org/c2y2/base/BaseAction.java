package com.org.c2y2.base;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

public class BaseAction  extends ActionSupport implements ServletRequestAware,ServletResponseAware {
	private static final long serialVersionUID = 1L;
	protected HttpServletRequest httpServletRequest;
	protected HttpServletResponse httpServletResponse;
	protected HttpSession session;
	
	
	public String index(){
		return "index";
	}
	
	
	public HttpServletRequest getHttpServletRequest() {
		return httpServletRequest;
	}
	public HttpServletResponse getHttpServletResponse() {
		return httpServletResponse;
	}
	
	public HttpSession getSession() {
		return session;
	}
	public void setSession(HttpSession session) {
		this.session = session;
	}
	
	public void setServletResponse( HttpServletResponse httpServletResponse) {
		this.httpServletResponse = httpServletResponse;
		this.httpServletResponse.setCharacterEncoding("UTF-8");
	}
	
	public void setServletRequest(HttpServletRequest httpServletRequest) {
		this.httpServletRequest = httpServletRequest;
		this.session = this.httpServletRequest.getSession();
	}	
	
}
