package com.org.c2y2.base;

import java.io.Serializable;

/**
 * 实体抽象类
 */
public abstract class Entity implements Serializable {

	private static final long serialVersionUID = -3618055865507347329L;

	protected Integer pageNo = 1;
	protected Integer pageSize = 10;

	public Entity() {
	}

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	
	public Integer getPageStart(){
		return (this.pageNo - 1) * this.pageSize;
	}
}
