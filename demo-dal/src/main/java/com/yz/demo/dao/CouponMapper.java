package com.yz.demo.dao;

import com.yz.demo.model.Coupon;
import com.yz.demo.model.CouponExample;
import com.yz.demo.req.CouponQueryDTO;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface CouponMapper {

    int countByExample(CouponExample example);

    int deleteByExample(CouponExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Coupon record);

    int insertSelective(Coupon record);

    List<Coupon> selectByExample(CouponExample example);

    Coupon selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Coupon record, @Param("example") CouponExample example);

    int updateByExample(@Param("record") Coupon record, @Param("example") CouponExample example);

    int updateByPrimaryKeySelective(Coupon record);

    int updateByPrimaryKey(Coupon record);

    int logicalDeleteByPrimaryKey(
            @Param("id") Integer id,
            @Param("updateUser") String updateUser,
            @Param("updateUserName") String updateUserName,
            @Param("updateTime") Date updateTime);

    Coupon selectByPrimaryKeyForUpdate(Integer id);

    List<Coupon> queryCoupon(CouponQueryDTO couponQuery);


    List<Coupon> selectByCouponNo(@Param("couponNo") String couponNo);


}