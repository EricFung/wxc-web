package com.hbshtx.wxc.web.bean;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

@Table("wxc_userinfo")
public class WxcUserInfo extends BaseModel {

	/**
	 * 用户登录帐号
	 */
	@Column
	public String user_login;

	/**
	 * 用户密码
	 */
	@Column
	public String user_pass;

	/**
	 * 昵称
	 */
	@Column
	public String user_nicename;

	/**
	 * 邮箱
	 */
	@Column
	public String user_email;

	/**
	 * 头像
	 */
	@Column
	public String user_url;

	/**
	 * 
	 */
	@Column
	public String avatar;

	/**
	 * 
	 */
	@Column
	public int sex;

	/**
	 * 
	 */
	@Column
	public String birthday;

	/**
	 * 
	 */
	@Column
	public String signature;

	/**
	 * 
	 */
	@Column
	public String last_login_ip;

	/**
	 * 
	 */
	@Column
	public String last_login_time;

	/**
	 * 余额
	 */
	@Column
	public float money;

	/**
	 * 用户状态
	 */
	@Column
	public int user_status;

	/**
	 * 积分
	 */
	@Column
	public int score;

	/**
	 * 用户类型
	 */
	@Column
	public int user_type;

	/**
	 * 用户电话
	 */
	@Column
	public String user_phone;

	/**
	 * token
	 */
	@Column
	public String token;

	/**
	 * 简介
	 */
	@Column
	public String content;

	/**
	 * 地址
	 */
	@Column
	public String user_address;
}
