package com.hbshtx.wxc.web.bean;

import java.sql.Timestamp;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.Table;

/**
 * 商品表：
 * 
 * @author Administrator
 *
 */
@Table("Shop_Products")
public class Shop_Products {

	/**
	 * 商品 ID
	 */
	@Id
	public long ProductId;

	/**
	 * 类别 ID 0:正常 有分类 -1:无分 类
	 */
	@Column
	public int CategoryId;

	/**
	 * 类型 ID
	 */
	@Column
	public int TypeId;

	/**
	 * 品牌 Id
	 */
	@Column
	public int BrandId;

	/**
	 * 名称
	 */
	@Column
	public String ProductName;

	/**
	 * 编码
	 */
	@Column
	public String ProductCode;

	/**
	 * 供应商 Id
	 */
	@Column
	public int SupplierId;

	/**
	 * 地区 Id
	 */
	@Column
	public int RegionId;

	/**
	 * 介绍
	 */
	@Column
	public String ShortDescription;

	/**
	 * 单位
	 */
	@Column
	public String Unit;

	/**
	 * 描述
	 */
	@Column
	public String Description;

	/**
	 * SEO_Title
	 */
	@Column
	public String Meta_Title;

	/**
	 * SEO_Description
	 */
	@Column
	public String Meta_Description;

	/**
	 * SEO_KeyWord
	 */
	@Column
	public String Meta_Keywords;

	/**
	 * 状态 0:下架(仓 库中) 1:上架 2:已删除
	 */
	@Column
	public int SaleStatus;

	/**
	 * 添加日期
	 */
	@Column
	public Timestamp AddedDate;

	/**
	 * 访问次数
	 */
	@Column
	public int VistiCounts;

	/**
	 * 售出总数
	 */
	@Column
	public int SaleCounts;

	/**
	 * 商品库存 (暂未 使用, 使用时请 设置为非空)
	 */
	@Column
	public int Stock;

	/**
	 * 显示顺序
	 */
	@Column
	public int DisplaySequence;

	/**
	 * 生产线
	 */
	@Column
	public int LineId;

	/**
	 * 市场价
	 */
	@Column
	public float MarketPrice;

	/**
	 * 其他价格（优惠前价格）
	 */
	@Column
	public float otherPrice;

	/**
	 * 最低价
	 */
	@Column
	public float LowestSalePrice;

	/**
	 * 
	 */
	@Column
	public int PenetrationStatus;

	/**
	 * 分类路径
	 */
	@Column
	public String MainCategoryPath;

	/**
	 * 扩展路径
	 */
	@Column
	public String ExtendCategoryPath;

	/**
	 * 是否有 SKU
	 */
	@Column
	public boolean HasSKU;

	/**
	 * 积分
	 */
	@Column
	public float Points;

	/**
	 * 图片路径
	 */
	@Column
	public String ImageUrl;

	/**
	 * 图片路径
	 */
	@Column
	public String ThumbnailUrl1;

	/**
	 * 图片路径
	 */
	@Column
	public String ThumbnailUrl2;

	/**
	 * 图片路径
	 */
	@Column
	public String ThumbnailUrl3;

	/**
	 * 图片路径
	 */
	@Column
	public String ThumbnailUrl4;

	/**
	 * 图片路径
	 */
	@Column
	public String ThumbnailUrl5;

	/**
	 * 图片路径
	 */
	@Column
	public String ThumbnailUrl6;

	/**
	 * 图片路径
	 */
	@Column
	public String ThumbnailUrl7;

	/**
	 * 是否特价
	 */
	@Column
	public String ThumbnailUrl8;

	/**
	 * 最大购买量
	 */
	@Column
	public int MaxQuantity;

	/**
	 * 最小购买量
	 */
	@Column
	public int MinQuantity;

	/**
	 * 标签
	 */
	@Column
	public String Tags;

	/**
	 * SEO Url 地址优化 规则
	 */
	@Column
	public String SeoUrl;

	public long getProductId() {
		return ProductId;
	}

	public void setProductId(long productId) {
		ProductId = productId;
	}

	public int getCategoryId() {
		return CategoryId;
	}

	public void setCategoryId(int categoryId) {
		CategoryId = categoryId;
	}

	public int getTypeId() {
		return TypeId;
	}

	public void setTypeId(int typeId) {
		TypeId = typeId;
	}

	public int getBrandId() {
		return BrandId;
	}

