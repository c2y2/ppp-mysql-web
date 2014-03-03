package com.org.c2y2.serv.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.c2y2.base.AbstractService;
import com.org.c2y2.entity.PptpdAdmin;
import com.org.c2y2.mapper.PptpdAdminMapper;
import com.org.c2y2.serv.IPptpdAdminService;

@Service
public class PptpdAdminServiceImpl extends AbstractService<PptpdAdmin> implements IPptpdAdminService {
	@Autowired
	protected void setMapper(PptpdAdminMapper pptpdAdminMapper) {
		this.mapper = pptpdAdminMapper;
	}
	
	/**
	 * 
	 * @name  insertPptpdAdmin
	 * @todo (用于添加pptpd管理员时的业务处理) 
	 * @conditions (这里描述这个方法适用条件 – 可选) 
	 * @step (这里描述这个方法业务步骤 – 可选) 
	 * @param pptpdAdmin
	 * @throws Exception  void 
	 * @exception  
	 * @author c2y2 Mar 3, 2014 11:05:55 PM
	 * @since  1.0.0
	 */
	@Override
	public void insertPptpdAdmin(PptpdAdmin pptpdAdmin) throws Exception {
		String username = pptpdAdmin.getUsername()==null?null:pptpdAdmin.getUsername();
		if(username!=null){
			Integer flag = 	checkUserNameUnique(username);
			if(flag == 0){
				this.mapper.insert(pptpdAdmin);
			}else{
				return;
			}
		}
	}
	
	/**
	 * 
	 * @name  checkUserNameUnique
	 * @todo (验证管理员名字的唯一性) 
	 * @param username
	 * @return
	 * @throws Exception  Integer 
	 * @exception  
	 * @author c2y2 Mar 3, 2014 11:12:51 PM
	 * @since  1.0.0
	 */
	public Integer checkUserNameUnique(String username) throws Exception{
		return ((PptpdAdminMapper)this.mapper).checkUserNameUnique(username);
	}
	

	/**
	 * 
	 * @name  pptpdSupperAdminLogin
	 * @todo (用于超级管理员登录) 
	 * @conditions (超级管理员登录时使用) 
	 * @param pptpdAdmin
	 * @return
	 * @throws Exception  PptpdAdmin 
	 * @exception  
	 * @author c2y2 Mar 3, 2014 11:33:27 PM
	 * @since  1.0.0
	 */
	@Override
	public PptpdAdmin pptpdAdminLogin(PptpdAdmin pptpdAdmin)throws Exception {
		return  ((PptpdAdminMapper)this.mapper).pptpdAdminLogin(pptpdAdmin);
	}

}
