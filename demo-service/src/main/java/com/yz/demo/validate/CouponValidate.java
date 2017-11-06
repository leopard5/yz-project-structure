package com.yz.demo.validate;

import com.yz.demo.model.Coupon;
import com.yz.demo.resp.DemoResult;
import com.yz.demo.resp.MmcResultCode;

import java.util.Date;

import static com.yz.demo.biz.util.ValidationUtil.*;

public class CouponValidate {

    public static boolean validateForCreate(Coupon coupon, DemoResult<?> message, boolean isUpdateFlag) {

        if (isNull(message, Coupon.OWNER_TYPE, coupon.getOwnerType())) {
            return false;
        }

        if (isNull(message, Coupon.OWNER_ID, coupon.getOwnerId())) {
            return false;
        }

        if (isEmptyOrMoreThan(message, Coupon.OWNER_NAME, coupon.getOwnerName(), 64)) {
            return false;
        }

        if (isNull(message, Coupon.ACTIVITY_ID, coupon.getActivityId())) {
            return false;
        }

        if (isEmptyOrMoreThan(message, Coupon.COUPON_NAME, coupon.getCouponName(), 64)) {
            return false;
        }

        if (isNull(message, Coupon.COUPON_USE_TYPE, coupon.getCouponUseType())) {
            return false;
        }

        if (isNull(message, Coupon.COUPON_PACKAGE_ID, coupon.getCouponPackageId())) {
            return false;
        }

        if (isNull(message, Coupon.PER_PERSON_LIMIT, coupon.getPerPersonLimit())) {
            return false;
        }

        if (coupon.getPerOrderLimit().intValue() < 1) {
            message.setErrorCode(MmcResultCode.CAN_NOT_BE_OPERATE, "每笔订单优惠券使用数量", "小于1");
            return false;
        }

        if (isNull(message, Coupon.START_TIME, coupon.getStartTime())) {
            return false;
        }

        if (isNull(message, Coupon.END_TIME, coupon.getEndTime())) {
            return false;
        }

        if (isNull(message, Coupon.IS_SHARED_SUBPROMOTION, coupon.getIsSharedSubpromotion())) {
            return false;
        }

        if (isNull(message, Coupon.IS_SHARED_COUPON, coupon.getIsSharedCoupon())) {
            return false;
        }

        if (isMoreThan(message, Coupon.REDIRECT_URL, coupon.getRedirectUrl(), 512)) {
            return false;
        }

        if (isNull(message, Coupon.IS_MUST_APPLY, coupon.getIsMustApply())) {
            return false;
        }

        if (isNull(message, Coupon.AFFORD_COST_TYPE, coupon.getAffordCostType())) {
            return false;
        }

        if (isNull(message, Coupon.AFFORD_COST_VALUE, coupon.getAffordCostValue())) {
            return false;
        }

        if (isNull(message, Coupon.COUPON_DISPATCH_TYPE, coupon.getCouponDispatchType())) {
            return false;
        }

        if (isMoreThan(message, Coupon.GIFT_NAME, coupon.getGiftName(), 64)) {
            return false;
        }

        if (isMoreThan(message, Coupon.PROMOTION_SCOPE_AMOUNT, coupon.getPromotionScopeAmount(), 1024)) {
            return false;
        }

        if (!isUpdateFlag) {
            if (isEmptyOrMoreThan(message, Coupon.CREATE_USER, coupon.getCreateUser(), 64)) {
                return false;
            }
            if (isMoreThan(message, Coupon.CREATE_USER_NAME, coupon.getCreateUserName(), 64)) {
                return false;
            }
        } else {
            if (isEmptyOrMoreThan(message, Coupon.UPDATE_USER, coupon.getUpdateUser(), 64)) {
                return false;
            }
            if (isMoreThan(message, Coupon.UPDATE_USER_NAME, coupon.getUpdateUserName(), 64)) {
                return false;
            }
        }

        return true;
    }

    private static boolean couponTimeCheck(DemoResult<?> message, Coupon coupon, Date issueStartTime, Date issueEndTime, String target) {
        // 优惠券发券开始时间为空 报错
        if (issueStartTime == null) {
            message.setErrorCode(MmcResultCode.FIELD_NOT_ALLOWED_EMPTY, target + "发券开始时间");
            return false;
        }
        // 优惠券发券结束时间为空 报错
        if (issueEndTime == null) {
            message.setErrorCode(MmcResultCode.FIELD_NOT_ALLOWED_EMPTY, target + "发券结束时间");
            return false;
        }
        // 优惠券发券开始时间大于等于发券结束时间 报错
        if (issueStartTime.getTime() >= issueEndTime.getTime()) {
            message.setErrorCode(MmcResultCode.TIME_VALUE_MUST_LESS_THAN, target + "发券开始时间", "发券结束时间");
            return false;
        }
        // 优惠券预热开始时间大于等于发券开始时间 报错
        if (coupon.getPendingTime() != null
                && coupon.getPendingTime().getTime() >= issueStartTime.getTime()) {
            message.setErrorCode(MmcResultCode.TIME_VALUE_MUST_LESS_THAN, "预热时间", target + "发券开始时间");
            return false;
        }
        // 优惠券发券截止日期大于生效截止时间 报错
        String msg = "发券";
        if (coupon.getCouponPackageId() > 0) {
            msg = "券包发行";
        }
        if (issueEndTime.getTime() > coupon.getEndTime().getTime()) {
            message.setErrorCode(MmcResultCode.TIME_VALUE_MUST_LESS_THAN, target + msg + "结束时间", "优惠券失效时间");
            return false;
        }
        // 优惠券发券开始日期大于生效开始时间 报错
        if (issueStartTime.getTime() > coupon.getStartTime().getTime()) {
            message.setErrorCode(MmcResultCode.TIME_VALUE_MUST_LESS_THAN, target + msg + "开始时间", "优惠券生效时间");
            return false;
        }
        return true;
    }


    public static boolean validateForUpdate(Coupon coupon, DemoResult<?> message) {
        if (isNull(message, Coupon.ID, coupon.getId())) {
            return false;
        }
        if (coupon.getId().intValue() <= 0) {
            message.setErrorCode(MmcResultCode.COMMON_PARAM_INVALID, Coupon.ID);
        }
        if (!(validateForCreate(coupon, message, true))) {
            return false;
        }
        return true;
    }


}