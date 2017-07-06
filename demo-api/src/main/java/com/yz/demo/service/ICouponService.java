package com.yz.demo.service;

import com.yz.demo.req.CouponQueryReq;
import com.yz.demo.req.CouponReq;
import com.yz.demo.req.UserGeneralReq;
import com.yz.demo.resp.CouponInfo;
import com.yz.demo.resp.MmcResult;
import com.yz.demo.resp.QueryResultInfo;

public interface ICouponService {

    /**
     * 删除优惠券
     *
     * @param bean
     * @return
     * @author yazhong.qi
     * @version 1.0.0
     */
    MmcResult<Integer> deleteCoupon(UserGeneralReq bean);

    /**
     * 创建优惠券
     *
     * @param couponReq
     * @return
     * @author yazhong.qi
     * @version 1.0.0
     */
    MmcResult<Integer> createCoupon(CouponReq couponReq);

    /**
     * 更新优惠券
     *
     * @param couponReq
     * @return
     * @author yazhong.qi
     * @version 1.0.0
     */
    MmcResult<Integer> updateCoupon(CouponReq couponReq);

    /**
     * 分页查询优惠券
     * @param couponQueryReq
     * @return
     */
    MmcResult<QueryResultInfo<CouponInfo>> queryCoupon(CouponQueryReq couponQueryReq);

}