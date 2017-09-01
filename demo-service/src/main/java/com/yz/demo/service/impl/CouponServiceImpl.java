package com.yz.demo.service.impl;

import com.yz.demo.biz.CouponBiz;
import com.yz.demo.biz.convertor.CouponConvertor;
import com.yz.demo.dal.CouponDal;
import com.yz.demo.model.Coupon;
import com.yz.demo.req.CouponQueryDTO;
import com.yz.demo.req.CouponDTO;
import com.yz.demo.req.UserGeneralDTO;
import com.yz.demo.resp.CouponInfo;
import com.yz.demo.resp.MmcResult;
import com.yz.demo.resp.MmcResultCode;
import com.yz.demo.resp.QueryResultInfo;
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
    public MmcResult<Integer> deleteCoupon(UserGeneralDTO bean) {
        MmcResult<Integer> result = MmcResult.newSuccess();

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
    public MmcResult<Integer> createCoupon(CouponDTO couponReq) {
        MmcResult<Integer> result = MmcResult.newSuccess();

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
    public MmcResult<Integer> updateCoupon(CouponDTO couponReq) {
        MmcResult<Integer> result = MmcResult.newSuccess();

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
    public MmcResult<QueryResultInfo<CouponInfo>> queryCoupon(CouponQueryDTO couponQueryReq) {
        MmcResult<QueryResultInfo<CouponInfo>> result = MmcResult.newSuccess();

        QueryResultInfo<Coupon> resultInfo = couponBiz.queryCoupon(couponQueryReq);
        result.setDataMap(CouponConvertor.toQueryResultInfo(resultInfo));
        return result;
    }
}