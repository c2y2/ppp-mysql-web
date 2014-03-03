package com.org.c2y2.mapper;

import com.org.c2y2.base.IMapper;
import com.org.c2y2.entity.PptpdAdmin;

public interface PptpdAdminMapper extends IMapper<PptpdAdmin> {
	/**
	 * 
	 * @name  checkUserNameUnique
	 * @todo (验证管理员名称的唯一性) 
	 * @param username
	 * @return
	 * @throws Exception  Integer 
	 * @exception  
	 * @author c2y2 Mar 3, 2014 11:11:30 PM
	 * @since  1.0.0
	 */
	Integer checkUserNameUnique(String username)throws Exception;
	
	/**
	 * 
	 * @name  pptpdAdminLogin
	 * @todo (用于管理员登录) 
	 * @conditions (管理员登录时使用，超级管理与普通管理员共同使用) 
	 * @param pptpdAdmin
	 * @return
	 * @throws Exception  PptpdAdmin 
	 * @exception  
	 * @author c2y2 Mar 3, 2014 11:47:01 PM
	 * @since  1.0.0
	 */
	PptpdAdmin pptpdAdminLogin(PptpdAdmin pptpdAdmin)throws Exception;
}
