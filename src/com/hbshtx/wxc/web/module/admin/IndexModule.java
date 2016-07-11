package com.hbshtx.wxc.web.module.admin;

import java.io.File;

import org.nutz.dao.Cnd;
import org.nutz.lang.util.NutMap;
import org.nutz.mvc.annotation.AdaptBy;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;
import org.nutz.mvc.upload.UploadAdaptor;

import com.hbshtx.wxc.web.bean.Shop_Products;
import com.hbshtx.wxc.web.bean.WxcAdModel;

@At("/admin")
public class IndexModule extends BaseModule {

	@At("/")
	@Ok("beetl:admin/index.html")
	public Object index() {
		return true;
	}

	@At
	@Ok("re:>>:/WEB-INF/admin/welcome.html")
	public Object welcome() {
		return "->:/WEB-INF/admin/welcome.html";
	}

	@At("/login")
	@Ok("beetl:admin/login.html")
	public Object login() {
		return true;
	}

	@At
	@Ok("json")
	public Object sylbdel(long id) {
		WxcAdModel wam = dao.fetch(WxcAdModel.class, id);
		wam.setShow(false);
		int count = dao.update(wam);
		if (count == 1) {
			return new NutMap().setv("ok", true);
		}
		return new NutMap().setv("ok", false);
	}

	@At
	@Ok("beetl:admin/fetch_p_list.html")
	public Object fetchsp(@Param("CategoryId") int CategoryId,
			@Param("ProductName") String ProductName) {
		return dao.query(
				Shop_Products.class,
				Cnd.where("CategoryId", "=", CategoryId).and("ProductName",
						"like", "%" + ProductName + "%"));
	}

	@At
	@Ok("beetl:admin/sylb.html")
	public Object sylb() {
		return dao.query(
				WxcAdModel.class,
				Cnd.where("adType", "=", 0).and("isShow", "=", true)
						.orderBy("sequence", "ASC"));
	}

	@At
	@Ok("beetl:admin/newadd.html")
	public Object newadd(long id) {
		if (id < 0) {
			return new WxcAdModel();
		} else {
			return dao.fetch(WxcAdModel.class, id);
		}
	}

	@At
	@Ok("beetl:admin/sylbfind.html")
	public Object sylbfind() {
		return true;
	}

	@At
	@Ok("beetl:admin/sylbedit2.html")
	public Object sylbedit(long id) {
		if (id > 0) {
			return dao.fetch(WxcAdModel.class, id);
		}
		return new WxcAdModel();
	}

	@At
	@Ok("beetl:admin/sylbsave.html")
	@AdaptBy(type = UploadAdaptor.class, args = { "${app.root}/upfile/image" })
	public Object sylbadnew(@Param("..") WxcAdModel ad, @Param("adp") int adp,
			@Param("adpv") String adpv, @Param("imgFile") File f) {
		System.out.println("adp:" + adp);
		System.out.println("adpv:" + adpv);

		if (f != null) {
			System.out.println("filepath:" + f.getPath());
			String path = f.getPath();
			String name = f.getName();
			int index = path.lastIndexOf("image");
			path = path.substring(0, index);
			File newFile = new File(path + "image//" + name);
			boolean flag = f.renameTo(newFile);
			ad.setImgUrl("image/" + name);
		}
		if (adpv == null) {
			adpv = "0";
		} else {
			switch (adp) {
			case 0:
				ad.groupId = Long.valueOf(adpv);
				System.out.println("groupId=" + ad.groupId);
				break;
			case 1:
				ad.goodsId = Long.valueOf(adpv);
				System.out.println("goodsid=" + ad.goodsId);
				break;
			case 2:
				ad.linkUrl = adpv;
				System.out.println("linkUrl=" + ad.linkUrl);
				break;
			}
		}
		if (ad.id > 0) {
			dao.update(ad);
		} else {
			dao.insert(ad);
		}
		return ad;
	}

	@At
	@Ok("beetl:admin/sylbsave.html")
	@AdaptBy(type = UploadAdaptor.class, args = { "${app.root}/upfile/image" })
	public Object sylbsave(@Param("..") WxcAdModel ad, @Param("adp") int adp,
			@Param("adpv") String adpv, @Param("imgFile") File f) {
		if (f != null) {
			System.out.println(f.getName());
			String path = f.getPath();
			String name = f.getName();
			int index = path.lastIndexOf("image");
			path = path.substring(0, index);
			File newFile = new File(path + "image//" + name);
			boolean flag = f.renameTo(newFile);
			ad.setImgUrl("image/" + name);
		}
		if (adpv == null) {
			adpv = "0";
			System.out.println(adpv + "adpv");
		} else {
			System.out.println(adpv + "adpv");
			switch (adp) {
			case 0:
				ad.groupId = Long.valueOf(adpv);
				break;
			case 1:
				ad.goodsId = Long.valueOf(adpv);
				System.out.println("goodid=" + ad.goodsId);
				break;
			case 2:
				ad.linkUrl = adpv;
				break;
			}
			System.out.println("goodid=" + ad.goodsId);
		}
		if (ad.id > 0) {
			dao.update(ad);
		} else {
			dao.insert(ad);
		}
		return ad;
	}
}