	public void setBrandId(int brandId) {
		BrandId = brandId;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public String getProductCode() {
		return ProductCode;
	}

	public void setProductCode(String productCode) {
		ProductCode = productCode;
	}

	public int getSupplierId() {
		return SupplierId;
	}

	public void setSupplierId(int supplierId) {
		SupplierId = supplierId;
	}

	public int getRegionId() {
		return RegionId;
	}

	public void setRegionId(int regionId) {
		RegionId = regionId;
	}

	public String getShortDescription() {
		return ShortDescription;
	}

	public void setShortDescription(String shortDescription) {
		ShortDescription = shortDescription;
	}

	public String getUnit() {
		return Unit;
	}

	public void setUnit(String unit) {
		Unit = unit;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
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

	public int getSaleStatus() {
		return SaleStatus;
	}

	public void setSaleStatus(int saleStatus) {
		SaleStatus = saleStatus;
	}

	public Timestamp getAddedDate() {
		return AddedDate;
	}

	public void setAddedDate(Timestamp addedDate) {
		AddedDate = addedDate;
	}

	public int getVistiCounts() {
		return VistiCounts;
	}

	public void setVistiCounts(int vistiCounts) {
		VistiCounts = vistiCounts;
	}

	public int getSaleCounts() {
		return SaleCounts;
	}

	public void setSaleCounts(int saleCounts) {
		SaleCounts = saleCounts;
	}

	public int getStock() {
		return Stock;
	}

	public void setStock(int stock) {
		Stock = stock;
	}

	public int getDisplaySequence() {
		return DisplaySequence;
	}

	public void setDisplaySequence(int displaySequence) {
		DisplaySequence = displaySequence;
	}

	public int getLineId() {
		return LineId;
	}

	public void setLineId(int lineId) {
		LineId = lineId;
	}

	public float getMarketPrice() {
		return MarketPrice;
	}

	public void setMarketPrice(float marketPrice) {
		MarketPrice = marketPrice;
	}

	public float getOtherPrice() {
		return otherPrice;
	}

	public void setOtherPrice(float otherPrice) {
		this.otherPrice = otherPrice;
	}

	public float getLowestSalePrice() {
		return LowestSalePrice;
	}

	public void setLowestSalePrice(float lowestSalePrice) {
		LowestSalePrice = lowestSalePrice;
	}

	public int getPenetrationStatus() {
		return PenetrationStatus;
	}

	public void setPenetrationStatus(int penetrationStatus) {
		PenetrationStatus = penetrationStatus;
	}

	public String getMainCategoryPath() {
		return MainCategoryPath;
	}

	public void setMainCategoryPath(String mainCategoryPath) {
		MainCategoryPath = mainCategoryPath;
	}

	public String getExtendCategoryPath() {
		return ExtendCategoryPath;
	}

	public void setExtendCategoryPath(String extendCategoryPath) {
		ExtendCategoryPath = extendCategoryPath;
	}

	public boolean isHasSKU() {
		return HasSKU;
	}

	public void setHasSKU(boolean hasSKU) {
		HasSKU = hasSKU;
	}

	public float getPoints() {
		return Points;
	}

	public void setPoints(float points) {
		Points = points;
	}

	public String getImageUrl() {
		return ImageUrl;
	}

	public void setImageUrl(String imageUrl) {
		ImageUrl = imageUrl;
	}

	public String getThumbnailUrl1() {
		return ThumbnailUrl1;
	}

	public void setThumbnailUrl1(String thumbnailUrl1) {
		ThumbnailUrl1 = thumbnailUrl1;
	}

	public String getThumbnailUrl2() {
		return ThumbnailUrl2;
	}

	public void setThumbnailUrl2(String thumbnailUrl2) {
		ThumbnailUrl2 = thumbnailUrl2;
	}

	public String getThumbnailUrl3() {
		return ThumbnailUrl3;
	}

	public void setThumbnailUrl3(String thumbnailUrl3) {
		ThumbnailUrl3 = thumbnailUrl3;
	}

	public String getThumbnailUrl4() {
		return ThumbnailUrl4;
	}

	public void setThumbnailUrl4(String thumbnailUrl4) {
		ThumbnailUrl4 = thumbnailUrl4;
	}

	public String getThumbnailUrl5() {
		return ThumbnailUrl5;
	}

	public void setThumbnailUrl5(String thumbnailUrl5) {
		ThumbnailUrl5 = thumbnailUrl5;
	}

	public String getThumbnailUrl6() {
		return ThumbnailUrl6;
	}

	public void setThumbnailUrl6(String thumbnailUrl6) {
		ThumbnailUrl6 = thumbnailUrl6;
	}

	public String getThumbnailUrl7() {
		return ThumbnailUrl7;
	}

	public void setThumbnailUrl7(String thumbnailUrl7) {
		ThumbnailUrl7 = thumbnailUrl7;
	}

	public String getThumbnailUrl8() {
		return ThumbnailUrl8;
	}

	public void setThumbnailUrl8(String thumbnailUrl8) {
		ThumbnailUrl8 = thumbnailUrl8;
	}

	public int getMaxQuantity() {
		return MaxQuantity;
	}

	public void setMaxQuantity(int maxQuantity) {
		MaxQuantity = maxQuantity;
	}

	public int getMinQuantity() {
		return MinQuantity;
	}

	public void setMinQuantity(int minQuantity) {
		MinQuantity = minQuantity;
	}

	public String getTags() {
		return Tags;
	}

	public void setTags(String tags) {
		Tags = tags;
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
	 * SEO 图片 Alt 信 息
	 */
	@Column
	public String SeoImageAlt;

	/**
	 * SEO 图片 Title 信息
	 */
	@Column
	public String SeoImageTitle;
}
