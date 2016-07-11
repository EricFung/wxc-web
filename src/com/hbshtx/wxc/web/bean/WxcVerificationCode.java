package com.hbshtx.wxc.web.bean;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

@Table("wxc_verificationcode")
public class WxcVerificationCode extends BaseModel{

	/**
	 * 手机号
	 */
	@Column
	public String simno;
	
	/**
	 * 验证码
	 */
	@Column
	public String verificationCode;

	/**
	 * 状态1发送成功 ，2发送失败
	 */
	@Column
	public int status=1;

	/**
	 * 原因1注册 ，2找回密码，3修改密码
	 */
	@Column
	public int effect=1;

	/**
	 * 短信内容
	 */
	@Column
	public String content;

	/**
	 * 是否验证
	 */
	@Column
	public boolean verify=false;
}
