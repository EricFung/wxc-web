package com.hbshtx.wxc.web.bean;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

/**
 * 轮播表
 * @author Administrator
 *
 */
@Table("wxc_scrollinfo")
public class WxcScrollInfo extends BaseModel{

	/**
	 * 标题
	 */
	@Column
	public String title;

	/**
	 * 图片地址
	 */
	@Column
	public String imgUrl;

	/**
	 * 连接地址
	 */
	@Column
	public String linkUrl;

	/**
	 * 排序
	 */
	@Column
	public int orders;

	/**
	 * 是否有效1为有效
	 */
	@Column
	public int valid=1;
}
