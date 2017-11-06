package com.yz.demo.resp;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@ApiModel("优惠券")
public class CouponODTO implements Serializable {

    /**
     * @Fields serialVersionUID : 序列化版本号
     */
    private static final long serialVersionUID = 1L;


    /**
     * @Fields id : 优惠券ID
     */
    @ApiModelProperty("优惠券ID")
    private Integer id;

    /**
     * @Fields ownerType : 1.平台 2.商场 3.店铺
     */
    @ApiModelProperty("1.平台 2.商场 3.店铺")
    private Byte ownerType;

    /**
     * @Fields ownerId : 优惠券拥有者ID
     */
    @ApiModelProperty("优惠券拥有者ID")
    private String ownerId;

    /**
     * @Fields ownerName : 优惠券拥有者名称
     */
    @ApiModelProperty("优惠券拥有者名称")
    private String ownerName;

    /**
     * @Fields activityId : 活动ID 如果单独创建，活动ID为0
     */
    @ApiModelProperty("活动ID 如果单独创建，活动ID为0")
    private Integer activityId;

    /**
     * @Fields couponName : 优惠券名称
     */
    @ApiModelProperty("优惠券名称")
    private String couponName;

    /**
     * @Fields couponNo : 优惠券sku编码
     */
    @ApiModelProperty("优惠券sku编码")
    private String couponNo;

    /**
     * @Fields couponUseType : 使用类型 1.免费券 2.付费券
     */
    @ApiModelProperty("使用类型 1.免费券 2.付费券")
    private Byte couponUseType;

    /**
     * @Fields price : 付费券价格
     */
    @ApiModelProperty("付费券价格")
    private BigDecimal price;

    /**
     * @Fields couponPackageId : 券包id(0表示不是券包券 大于0表示属于一个券包)
     */
    @ApiModelProperty("券包id(0表示不是券包券 大于0表示属于一个券包)")
    private Integer couponPackageId;

    /**
     * @Fields perPersonLimit : 一个人最多领取优惠券的张数
     */
    @ApiModelProperty("一个人最多领取优惠券的张数")
    private Integer perPersonLimit;

    /**
     * @Fields perOrderLimit : 每个订单优惠券可以使用的张数
     */
    @ApiModelProperty("每个订单优惠券可以使用的张数")
    private Integer perOrderLimit;

    /**
     * @Fields couponTypeId : 优惠券类型ID  51.无门槛现金抵用券 52.满减券 53.叠加满减券 54.阶梯满减券 55.折扣券 56.赠品券
     */
    @ApiModelProperty("优惠券类型ID  51.无门槛现金抵用券 52.满减券 53.叠加满减券 54.阶梯满减券 55.折扣券 56.赠品券")
    private Byte couponTypeId;

    /**
     * @Fields startTime : 优惠券生效时间
     */
    @ApiModelProperty("优惠券生效时间")
    private Date startTime;

    /**
     * @Fields endTime : 优惠券过期时间
     */
    @ApiModelProperty("优惠券过期时间")
    private Date endTime;

    /**
     * @Fields pendingTime : 优惠券预热时间 如果有必须早于发券开始时间
     */
    @ApiModelProperty("优惠券预热时间 如果有必须早于发券开始时间")
    private Date pendingTime;

    /**
     * @Fields isSharedSubpromotion : 是否可以叠加订单促销 1.是 0.否
     */
    @ApiModelProperty("是否可以叠加订单促销 1.是 0.否")
    private Boolean isSharedSubpromotion;

    /**
     * @Fields isSharedCoupon : 是否可以叠加优惠券促销 1.是 0.否
     */
    @ApiModelProperty("是否可以叠加优惠券促销 1.是 0.否")
    private Boolean isSharedCoupon;

    /**
     * @Fields redirectType : 0.页面无此选项展示 1.点击券面进入活动页面 2.券面无点击效果
     */
    @ApiModelProperty("0.页面无此选项展示 1.点击券面进入活动页面 2.券面无点击效果")
    private Byte redirectType;

    /**
     * @Fields redirectUrl : 跳转页面url地址
     */
    @ApiModelProperty("跳转页面url地址")
    private String redirectUrl;

    /**
     * @Fields isMustApply : 是否必须报名（0：否；1：是） E端才有
     */
    @ApiModelProperty("是否必须报名（0：否；1：是） E端才有")
    private Boolean isMustApply;

    /**
     * @Fields affordCostType : 1.百分比 2.暂时无用，以后扩展
     */
    @ApiModelProperty("1.百分比 2.暂时无用，以后扩展")
    private Byte affordCostType;

    /**
     * @Fields affordCostValue : 如果bear_cost_type=1 表示分摊率(bear_cost_value=1表示自己承担费用 小于1表示需要下级分摊);如果...
     */
    @ApiModelProperty("如果bear_cost_type=1 表示分摊率(bear_cost_value=1表示自己承担费用 小于1表示需要下级分摊);如果...")
    private BigDecimal affordCostValue;

    /**
     * @Fields couponDispatchType : 1.统一发券 2.分渠道发券 3.线下发券
     */
    @ApiModelProperty("1.统一发券 2.分渠道发券 3.线下发券")
    private Byte couponDispatchType;

    /**
     * @Fields issueStartTime : 优惠券发放起始时间 只有coupon_dispatch_type=1 统一发券时不为空
     */
    @ApiModelProperty("优惠券发放起始时间 只有coupon_dispatch_type=1 统一发券时不为空")
    private Date issueStartTime;

