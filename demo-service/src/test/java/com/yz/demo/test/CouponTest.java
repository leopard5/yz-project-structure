package com.yz.demo.test;

import com.yz.demo.service.ICouponService;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Random;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:spring-test.xml",
        "classpath:*/applicationContext-bean.xml",
        "classpath:*/applicationContext-consumer.xml",
        "classpath:*/applicationContext-redis.xml",
        "classpath:*/applicationContext-ds.xml",
})
public class CouponTest extends TestBase {

    private static Random random = new Random();
    //	private final static String NUMBERS_LETTER = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final static String NUMBERS_UPPERLETTER = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final static int COUPON_CODE_LENGTH = 10;


    @Resource
    private ICouponService couponService;



}