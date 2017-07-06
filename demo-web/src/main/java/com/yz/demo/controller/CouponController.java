package com.yz.demo.controller;

import com.wordnik.swagger.annotations.Api;
import com.yz.demo.service.ICouponService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Api(value = "coupon", description = "优惠券管理接口")
@RequestMapping("coupon")
@Controller
public class CouponController extends BaseController {
    private final Logger logger = LoggerFactory.getLogger(CouponController.class);

    @Autowired
    private ICouponService couponService;


}
