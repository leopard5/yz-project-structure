package com.yz.demo.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@ApiModel("优惠券")
public class CouponVo implements Serializable {

    /**
     * @Fields serialVersionUID : 序列化版本号
     */
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("优惠券ID")
    private Integer id;

    @ApiModelProperty("1.平台 2.商场 3.店铺")
    private Byte ownerType;

    @ApiModelProperty("优惠券拥有者ID")
    private String ownerId;

    @ApiModelProperty("优惠券拥有者名称")
    private String ownerName;

    @ApiModelProperty("活动ID 如果单独创建，活动ID为0")
    private Integer activityId;

    @ApiModelProperty("优惠券名称")
    @NotEmpty(message = "优惠券名称不能为空")
    @NotNull(message = "优惠券名称不能为空")
    @Size(max = 64, message = "优惠券名字不能超过32个字符")
    private String couponName;

    @ApiModelProperty("优惠券sku编码")
    private String couponNo;

    @ApiModelProperty("使用类型 1.免费券 2.付费券")
    private Byte couponUseType;

    @ApiModelProperty("付费券价格")
    private BigDecimal price;

    @ApiModelProperty("券包id(0表示不是券包券 大于0表示属于一个券包)")
    private Integer couponPackageId;

    @ApiModelProperty("一个人最多领取优惠券的张数")
    private Integer perPersonLimit;

    @ApiModelProperty("每个订单优惠券可以使用的张数")
    private Integer perOrderLimit;

    @ApiModelProperty("优惠券类型ID  51.无门槛现金抵用券 52.满减券 53.叠加满减券 54.阶梯满减券 55.折扣券 56.赠品券")
    private Byte couponTypeId;

    @ApiModelProperty("优惠券生效时间")
    @NotNull(message = "优惠券生效开始时间不能为空")
    private Date startTime;

    @ApiModelProperty("优惠券过期时间")
    @NotNull(message = "优惠券生效结束时间不能为空")
    private Date endTime;

    @ApiModelProperty("优惠券预热时间 如果有必须早于发券开始时间")
    private Date pendingTime;

    @ApiModelProperty("是否可以叠加订单促销 1.是 0.否")
    private Boolean isSharedSubpromotion;

    @ApiModelProperty("是否可以叠加优惠券促销 1.是 0.否")
    private Boolean isSharedCoupon;

    @ApiModelProperty("0.页面无此选项展示 1.点击券面进入活动页面 2.券面无点击效果")
    private Byte redirectType;

    @ApiModelProperty("跳转页面url地址")
    private String redirectUrl;

    @ApiModelProperty("是否必须报名（0：否；1：是） E端才有")
    private Boolean isMustApply;

    @ApiModelProperty("1.百分比 2.暂时无用，以后扩展")
    private Byte affordCostType;

    @ApiModelProperty("如果bear_cost_type=1 表示分摊率(bear_cost_value=1表示自己承担费用 小于1表示需要下级分摊);如果...")
    private BigDecimal affordCostValue;

    @ApiModelProperty("1.统一发券 2.分渠道发券 3.线下发券")
    private Byte couponDispatchType;

    @ApiModelProperty("优惠券发放起始时间 只有coupon_dispatch_type=1 统一发券时不为空")
    private Date issueStartTime;

    @ApiModelProperty("优惠券发放截止时间 只有coupon_dispatch_type=1 统一发券时不为空")
    private Date issueEndTime;

    @ApiModelProperty("发券总数量 冗余字段")
    private Integer issuedTotalAmount;

    @ApiModelProperty("是否全店通用 1.是 0否 B端才有")
    private Byte scopeType;

    @ApiModelProperty("促销金额  [51无门槛现金抵用券|52满减券|53叠加满减券]")
    private BigDecimal promotionAmount;

    @ApiModelProperty("订单满多少  [52满减券|53叠加满减券|56赠品券]}")
    private BigDecimal orderFullAmount;

    @ApiModelProperty("促销封顶金额  [53叠加满减券]")
    private BigDecimal promotionMaxAmount;

    @ApiModelProperty("折扣（0和1之间）  [55折扣券]")
    private BigDecimal discountAmount;

    @ApiModelProperty("赠品名称  [56赠品券]")
    private String giftName;

    @ApiModelProperty("订单金额范围及促销金额 json格式 [54阶梯满减券]")
    private String promotionScopeAmount;

    @ApiModelProperty("创建人ID")
    private String createUser;

    @ApiModelProperty("创建人名称")
    private String createUserName;

    @ApiModelProperty("更新人ID")
    private String updateUser;

    @ApiModelProperty("更新人名称")
    private String updateUserName;

    @ApiModelProperty("是否删除：0.未删除，1.已删除")
    private Boolean isDeleted;

