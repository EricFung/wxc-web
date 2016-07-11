package com.hbshtx.wxc.web.module.admin;

import org.nutz.dao.Cnd;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;

import com.hbshtx.wxc.web.bean.Shop_Categories;
import com.hbshtx.wxc.web.bean.WxcAdModel;

@At("/admin")
public class JPModule extends BaseModule {
	@At("/")
	@Ok("beetl:admin/index.html")
	public Object index(){
		return true;
	}
	
	@At
	@Ok("beetl:admin/jpfl.html")
	public Object queryJP(){
		return dao.query(WxcAdModel.class,Cnd.where("adType","=",2).and("isShow","=",true).orderBy("sequence","ASC"));
	}
	
	@At
	@Ok("beetl:admin/jpfl.html")
	public void updateFl(long id){
		WxcAdModel wam = dao.fetch(WxcAdModel.class,id);
		wam.setShow(false);
		dao.update(wam);
	}
	
	@At
	@Ok("json")
	public Object getCategories(){
		return dao.query(Shop_Categories.class, Cnd.where("1","=","1").orderBy("DisplaySequence","ASC"));
	}
}
