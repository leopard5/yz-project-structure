package com.yz.demo.model.ext;

import com.yz.demo.model.Coupon;

public class CouponDetail extends Coupon{
	/**
	 * 下发状态
	 */
    private byte issueStatus;
    
	/**
	 * 剩余优惠券数量
	 */
    private int remainingCount;
    
    /**
     * 优惠券券码
     */
    private String couponCode;

    public byte getIssueStatus() {
        return issueStatus;
    }

    public void setIssueStatus(byte issueStatus) {
        this.issueStatus = issueStatus;
    }

    public int getRemainingCount() {
        return remainingCount;
    }

    public void setRemainingCount(int remainingCount) {
        this.remainingCount = remainingCount;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }
}
