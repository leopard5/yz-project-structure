package com.yz.demo.biz;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yz.demo.biz.exception.CommonBizException;
import com.yz.demo.dal.CouponDal;
import com.yz.demo.dao.CouponMapper;
import com.yz.demo.dao.ext.CouponExtMapper;
import com.yz.demo.model.Coupon;
import com.yz.demo.req.CouponQueryDTO;
import com.yz.demo.req.UserGeneralDTO;
import com.yz.demo.resp.MmcResultCode;
import com.yz.demo.resp.QueryResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service("couponBiz")
public class CouponBiz {
    private final Logger LOGGER = LoggerFactory.getLogger(CouponBiz.class);

    @Resource
    private CouponMapper couponMapper;
    @Resource
    private CouponExtMapper couponExtMapper;
    @Resource
    private CouponDal couponDal;

    @Resource
    private RestTemplate restTemplate;

    /**
     * 删除优惠券
     *
     * @param bean
     * @return
     * @author yazhong.qi
     * @version 1.0.0
     */
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, rollbackFor = Exception.class)
    public Integer deleteCoupon(UserGeneralDTO bean) {
        Coupon coupon = couponDal.getCoupon(bean.getId());
        if (coupon == null) {
            throw new CommonBizException(MmcResultCode.DATA_NOT_EXIST, "优惠券");
        }
        if (!coupon.getOwnerType().equals(bean.getOwnerType())) {
            LOGGER.warn("优惠券自身类型：{} 删除优惠券类型：{}", coupon.getOwnerType(), bean.getOwnerType());
            throw new CommonBizException(MmcResultCode.NO_PERMISSION_OPERATE, "删除此优惠券");
        }
        if (!coupon.getOwnerId().equals(bean.getOwnerId())) {
            LOGGER.warn("优惠券自身属性ID：{}，删除优惠券属性ID：{}", coupon.getOwnerId(), bean.getOwnerId());
            throw new CommonBizException(MmcResultCode.NO_PERMISSION_OPERATE, "删除此优惠券");
        }

        int result = couponMapper.logicalDeleteByPrimaryKey(bean.getId(), bean.getOperator(), bean.getOperatorName(), new Date());
        return result;
    }

    /**
     * 创建优惠券
     *
     * @param coupon
     * @return
     * @author yazhong.qi
     * @version 1.0.0
     */
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, rollbackFor = Exception.class)
    public Integer createCoupon(Coupon coupon) throws CommonBizException {
        couponMapper.insertSelective(coupon);
        return coupon.getId();
    }

    /**
     * 更新优惠券
     *
     * @param coupon
     * @return
     * @author yazhong.qi
     * @version 1.0.0
     */
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, rollbackFor = Exception.class)
    public Integer updateCoupon(Coupon coupon) {
        Integer result = null;
        Coupon couponLast = couponMapper.selectByPrimaryKeyForUpdate(coupon.getId());
        if (couponLast == null || couponLast.getIsDeleted()) {
            throw new CommonBizException(MmcResultCode.DATA_NOT_EXIST, "优惠券");
        }
        if (!couponLast.getOwnerType().equals(coupon.getOwnerType())
                || !couponLast.getOwnerId().equals(coupon.getOwnerId())) {
            throw new CommonBizException(MmcResultCode.CAN_NOT_BE_OPERATE, "不是属于自己的优惠券", "编辑");
        }
        // 设置不可修改的值
        coupon.setProcessDataFlag(null);
        coupon.setCouponNo(null);
        coupon.setStatus(null);
        coupon.setAuditStatus(null);
        coupon.setIsDeleted(null);
        coupon.setActivityId(null);
        coupon.setApplyAuditTime(null);
        coupon.setApplyAuditName(null);
        coupon.setCreateTime(null);
        coupon.setUpdateTime(null);

        result = couponMapper.updateByPrimaryKeySelective(coupon);

        return result;
    }

    /**
     * 分页查询优惠券信息
     *
     * @param couponQuery
     * @return
     * @author yazhong.qi
     * @version 1.0.0
     */
    @Transactional(readOnly = true)
    public QueryResult<Coupon> queryCoupon(CouponQueryDTO couponQuery) {
        QueryResult<Coupon> queryResult = new QueryResult<Coupon>();
        // 使用分页插件PageHelper实现分页功能
        PageHelper.startPage(couponQuery.getPageNo(), couponQuery.getPageSize());
        List<Coupon> couponList = couponMapper.queryCoupon(couponQuery);
        PageInfo<Coupon> pageInfo = new PageInfo<Coupon>(couponList);
        queryResult.setPageNo(pageInfo.getPageNum());
        queryResult.setPageSize(pageInfo.getPageSize());
        queryResult.setTotalPages(pageInfo.getPages());
        queryResult.setTotalRecords(pageInfo.getTotal());
        queryResult.setRecords(couponList);
        return queryResult;
    }

}