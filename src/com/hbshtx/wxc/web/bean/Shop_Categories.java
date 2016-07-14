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

	public int getCategoryId() {
		return CategoryId;
	}

	public void setCategoryId(int categoryId) {
		CategoryId = categoryId;
	}

	public int getDisplaySequence() {
		return DisplaySequence;
	}

	public void setDisplaySequence(int displaySequence) {
		DisplaySequence = displaySequence;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getImageUrl() {
		return ImageUrl;
	}

	public void setImageUrl(String imageUrl) {
		ImageUrl = imageUrl;
	}

	public String getMeta_Title() {
		return Meta_Title;
	}

	public void setMeta_Title(String meta_Title) {
		Meta_Title = meta_Title;
	}

	public String getMeta_Description() {
		return Meta_Description;
	}

	public void setMeta_Description(String meta_Description) {
		Meta_Description = meta_Description;
	}

	public String getMeta_Keywords() {
		return Meta_Keywords;
	}

	public void setMeta_Keywords(String meta_Keywords) {
		Meta_Keywords = meta_Keywords;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public int getParentCategoryId() {
		return ParentCategoryId;
	}

	public void setParentCategoryId(int parentCategoryId) {
		ParentCategoryId = parentCategoryId;
	}

	public int getDepth() {
		return Depth;
	}

	public void setDepth(int depth) {
		Depth = depth;
	}

	public String getPath() {
		return Path;
	}

	public void setPath(String path) {
		Path = path;
	}

	public String getRewriteName() {
		return RewriteName;
	}

	public void setRewriteName(String rewriteName) {
		RewriteName = rewriteName;
	}

	public String getSKUPrefix() {
		return SKUPrefix;
	}

	public void setSKUPrefix(String sKUPrefix) {
		SKUPrefix = sKUPrefix;
	}

	public int getAssociatedProductType() {
		return AssociatedProductType;
	}

	public void setAssociatedProductType(int associatedProductType) {
		AssociatedProductType = associatedProductType;
	}

	public String getNotes1() {
		return Notes1;
	}

	public void setNotes1(String notes1) {
		Notes1 = notes1;
	}

	public String getNotes2() {
		return Notes2;
	}

	public void setNotes2(String notes2) {
		Notes2 = notes2;
	}

	public String getNotes3() {
		return Notes3;
	}

	public void setNotes3(String notes3) {
		Notes3 = notes3;
	}

	public String getNotes4() {
		return Notes4;
	}

	public void setNotes4(String notes4) {
		Notes4 = notes4;
	}

	public String getNotes5() {
		return Notes5;
	}

	public void setNotes5(String notes5) {
		Notes5 = notes5;
	}

	public String getTheme() {
		return Theme;
	}

	public void setTheme(String theme) {
		Theme = theme;
	}

	public boolean isHasChildren() {
		return HasChildren;
	}

	public void setHasChildren(boolean hasChildren) {
		HasChildren = hasChildren;
	}

	public String getSeoUrl() {
		return SeoUrl;
	}

	public void setSeoUrl(String seoUrl) {
		SeoUrl = seoUrl;
	}

	public String getSeoImageAlt() {
		return SeoImageAlt;
	}

	public void setSeoImageAlt(String seoImageAlt) {
		SeoImageAlt = seoImageAlt;
	}

	public String getSeoImageTitle() {
		return SeoImageTitle;
	}

	public void setSeoImageTitle(String seoImageTitle) {
		SeoImageTitle = seoImageTitle;
	}

	/**
	 * 
	 */
	@Column
	public String SeoImageTitle;
}
