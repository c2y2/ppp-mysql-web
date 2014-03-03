package com.org.c2y2.serv;

import com.org.c2y2.base.IService;
import com.org.c2y2.entity.PptpdAdmin;

public interface IPptpdAdminService extends IService<PptpdAdmin> {
	
	/**
	 * 
	 * @name  insertPptpdAdmin
	 * @todo (用于添加pptpd管理员时的业务) 
	 * @conditions (这里描述这个方法适用条件 – 可选) 
	 * @step (这里描述这个方法业务步骤 – 可选) 
	 * @param pptpdAdmin
	 * @throws Exception  void 
	 * @exception  
	 * @author c2y2 Mar 3, 2014 11:05:55 PM
	 * @since  1.0.0
	 */
	void insertPptpdAdmin(PptpdAdmin pptpdAdmin)throws Exception;
	
	/**
	 * 
	 * @name  pptpdAdminLogin
	 * @todo (用于管理员登录) 
	 * @conditions (管理员登录时使用) 
	 * @param pptpdAdmin
	 * @return
	 * @throws Exception  PptpdAdmin 
	 * @exception  
	 * @author c2y2 Mar 3, 2014 11:33:27 PM
	 * @since  1.0.0
	 */
	PptpdAdmin pptpdAdminLogin(PptpdAdmin pptpdAdmin)throws Exception;
	
}
