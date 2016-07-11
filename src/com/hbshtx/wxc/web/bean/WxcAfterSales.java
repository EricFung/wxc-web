package com.hbshtx.wxc.web.bean;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.One;
import org.nutz.dao.entity.annotation.Table;

@Table("wxc_aftersales")
public class WxcAfterSales extends BaseModel{


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
	 * 商品数量
	 */
	@Column
	public int nums;

	/**
	 * 申请售后商品价格
	 */
	@Column
	public float price;

	/**
	 * 用户姓名
	 */
	@Column
	public String userName;

	/**
	 * 联系电话
	 */
	@Column
	public String userPhone;

	/**
	 * 邮箱
	 */
	@Column
	public String userEmail;

	/**
	 * 描述
	 */
	@Column
	public String description;

	/**
	 * 状态0为未处理，1为处理完成，2为正在处理
	 */
	@Column
	public int status;

	/**
	 * 备注
	 */
	@Column
	public String remark;

	/**
	 * 备注
	 */
	@Column
	public String imgUrl1;
	/**
	 * 备注
	 */
	@Column
	public String imgUrl2;
	/**
	 * 备注
	 */
	@Column
	public String imgUrl3;
	/**
	 * 备注
	 */
	@Column
	public String imgUrl4;
	/**
	 * 备注
	 */
	@Column
	public String imgUrl5;
	
	
}
