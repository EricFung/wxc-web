package com.hbshtx.wxc.web.bean;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.One;
import org.nutz.dao.entity.annotation.Table;

/**
 * 评论表
 * @author Administrator
 *
 */
@Table("wxc_comment")
public class WxcComment extends BaseModel{
	
	/**
	 * 评论内容
	 */
	@Column
	public String content;

	/**
	 * 会员ID
	 */
	@Column
	public long memberID;
	
	@One(target = WxcUserInfo.class, field = "memberID")
	public WxcUserInfo userInfo;

	/**
	 * 评论类型：1商品，2商家  默认是商品
	 */
	@Column
	public int type=1;

	/**
	 * 类型对应表ID
	 */
	@Column
	public long ids;
	

	/**
	 * 客户评分
	 */
	@Column
	public float score=5;
	
	/**
	 * 是否显示
	 */
	@Column
	public boolean isShow;
	
	/**
	 * 订单token
	 */
	@Column
	public String orderToken;
	
	/**
	 * 订单token
	 */
	@Column
	public String imgUrl1;
	
	/**
	 * 订单token
	 */
	@Column
	public String imgUrl2;
	
	/**
	 * 订单token
	 */
	@Column
	public String imgUrl3;
	
	/**
	 * 订单token
	 */
	@Column
	public String imgUrl4;
	
	/**
	 * 订单token
	 */
	@Column
	public String imgUrl5;
	
}
