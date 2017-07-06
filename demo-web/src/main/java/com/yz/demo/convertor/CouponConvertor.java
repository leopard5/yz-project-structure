package com.yz.demo.convertor;

import com.yz.demo.req.CouponQueryReq;
import com.yz.demo.req.CouponReq;
import com.yz.demo.vo.CouponQueryVo;
import com.yz.demo.vo.CouponVo;
import org.springframework.cglib.beans.BeanCopier;

import java.util.ArrayList;
import java.util.List;

public abstract class CouponConvertor {

    private static final BeanCopier beanCopierForCouponReq = BeanCopier.create(CouponVo.class, CouponReq.class, false);
    private static final BeanCopier beanCopierForCouponQueryReq = BeanCopier.create(CouponQueryVo.class, CouponQueryReq.class, false);

    public static CouponReq toCouponReq(CouponVo couponVo) {
        if (couponVo == null) {
            return null;
        }
        CouponReq couponReq = new CouponReq();
        beanCopierForCouponReq.copy(couponVo, couponReq, null);
        return couponReq;
    }

    public static List<CouponReq> toCouponReqList(List<CouponVo> couponVoList) {
        if (couponVoList == null || couponVoList.isEmpty()) {
            return null;
        }
        List<CouponReq> couponReqList = new ArrayList<CouponReq>(couponVoList.size());
        for (CouponVo couponVo : couponVoList) {
            couponReqList.add(toCouponReq(couponVo));
        }
        return couponReqList;
    }

    public static CouponQueryReq toCouponQueryReq(CouponQueryVo couponQueryVo) {
        if (couponQueryVo == null) {
            return null;
        }
        CouponQueryReq couponQueryReq = new CouponQueryReq();
        beanCopierForCouponQueryReq.copy(couponQueryVo, couponQueryReq, null);
        return couponQueryReq;
    }
}