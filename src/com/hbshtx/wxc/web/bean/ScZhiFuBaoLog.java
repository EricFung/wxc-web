package com.hbshtx.wxc.web.bean;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

/**
 * 支付宝日志
 * 
 * @author Administrator
 *
 */
@Table("tb_zhifubaolog")
public class ScZhiFuBaoLog extends BaseModel{

	/**
	 * 日志关键字
	 */
	@Column(value="key1")
	public String key;
	
	/**
	 * 日志内容
	 */
	@Column
	public String content;
	
	/**
	 * 支付宝ID
	 */
	@Column
	public String notify_id;
}
