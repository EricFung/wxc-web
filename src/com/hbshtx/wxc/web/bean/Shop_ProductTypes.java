package com.hbshtx.wxc.web.bean;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.Table;

/**
 * 商品类型表
 * 
 * @author Administrator
 *
 */
@Table("Shop_ProductTypes")
public class Shop_ProductTypes {

	/**
	 * 类型 ID
	 */
	@Id
	public int TypeId;

	/**
	 * 商品类型名称
	 */
	@Column
	public String TypeName;

	/**
	 * 备注
	 */
	@Column
	public String Remark;
}
