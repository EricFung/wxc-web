package com.hbshtx.wxc.web;

import org.nutz.dao.Dao;
import org.nutz.dao.util.Daos;
import org.nutz.ioc.Ioc;
import org.nutz.mvc.NutConfig;
import org.nutz.mvc.Setup;

public class MainSetup implements Setup {


	public void destroy(NutConfig conf) {
		// TODO Auto-generated method stub
		
	}


	public void init(NutConfig conf) {
		// TODO Auto-generated method stub
        Ioc ioc = conf.getIoc();
        Dao dao = ioc.get(Dao.class);
        Daos.createTablesInPackage(dao, "com.hbshtx.wxc.web", false);
	}

}
