package com.hbshtx.wxc.web.module.admin;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;

import javax.servlet.http.HttpServletRequest;

import org.nutz.dao.Cnd;
import org.nutz.lang.util.NutMap;
import org.nutz.mvc.annotation.AdaptBy;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;
import org.nutz.mvc.upload.UploadAdaptor;

import com.hbshtx.wxc.web.bean.Shop_Categories;
import com.hbshtx.wxc.web.bean.Shop_Products;
import com.hbshtx.wxc.web.bean.WxcAdModel;

@At("/admin")
public class SeckillModule extends BaseModule {

	/**
	 * 查询秒杀产品
	 * 
	 * @return 秒杀产品集合
	 */
	@At
	@Ok("beetl:admin/msht.html")
	public Object msht() {
		return dao.query(WxcAdModel.class,
				Cnd.where("adType", "=", 1).and("isShow", "=", true).orderBy("sequence", "ASC"));
	}
	
	

	/**
	 * 模糊搜索商品
	 * 
	 * @param CategoryId
	 * @param describe
	 * @return
	 */
	@At
	@Ok("beetl:admin/category_list.html")
	public Object mhmsht(@Param("CategoryId") int CategoryId, @Param("ProductName")String ProductName,HttpServletRequest request) throws UnsupportedEncodingException {
		String name = request.getParameter("ProductName");
        System.out.println("前台传入参数：" + name);
        name  = new String(name.getBytes("ISO-8859-1"),"UTF-8");
        System.out.println("经过解码后参数：" + name);

		return dao.query(Shop_Products.class, Cnd.where("CategoryId", "=", CategoryId).or("ProductName", "like","%"+name+"%"));
		
	}

	/**
	 * 编辑秒杀商品
	 */
	@At
	@Ok("beetl:admin/mshtedit.html")
	public Object mshtEdit(long id) {
		if (id > 0) {
			return dao.fetch(WxcAdModel.class, id);
		}
		return new WxcAdModel();
	}

	/**
	 * tejiapush 增加秒杀商品到首页
	 */
	@At
	@Ok("beetl:admin/xiugai2.html")
	//@Ok("json")
	@AdaptBy(type = UploadAdaptor.class)
	public Object tejiapush(@Param("..") Shop_Products sp, @Param("logmin") String timespsta, @Param("logend") String timespend) {
		NutMap re = new NutMap();
		System.out.print("开始时间："+timespsta+";结束时间："+timespend);
		Shop_Products sps = dao.fetch(Shop_Products.class, sp.ProductId);
		WxcAdModel ad = new WxcAdModel();
		ad.setAdType(1);
		ad.setDescribe(sp.Description);
		ad.setGoodsName(sps.ProductName);
		ad.setGoodsId(sps.ProductId);
		ad.setTime_sta(Timestamp.valueOf(timespsta));
		ad.setTime_end(Timestamp.valueOf(timespend));;
		ad.setImgUrl(sps.ImageUrl);
		ad.setGroupId(sps.TypeId);
		ad.setMarketPrice(sp.MarketPrice);
		ad.setMemberPrice(sp.LowestSalePrice);
		ad.setShow(true);
		System.out.println(ad.getMarketPrice());
		System.out.println(ad.getDescribe());
		System.out.println(ad.getMemberPrice());

		int count = dao.count(WxcAdModel.class,
				Cnd.where("goodsId", "=", sps.ProductId).and("isShow", "=", 1).and("adType", "=", 1));
		if (count == 0) {
			WxcAdModel a = dao.insert(ad);
			re.setv("ok", true);
		} else {
			WxcAdModel adtemp = dao.fetch(WxcAdModel.class,
					Cnd.where("goodsId", "=", sps.ProductId).and("isShow", "=", 1).and("adType", "=", 1));
			ad.id = adtemp.id;
			int gengxin = dao.update(ad);
			re.setv("ok", false);
		}
		return re;
	}

	/**
	 * 增加商品
	 */
	@At
	@Ok("beetl:admin/xiugai.html")
	@AdaptBy(type = UploadAdaptor.class, args = { "${app.root}/upfile/image" })
	public Object mshtsave(@Param("..")WxcAdModel ad, @Param("imgUrl") File f) {

		if (ad.id > 0) {
			if (f != null) {
				System.out.println(f);
				System.out.println(f.getName());
				String path = f.getPath();
				String name = f.getName();
				int index = path.lastIndexOf("image");
				path = path.substring(0, index);
				File newFile = new File(path + "image//" + name);
				boolean flag = f.renameTo(newFile);
				ad.setImgUrl("image/" + name);
			} else {
				WxcAdModel wa = (WxcAdModel) mshtEdit(ad.id);			
				ad.setImgUrl(wa.imgUrl);
			}
			dao.updateIgnoreNull(ad);

		} else {		
			dao.insert(ad);
		}
		return ad;
	}


	/**
	 * 添加
	 */
	@At
	@Ok("beetl:admin/Commonadd.html")
	public Object Commonadd() {
		return null;
	}

	/**
	 * 查所有类型
	 */
	@At
	@Ok("json")
	public Object allCategories() {
		return dao.query(Shop_Categories.class, null);
	}

	/**
	 * 删除
	 */
	@At
	@Ok("json")
	public Object mshtdel(long mid) {
		NutMap rs = new NutMap();
		WxcAdModel wd = dao.fetch(WxcAdModel.class, mid);
		if (wd.isShow == true) {
			wd.setShow(false);
			dao.update(wd);
			return rs.setv("ok", false);
		}
		return rs.setv("ok", true);
	}


	/**
	 * 根据产品id查出本条产品
	 */
	@At
	@Ok("beetl:admin/mshtedit2.html")
	public Object msadd(long pid){
		return dao.fetch(Shop_Products.class,pid);
	}

}
