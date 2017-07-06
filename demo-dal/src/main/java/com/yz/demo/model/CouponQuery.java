package com.yz.demo.model;

import java.math.BigDecimal;
import java.util.Date;

public class CouponQuery extends Query {
	
	/**   
	 * @Fields serialVersionUID : 序列化版本号 
	 */ 
	private static final long serialVersionUID = 1L;
	
			
	private Integer id;
			
	private Byte ownerType;
			
	private String ownerId;
			
	private String ownerName;
			
	private Integer activityId;
			
	private String couponName;

	private Byte couponUseType;
			
	private String couponNo;

	private BigDecimal price;
			
	private Integer couponPackageId;
			
	private Integer perPersonLimit;
			
	private Integer perOrderLimit;
			
	private Byte couponTypeId;
			
	private Date startTime;
			
	private Date endTime;
			
	private Date pendingTime;
			
	private Boolean isSharedSubpromotion;
			
	private Boolean isSharedCoupon;
			
	private Byte redirectType;
			
	private String redirectUrl;
			
	private Boolean isMustApply;
			
	private Byte affordCostType;
			
	private BigDecimal affordCostValue;
			
	private Byte couponDispatchType;
			
	private Date issueStartTime;
			
	private Date issueEndTime;
			
	private Integer issuedTotalAmount;
			
	private Byte scopeType;
			
	private BigDecimal promotionAmount;
			
	private BigDecimal orderFullAmount;
			
	private BigDecimal promotionMaxAmount;
			
	private BigDecimal discountAmount;
			
	private String giftName;
			
	private String promotionScopeAmount;
			
	private String applyAuditName;
			
	private Date applyAuditTime;
			
	private Date createTime;
			
	private String createUser;
			
	private String createUserName;
			
	private Date updateTime;
			
	private String updateUser;
			
	private String updateUserName;
			
	private Boolean isDeleted;
			
	private Byte status;
			
	private Byte auditStatus;
		
	private Byte rebateSender;

	private String extRelationId;

	private String extRelationName;
		
	private Byte processDataFlag;


	public Integer getId(){
		return id;
	}
	public void setId(Integer id){
		this.id = id;
	}
    
	public Byte getOwnerType(){
		return ownerType;
	}
	public void setOwnerType(Byte ownerType){
		this.ownerType = ownerType;
	}
    
	public String getOwnerId(){
		return ownerId;
	}
	public void setOwnerId(String ownerId){
		this.ownerId = ownerId;
	}
    
	public String getOwnerName(){
		return ownerName;
	}
	public void setOwnerName(String ownerName){
		this.ownerName = ownerName;
	}
    
	public Integer getActivityId(){
		return activityId;
	}
	public void setActivityId(Integer activityId){
		this.activityId = activityId;
	}
    
	public String getCouponName(){
		return couponName;
	}
	public void setCouponName(String couponName){
		this.couponName = couponName;
	}

	public Byte getCouponUseType(){
		return couponUseType;
	}
	public void setCouponUseType(Byte couponUseType){
		this.couponUseType = couponUseType;
	}
    
	public String getCouponNo(){
		return couponNo;
	}
	public void setCouponNo(String couponNo){
		this.couponNo = couponNo;
	}

	public BigDecimal getPrice(){
		return price;
	}
	public void setPrice(BigDecimal price){
		this.price = price;
	}
    
	public Integer getCouponPackageId(){
		return couponPackageId;
	}
	public void setCouponPackageId(Integer couponPackageId){
		this.couponPackageId = couponPackageId;
	}
    
	public Integer getPerPersonLimit(){
		return perPersonLimit;
	}
	public void setPerPersonLimit(Integer perPersonLimit){
		this.perPersonLimit = perPersonLimit;
	}
    
	public Integer getPerOrderLimit(){
		return perOrderLimit;
	}
	public void setPerOrderLimit(Integer perOrderLimit){
		this.perOrderLimit = perOrderLimit;
	}
    
	public Byte getCouponTypeId(){
		return couponTypeId;
	}
	public void setCouponTypeId(Byte couponTypeId){
		this.couponTypeId = couponTypeId;
	}
    
	public Date getStartTime(){
		return startTime;
	}
	public void setStartTime(Date startTime){
		this.startTime = startTime;
	}
    
	public Date getEndTime(){
		return endTime;
	}
	public void setEndTime(Date endTime){
		this.endTime = endTime;
	}
    
	public Date getPendingTime(){
		return pendingTime;
	}
	public void setPendingTime(Date pendingTime){
		this.pendingTime = pendingTime;
	}
    
	public Boolean getIsSharedSubpromotion(){
		return isSharedSubpromotion;
	}
	public void setIsSharedSubpromotion(Boolean isSharedSubpromotion){
		this.isSharedSubpromotion = isSharedSubpromotion;
	}
    
	public Boolean getIsSharedCoupon(){
		return isSharedCoupon;
	}
	public void setIsSharedCoupon(Boolean isSharedCoupon){
		this.isSharedCoupon = isSharedCoupon;
	}
    
	public Byte getRedirectType(){
		return redirectType;
	}
	public void setRedirectType(Byte redirectType){
		this.redirectType = redirectType;
	}
    
