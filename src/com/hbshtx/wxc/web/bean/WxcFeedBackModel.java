package com.hbshtx.wxc.web.bean;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

@Table("wxc_feedback")
public class WxcFeedBackModel extends BaseModel{

	/**
	 * 用户电话
	 */
	@Column
	public String userPhone;
	
	/**
	 * 留言内容
	 */
	@Column
	public String content;
	
	/**
	 * 备注
	 */
	@Column
	public String beizhu;
	
	/**
	 * 坐标x经度
	 */
	@Column
	public float xx;
	
	/**
	 * 坐标y纬度
	 */
	@Column
	public float yy;
	
}
