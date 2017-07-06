package com.yz.demo.dal;

import com.yz.demo.dao.CouponMapper;
import com.yz.demo.model.Coupon;
import com.yz.demo.model.CouponExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("couponDal")
public class CouponDal {

    @Autowired
    private CouponMapper couponMapper;

    /**
     * 根据活动ID查询优惠券列表
     *
     * @param activityId
     * @return
     */
    @Transactional(readOnly = true)
    public List<Coupon> getCouponByActivityId(Integer activityId) {
        CouponExample couponExample = new CouponExample();
        couponExample.createCriteria()
                .andActivityIdEqualTo(activityId)
                .andIsDeletedEqualTo(false);

        List<Coupon> couponList = couponMapper.selectByExample(couponExample);
        return couponList;
    }

    /**
     * 根据活动ID查询优惠券列表
     *
     * @param packageId
     * @return
     */
    @Transactional(readOnly = true)
    public List<Coupon> getCouponByPackageId(Integer packageId) {
        CouponExample couponExample = new CouponExample();
        couponExample.createCriteria()
                .andCouponPackageIdEqualTo(packageId)
                .andIsDeletedEqualTo(false);

        List<Coupon> couponList = couponMapper.selectByExample(couponExample);
        return couponList;
    }

    /**
     * 根据ID获取优惠券信息
     *
     * @param id
     * @return
     * @version 1.0.0
     */
    @Transactional(readOnly = true)
    public Coupon getCoupon(Integer id) {
        CouponExample example = new CouponExample();
        example.createCriteria()
                .andIdEqualTo(id)
                .andIsDeletedEqualTo(false);

        List<Coupon> Coupons = couponMapper.selectByExample(example);
        if (Coupons == null || Coupons.isEmpty()) {
            return null;
        }
        return Coupons.get(0);
    }

    /**
     * 根据sku获取优惠券信息
     *
     * @param virtualItemNo
     * @return
     * @version 1.0.0
     */
    @Transactional(readOnly = true)
    public Coupon getCouponBySkuNo(String virtualItemNo) {
        CouponExample example = new CouponExample();
        example.createCriteria()
                .andCouponNoEqualTo(virtualItemNo.toString())
                .andIsDeletedEqualTo(false);

        List<Coupon> Coupons = couponMapper.selectByExample(example);
        if (Coupons == null || Coupons.isEmpty()) {
            return null;
        }
        return Coupons.get(0);
    }

    /**
     * 根据活动ID查询优惠券列表
     *
     * @param activityId
     * @return
     */
    @Transactional(readOnly = true)
    public List<Coupon> listCouponsByActivityId(Integer activityId) {
        CouponExample example = new CouponExample();
        example.createCriteria()
                .andActivityIdEqualTo(activityId)
                .andIsDeletedEqualTo(false);

        return couponMapper.selectByExample(example);
    }

    /**
     * 根据ID列表批量更新优惠券
     *
     * @param record
     * @param lists
     * @return
     */
    @Transactional
    public Integer updateCouponsById(Coupon record, List<Integer> lists) {
        CouponExample example = new CouponExample();
        example.createCriteria()
                .andIdIn(lists)
                .andIsDeletedEqualTo(false);
        return couponMapper.updateByExampleSelective(record, example);
    }
}
