package com.hbshtx.wxc.web.bean;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;
/**
 * 充值历史记录表
 * @author Administrator
 *
 */
@Table("record_topup")
public class TopupHistoryModel extends BaseModel {
	/**
	 * 用户ID
	 */
	@Column
	public String userid;
	/**
	 * 支付宝异步同步消息ID
	 */
	@Column
	public String notify_id;
	/**
	 * 充值金额
	 */
	@Column
	public String add_money;
	/**
	 * 账户原有金额
	 */
	@Column
	public String original_money;
	/**
	 * 消息时间
	 */
	@Column
	public String notify_time;
	/**
	 * 插入时间
	 */
	@Column
	public String time_stmp;
}
