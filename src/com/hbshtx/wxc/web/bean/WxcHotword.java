package com.hbshtx.wxc.web.bean;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

@Table("wxc_hotword")
public class WxcHotword extends BaseModel{
	
	/**
	 * 搜索热字
	 */
	@Column
	public String hotWord;
	
	/**
	 * 搜索次数
	 */
	@Column
	public int nums;
}
