package com.hbshtx.wxc.web.module.admin;

import org.nutz.dao.Dao;
import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;

@IocBean
public abstract class BaseModule {
	@Inject
	protected Dao dao;
}
