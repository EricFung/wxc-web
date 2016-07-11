package com.hbshtx.wxc.web.module.admin;

import org.nutz.dao.Cnd;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;

import com.hbshtx.wxc.web.bean.Shop_Products;

@At("/admin")
public class TjModule extends BaseModule{
	
	@At("/")
	@Ok("beetl:admin/index.html")	
	public Object index() {
		return true;
	}
	
	/**
	 * 查询特价商品信息
	 * @param ProductName
	 * @return
	 */
	@At
	@Ok("beetl:admin/tejia.html")
	public Object querySp(@Param("..")String ProductName){
		return dao.query(Shop_Products.class, 
				Cnd.where("ProductName","like","%"+ProductName+"%"));
	}
	
	/**
	 * 改变商品信息的状态
	 * @param ProductId
	 * @return
	 */
	@At
	@Ok("beetl:admin/tejia.html")
	public void updateSp(long ProductId){
		Shop_Products sp = dao.fetch(Shop_Products.class, ProductId);
		if(sp.ThumbnailUrl8.equals("1")){
			sp.setThumbnailUrl8("0");
			dao.update(sp);
		} else {
			sp.setThumbnailUrl8("1");
			dao.update(sp);
		}
	}
}
