package com.hbshtx.wxc.web.bean;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.One;
import org.nutz.dao.entity.annotation.Table;

/**
 * 收藏表
 * @author Administrator
 *
 */
@Table("wxc_collect")
public class WxcCollect extends BaseModel{

	/**
	 * 商品ID
	 */
	@Column
	public long goodsId;

	@One(target = Shop_Products.class, field = "goodsId")
	public Shop_Products goods;

	/**
	 * 会员ID
	 */
	@Column
	public long memberID;

	@One(target = WxcUserInfo.class, field = "memberID")
	public WxcUserInfo userInfo;
}
