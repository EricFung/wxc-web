package com.hbshtx.wxc.web.bean;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.Table;

/**
 * 产品 类别关联表
 * 
 * @author Administrator
 *
 */
@Table("Shop_ProductCategories")
public class Shop_ProductCategories {

	/**
	 * 分类 ID
	 */
	@Id
	public int CategoryId;

	/**
	 * 产品ID
	 */
	@Column
	public long ProductId;

	/**
	 * 备注
	 */
	@Column
	public String CategoryPath;
}
