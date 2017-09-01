package com.yz.demo.req;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class CouponQueryDTO extends QueryDTO {
	
	/**   
	 * @Fields serialVersionUID : 序列化版本号 
	 */ 
	private static final long serialVersionUID = 1L;

			private Integer id;
			
			public Integer getId(){
				return id;
			}
			public void setId(Integer id){
				this.id = id;
			}
			
			private List<Integer> idList;
			public List<Integer> getIdList(){
				return idList;
			}
			public void setIdList(List<Integer> idList){
				this.idList = idList;
			}
			
				
			
			private Byte ownerType;
			
			public Byte getOwnerType(){
				return ownerType;
			}
			public void setOwnerType(Byte ownerType){
				this.ownerType = ownerType;
			}
			
			private List<Byte> ownerTypeList;
			public List<Byte> getOwnerTypeList(){
				return ownerTypeList;
			}
			public void setOwnerTypeList(List<Byte> ownerTypeList){
				this.ownerTypeList = ownerTypeList;
			}
			
				
			
			private String ownerId;
			
			public String getOwnerId(){
				return ownerId;
			}
			public void setOwnerId(String ownerId){
				this.ownerId = ownerId;
			}
			
			
			private String ownerIdLike;
			public String getOwnerIdLike(){
				return ownerIdLike;
			}
			public void setOwnerIdLike(String ownerIdLike){
				this.ownerIdLike = ownerIdLike;
			}
				
			
			private String ownerName;
			
			public String getOwnerName(){
				return ownerName;
			}
			public void setOwnerName(String ownerName){
				this.ownerName = ownerName;
			}
			
			
			private String ownerNameLike;
			public String getOwnerNameLike(){
				return ownerNameLike;
			}
			public void setOwnerNameLike(String ownerNameLike){
				this.ownerNameLike = ownerNameLike;
			}
				
			
			private Integer activityId;
			
			public Integer getActivityId(){
				return activityId;
			}
			public void setActivityId(Integer activityId){
				this.activityId = activityId;
			}
			
			private List<Integer> activityIdList;
			public List<Integer> getActivityIdList(){
				return activityIdList;
			}
			public void setActivityIdList(List<Integer> activityIdList){
				this.activityIdList = activityIdList;
			}
			
				
			
			private String couponName;
			
			public String getCouponName(){
				return couponName;
			}
			public void setCouponName(String couponName){
				this.couponName = couponName;
			}
			
			
			private String couponNameLike;
			public String getCouponNameLike(){
				return couponNameLike;
			}
			public void setCouponNameLike(String couponNameLike){
				this.couponNameLike = couponNameLike;
			}
				
			
			private String couponNo;
			
			public String getCouponNo(){
				return couponNo;
			}
			public void setCouponNo(String couponNo){
				this.couponNo = couponNo;
			}
			
			private List<String> couponNoList;
			public List<String> getCouponNoList(){
				return couponNoList;
			}
			public void setCouponNoList(List<String> couponNoList){
				this.couponNoList = couponNoList;
			}
			
			private String couponNoLike;
			public String getCouponNoLike(){
				return couponNoLike;
			}
			public void setCouponNoLike(String couponNoLike){
				this.couponNoLike = couponNoLike;
			}
				
			
			private Byte couponUseType;
			
			public Byte getCouponUseType(){
				return couponUseType;
			}
			public void setCouponUseType(Byte couponUseType){
				this.couponUseType = couponUseType;
			}
			
			private List<Byte> couponUseTypeList;
			public List<Byte> getCouponUseTypeList(){
				return couponUseTypeList;
			}
			public void setCouponUseTypeList(List<Byte> couponUseTypeList){
				this.couponUseTypeList = couponUseTypeList;
			}
			
				
			
				
			
				
			private BigDecimal priceFrom;
			public BigDecimal getPriceFrom(){
				return priceFrom;
			}
			public void setPriceFrom(BigDecimal priceFrom){
				this.priceFrom = priceFrom;
			}
			
			private BigDecimal priceTo;  			
			public BigDecimal getPriceTo(){
				return priceTo;
			}
			public void setPriceTo(BigDecimal priceTo){
				this.priceTo = priceTo;
			}
			
			private Integer couponPackageId;
			
			public Integer getCouponPackageId(){
				return couponPackageId;
			}
			public void setCouponPackageId(Integer couponPackageId){
				this.couponPackageId = couponPackageId;
			}
			
			private List<Integer> couponPackageIdList;
			public List<Integer> getCouponPackageIdList(){
				return couponPackageIdList;
			}
			public void setCouponPackageIdList(List<Integer> couponPackageIdList){
				this.couponPackageIdList = couponPackageIdList;
			}
			
				
			
			private Integer perPersonLimit;
			
			public Integer getPerPersonLimit(){
				return perPersonLimit;
			}
			public void setPerPersonLimit(Integer perPersonLimit){
				this.perPersonLimit = perPersonLimit;
			}
			
			private List<Integer> perPersonLimitList;
			public List<Integer> getPerPersonLimitList(){
				return perPersonLimitList;
			}
			public void setPerPersonLimitList(List<Integer> perPersonLimitList){
				this.perPersonLimitList = perPersonLimitList;
			}
			
				
			
			private Integer perOrderLimit;
			
			public Integer getPerOrderLimit(){
				return perOrderLimit;
			}
			public void setPerOrderLimit(Integer perOrderLimit){
				this.perOrderLimit = perOrderLimit;
			}
			
			private List<Integer> perOrderLimitList;
			public List<Integer> getPerOrderLimitList(){
				return perOrderLimitList;
			}
			public void setPerOrderLimitList(List<Integer> perOrderLimitList){
				this.perOrderLimitList = perOrderLimitList;
			}
			
				
			
			private Byte couponTypeId;
			
			public Byte getCouponTypeId(){
				return couponTypeId;
			}
			public void setCouponTypeId(Byte couponTypeId){
				this.couponTypeId = couponTypeId;
			}
			
			private List<Byte> couponTypeIdList;
			public List<Byte> getCouponTypeIdList(){
				return couponTypeIdList;
			}
			public void setCouponTypeIdList(List<Byte> couponTypeIdList){
				this.couponTypeIdList = couponTypeIdList;
			}
			
				
			
				
			
				
			private Date startTimeFrom;
			public Date getStartTimeFrom(){
				return startTimeFrom;
			}
			public void setStartTimeFrom(Date startTimeFrom){
				this.startTimeFrom = startTimeFrom;
			}
			
			private Date startTimeTo;  			
			public Date getStartTimeTo(){
				return startTimeTo;
			}
			public void setStartTimeTo(Date startTimeTo){
				this.startTimeTo = startTimeTo;
			}
			
				
			
				
			private Date endTimeFrom;
			public Date getEndTimeFrom(){
				return endTimeFrom;
			}
			public void setEndTimeFrom(Date endTimeFrom){
				this.endTimeFrom = endTimeFrom;
			}
			
			private Date endTimeTo;  			
			public Date getEndTimeTo(){
				return endTimeTo;
			}
			public void setEndTimeTo(Date endTimeTo){
				this.endTimeTo = endTimeTo;
			}
			
				
			
				
			private Date pendingTimeFrom;
			public Date getPendingTimeFrom(){
				return pendingTimeFrom;
			}
			public void setPendingTimeFrom(Date pendingTimeFrom){
				this.pendingTimeFrom = pendingTimeFrom;
			}
			
			private Date pendingTimeTo;  			
			public Date getPendingTimeTo(){
				return pendingTimeTo;
			}
			public void setPendingTimeTo(Date pendingTimeTo){
				this.pendingTimeTo = pendingTimeTo;
			}
			
			private Boolean isSharedSubpromotion;
			
			public Boolean getIsSharedSubpromotion(){
				return isSharedSubpromotion;
			}
			public void setIsSharedSubpromotion(Boolean isSharedSubpromotion){
				this.isSharedSubpromotion = isSharedSubpromotion;
			}
			
			private List<Boolean> isSharedSubpromotionList;
			public List<Boolean> getIsSharedSubpromotionList(){
				return isSharedSubpromotionList;
			}
			public void setIsSharedSubpromotionList(List<Boolean> isSharedSubpromotionList){
				this.isSharedSubpromotionList = isSharedSubpromotionList;
			}
			
				
			
			private Boolean isSharedCoupon;
			
			public Boolean getIsSharedCoupon(){
				return isSharedCoupon;
			}
			public void setIsSharedCoupon(Boolean isSharedCoupon){
				this.isSharedCoupon = isSharedCoupon;
			}
			
			private List<Boolean> isSharedCouponList;
			public List<Boolean> getIsSharedCouponList(){
				return isSharedCouponList;
			}
			public void setIsSharedCouponList(List<Boolean> isSharedCouponList){
				this.isSharedCouponList = isSharedCouponList;
			}
			
				
			
			private Byte redirectType;
			
			public Byte getRedirectType(){
				return redirectType;
			}
			public void setRedirectType(Byte redirectType){
				this.redirectType = redirectType;
			}
			
			private List<Byte> redirectTypeList;
			public List<Byte> getRedirectTypeList(){
				return redirectTypeList;
			}
			public void setRedirectTypeList(List<Byte> redirectTypeList){
				this.redirectTypeList = redirectTypeList;
			}
			
				
			
				
			
				
			
			private Boolean isMustApply;
			
			public Boolean getIsMustApply(){
				return isMustApply;
			}
			public void setIsMustApply(Boolean isMustApply){
				this.isMustApply = isMustApply;
			}
			
			private List<Boolean> isMustApplyList;
			public List<Boolean> getIsMustApplyList(){
				return isMustApplyList;
			}
			public void setIsMustApplyList(List<Boolean> isMustApplyList){
				this.isMustApplyList = isMustApplyList;
			}
			
				
			
			private Byte affordCostType;
			
			public Byte getAffordCostType(){
				return affordCostType;
			}
			public void setAffordCostType(Byte affordCostType){
				this.affordCostType = affordCostType;
			}
			
			private List<Byte> affordCostTypeList;
			public List<Byte> getAffordCostTypeList(){
				return affordCostTypeList;
			}
			public void setAffordCostTypeList(List<Byte> affordCostTypeList){
				this.affordCostTypeList = affordCostTypeList;
			}
			
				
			
				
			
				
			private BigDecimal affordCostValueFrom;
			public BigDecimal getAffordCostValueFrom(){
				return affordCostValueFrom;
			}
			public void setAffordCostValueFrom(BigDecimal affordCostValueFrom){
				this.affordCostValueFrom = affordCostValueFrom;
			}
			
			private BigDecimal affordCostValueTo;  			
			public BigDecimal getAffordCostValueTo(){
				return affordCostValueTo;
			}
			public void setAffordCostValueTo(BigDecimal affordCostValueTo){
				this.affordCostValueTo = affordCostValueTo;
			}
			
			private Byte couponDispatchType;
			
			public Byte getCouponDispatchType(){
				return couponDispatchType;
			}
			public void setCouponDispatchType(Byte couponDispatchType){
				this.couponDispatchType = couponDispatchType;
			}
			
			private List<Byte> couponDispatchTypeList;
			public List<Byte> getCouponDispatchTypeList(){
				return couponDispatchTypeList;
			}
			public void setCouponDispatchTypeList(List<Byte> couponDispatchTypeList){
				this.couponDispatchTypeList = couponDispatchTypeList;
			}
			
				
			
				
			
				
			private Date issueStartTimeFrom;
			public Date getIssueStartTimeFrom(){
				return issueStartTimeFrom;
			}
			public void setIssueStartTimeFrom(Date issueStartTimeFrom){
				this.issueStartTimeFrom = issueStartTimeFrom;
			}
			
			private Date issueStartTimeTo;  			
			public Date getIssueStartTimeTo(){
				return issueStartTimeTo;
			}
			public void setIssueStartTimeTo(Date issueStartTimeTo){
				this.issueStartTimeTo = issueStartTimeTo;
			}
			
				
			
				
			private Date issueEndTimeFrom;
			public Date getIssueEndTimeFrom(){
				return issueEndTimeFrom;
			}
			public void setIssueEndTimeFrom(Date issueEndTimeFrom){
				this.issueEndTimeFrom = issueEndTimeFrom;
			}
			
			private Date issueEndTimeTo;  			
			public Date getIssueEndTimeTo(){
				return issueEndTimeTo;
			}
			public void setIssueEndTimeTo(Date issueEndTimeTo){
				this.issueEndTimeTo = issueEndTimeTo;
			}
			
			private Integer issuedTotalAmount;
			
			public Integer getIssuedTotalAmount(){
				return issuedTotalAmount;
			}
			public void setIssuedTotalAmount(Integer issuedTotalAmount){
				this.issuedTotalAmount = issuedTotalAmount;
			}
			
			private List<Integer> issuedTotalAmountList;
			public List<Integer> getIssuedTotalAmountList(){
				return issuedTotalAmountList;
			}
			public void setIssuedTotalAmountList(List<Integer> issuedTotalAmountList){
				this.issuedTotalAmountList = issuedTotalAmountList;
			}
			
				
			
			private Byte scopeType;
			
			public Byte getScopeType(){
				return scopeType;
			}
			public void setScopeType(Byte scopeType){
				this.scopeType = scopeType;
			}
			
			private List<Byte> scopeTypeList;
			public List<Byte> getScopeTypeList(){
				return scopeTypeList;
			}
			public void setScopeTypeList(List<Byte> scopeTypeList){
				this.scopeTypeList = scopeTypeList;
			}
			
				
			
				
			
				
			private BigDecimal promotionAmountFrom;
			public BigDecimal getPromotionAmountFrom(){
				return promotionAmountFrom;
			}
			public void setPromotionAmountFrom(BigDecimal promotionAmountFrom){
				this.promotionAmountFrom = promotionAmountFrom;
			}
			
			private BigDecimal promotionAmountTo;  			
			public BigDecimal getPromotionAmountTo(){
				return promotionAmountTo;
			}
			public void setPromotionAmountTo(BigDecimal promotionAmountTo){
				this.promotionAmountTo = promotionAmountTo;
			}
			
				
			
				
			private BigDecimal orderFullAmountFrom;
			public BigDecimal getOrderFullAmountFrom(){
				return orderFullAmountFrom;
			}
			public void setOrderFullAmountFrom(BigDecimal orderFullAmountFrom){
				this.orderFullAmountFrom = orderFullAmountFrom;
			}
			
			private BigDecimal orderFullAmountTo;  			
			public BigDecimal getOrderFullAmountTo(){
				return orderFullAmountTo;
			}
			public void setOrderFullAmountTo(BigDecimal orderFullAmountTo){
				this.orderFullAmountTo = orderFullAmountTo;
			}
			
				
			
				
			private BigDecimal promotionMaxAmountFrom;
			public BigDecimal getPromotionMaxAmountFrom(){
				return promotionMaxAmountFrom;
			}
			public void setPromotionMaxAmountFrom(BigDecimal promotionMaxAmountFrom){
				this.promotionMaxAmountFrom = promotionMaxAmountFrom;
			}
			
			private BigDecimal promotionMaxAmountTo;  			
			public BigDecimal getPromotionMaxAmountTo(){
				return promotionMaxAmountTo;
			}
			public void setPromotionMaxAmountTo(BigDecimal promotionMaxAmountTo){
				this.promotionMaxAmountTo = promotionMaxAmountTo;
			}
			
				
			
				
			private BigDecimal discountAmountFrom;
			public BigDecimal getDiscountAmountFrom(){
				return discountAmountFrom;
			}
			public void setDiscountAmountFrom(BigDecimal discountAmountFrom){
				this.discountAmountFrom = discountAmountFrom;
			}
			
			private BigDecimal discountAmountTo;  			
			public BigDecimal getDiscountAmountTo(){
				return discountAmountTo;
			}
			public void setDiscountAmountTo(BigDecimal discountAmountTo){
				this.discountAmountTo = discountAmountTo;
			}
			
			private String giftName;
			
			public String getGiftName(){
				return giftName;
			}
			public void setGiftName(String giftName){
				this.giftName = giftName;
			}
			
			
			private String giftNameLike;
			public String getGiftNameLike(){
				return giftNameLike;
			}
			public void setGiftNameLike(String giftNameLike){
				this.giftNameLike = giftNameLike;
			}
				
			
				
			
				
			
			private String applyAuditName;
			
			public String getApplyAuditName(){
				return applyAuditName;
			}
			public void setApplyAuditName(String applyAuditName){
				this.applyAuditName = applyAuditName;
			}
			
			
			private String applyAuditNameLike;
			public String getApplyAuditNameLike(){
				return applyAuditNameLike;
			}
			public void setApplyAuditNameLike(String applyAuditNameLike){
				this.applyAuditNameLike = applyAuditNameLike;
			}
				
			
				
			
				
			private Date applyAuditTimeFrom;
			public Date getApplyAuditTimeFrom(){
				return applyAuditTimeFrom;
			}
			public void setApplyAuditTimeFrom(Date applyAuditTimeFrom){
				this.applyAuditTimeFrom = applyAuditTimeFrom;
			}
			
			private Date applyAuditTimeTo;  			
			public Date getApplyAuditTimeTo(){
				return applyAuditTimeTo;
			}
			public void setApplyAuditTimeTo(Date applyAuditTimeTo){
				this.applyAuditTimeTo = applyAuditTimeTo;
			}
			
				
			
				
			private Date createTimeFrom;
			public Date getCreateTimeFrom(){
				return createTimeFrom;
			}
			public void setCreateTimeFrom(Date createTimeFrom){
				this.createTimeFrom = createTimeFrom;
			}
			
			private Date createTimeTo;  			
			public Date getCreateTimeTo(){
				return createTimeTo;
			}
			public void setCreateTimeTo(Date createTimeTo){
				this.createTimeTo = createTimeTo;
			}
			
			private String createUser;
			
			public String getCreateUser(){
				return createUser;
			}
			public void setCreateUser(String createUser){
				this.createUser = createUser;
			}
			
			
			private String createUserLike;
			public String getCreateUserLike(){
				return createUserLike;
			}
			public void setCreateUserLike(String createUserLike){
				this.createUserLike = createUserLike;
			}
				
			
			private String createUserName;
			
			public String getCreateUserName(){
				return createUserName;
			}
			public void setCreateUserName(String createUserName){
				this.createUserName = createUserName;
			}
			
			
			private String createUserNameLike;
			public String getCreateUserNameLike(){
				return createUserNameLike;
			}
			public void setCreateUserNameLike(String createUserNameLike){
				this.createUserNameLike = createUserNameLike;
			}
				
			
				
			
				
			private Date updateTimeFrom;
			public Date getUpdateTimeFrom(){
				return updateTimeFrom;
			}
			public void setUpdateTimeFrom(Date updateTimeFrom){
				this.updateTimeFrom = updateTimeFrom;
			}
			
			private Date updateTimeTo;  			
			public Date getUpdateTimeTo(){
				return updateTimeTo;
			}
			public void setUpdateTimeTo(Date updateTimeTo){
				this.updateTimeTo = updateTimeTo;
			}
			
			private String updateUser;
			
			public String getUpdateUser(){
				return updateUser;
			}
			public void setUpdateUser(String updateUser){
				this.updateUser = updateUser;
			}
			
			
			private String updateUserLike;
			public String getUpdateUserLike(){
				return updateUserLike;
			}
			public void setUpdateUserLike(String updateUserLike){
				this.updateUserLike = updateUserLike;
			}
				
			
			private String updateUserName;
			
			public String getUpdateUserName(){
				return updateUserName;
			}
			public void setUpdateUserName(String updateUserName){
				this.updateUserName = updateUserName;
			}
			
			
			private String updateUserNameLike;
			public String getUpdateUserNameLike(){
				return updateUserNameLike;
			}
			public void setUpdateUserNameLike(String updateUserNameLike){
				this.updateUserNameLike = updateUserNameLike;
			}
				
			
			private Boolean isDeleted;
			
			public Boolean getIsDeleted(){
				return isDeleted;
			}
			public void setIsDeleted(Boolean isDeleted){
				this.isDeleted = isDeleted;
			}
			
			private List<Boolean> isDeletedList;
			public List<Boolean> getIsDeletedList(){
				return isDeletedList;
			}
			public void setIsDeletedList(List<Boolean> isDeletedList){
				this.isDeletedList = isDeletedList;
			}
			
				
			
			private Byte status;
			
			public Byte getStatus(){
				return status;
			}
			public void setStatus(Byte status){
				this.status = status;
			}
			
			private List<Byte> statusList;
			public List<Byte> getStatusList(){
				return statusList;
			}
			public void setStatusList(List<Byte> statusList){
				this.statusList = statusList;
			}
			
				
			
			private Byte auditStatus;
			
			public Byte getAuditStatus(){
				return auditStatus;
			}
			public void setAuditStatus(Byte auditStatus){
				this.auditStatus = auditStatus;
			}
			
			private List<Byte> auditStatusList;
			public List<Byte> getAuditStatusList(){
				return auditStatusList;
			}
			public void setAuditStatusList(List<Byte> auditStatusList){
				this.auditStatusList = auditStatusList;
			}
			
				
			
			private Byte rebateSender;

			public Byte getRebateSender(){
				return rebateSender;
			}
			public void setRebateSender(Byte rebateSender){
				this.rebateSender = rebateSender;
			}

			private List<Byte> rebateSenderList;
			public List<Byte> getRebateSenderList(){
				return rebateSenderList;
			}
			public void setRebateSenderList(List<Byte> rebateSenderList){
				this.rebateSenderList = rebateSenderList;
			}



			private String extRelationId;

			public String getExtRelationId(){
				return extRelationId;
			}
			public void setExtRelationId(String extRelationId){
				this.extRelationId = extRelationId;
			}

			private List<String> extRelationIdList;
			public List<String> getExtRelationIdList(){
				return extRelationIdList;
			}
			public void setExtRelationIdList(List<String> extRelationIdList){
				this.extRelationIdList = extRelationIdList;
			}

			private String extRelationIdLike;
			public String getExtRelationIdLike(){
				return extRelationIdLike;
			}
			public void setExtRelationIdLike(String extRelationIdLike){
				this.extRelationIdLike = extRelationIdLike;
			}


			private String extRelationName;

			public String getExtRelationName(){
				return extRelationName;
			}
			public void setExtRelationName(String extRelationName){
				this.extRelationName = extRelationName;
			}

			private List<String> extRelationNameList;
			public List<String> getExtRelationNameList(){
				return extRelationNameList;
			}
			public void setExtRelationNameList(List<String> extRelationNameList){
				this.extRelationNameList = extRelationNameList;
			}

			private String extRelationNameLike;
			public String getExtRelationNameLike(){
				return extRelationNameLike;
			}
			public void setExtRelationNameLike(String extRelationNameLike){
				this.extRelationNameLike = extRelationNameLike;
			}


	}