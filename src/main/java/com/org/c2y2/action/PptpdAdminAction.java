package com.org.c2y2.action;

import javax.annotation.Resource;

import org.apache.commons.lang.StringEscapeUtils;
import org.apache.commons.logging.Log;

import com.org.c2y2.base.BaseAction;
import com.org.c2y2.base.PageModel;
import com.org.c2y2.entity.PptpdAdmin;
import com.org.c2y2.serv.IPptpdAdminService;
import com.org.c2y2.util.LogUtils;

public class PptpdAdminAction extends BaseAction {

	private static final long serialVersionUID = 1L;
	
	private static  Log log = LogUtils.getLogger(PptpdAdminAction.class);
	
	private PptpdAdmin pptpdAdmin = new PptpdAdmin();
	private PageModel<PptpdAdmin> pm = new PageModel<PptpdAdmin>();

	@Resource IPptpdAdminService pptpdAdminService;
	
	
	/**
	 * 
	 * @name  pptpdAdminLogin
	 * @todo (vpn服务器管理员登录） 
	 * @conditions (管理员登录) 
	 * @return  String 
	 * @exception  
	 * @author c2y2 Mar 3, 2014 11:22:23 PM
	 * @since  1.0.0
	 */
	public String pptpdAdminLogin(){
		try {
			if(pptpdAdmin.getUsername()==null||(pptpdAdmin.getUsername()!=null && pptpdAdmin.getUsername().equals("")) ||pptpdAdmin.getPassword()==null||(pptpdAdmin.getPassword()!=null && pptpdAdmin.getPassword().equals(""))){
				return "return_LoginIndex";
			}else{
				pptpdAdmin = pptpdAdminService.pptpdAdminLogin(pptpdAdmin);
				if(pptpdAdmin!=null){
					if(pptpdAdmin.getUsertype()!=null){
						session.setAttribute("pptpdAdmin", pptpdAdmin);
						return "return_pptpdAdminQuery";
					}
				}else{
					return "return_LoginIndex";
				}
			}
			log.info("超级管理员登录成功");
			return "return_LoginIndex";
		} catch (Exception e) {
			log.debug("超级管理员登录异常",e);
			return ERROR;
		}
	}
	
	/**
	 * 
	 * @name  toAddAdmin
	 * @todo (跳转添加管理员页面) 
	 * @conditions (超级管理员使用) 
	 * @step (必须是超级管理员登录后才能跳转该页面) 
	 * @return  String 
	 * @exception  
	 * @author c2y2
	 * @since  1.0.0
	 */
	public String toAddAdmin(){
		log.info("跳转添加管理员页面");
		return "success_toAddAdmin";
	}
	
	/**
	 * 
	 * @name  insertPptpdAdmin
	 * @todo (用于添加普通管理员) 
	 * @conditions (超级管理员添加普通管理) 
	 * @return  String 
	 * @exception  
	 * @author c2y2 Mar 3, 2014 10:09:58 PM
	 * @since  1.0.0
	 */
	public String insertPptpdAdmin(){
		try {
			//默认仅仅只添加普通管理员
			pptpdAdmin.setUsertype(PptpdAdmin.generalAdmin);
			pptpdAdmin.setMemo(StringEscapeUtils.escapeHtml(pptpdAdmin.getMemo()));
			pptpdAdminService.insertPptpdAdmin(pptpdAdmin);
			log.info("添加普通管理员成功");
			return "success_insertPptpdAdmin";
		} catch (Exception e) {
			log.debug("添加管理员异常", e);
			return ERROR;
		}
	}
	
	/**
	 * 
	 * @name  queryPptdAdmin
	 * @todo (用于查询普通管理员) 
	 * @conditions (管理查询普通管理员) 
	 * @return  String 
	 * @exception  
	 * @author c2y2 Mar 3, 2014 10:16:03 PM
	 * @since  1.0.0
	 */
	public String queryPptpdAdmin(){
		try {
			//默认仅仅只添加普通管理员
			pm = pptpdAdminService.findOnPage(pptpdAdmin, pm);
			log.info("查询管理员成功");
			return "success_queryPptpdAdmin";
		} catch (Exception e) {
			log.debug("查询管理员异常", e);
			return ERROR;
		}
	}
	
	
	/*--------------------------set/get--------------------------------------*/
	public PptpdAdmin getPptpdAdmin() {
		return pptpdAdmin;
	}

	public void setPptpdAdmin(PptpdAdmin pptpdAdmin) {
		this.pptpdAdmin = pptpdAdmin;
	}

	public PageModel<PptpdAdmin> getPm() {
		return pm;
	}

	public void setPm(PageModel<PptpdAdmin> pm) {
		this.pm = pm;
	}
	
}