    /**
     * @Fields issueEndTime : 优惠券发放截止时间 只有coupon_dispatch_type=1 统一发券时不为空
     */
    @ApiModelProperty("优惠券发放截止时间 只有coupon_dispatch_type=1 统一发券时不为空")
    private Date issueEndTime;

    /**
     * @Fields issuedTotalAmount : 发券总数量 冗余字段
     */
    @ApiModelProperty("发券总数量 冗余字段")
    private Integer issuedTotalAmount;

    /**
     * @Fields scopeType : 是否全店通用 1.是 0否 B端才有
     */
    @ApiModelProperty("是否全店通用 1.是 0否 B端才有")
    private Byte scopeType;

    /**
     * @Fields promotionAmount : 促销金额  [51无门槛现金抵用券|52满减券|53叠加满减券]
     */
    @ApiModelProperty("促销金额  [51无门槛现金抵用券|52满减券|53叠加满减券]")
    private BigDecimal promotionAmount;

    /**
     * @Fields orderFullAmount : 订单满多少  [52满减券|53叠加满减券|56赠品券]}
     */
    @ApiModelProperty("订单满多少  [52满减券|53叠加满减券|56赠品券]}")
    private BigDecimal orderFullAmount;

    /**
     * @Fields promotionMaxAmount : 促销封顶金额  [53叠加满减券]
     */
    @ApiModelProperty("促销封顶金额  [53叠加满减券]")
    private BigDecimal promotionMaxAmount;

    /**
     * @Fields discountAmount : 折扣（0和1之间）  [55折扣券]
     */
    @ApiModelProperty("折扣（0和1之间）  [55折扣券]")
    private BigDecimal discountAmount;

    /**
     * @Fields giftName : 赠品名称  [56赠品券]
     */
    @ApiModelProperty("赠品名称  [56赠品券]")
    private String giftName;

    /**
     * @Fields promotionScopeAmount : 订单金额范围及促销金额 json格式 [54阶梯满减券]
     */
    @ApiModelProperty("订单金额范围及促销金额 json格式 [54阶梯满减券]")
    private String promotionScopeAmount;

    /**
     * @Fields applyAuditName : 申请审核人
     */
    @ApiModelProperty("申请审核人")
    private String applyAuditName;

    /**
     * @Fields applyAuditTime : 申请审核时间
     */
    @ApiModelProperty("申请审核时间")
    private Date applyAuditTime;

    /**
     * @Fields createTime : 创建时间
     */
    @ApiModelProperty("创建时间")
    private Date createTime;

    /**
     * @Fields createUser : 创建人ID
     */
    @ApiModelProperty("创建人ID")
    private String createUser;

    /**
     * @Fields createUserName : 创建人名称
     */
    @ApiModelProperty("创建人名称")
    private String createUserName;

    /**
     * @Fields updateTime : 更新时间
     */
    @ApiModelProperty("更新时间")
    private Date updateTime;

    /**
     * @Fields updateUser : 更新人ID
     */
    @ApiModelProperty("更新人ID")
    private String updateUser;

    /**
     * @Fields updateUserName : 更新人名称
     */
    @ApiModelProperty("更新人名称")
    private String updateUserName;

    /**
     * @Fields isDeleted : 是否删除：0.未删除，1.已删除
     */
    @ApiModelProperty("是否删除：0.未删除，1.已删除")
    private Boolean isDeleted;

    /**
     * @Fields status : 状态 1.已保存 2.报名中 3.进行中 4.已中止 5.已取消 6.已结束 7.已关闭  20.已上线(B端才有)  21.已下线(B端才有)
     */
    @ApiModelProperty("状态 1.已保存 2.报名中 3.进行中 4.已中止 5.已取消 6.已结束 7.已关闭  20.已上线(B端才有)  21.已下线(B端才有)")
    private Byte status;

    /**
     * @Fields auditStatus : 审核状态 0.初始状态 1.审核中 2.中止审核中 3.取消审核中
     */
    @ApiModelProperty("审核状态 0.初始状态 1.审核中 2.中止审核中 3.取消审核中")
    private Byte auditStatus;

    /**
     * @Fields rebateSender : 0. 无 1. 商场联合大促 2. 红星大促
     */
    @ApiModelProperty("0. 无 1. 商场联合大促 2. 红星大促 ")
    private Byte rebateSender;

    /**
     * @Fields extRelationId : 付费券才有,商场创建时为虚拟商户ID,格式为cx_sc_xxxx 商户创建时为商场ID
     */
    @ApiModelProperty("付费券才有,商场创建时为虚拟商户ID,格式为cx_sc_xxxx 商户创建时为商场ID")
    private String extRelationId;

    /**
     * @Fields extRelationName : 扩展名称
     */
    @ApiModelProperty("扩展名称")
    private String extRelationName;


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

    public String getApplyAuditName() {
        return applyAuditName;
    }

    public void setApplyAuditName(String applyAuditName) {
        this.applyAuditName = applyAuditName;
    }

    public Date getApplyAuditTime() {
        return applyAuditTime;
    }

    public void setApplyAuditTime(Date applyAuditTime) {
        this.applyAuditTime = applyAuditTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Byte auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getExtRelationId() {
        return extRelationId;
    }

    public void setExtRelationId(String extRelationId) {
        this.extRelationId = extRelationId;
    }

    public String getExtRelationName() {
        return extRelationName;
    }

    public void setExtRelationName(String extRelationName) {
        this.extRelationName = extRelationName;
    }

    public Byte getRebateSender() {
        return rebateSender;
    }

    public void setRebateSender(Byte rebateSender) {
        this.rebateSender = rebateSender;
    }

    //--------------------------------------------------------
}