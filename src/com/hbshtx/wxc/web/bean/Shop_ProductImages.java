package com.hbshtx.wxc.web.bean;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.Table;

/**
 * 商品图片
 * 
 * @author Administrator
 *
 */
@Table("Shop_ProductImages")
public class Shop_ProductImages {

	/**
	 * 图片 ID
	 */
	@Id
	public int ProductImageId;

	/**
	 * 商品ID
	 */
	@Column
	public long ProductId;

	/**
	 * 图片地址
	 */
	@Column
	public String ImageUrl;

	/**
	 * 图片地址
	 */
	@Column
	public String ThumbnailUrl1;

	/**
	 * 图片地址
	 */
	@Column
	public String ThumbnailUrl2;

	/**
	 * 图片地址
	 */
	@Column
	public String ThumbnailUrl3;

	/**
	 * 图片地址
	 */
	@Column
	public String ThumbnailUrl4;

	/**
	 * 图片地址
	 */
	@Column
	public String ThumbnailUrl5;

	/**
	 * 图片地址
	 */
	@Column
	public String ThumbnailUrl6;

	/**
	 * 图片地址
	 */
	@Column
	public String ThumbnailUrl7;

	/**
	 * 图片地址
	 */
	@Column
	public String ThumbnailUrl8;
}
