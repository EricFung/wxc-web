package com.hbshtx.wxc.web.bean;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

/**
 * 商品类型和品牌关联
 * 
 * @author Administrator
 *
 */
@Table("Shop_ProductTypeBrands")
public class Shop_ProductTypeBrands {

	/**
	 * 类型 ID
	 */
	@Column
	public int ProductTypeId;

	/**
	 * 品牌ID
	 */
	@Column
	public int BrandId;

}