    @ApiModelProperty("0. 无 1. 商场联合大促 2. 红星大促 ")
    private Byte rebateSender;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(Byte ownerType) {
        this.ownerType = ownerType;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    public String getCouponNo() {
        return couponNo;
    }

    public void setCouponNo(String couponNo) {
        this.couponNo = couponNo;
    }

    public Byte getCouponUseType() {
        return couponUseType;
    }

    public void setCouponUseType(Byte couponUseType) {
        this.couponUseType = couponUseType;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getCouponPackageId() {
        return couponPackageId;
    }

    public void setCouponPackageId(Integer couponPackageId) {
        this.couponPackageId = couponPackageId;
    }

    public Integer getPerPersonLimit() {
        return perPersonLimit;
    }

    public void setPerPersonLimit(Integer perPersonLimit) {
        this.perPersonLimit = perPersonLimit;
    }

    public Integer getPerOrderLimit() {
        return perOrderLimit;
    }

    public void setPerOrderLimit(Integer perOrderLimit) {
        this.perOrderLimit = perOrderLimit;
    }

    public Byte getCouponTypeId() {
        return couponTypeId;
    }

    public void setCouponTypeId(Byte couponTypeId) {
        this.couponTypeId = couponTypeId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getPendingTime() {
        return pendingTime;
    }

    public void setPendingTime(Date pendingTime) {
        this.pendingTime = pendingTime;
    }

    public Boolean getIsSharedSubpromotion() {
        return isSharedSubpromotion;
    }

    public void setIsSharedSubpromotion(Boolean isSharedSubpromotion) {
        this.isSharedSubpromotion = isSharedSubpromotion;
    }

    public Boolean getIsSharedCoupon() {
        return isSharedCoupon;
    }

    public void setIsSharedCoupon(Boolean isSharedCoupon) {
        this.isSharedCoupon = isSharedCoupon;
    }

    public Byte getRedirectType() {
        return redirectType;
    }

    public void setRedirectType(Byte redirectType) {
        this.redirectType = redirectType;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    public Boolean getIsMustApply() {
        return isMustApply;
    }

    public void setIsMustApply(Boolean isMustApply) {
        this.isMustApply = isMustApply;
    }

    public Byte getAffordCostType() {
        return affordCostType;
    }

    public void setAffordCostType(Byte affordCostType) {
        this.affordCostType = affordCostType;
    }

    public BigDecimal getAffordCostValue() {
        return affordCostValue;
    }

    public void setAffordCostValue(BigDecimal affordCostValue) {
        this.affordCostValue = affordCostValue;
    }

    public Byte getCouponDispatchType() {
        return couponDispatchType;
    }

    public void setCouponDispatchType(Byte couponDispatchType) {
        this.couponDispatchType = couponDispatchType;
    }

    public Date getIssueStartTime() {
        return issueStartTime;
    }

    public void setIssueStartTime(Date issueStartTime) {
        this.issueStartTime = issueStartTime;
    }

    public Date getIssueEndTime() {
        return issueEndTime;
    }

    public void setIssueEndTime(Date issueEndTime) {
        this.issueEndTime = issueEndTime;
    }

    public Integer getIssuedTotalAmount() {
        return issuedTotalAmount;
    }

    public void setIssuedTotalAmount(Integer issuedTotalAmount) {
        this.issuedTotalAmount = issuedTotalAmount;
    }

    public Byte getScopeType() {
        return scopeType;
    }

    public void setScopeType(Byte scopeType) {
        this.scopeType = scopeType;
    }

    public BigDecimal getPromotionAmount() {
        return promotionAmount;
    }

    public void setPromotionAmount(BigDecimal promotionAmount) {
        this.promotionAmount = promotionAmount;
    }

    public BigDecimal getOrderFullAmount() {
        return orderFullAmount;
    }

    public void setOrderFullAmount(BigDecimal orderFullAmount) {
        this.orderFullAmount = orderFullAmount;
    }

    public BigDecimal getPromotionMaxAmount() {
        return promotionMaxAmount;
    }

    public void setPromotionMaxAmount(BigDecimal promotionMaxAmount) {
        this.promotionMaxAmount = promotionMaxAmount;
    }

    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    public String getGiftName() {
        return giftName;
    }

    public void setGiftName(String giftName) {
        this.giftName = giftName;
    }

    public String getPromotionScopeAmount() {
        return promotionScopeAmount;
    }

    public void setPromotionScopeAmount(String promotionScopeAmount) {
        this.promotionScopeAmount = promotionScopeAmount;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public String getUpdateUserName() {
        return updateUserName;
    }

    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Byte getRebateSender() {
        return rebateSender;
    }

    public void setRebateSender(Byte rebateSender) {
        this.rebateSender = rebateSender;
    }

    // *************************************************************************
}