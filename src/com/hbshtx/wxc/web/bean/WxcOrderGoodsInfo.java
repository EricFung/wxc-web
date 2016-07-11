package com.hbshtx.wxc.web.bean;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.One;
import org.nutz.dao.entity.annotation.Table;

/**
 * 订单商品表
 * 
 * @author Administrator
 *
 */
@Table("wxc_ordergoodsinfo")
public class WxcOrderGoodsInfo extends BaseModel{

	/**
	 * 商品ID
	 */
	@Column
	public long goodsId;

	@One(target = Shop_Products.class, field = "goodsId")
	public Shop_Products goods;
	
	/**
	 * 规格 ID
	 */
	@Column
	public long skuId;

	@One(target = Shop_SKUs.class, field = "skuId")
	public Shop_SKUs skuInfo;

	/**
	 * 订单ID
	 */
	@Column
	public long orderId;

	@One(target = WxcOrderInfo.class, field = "orderId")
	public WxcOrderInfo orders;

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
	 * 商品数量
	 */
	@Column
	public int goodSum;
	
	/**
	 * 成交价格
	 */
	@Column
	public float price;
	
	/**
	 * 红包使用码
	 */
	@Column
	public String redToken;
	
	/**
	 * 图片
	 */
	@Column
	public String imgUrl;
	
}
