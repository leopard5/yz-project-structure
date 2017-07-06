package com.yz.demo.biz.cache;

import org.apache.commons.lang3.StringUtils;

public class RedisKey {
	public static final String SEPARATOR = ":";
	public static final String PREFIX = "mkt:";
	public static final String LOCK = "lock:";
	
	// 51-56优惠券剩余库存
	public static final String COUPON_STOCK = "mkt:coupon:stock:";
	
	public static final String COUPON_SKU_STOCK = "mkt:coupon:sku:stock:";
	// 31爆品
	public static final String PREFIX_SUBPROMOTION = "mkt:subpromotion:";
	
	// 是否为爆品
	public static final String SUBPROMOTION_HOTSKU = "hotsku:";
	// 爆品剩余库存
	public static final String SUBPROMOTION_STOCK = "stock:";
	// 爆品促销价格
	public static final String SUBPROMOTION_SALE = "sale:";
	// 爆品用户已经购买数量
	public static final String SUBPROMOTION_USER_BUY = "userbuy:";

	private static final String EXIST = "exist:";
	
	//券码
	public static final String COUPON_CODE_KEY = "promotion:coupon:codes";
	
	public static final String PRIZE_STOCK="mkt:prize:stock:";
	
	public static String getCacheKeyByPrizeId(Integer prizeId){
		if (prizeId == null || prizeId.intValue() <= 0) {
			return "";
		}
		StringBuilder sbBuilder = new StringBuilder(50);
		sbBuilder.append(PRIZE_STOCK);
		sbBuilder.append(prizeId);
		return sbBuilder.toString();
	}
	
	public static String getCacheKeyByCouponSku(String couponNo){
		if (StringUtils.isBlank(couponNo)) {
			return "";
		}
		StringBuilder sbBuilder = new StringBuilder(50);
		sbBuilder.append(COUPON_SKU_STOCK);
		sbBuilder.append(couponNo);
		return sbBuilder.toString();
	}
	public static String getCacheKeyByCouponId(Integer couponId){
		if (couponId == null || couponId.intValue() <= 0) {
			return "";
		}
		StringBuilder sbBuilder = new StringBuilder(50);
		sbBuilder.append(COUPON_STOCK);
		sbBuilder.append(couponId);
		return sbBuilder.toString();
	}
	
	public static String getCouponRedisLockKey(Integer couponId){
		if (couponId == null || couponId.intValue() <= 0) {
			return "";
		}
		StringBuilder sbBuilder = new StringBuilder(50);
		sbBuilder.append(COUPON_STOCK);
		sbBuilder.append(LOCK);
		sbBuilder.append(couponId);
		return sbBuilder.toString();
	}
	
	/**
	 * 返回hashMap的key值
	 * @param subPromotionId
	 * @return
	 */
	public static String getCacheKeySkusPromotionPrice(Integer subPromotionId){
		if (subPromotionId == null) {
			return "";
		}
		StringBuilder sbBuilder = new StringBuilder(50);
		sbBuilder.append(PREFIX_SUBPROMOTION);
		sbBuilder.append(SUBPROMOTION_SALE);
		sbBuilder.append(subPromotionId);
		return sbBuilder.toString();
	}

	public static String getExistCacheKeyBySubPromotionId(Integer subPromotionId) {
		if (subPromotionId == null) {
			return "";
		}
		StringBuilder sbBuilder = new StringBuilder(50);
		sbBuilder.append(PREFIX_SUBPROMOTION);
		sbBuilder.append(EXIST);
		sbBuilder.append(subPromotionId);
		return sbBuilder.toString();
	}
}
