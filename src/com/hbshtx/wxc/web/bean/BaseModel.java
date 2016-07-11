package com.hbshtx.wxc.web.bean;

import java.sql.Timestamp;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Id;

public abstract class BaseModel {

	@Id
	public long id;

	@Column
	public Timestamp time_stmp = new Timestamp(System.currentTimeMillis());

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Timestamp getTime_stmp() {
		return time_stmp;
	}

	public void setTime_stmp(Timestamp time_stmp) {
		this.time_stmp = time_stmp;
	}

}