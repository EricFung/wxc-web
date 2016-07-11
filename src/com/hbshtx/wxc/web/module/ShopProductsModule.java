package com.hbshtx.wxc.web.module;

import org.nutz.dao.Dao;
import org.nutz.dao.QueryResult;
import org.nutz.dao.pager.Pager;
import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;

import com.hbshtx.wxc.web.bean.Shop_Products;

@IocBean
@At("/sp")
@Ok("json")
public class ShopProductsModule {

	
	@Inject
	protected Dao dao;
	
	//得到全部商品（特价
	public Object query(@Param("..")Pager pager){
		QueryResult qr = new QueryResult();
		qr.setList(dao.query(Shop_Products.class,null,pager));
		pager.setRecordCount(dao.count(Shop_Products.class,null));
		qr.setPager(pager);
		return qr;
	}
}
