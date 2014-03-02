package com.org.c2y2.base;

import java.util.List;

public class PageModel<T extends Entity> {
	public static final String PAGE_SIZE = "pageSize";
	public static final String PAGE_NO = "pageNo";
	
	protected List<T> list;  //结果集
	
	protected Integer totalRecords; //查询记录数
	
	protected Integer pageSize = 10;  //每页多少条数据
	
	protected Integer pageNo = 1;  //第几页
	
	protected String pageType = "Y" ;//分页类型 Y 带count  N不带count分页
	/**
	 * 总页数
	 * @return
	 */
	public Integer getTotalPages() {
		return (totalRecords + pageSize - 1) / pageSize;
	}
	
	/**
	 * 取得首页
	 * @return
	 */
	public Integer getTopPageNo() {
		return 1;
	}
	
	/**
	 * 上一页
	 * @return
	 */
	public Integer getPreviousPageNo() {
		if (pageNo <= 1) {
			return 1;
		}
		return pageNo - 1;
	}
	
	/**
	 * 下一页
	 * @return
	 */
	public Integer getNextPageNo() {
		if (pageNo >= getBottomPageNo()) {
			return getBottomPageNo();
		}
		return pageNo + 1;	
	}
	
	/**
	 * 取得尾页
	 * @return
	 */
	public Integer getBottomPageNo() {
		return getTotalPages();
	}
	
	
	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public Integer getTotalRecords() {
		return totalRecords;
	}

	public void setTotalRecords(Integer totalRecords) {
		this.totalRecords = totalRecords;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public Integer getPageNo() {
		return pageNo;
	}

	/**
	 * 类型: String
	 * 字段名: pageType
	 */
	public String getPageType() {
		return pageType;
	}

	/**
	 * 类型: String
	 * 字段名: pageType
	 */
	public void setPageType(String pageType) {
		this.pageType = pageType;
	}

	/**
	 * 类型: Integer
	 * 字段名: pageSize
	 */
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	/**
	 * 类型: Integer
	 * 字段名: pageNo
	 */
	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}
}
