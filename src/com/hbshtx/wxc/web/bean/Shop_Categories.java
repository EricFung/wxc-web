package com.hbshtx.wxc.web.bean;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.Table;

/**
 * 商品分类 表：
 * 
 * @author Administrator
 *
 */
@Table("Shop_Categories")
public class Shop_Categories {

	/**
	 * 分类 ID
	 */
	@Id
	public int CategoryId;

	/**
	 * 排序
	 */
	@Column
	public int DisplaySequence;

	/**
	 * 分类 名称
	 */
	@Column
	public String Name;

	/**
	 * 图片地址
	 */
	@Column
	public String ImageUrl;

	/**
	 * 
	 */
	@Column
	public String Meta_Title;

	/**
	 * SEO 描述
	 */
	@Column
	public String Meta_Description;

	/**
	 * SEO 关键 字
	 */
	@Column
	public String Meta_Keywords;

	/**
	 * 分类描述
	 */
	@Column
	public String Description;

	/**
	 * 父分 类 ID
	 */
	@Column
	public int ParentCategoryId;

	/**
	 * 分类 级别
	 */
	@Column
	public int Depth;

	/**
	 * 分类 全路 径
	 */
	@Column
	public String Path;

	/**
	 * 重写 名称
	 */
	@Column
	public String RewriteName;

	/**
	 * SKU 前缀
	 */
	@Column
	public String SKUPrefix;

	/**
	 * 关联 的产 品类 型
	 */
	@Column
	public int AssociatedProductType;

	/**
	 * 
	 */
	@Column
	public String Notes1;

	/**
	 * 
	 */
	@Column
	public String Notes2;

	/**
	 * 
	 */
	@Column
	public String Notes3;

	/**
	 * 
	 */
	@Column
	public String Notes4;

	/**
	 * 
	 */
	@Column
	public String Notes5;

	/**
	 * 样式
	 */
	@Column
	public String Theme;

	/**
	 * 是否 有子 类
	 */
	@Column
	public boolean HasChildren;

	/**
	 * SEO Url 地址 优化
	 */
	@Column
	public String SeoUrl;

	/**
	 * 
	 */
	@Column
	public String SeoImageAlt;

	/**
	 * 
	 */
	@Column
	public String SeoImageTitle;
}
