package com.yz.demo.service.impl;

import com.yz.demo.biz.CouponBiz;
import com.yz.demo.biz.convertor.CouponConvertor;
import com.yz.demo.dal.CouponDal;
import com.yz.demo.model.Coupon;
import com.yz.demo.req.CouponQueryDTO;
import com.yz.demo.req.CouponDTO;
import com.yz.demo.req.UserGeneralDTO;
import com.yz.demo.resp.CouponODTO;
import com.yz.demo.resp.DemoResult;
import com.yz.demo.resp.MmcResultCode;
import com.yz.demo.resp.QueryResult;
import com.yz.demo.service.ICouponService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import static com.yz.demo.biz.util.ValidationUtil.isNull;
import static com.yz.demo.validate.CouponValidate.validateForCreate;
import static com.yz.demo.validate.CouponValidate.validateForUpdate;

@Service("couponService")
public class CouponServiceImpl implements ICouponService {
    private final Logger logger = LoggerFactory.getLogger(CouponServiceImpl.class);

    @Resource
    private CouponDal couponDal;
    @Resource
    private CouponBiz couponBiz;

    /**
     * 删除优惠券
     *
     * @param bean
     * @return
     * @Author: <yazhong.qi@chinaredstar.com>
     * @Version: <1.0>
     */
    @Override
    public DemoResult<Integer> deleteCoupon(UserGeneralDTO bean) {
        DemoResult<Integer> result = DemoResult.newSuccess();

        if (isNull(result, "优惠券ID", bean.getId())) {
            return result;
        }
        if (bean.getId().intValue() <= 0) {
            result.setErrorCode(MmcResultCode.COMMON_PARAM_INVALID, Coupon.ID);
            return result;
        }
        result.setDataMap(couponBiz.deleteCoupon(bean));
        return result;
    }

    /**
     * 创建优惠券
     *
     * @param couponReq
     * @return
     * @Author: <yazhong.qi@chinaredstar.com>
     * @Version: <1.0>
     */
    @Override
    public DemoResult<Integer> createCoupon(CouponDTO couponReq) {
        DemoResult<Integer> result = DemoResult.newSuccess();

        Coupon coupon = CouponConvertor.toCoupon(couponReq);
        if (!validateForCreate(coupon, result, false)) {
            return result;
        }

        result.setDataMap(couponBiz.createCoupon(coupon));
        return result;
    }

    /**
     * 更新优惠券
     *
     * @param couponReq
     * @return
     * @Author: <yazhong.qi@chinaredstar.com>
     * @Version: <1.0>
     */
    @Override
    public DemoResult<Integer> updateCoupon(CouponDTO couponReq) {
        DemoResult<Integer> result = DemoResult.newSuccess();

        Coupon coupon = CouponConvertor.toCoupon(couponReq);
        if (!validateForUpdate(coupon, result)) {
            return result;
        }
        result.setDataMap(couponBiz.updateCoupon(coupon));
        return result;
    }

    /**
     * 分页查询优惠券信息
     *
     * @param couponQueryReq
     * @return
     * @Author: <yazhong.qi@chinaredstar.com>
     * @Version: <1.0>
     */
    @Override
    public DemoResult<QueryResult<CouponODTO>> queryCoupon(CouponQueryDTO couponQueryReq) {
        DemoResult<QueryResult<CouponODTO>> result = DemoResult.newSuccess();

        QueryResult<Coupon> resultInfo = couponBiz.queryCoupon(couponQueryReq);
        result.setDataMap(CouponConvertor.toQueryResultInfo(resultInfo));
        return result;
    }
}