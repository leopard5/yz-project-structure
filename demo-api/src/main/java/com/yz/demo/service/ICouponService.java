package com.yz.demo.service;

import com.yz.demo.req.CouponQueryDTO;
import com.yz.demo.req.CouponDTO;
import com.yz.demo.req.UserGeneralDTO;
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
    MmcResult<Integer> deleteCoupon(UserGeneralDTO bean);

    /**
     * 创建优惠券
     *
     * @param couponReq
     * @return
     * @author yazhong.qi
     * @version 1.0.0
     */
    MmcResult<Integer> createCoupon(CouponDTO couponReq);

    /**
     * 更新优惠券
     *
     * @param couponReq
     * @return
     * @author yazhong.qi
     * @version 1.0.0
     */
    MmcResult<Integer> updateCoupon(CouponDTO couponReq);

    /**
     * 分页查询优惠券
     * @param couponQueryReq
     * @return
     */
    MmcResult<QueryResultInfo<CouponInfo>> queryCoupon(CouponQueryDTO couponQueryReq);

}