package com.hbshtx.wxc.web.bean;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.One;
import org.nutz.dao.entity.annotation.Table;

@Table("wxc_footprint")
public class WxcFootprint extends BaseModel{

	/**
	 * 会员ID
	 */
	@Column
	public long memberID;

	@One(target = WxcUserInfo.class, field = "memberID")
	public WxcUserInfo userInfo;
	
	/**
	 * 商品ID
	 */
	@Column
	public long goodsId;

	@One(target = Shop_Products.class, field = "goodsId")
	public Shop_Products goods;
}
