package com.yz.demo.biz.convertor;

import java.util.ArrayList;
import java.util.List;

import org.springframework.cglib.beans.BeanCopier;

import com.yz.demo.model.Coupon;
import com.yz.demo.model.CouponQuery;
import com.yz.demo.req.CouponQueryDTO;
import com.yz.demo.req.CouponDTO;
import com.yz.demo.resp.CouponInfo;
import com.yz.demo.resp.QueryResultInfo;

public abstract class CouponConvertor {

	private static final BeanCopier beanCopierForCouponInfo = BeanCopier.create(Coupon.class, CouponInfo.class, false);
	private static final BeanCopier beanCopierForCoupon = BeanCopier.create(CouponDTO.class, Coupon.class, false);
	private static final BeanCopier beanCopierForCouponQuery = BeanCopier.create(CouponQueryDTO.class, CouponQuery.class, false);

	public static CouponInfo toCouponInfo(Coupon coupon)
	{
		if (coupon == null) {
			return null;
		}
		CouponInfo couponInfo = new CouponInfo();
		beanCopierForCouponInfo.copy(coupon, couponInfo, null);
		return couponInfo;
	}

	public static Coupon toCoupon(CouponDTO couponReq)
	{
		Coupon coupon = new Coupon();
		beanCopierForCoupon.copy(couponReq, coupon, null);
		return coupon;
	}

	public static List<CouponInfo> toCouponInfoList(List<Coupon> couponList)
	{
		if (couponList == null || couponList.isEmpty()) {
			return null;
		}
		List<CouponInfo> couponInfoList = new ArrayList<CouponInfo>(couponList.size());
		for (Coupon coupon : couponList) {
			couponInfoList.add(toCouponInfo(coupon));
		}
		return couponInfoList;
	}

	public static List<Coupon> toCouponList(List<CouponDTO> couponReqList)
	{
		if (couponReqList == null || couponReqList.isEmpty()) {
			return null;
		}
		List<Coupon> couponList = new ArrayList<Coupon>(couponReqList.size());
		for (CouponDTO couponReq : couponReqList) {
			couponList.add(toCoupon(couponReq));
		}
		return couponList;
	}
	
	public static CouponQuery toCouponQuery(CouponQueryDTO couponQueryReq)
	{
		if (couponQueryReq== null) {
			return null;
		}
		CouponQuery couponQuery = new CouponQuery();
		beanCopierForCouponQuery.copy(couponQueryReq, couponQuery, null);
		return couponQuery;
	}

	public static QueryResultInfo<CouponInfo> toQueryResultInfo(QueryResultInfo<Coupon> queryResult)
	{
		QueryResultInfo<CouponInfo> queryResultInfo = new QueryResultInfo<CouponInfo>();
		queryResultInfo.setPageNo(queryResult.getPageNo());
		queryResultInfo.setPageSize(queryResult.getPageSize());
		queryResultInfo.setTotalPages(queryResult.getTotalPages());
		queryResultInfo.setTotalRecords(queryResult.getTotalRecords());
		queryResultInfo.setRecords(toCouponInfoList(queryResult.getRecords()));
		return queryResultInfo;
	}
}