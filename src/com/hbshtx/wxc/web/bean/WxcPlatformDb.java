package com.hbshtx.wxc.web.bean;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

@Table("wxc_platformdb")
public class WxcPlatformDb extends BaseModel{

	/**
	 * 第三方登录用户ID
	 */
	@Column
	public String dbUserId;
	/**
	 * 第三方登录用户昵称
	 */
	@Column
	public String dbUserName;
	/**
	 * 第三方登录用户头像
	 */
	@Column
	public String dbUserIcon;
	/**
	 * 第三方登录用户性别
	 */
	@Column
	public String dbUserGender;
	/**
	 * 第三方登录token值
	 */
	@Column
	public String dbUserToken;
	/**
	 * 对应注册用户ID
	 */
	@Column
	public long relUserId;
	/**
	 * 第三方平台名称
	 */
	@Column
	public String sourceName;

}
