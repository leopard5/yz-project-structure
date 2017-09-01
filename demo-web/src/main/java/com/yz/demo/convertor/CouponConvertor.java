package com.yz.demo.convertor;

import com.yz.demo.req.CouponQueryDTO;
import com.yz.demo.req.CouponDTO;
import com.yz.demo.vo.CouponQueryVo;
import com.yz.demo.vo.CouponVo;
import org.springframework.cglib.beans.BeanCopier;

import java.util.ArrayList;
import java.util.List;

public abstract class CouponConvertor {

    private static final BeanCopier beanCopierForCouponReq = BeanCopier.create(CouponVo.class, CouponDTO.class, false);
    private static final BeanCopier beanCopierForCouponQueryReq = BeanCopier.create(CouponQueryVo.class, CouponQueryDTO.class, false);

    public static CouponDTO toCouponReq(CouponVo couponVo) {
        if (couponVo == null) {
            return null;
        }
        CouponDTO couponReq = new CouponDTO();
        beanCopierForCouponReq.copy(couponVo, couponReq, null);
        return couponReq;
    }

    public static List<CouponDTO> toCouponReqList(List<CouponVo> couponVoList) {
        if (couponVoList == null || couponVoList.isEmpty()) {
            return null;
        }
        List<CouponDTO> couponReqList = new ArrayList<CouponDTO>(couponVoList.size());
        for (CouponVo couponVo : couponVoList) {
            couponReqList.add(toCouponReq(couponVo));
        }
        return couponReqList;
    }

    public static CouponQueryDTO toCouponQueryReq(CouponQueryVo couponQueryVo) {
        if (couponQueryVo == null) {
            return null;
        }
        CouponQueryDTO couponQueryReq = new CouponQueryDTO();
        beanCopierForCouponQueryReq.copy(couponQueryVo, couponQueryReq, null);
        return couponQueryReq;
    }
}