	public String getRedirectUrl(){
		return redirectUrl;
	}
	public void setRedirectUrl(String redirectUrl){
		this.redirectUrl = redirectUrl;
	}
    
	public Boolean getIsMustApply(){
		return isMustApply;
	}
	public void setIsMustApply(Boolean isMustApply){
		this.isMustApply = isMustApply;
	}
    
	public Byte getAffordCostType(){
		return affordCostType;
	}
	public void setAffordCostType(Byte affordCostType){
		this.affordCostType = affordCostType;
	}
    
	public BigDecimal getAffordCostValue(){
		return affordCostValue;
	}
	public void setAffordCostValue(BigDecimal affordCostValue){
		this.affordCostValue = affordCostValue;
	}
    
	public Byte getCouponDispatchType(){
		return couponDispatchType;
	}
	public void setCouponDispatchType(Byte couponDispatchType){
		this.couponDispatchType = couponDispatchType;
	}
    
	public Date getIssueStartTime(){
		return issueStartTime;
	}
	public void setIssueStartTime(Date issueStartTime){
		this.issueStartTime = issueStartTime;
	}
    
	public Date getIssueEndTime(){
		return issueEndTime;
	}
	public void setIssueEndTime(Date issueEndTime){
		this.issueEndTime = issueEndTime;
	}
    
	public Integer getIssuedTotalAmount(){
		return issuedTotalAmount;
	}
	public void setIssuedTotalAmount(Integer issuedTotalAmount){
		this.issuedTotalAmount = issuedTotalAmount;
	}
    
	public Byte getScopeType(){
		return scopeType;
	}
	public void setScopeType(Byte scopeType){
		this.scopeType = scopeType;
	}
    
	public BigDecimal getPromotionAmount(){
		return promotionAmount;
	}
	public void setPromotionAmount(BigDecimal promotionAmount){
		this.promotionAmount = promotionAmount;
	}
    
	public BigDecimal getOrderFullAmount(){
		return orderFullAmount;
	}
	public void setOrderFullAmount(BigDecimal orderFullAmount){
		this.orderFullAmount = orderFullAmount;
	}
    
	public BigDecimal getPromotionMaxAmount(){
		return promotionMaxAmount;
	}
	public void setPromotionMaxAmount(BigDecimal promotionMaxAmount){
		this.promotionMaxAmount = promotionMaxAmount;
	}
    
	public BigDecimal getDiscountAmount(){
		return discountAmount;
	}
	public void setDiscountAmount(BigDecimal discountAmount){
		this.discountAmount = discountAmount;
	}
    
	public String getGiftName(){
		return giftName;
	}
	public void setGiftName(String giftName){
		this.giftName = giftName;
	}
    
	public String getPromotionScopeAmount(){
		return promotionScopeAmount;
	}
	public void setPromotionScopeAmount(String promotionScopeAmount){
		this.promotionScopeAmount = promotionScopeAmount;
	}
    
	public String getApplyAuditName(){
		return applyAuditName;
	}
	public void setApplyAuditName(String applyAuditName){
		this.applyAuditName = applyAuditName;
	}
    
	public Date getApplyAuditTime(){
		return applyAuditTime;
	}
	public void setApplyAuditTime(Date applyAuditTime){
		this.applyAuditTime = applyAuditTime;
	}
    
	public Date getCreateTime(){
		return createTime;
	}
	public void setCreateTime(Date createTime){
		this.createTime = createTime;
	}
    
	public String getCreateUser(){
		return createUser;
	}
	public void setCreateUser(String createUser){
		this.createUser = createUser;
	}
    
	public String getCreateUserName(){
		return createUserName;
	}
	public void setCreateUserName(String createUserName){
		this.createUserName = createUserName;
	}
    
	public Date getUpdateTime(){
		return updateTime;
	}
	public void setUpdateTime(Date updateTime){
		this.updateTime = updateTime;
	}
    
	public String getUpdateUser(){
		return updateUser;
	}
	public void setUpdateUser(String updateUser){
		this.updateUser = updateUser;
	}
    
	public String getUpdateUserName(){
		return updateUserName;
	}
	public void setUpdateUserName(String updateUserName){
		this.updateUserName = updateUserName;
	}
    
	public Boolean getIsDeleted(){
		return isDeleted;
	}
	public void setIsDeleted(Boolean isDeleted){
		this.isDeleted = isDeleted;
	}
    
	public Byte getStatus(){
		return status;
	}
	public void setStatus(Byte status){
		this.status = status;
	}
    
	public Byte getAuditStatus(){
		return auditStatus;
	}
	public void setAuditStatus(Byte auditStatus){
		this.auditStatus = auditStatus;
	}

	public Byte getRebateSender(){
		return rebateSender;
	}
	public void setRebateSender(Byte rebateSender){
		this.rebateSender = rebateSender;
	}

	public String getExtRelationId(){
		return extRelationId;
	}
	public void setExtRelationId(String extRelationId){
		this.extRelationId = extRelationId;
	}
    
	public String getExtRelationName(){
		return extRelationName;
	}
	public void setExtRelationName(String extRelationName){
		this.extRelationName = extRelationName;
	}

	public Byte getProcessDataFlag(){
		return processDataFlag;
	}
	public void setProcessDataFlag(Byte processDataFlag){
		this.processDataFlag = processDataFlag;
	}
    }