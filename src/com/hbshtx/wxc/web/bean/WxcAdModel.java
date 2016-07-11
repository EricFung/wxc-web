package com.hbshtx.wxc.web.bean;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

/**
 * 商品广告
 * 
 * @author Administrator
 *
 */
@Table("wxc_admodel")
public class WxcAdModel extends BaseModel {

	/**
	 * 商品ID
	 */
	@Column
	public long goodsId = 0;

	/**
	 * 商品分类ID
	 */
	@Column
	public long groupId = 0;

	/**
	 * 商品名称
	 */
	@Column
	public String goodsName;

	/**
	 * 商品图片
	 */
	@Column
	public String imgUrl;

	/**
	 * 商品折扣
	 */
	@Column
	public String discount;

	/**
	 * 市场价
	 */
	@Column
	public float MarketPrice;

	/**
	 * 会员价或者折扣价
	 */
	@Column
	public float memberPrice;

	/**
	 * 连接URL站外商品或者其他非商品类广告连接地址
	 */
	@Column
	public String linkUrl;

	/**
	 * 广告描述
	 */
	@Column(value = "describe")
	public String describe;

	/**
	 * 广告类型：0为首页轮播图类广告，1首页秒杀，2首页精品抢先，3首页新品秀
	 * ，4首页品牌推荐，5首页猜你喜欢，6为绿色食品广告，7为进口食品广告，8为酒类广告
	 */
	@Column
	public int adType;

	/**
	 * 排列顺序小靠前，大后
	 */
	@Column
	public int sequence = 10;

	/**
	 * 是否首页显示
	 */
	@Column
	public boolean isShow = true;

	public long getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(long goodsId) {
		this.goodsId = goodsId;
	}

	public long getGroupId() {
		return groupId;
	}

	public void setGroupId(long groupId) {
		this.groupId = groupId;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public float getMarketPrice() {
		return MarketPrice;
	}

	public void setMarketPrice(float marketPrice) {
		MarketPrice = marketPrice;
	}

	public float getMemberPrice() {
		return memberPrice;
	}

	public void setMemberPrice(float memberPrice) {
		this.memberPrice = memberPrice;
	}

	public String getLinkUrl() {
		return linkUrl;
	}

	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public int getAdType() {
		return adType;
	}

	public void setAdType(int adType) {
		this.adType = adType;
	}

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public boolean isShow() {
		return isShow;
	}

	public void setShow(boolean isShow) {
		this.isShow = isShow;
	}

}
