package com.org.c2y2.serv.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.c2y2.base.AbstractService;
import com.org.c2y2.entity.PptpdUser;
import com.org.c2y2.mapper.PptpdUserMapper;
import com.org.c2y2.serv.IPptpdUserService;
@Service
public class PptpdUserServiceImpl extends AbstractService<PptpdUser> implements IPptpdUserService {
	
	@Autowired
	protected void setMapper(PptpdUserMapper pptpdUserMapper) {
		this.mapper = pptpdUserMapper;
	}

}
