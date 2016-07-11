package com.hbshtx.wxc.web.bean;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.One;
import org.nutz.dao.entity.annotation.Table;

/**
 * 订单信息表
 * 
 * @author Administrator
 *
 */
@Table("wxc_orderinfo")
public class WxcOrderInfo extends BaseModel {

	/**
	 * 商品总费用
	 */
	@Column
	public float totalPrice;
	
	/**
	 * 付款方式
	 */
	@Column
	public String payType;

	/**
	 * 会员ID
	 */
	@Column
	public long memberID;

	@One(target = WxcUserInfo.class, field = "memberID")
	public WxcUserInfo userInfo;

	/**
	 * 是否确认/评论
	 */
	@Column
	public boolean isConfirm=false;

	/**
	 * 是否付款
	 */
	@Column
	public boolean isPayment;
	
	/**
	 * 随机生成订单ID
	 */
	@Column
	public String token;

	/**
	 * 商家是否确认
	 */
	@Column
	public boolean isOK=false;
	
	/**
	 * 订单中一个商品图片
	 */
	@Column
	public String imgUrl;

	/**
	 * 有效标识
	 */
	@Column
	public boolean isValid=true;


	/**
	 * 电话
	 */
	@Column
	public String userPhone;
	
	/**
	 * 姓名
	 */
	@Column
	public String userName;

	/**
	 * 地址
	 */
	@Column
	public String userAddress;

	/**
	 * 邮编
	 */
	@Column
	public String userCode;

	/**
	 * 快递公司名称
	 */
	@Column
	public String kdName;

	/**
	 * 快递单号
	 */
	@Column
	public String KdNum;
	
}
