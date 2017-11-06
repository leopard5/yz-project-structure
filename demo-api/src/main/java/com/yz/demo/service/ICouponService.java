package com.yz.demo.service;

import com.yz.demo.req.CouponQueryDTO;
import com.yz.demo.req.CouponDTO;
import com.yz.demo.req.UserGeneralDTO;
import com.yz.demo.resp.CouponODTO;
import com.yz.demo.resp.DemoResult;
import com.yz.demo.resp.QueryResult;

public interface ICouponService {

    /**
     * 删除优惠券
     *
     * @param bean
     * @return
     * @author yazhong.qi
     * @version 1.0.0
     */
    DemoResult<Integer> deleteCoupon(UserGeneralDTO bean);

    /**
     * 创建优惠券
     *
     * @param couponReq
     * @return
     * @author yazhong.qi
     * @version 1.0.0
     */
    DemoResult<Integer> createCoupon(CouponDTO couponReq);

    /**
     * 更新优惠券
     *
     * @param couponReq
     * @return
     * @author yazhong.qi
     * @version 1.0.0
     */
    DemoResult<Integer> updateCoupon(CouponDTO couponReq);

    /**
     * 分页查询优惠券
     * @param couponQueryReq
     * @return
     */
    DemoResult<QueryResult<CouponODTO>> queryCoupon(CouponQueryDTO couponQueryReq);

}