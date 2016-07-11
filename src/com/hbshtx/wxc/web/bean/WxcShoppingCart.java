package com.hbshtx.wxc.web.bean;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.One;
import org.nutz.dao.entity.annotation.Table;

/**
 * 购物车
 * @author Administrator
 *
 */
@Table("wxc_shoppingcart")
public class WxcShoppingCart extends BaseModel{

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
	
	/**
	 * 规格 ID
	 */
	@Column
	public long skuId;

	@One(target = Shop_SKUs.class, field = "skuId")
	public Shop_SKUs skuInfo;

	/**
	 * 商品类别名称
	 */
	@Column
	public String typeName;

	/**
	 * 商品名称
	 */
	@Column
	public String goodsName;

	/**
	 * 商品图片
	 */
	@Column
	public String imgUrl;

	/**
	 * 添加时候价格
	 */
	@Column
	public float oldPirce=0;


	/**
	 * 商品数量
	 */
	@Column
	public int goodSum;

}
