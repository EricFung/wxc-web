package com.hbshtx.wxc.web.bean;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.Table;

/**
 * 商品 SKU 表 ：
 * 
 * @author Administrator
 *
 */
@Table("Shop_SKUs")
public class Shop_SKUs {

	/**
	 * 分类 ID
	 */
	@Id
	public long SkuId;

	/**
	 * 产品ID
	 */
	@Column
	public long ProductId;

	/**
	 * 备注
	 */
	@Column
	public String SKU;

	/**
	 * 备注
	 */
	@Column
	public int Weight;

	/**
	 * 备注
	 */
	@Column
	public int Stock;

	/**
	 * 备注
	 */
	@Column
	public int AlertStock;

	/**
	 * 成本 价
	 */
	@Column
	public float CostPrice;

	/**
	 * 销售 价
	 */
	@Column
	public float SalePrice;

	/**
	 * 备注
	 */
	@Column
	public boolean Upselling;

	/**
	 * SKU图片
	 */
	@Column
	public String imgUrl;
}
