package com.org.c2y2.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public final class LogUtils {
	/**
	 * 
	 * @name  getLogger
	 * @todo (用于获取日志记录器) 
	 * @param clazz
	 * @return  Log 
	 * @exception  
	 * @author c2y2
	 * @since  1.0.0
	 */
	public final static Log getLogger(Class<?> clazz){
		return LogFactory.getLog(clazz);
	}

}
