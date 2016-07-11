package com.hbshtx.wxc.web.bean;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.One;
import org.nutz.dao.entity.annotation.Table;

@Table("wxc_address")
public class WxcAddress extends BaseModel {

	/**
	 * 会员ID
	 */
	@Column
	public long userId;

	@One(target = WxcUserInfo.class, field = "userId")
	public WxcUserInfo userInfo;

	/**
	 * 电话
	 */
	@Column
	public String userPhone;

	/**
	 * 座机号码
	 */
	@Column
	public String telephoneNum;

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
	 * 备注
	 */
	@Column
	public String beizhu;

	/**
	 * 默认标识
	 */
	@Column
	public int status = 0;
}
