package com.hbshtx.wxc.web.bean;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.Table;

/**
 * 品牌表：
 * 
 * @author Administrator
 *
 */
@Table("CMS_Brand")
public class CMS_Brand {

	/**
	 * 品牌ID
	 */
	@Id
	public long BrandID;

	/**
	 * 品牌名称
	 */
	@Column
	public String BrandName;

	/**
	 * LOGO
	 */
	@Column
	public String BrandLogo;

	/**
	 * 描述
	 */
	@Column
	public String BrandDesc;

	/**
	 * 企业 ID
	 */
	@Column
	public int EnterpriseID;

	/**
	 * 状态
	 */
	@Column
	public int State;

	/**
	 * 排序
	 */
	@Column
	public int Orders;

}
