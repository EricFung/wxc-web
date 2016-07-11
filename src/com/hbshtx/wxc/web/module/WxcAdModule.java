package com.hbshtx.wxc.web.module;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;

import org.nutz.dao.Cnd;
import org.nutz.dao.Dao;
import org.nutz.dao.DaoException;
import org.nutz.dao.FieldFilter;
import org.nutz.dao.QueryResult;
import org.nutz.dao.pager.Pager;
import org.nutz.dao.util.Daos;
import org.nutz.img.Images;
import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.lang.util.NutMap;
import org.nutz.log.Log;
import org.nutz.mvc.annotation.AdaptBy;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.GET;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.POST;
import org.nutz.mvc.annotation.Param;
import org.nutz.mvc.impl.AdaptorErrorContext;
import org.nutz.mvc.upload.TempFile;
import org.nutz.mvc.upload.UploadAdaptor;

import com.hbshtx.wxc.web.bean.WxcAdModel;

@IocBean
@At("/ad")
@Ok("json")
public class WxcAdModule {

	@Inject
	protected Dao dao;

	// 得到全部 带分页
	@At
	public Object query(@Param("..") Pager pager) {
		QueryResult qr = new QueryResult();
		qr.setList(dao.query(WxcAdModel.class, null, pager));
		pager.setRecordCount(dao.count(WxcAdModel.class, null));
		qr.setPager(pager);
		return qr; // 默认分页是第1页,每页20条
	}

	// 得到全部（Type=0）不带分页
	@At("/qop")
	public Object queryNoPage() {
		QueryResult qr = new QueryResult();
		qr.setList(dao.query(WxcAdModel.class, Cnd.where("adType", "=", "0")));
		return qr;
	}

	// 根据id得到AD
	@At("/qbid")
	@GET
	@Ok("jsp:/sylbedit2")
	public WxcAdModel queryById(@Param("id") long id) {
		WxcAdModel admodel = Daos.ext(dao, FieldFilter.get(WxcAdModel.class))
				.fetch(WxcAdModel.class, id);
		return admodel;
	}
	//根据id删除ad
	@At("/dbid")
	@GET
	public Object delById(@Param("id") long id){
		dao.delete(WxcAdModel.class, id);
		return new NutMap().setv("ok", true);
	}

	// 得到秒杀数据
	@At("/qms")
	public Object queryMS() {
		QueryResult qr = new QueryResult();
		qr.setList(dao.query(WxcAdModel.class, Cnd.where("adType", "=", "1")));
		return qr;
	}

	@At("/aad")
	public Object addAd(@Param("..") WxcAdModel adm) {
		NutMap re = new NutMap();
		adm = dao.insert(adm);
		return re.setv("ok", true).setv("data", adm);
	}
	Log log = null;
	
	@AdaptBy(type = UploadAdaptor.class, args = {
		"${app.root}/WEB-INF/tmp/user_avatar", "8192", "utf-8", "20000",
		"102400" })
	@POST
	@At("/upld")
	public void uploadAvatar(@Param("file") TempFile tf,int userId,AdaptorErrorContext err){
		String msg = null;
		if (err != null && err.getAdaptorErr() != null) {
			msg = "文件大小不符合规定";
		} else if (tf == null) {
			msg = "空文件";
		} else {
			try {
				BufferedImage image = Images.read(tf.getFile());
				image = Images.zoomScale(image, 128, 128, Color.WHITE);
				ByteArrayOutputStream out = new ByteArrayOutputStream();
				Images.writeJpeg(image, out, 0.8f);

			} catch (DaoException e) {
				log.info("SystemError", e);
				msg = "系统错误";
			} catch (Throwable e) {
				msg = "图片格式错误";
			}
		}
	}
}
