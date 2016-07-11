package com.hbshtx.wxc.web.bean;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

@Table("payinfo_table")
public class PayInfoModel extends BaseModel{

	@Column
	public String notify_time;
	@Column
	public String notify_type;
	@Column
	public String notify_id;
	@Column
	public String sign_type;
	@Column
	public String sign;
	@Column
	public String out_trade_no;
	@Column
	public String subject;
	@Column
	public String payment_type;
	@Column
	public String trade_no;
	@Column
	public String trade_status;
	@Column
	public String gmt_create;
	@Column
	public String gmt_payment;
	@Column
	public String gmt_close;
	@Column
	public String refund_status;
	@Column
	public String gmt_refund;
	@Column
	public String seller_email;
	@Column
	public String buyer_email;
	@Column
	public String seller_id;
	@Column
	public String buyer_id;
	@Column
	public String price;
	@Column
	public String total_fee;
	@Column
	public String quantity;
	@Column
	public String body;
	@Column
	public String discount;
	@Column
	public String is_total_fee_adjust;
	@Column
	public String use_coupon;
	@Column
	public String extra_common_param;
	@Column
	public String out_channel_type;
	@Column
	public String out_channel_amount;
	@Column
	public String out_channel_inst;
	@Column
	public String business_scene;
	@Column
	public String time_stmp;
}
