package com.yz.demo.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CouponExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CouponExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeIsNull() {
            addCriterion("owner_type is null");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeIsNotNull() {
            addCriterion("owner_type is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeEqualTo(Byte value) {
            addCriterion("owner_type =", value, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeNotEqualTo(Byte value) {
            addCriterion("owner_type <>", value, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeGreaterThan(Byte value) {
            addCriterion("owner_type >", value, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("owner_type >=", value, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeLessThan(Byte value) {
            addCriterion("owner_type <", value, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeLessThanOrEqualTo(Byte value) {
            addCriterion("owner_type <=", value, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeIn(List<Byte> values) {
            addCriterion("owner_type in", values, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeNotIn(List<Byte> values) {
            addCriterion("owner_type not in", values, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeBetween(Byte value1, Byte value2) {
            addCriterion("owner_type between", value1, value2, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("owner_type not between", value1, value2, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerIdIsNull() {
            addCriterion("owner_id is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIdIsNotNull() {
            addCriterion("owner_id is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerIdEqualTo(String value) {
            addCriterion("owner_id =", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdNotEqualTo(String value) {
            addCriterion("owner_id <>", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdGreaterThan(String value) {
            addCriterion("owner_id >", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdGreaterThanOrEqualTo(String value) {
            addCriterion("owner_id >=", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdLessThan(String value) {
            addCriterion("owner_id <", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdLessThanOrEqualTo(String value) {
            addCriterion("owner_id <=", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdLike(String value) {
            addCriterion("owner_id like", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdNotLike(String value) {
            addCriterion("owner_id not like", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdIn(List<String> values) {
            addCriterion("owner_id in", values, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdNotIn(List<String> values) {
            addCriterion("owner_id not in", values, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdBetween(String value1, String value2) {
            addCriterion("owner_id between", value1, value2, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdNotBetween(String value1, String value2) {
            addCriterion("owner_id not between", value1, value2, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerNameIsNull() {
            addCriterion("owner_name is null");
            return (Criteria) this;
        }

        public Criteria andOwnerNameIsNotNull() {
            addCriterion("owner_name is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerNameEqualTo(String value) {
            addCriterion("owner_name =", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameNotEqualTo(String value) {
            addCriterion("owner_name <>", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameGreaterThan(String value) {
            addCriterion("owner_name >", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameGreaterThanOrEqualTo(String value) {
            addCriterion("owner_name >=", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameLessThan(String value) {
            addCriterion("owner_name <", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameLessThanOrEqualTo(String value) {
            addCriterion("owner_name <=", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameLike(String value) {
            addCriterion("owner_name like", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameNotLike(String value) {
            addCriterion("owner_name not like", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameIn(List<String> values) {
            addCriterion("owner_name in", values, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameNotIn(List<String> values) {
            addCriterion("owner_name not in", values, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameBetween(String value1, String value2) {
            addCriterion("owner_name between", value1, value2, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameNotBetween(String value1, String value2) {
            addCriterion("owner_name not between", value1, value2, "ownerName");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNull() {
            addCriterion("activity_id is null");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNotNull() {
            addCriterion("activity_id is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIdEqualTo(Integer value) {
            addCriterion("activity_id =", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotEqualTo(Integer value) {
            addCriterion("activity_id <>", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThan(Integer value) {
            addCriterion("activity_id >", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_id >=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThan(Integer value) {
            addCriterion("activity_id <", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThanOrEqualTo(Integer value) {
            addCriterion("activity_id <=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdIn(List<Integer> values) {
            addCriterion("activity_id in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotIn(List<Integer> values) {
            addCriterion("activity_id not in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdBetween(Integer value1, Integer value2) {
            addCriterion("activity_id between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_id not between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andCouponNameIsNull() {
            addCriterion("coupon_name is null");
            return (Criteria) this;
        }

        public Criteria andCouponNameIsNotNull() {
            addCriterion("coupon_name is not null");
            return (Criteria) this;
        }

        public Criteria andCouponNameEqualTo(String value) {
            addCriterion("coupon_name =", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotEqualTo(String value) {
            addCriterion("coupon_name <>", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameGreaterThan(String value) {
            addCriterion("coupon_name >", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_name >=", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameLessThan(String value) {
            addCriterion("coupon_name <", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameLessThanOrEqualTo(String value) {
            addCriterion("coupon_name <=", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameLike(String value) {
            addCriterion("coupon_name like", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotLike(String value) {
            addCriterion("coupon_name not like", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameIn(List<String> values) {
            addCriterion("coupon_name in", values, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotIn(List<String> values) {
            addCriterion("coupon_name not in", values, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameBetween(String value1, String value2) {
            addCriterion("coupon_name between", value1, value2, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotBetween(String value1, String value2) {
            addCriterion("coupon_name not between", value1, value2, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponUseTypeIsNull() {
            addCriterion("coupon_use_type is null");
            return (Criteria) this;
        }

        public Criteria andCouponUseTypeIsNotNull() {
            addCriterion("coupon_use_type is not null");
            return (Criteria) this;
        }

        public Criteria andCouponUseTypeEqualTo(Byte value) {
            addCriterion("coupon_use_type =", value, "couponUseType");
            return (Criteria) this;
        }

        public Criteria andCouponUseTypeNotEqualTo(Byte value) {
            addCriterion("coupon_use_type <>", value, "couponUseType");
            return (Criteria) this;
        }

        public Criteria andCouponUseTypeGreaterThan(Byte value) {
            addCriterion("coupon_use_type >", value, "couponUseType");
            return (Criteria) this;
        }

        public Criteria andCouponUseTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("coupon_use_type >=", value, "couponUseType");
            return (Criteria) this;
        }

        public Criteria andCouponUseTypeLessThan(Byte value) {
            addCriterion("coupon_use_type <", value, "couponUseType");
            return (Criteria) this;
        }

        public Criteria andCouponUseTypeLessThanOrEqualTo(Byte value) {
            addCriterion("coupon_use_type <=", value, "couponUseType");
            return (Criteria) this;
        }

        public Criteria andCouponUseTypeIn(List<Byte> values) {
            addCriterion("coupon_use_type in", values, "couponUseType");
            return (Criteria) this;
        }

        public Criteria andCouponUseTypeNotIn(List<Byte> values) {
            addCriterion("coupon_use_type not in", values, "couponUseType");
            return (Criteria) this;
        }

        public Criteria andCouponUseTypeBetween(Byte value1, Byte value2) {
            addCriterion("coupon_use_type between", value1, value2, "couponUseType");
            return (Criteria) this;
        }

        public Criteria andCouponUseTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("coupon_use_type not between", value1, value2, "couponUseType");
            return (Criteria) this;
        }

        public Criteria andCouponNoIsNull() {
            addCriterion("coupon_no is null");
            return (Criteria) this;
        }

        public Criteria andCouponNoIsNotNull() {
            addCriterion("coupon_no is not null");
            return (Criteria) this;
        }

        public Criteria andCouponNoEqualTo(String value) {
            addCriterion("coupon_no =", value, "couponNo");
            return (Criteria) this;
        }

        public Criteria andCouponNoNotEqualTo(String value) {
            addCriterion("coupon_no <>", value, "couponNo");
            return (Criteria) this;
        }

        public Criteria andCouponNoGreaterThan(String value) {
            addCriterion("coupon_no >", value, "couponNo");
            return (Criteria) this;
        }

        public Criteria andCouponNoGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_no >=", value, "couponNo");
            return (Criteria) this;
        }

        public Criteria andCouponNoLessThan(String value) {
            addCriterion("coupon_no <", value, "couponNo");
            return (Criteria) this;
        }

        public Criteria andCouponNoLessThanOrEqualTo(String value) {
            addCriterion("coupon_no <=", value, "couponNo");
            return (Criteria) this;
        }

        public Criteria andCouponNoLike(String value) {
            addCriterion("coupon_no like", value, "couponNo");
            return (Criteria) this;
        }

        public Criteria andCouponNoNotLike(String value) {
            addCriterion("coupon_no not like", value, "couponNo");
            return (Criteria) this;
        }

        public Criteria andCouponNoIn(List<String> values) {
            addCriterion("coupon_no in", values, "couponNo");
            return (Criteria) this;
        }

        public Criteria andCouponNoNotIn(List<String> values) {
            addCriterion("coupon_no not in", values, "couponNo");
            return (Criteria) this;
        }

        public Criteria andCouponNoBetween(String value1, String value2) {
            addCriterion("coupon_no between", value1, value2, "couponNo");
            return (Criteria) this;
        }

        public Criteria andCouponNoNotBetween(String value1, String value2) {
            addCriterion("coupon_no not between", value1, value2, "couponNo");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andCouponPackageIdIsNull() {
            addCriterion("coupon_package_id is null");
            return (Criteria) this;
        }

        public Criteria andCouponPackageIdIsNotNull() {
            addCriterion("coupon_package_id is not null");
            return (Criteria) this;
        }

        public Criteria andCouponPackageIdEqualTo(Integer value) {
            addCriterion("coupon_package_id =", value, "couponPackageId");
            return (Criteria) this;
        }

        public Criteria andCouponPackageIdNotEqualTo(Integer value) {
            addCriterion("coupon_package_id <>", value, "couponPackageId");
            return (Criteria) this;
        }

        public Criteria andCouponPackageIdGreaterThan(Integer value) {
            addCriterion("coupon_package_id >", value, "couponPackageId");
            return (Criteria) this;
        }

        public Criteria andCouponPackageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("coupon_package_id >=", value, "couponPackageId");
            return (Criteria) this;
        }

        public Criteria andCouponPackageIdLessThan(Integer value) {
            addCriterion("coupon_package_id <", value, "couponPackageId");
            return (Criteria) this;
        }

        public Criteria andCouponPackageIdLessThanOrEqualTo(Integer value) {
            addCriterion("coupon_package_id <=", value, "couponPackageId");
            return (Criteria) this;
        }

        public Criteria andCouponPackageIdIn(List<Integer> values) {
            addCriterion("coupon_package_id in", values, "couponPackageId");
            return (Criteria) this;
        }

        public Criteria andCouponPackageIdNotIn(List<Integer> values) {
            addCriterion("coupon_package_id not in", values, "couponPackageId");
            return (Criteria) this;
        }

        public Criteria andCouponPackageIdBetween(Integer value1, Integer value2) {
            addCriterion("coupon_package_id between", value1, value2, "couponPackageId");
            return (Criteria) this;
        }

        public Criteria andCouponPackageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("coupon_package_id not between", value1, value2, "couponPackageId");
            return (Criteria) this;
        }

        public Criteria andPerPersonLimitIsNull() {
            addCriterion("per_person_limit is null");
            return (Criteria) this;
        }

        public Criteria andPerPersonLimitIsNotNull() {
            addCriterion("per_person_limit is not null");
            return (Criteria) this;
        }

        public Criteria andPerPersonLimitEqualTo(Integer value) {
            addCriterion("per_person_limit =", value, "perPersonLimit");
            return (Criteria) this;
        }

        public Criteria andPerPersonLimitNotEqualTo(Integer value) {
            addCriterion("per_person_limit <>", value, "perPersonLimit");
            return (Criteria) this;
        }

        public Criteria andPerPersonLimitGreaterThan(Integer value) {
            addCriterion("per_person_limit >", value, "perPersonLimit");
            return (Criteria) this;
        }

        public Criteria andPerPersonLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("per_person_limit >=", value, "perPersonLimit");
            return (Criteria) this;
        }

        public Criteria andPerPersonLimitLessThan(Integer value) {
            addCriterion("per_person_limit <", value, "perPersonLimit");
            return (Criteria) this;
        }

        public Criteria andPerPersonLimitLessThanOrEqualTo(Integer value) {
            addCriterion("per_person_limit <=", value, "perPersonLimit");
            return (Criteria) this;
        }

        public Criteria andPerPersonLimitIn(List<Integer> values) {
            addCriterion("per_person_limit in", values, "perPersonLimit");
            return (Criteria) this;
        }

        public Criteria andPerPersonLimitNotIn(List<Integer> values) {
            addCriterion("per_person_limit not in", values, "perPersonLimit");
            return (Criteria) this;
        }

        public Criteria andPerPersonLimitBetween(Integer value1, Integer value2) {
            addCriterion("per_person_limit between", value1, value2, "perPersonLimit");
            return (Criteria) this;
        }

        public Criteria andPerPersonLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("per_person_limit not between", value1, value2, "perPersonLimit");
            return (Criteria) this;
        }

        public Criteria andPerOrderLimitIsNull() {
            addCriterion("per_order_limit is null");
            return (Criteria) this;
        }

        public Criteria andPerOrderLimitIsNotNull() {
            addCriterion("per_order_limit is not null");
            return (Criteria) this;
        }

        public Criteria andPerOrderLimitEqualTo(Integer value) {
            addCriterion("per_order_limit =", value, "perOrderLimit");
            return (Criteria) this;
        }

        public Criteria andPerOrderLimitNotEqualTo(Integer value) {
            addCriterion("per_order_limit <>", value, "perOrderLimit");
            return (Criteria) this;
        }

        public Criteria andPerOrderLimitGreaterThan(Integer value) {
            addCriterion("per_order_limit >", value, "perOrderLimit");
            return (Criteria) this;
        }

        public Criteria andPerOrderLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("per_order_limit >=", value, "perOrderLimit");
            return (Criteria) this;
        }

        public Criteria andPerOrderLimitLessThan(Integer value) {
            addCriterion("per_order_limit <", value, "perOrderLimit");
            return (Criteria) this;
        }

        public Criteria andPerOrderLimitLessThanOrEqualTo(Integer value) {
            addCriterion("per_order_limit <=", value, "perOrderLimit");
            return (Criteria) this;
        }

        public Criteria andPerOrderLimitIn(List<Integer> values) {
            addCriterion("per_order_limit in", values, "perOrderLimit");
            return (Criteria) this;
        }

        public Criteria andPerOrderLimitNotIn(List<Integer> values) {
            addCriterion("per_order_limit not in", values, "perOrderLimit");
            return (Criteria) this;
        }

        public Criteria andPerOrderLimitBetween(Integer value1, Integer value2) {
            addCriterion("per_order_limit between", value1, value2, "perOrderLimit");
            return (Criteria) this;
        }

        public Criteria andPerOrderLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("per_order_limit not between", value1, value2, "perOrderLimit");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIdIsNull() {
            addCriterion("coupon_type_id is null");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIdIsNotNull() {
            addCriterion("coupon_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIdEqualTo(Byte value) {
            addCriterion("coupon_type_id =", value, "couponTypeId");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIdNotEqualTo(Byte value) {
            addCriterion("coupon_type_id <>", value, "couponTypeId");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIdGreaterThan(Byte value) {
            addCriterion("coupon_type_id >", value, "couponTypeId");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("coupon_type_id >=", value, "couponTypeId");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIdLessThan(Byte value) {
            addCriterion("coupon_type_id <", value, "couponTypeId");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIdLessThanOrEqualTo(Byte value) {
            addCriterion("coupon_type_id <=", value, "couponTypeId");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIdIn(List<Byte> values) {
            addCriterion("coupon_type_id in", values, "couponTypeId");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIdNotIn(List<Byte> values) {
            addCriterion("coupon_type_id not in", values, "couponTypeId");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIdBetween(Byte value1, Byte value2) {
            addCriterion("coupon_type_id between", value1, value2, "couponTypeId");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIdNotBetween(Byte value1, Byte value2) {
            addCriterion("coupon_type_id not between", value1, value2, "couponTypeId");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andPendingTimeIsNull() {
            addCriterion("pending_time is null");
            return (Criteria) this;
        }

        public Criteria andPendingTimeIsNotNull() {
            addCriterion("pending_time is not null");
            return (Criteria) this;
        }

        public Criteria andPendingTimeEqualTo(Date value) {
            addCriterion("pending_time =", value, "pendingTime");
            return (Criteria) this;
        }

        public Criteria andPendingTimeNotEqualTo(Date value) {
            addCriterion("pending_time <>", value, "pendingTime");
            return (Criteria) this;
        }

        public Criteria andPendingTimeGreaterThan(Date value) {
            addCriterion("pending_time >", value, "pendingTime");
            return (Criteria) this;
        }

        public Criteria andPendingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pending_time >=", value, "pendingTime");
            return (Criteria) this;
        }

        public Criteria andPendingTimeLessThan(Date value) {
            addCriterion("pending_time <", value, "pendingTime");
            return (Criteria) this;
        }

        public Criteria andPendingTimeLessThanOrEqualTo(Date value) {
            addCriterion("pending_time <=", value, "pendingTime");
            return (Criteria) this;
        }

        public Criteria andPendingTimeIn(List<Date> values) {
            addCriterion("pending_time in", values, "pendingTime");
            return (Criteria) this;
        }

        public Criteria andPendingTimeNotIn(List<Date> values) {
            addCriterion("pending_time not in", values, "pendingTime");
            return (Criteria) this;
        }

        public Criteria andPendingTimeBetween(Date value1, Date value2) {
            addCriterion("pending_time between", value1, value2, "pendingTime");
            return (Criteria) this;
        }

        public Criteria andPendingTimeNotBetween(Date value1, Date value2) {
            addCriterion("pending_time not between", value1, value2, "pendingTime");
            return (Criteria) this;
        }

        public Criteria andIsSharedSubpromotionIsNull() {
            addCriterion("is_shared_subpromotion is null");
            return (Criteria) this;
        }

        public Criteria andIsSharedSubpromotionIsNotNull() {
            addCriterion("is_shared_subpromotion is not null");
            return (Criteria) this;
        }

        public Criteria andIsSharedSubpromotionEqualTo(Boolean value) {
            addCriterion("is_shared_subpromotion =", value, "isSharedSubpromotion");
            return (Criteria) this;
        }

        public Criteria andIsSharedSubpromotionNotEqualTo(Boolean value) {
            addCriterion("is_shared_subpromotion <>", value, "isSharedSubpromotion");
            return (Criteria) this;
        }

        public Criteria andIsSharedSubpromotionGreaterThan(Boolean value) {
            addCriterion("is_shared_subpromotion >", value, "isSharedSubpromotion");
            return (Criteria) this;
        }

        public Criteria andIsSharedSubpromotionGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_shared_subpromotion >=", value, "isSharedSubpromotion");
            return (Criteria) this;
        }

        public Criteria andIsSharedSubpromotionLessThan(Boolean value) {
            addCriterion("is_shared_subpromotion <", value, "isSharedSubpromotion");
            return (Criteria) this;
        }

        public Criteria andIsSharedSubpromotionLessThanOrEqualTo(Boolean value) {
            addCriterion("is_shared_subpromotion <=", value, "isSharedSubpromotion");
            return (Criteria) this;
        }

        public Criteria andIsSharedSubpromotionIn(List<Boolean> values) {
            addCriterion("is_shared_subpromotion in", values, "isSharedSubpromotion");
            return (Criteria) this;
        }

        public Criteria andIsSharedSubpromotionNotIn(List<Boolean> values) {
            addCriterion("is_shared_subpromotion not in", values, "isSharedSubpromotion");
            return (Criteria) this;
        }

        public Criteria andIsSharedSubpromotionBetween(Boolean value1, Boolean value2) {
            addCriterion("is_shared_subpromotion between", value1, value2, "isSharedSubpromotion");
            return (Criteria) this;
        }

        public Criteria andIsSharedSubpromotionNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_shared_subpromotion not between", value1, value2, "isSharedSubpromotion");
            return (Criteria) this;
        }

        public Criteria andIsSharedCouponIsNull() {
            addCriterion("is_shared_coupon is null");
            return (Criteria) this;
        }

        public Criteria andIsSharedCouponIsNotNull() {
            addCriterion("is_shared_coupon is not null");
            return (Criteria) this;
        }

        public Criteria andIsSharedCouponEqualTo(Boolean value) {
            addCriterion("is_shared_coupon =", value, "isSharedCoupon");
            return (Criteria) this;
        }

        public Criteria andIsSharedCouponNotEqualTo(Boolean value) {
            addCriterion("is_shared_coupon <>", value, "isSharedCoupon");
            return (Criteria) this;
        }

        public Criteria andIsSharedCouponGreaterThan(Boolean value) {
            addCriterion("is_shared_coupon >", value, "isSharedCoupon");
            return (Criteria) this;
        }

        public Criteria andIsSharedCouponGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_shared_coupon >=", value, "isSharedCoupon");
            return (Criteria) this;
        }

        public Criteria andIsSharedCouponLessThan(Boolean value) {
            addCriterion("is_shared_coupon <", value, "isSharedCoupon");
            return (Criteria) this;
        }

        public Criteria andIsSharedCouponLessThanOrEqualTo(Boolean value) {
            addCriterion("is_shared_coupon <=", value, "isSharedCoupon");
            return (Criteria) this;
        }

        public Criteria andIsSharedCouponIn(List<Boolean> values) {
            addCriterion("is_shared_coupon in", values, "isSharedCoupon");
            return (Criteria) this;
        }

        public Criteria andIsSharedCouponNotIn(List<Boolean> values) {
            addCriterion("is_shared_coupon not in", values, "isSharedCoupon");
            return (Criteria) this;
        }

        public Criteria andIsSharedCouponBetween(Boolean value1, Boolean value2) {
            addCriterion("is_shared_coupon between", value1, value2, "isSharedCoupon");
            return (Criteria) this;
        }

        public Criteria andIsSharedCouponNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_shared_coupon not between", value1, value2, "isSharedCoupon");
            return (Criteria) this;
        }

        public Criteria andRedirectTypeIsNull() {
            addCriterion("redirect_type is null");
            return (Criteria) this;
        }

        public Criteria andRedirectTypeIsNotNull() {
            addCriterion("redirect_type is not null");
            return (Criteria) this;
        }

        public Criteria andRedirectTypeEqualTo(Byte value) {
            addCriterion("redirect_type =", value, "redirectType");
            return (Criteria) this;
        }

        public Criteria andRedirectTypeNotEqualTo(Byte value) {
            addCriterion("redirect_type <>", value, "redirectType");
            return (Criteria) this;
        }

        public Criteria andRedirectTypeGreaterThan(Byte value) {
            addCriterion("redirect_type >", value, "redirectType");
            return (Criteria) this;
        }

        public Criteria andRedirectTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("redirect_type >=", value, "redirectType");
            return (Criteria) this;
        }

        public Criteria andRedirectTypeLessThan(Byte value) {
            addCriterion("redirect_type <", value, "redirectType");
            return (Criteria) this;
        }

        public Criteria andRedirectTypeLessThanOrEqualTo(Byte value) {
            addCriterion("redirect_type <=", value, "redirectType");
            return (Criteria) this;
        }

        public Criteria andRedirectTypeIn(List<Byte> values) {
            addCriterion("redirect_type in", values, "redirectType");
            return (Criteria) this;
        }

        public Criteria andRedirectTypeNotIn(List<Byte> values) {
            addCriterion("redirect_type not in", values, "redirectType");
            return (Criteria) this;
        }

        public Criteria andRedirectTypeBetween(Byte value1, Byte value2) {
            addCriterion("redirect_type between", value1, value2, "redirectType");
            return (Criteria) this;
        }

        public Criteria andRedirectTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("redirect_type not between", value1, value2, "redirectType");
            return (Criteria) this;
        }

        public Criteria andRedirectUrlIsNull() {
            addCriterion("redirect_url is null");
            return (Criteria) this;
        }

        public Criteria andRedirectUrlIsNotNull() {
            addCriterion("redirect_url is not null");
            return (Criteria) this;
        }

        public Criteria andRedirectUrlEqualTo(String value) {
            addCriterion("redirect_url =", value, "redirectUrl");
            return (Criteria) this;
        }

        public Criteria andRedirectUrlNotEqualTo(String value) {
            addCriterion("redirect_url <>", value, "redirectUrl");
            return (Criteria) this;
        }

        public Criteria andRedirectUrlGreaterThan(String value) {
            addCriterion("redirect_url >", value, "redirectUrl");
            return (Criteria) this;
        }

        public Criteria andRedirectUrlGreaterThanOrEqualTo(String value) {
            addCriterion("redirect_url >=", value, "redirectUrl");
            return (Criteria) this;
        }

        public Criteria andRedirectUrlLessThan(String value) {
            addCriterion("redirect_url <", value, "redirectUrl");
            return (Criteria) this;
        }

        public Criteria andRedirectUrlLessThanOrEqualTo(String value) {
            addCriterion("redirect_url <=", value, "redirectUrl");
            return (Criteria) this;
        }

        public Criteria andRedirectUrlLike(String value) {
            addCriterion("redirect_url like", value, "redirectUrl");
            return (Criteria) this;
        }

        public Criteria andRedirectUrlNotLike(String value) {
            addCriterion("redirect_url not like", value, "redirectUrl");
            return (Criteria) this;
        }

        public Criteria andRedirectUrlIn(List<String> values) {
            addCriterion("redirect_url in", values, "redirectUrl");
            return (Criteria) this;
        }

        public Criteria andRedirectUrlNotIn(List<String> values) {
            addCriterion("redirect_url not in", values, "redirectUrl");
            return (Criteria) this;
        }

        public Criteria andRedirectUrlBetween(String value1, String value2) {
            addCriterion("redirect_url between", value1, value2, "redirectUrl");
            return (Criteria) this;
        }

        public Criteria andRedirectUrlNotBetween(String value1, String value2) {
            addCriterion("redirect_url not between", value1, value2, "redirectUrl");
            return (Criteria) this;
        }

        public Criteria andIsMustApplyIsNull() {
            addCriterion("is_must_apply is null");
            return (Criteria) this;
        }

        public Criteria andIsMustApplyIsNotNull() {
            addCriterion("is_must_apply is not null");
            return (Criteria) this;
        }

        public Criteria andIsMustApplyEqualTo(Boolean value) {
            addCriterion("is_must_apply =", value, "isMustApply");
            return (Criteria) this;
        }

        public Criteria andIsMustApplyNotEqualTo(Boolean value) {
            addCriterion("is_must_apply <>", value, "isMustApply");
            return (Criteria) this;
        }

        public Criteria andIsMustApplyGreaterThan(Boolean value) {
            addCriterion("is_must_apply >", value, "isMustApply");
            return (Criteria) this;
        }

        public Criteria andIsMustApplyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_must_apply >=", value, "isMustApply");
            return (Criteria) this;
        }

        public Criteria andIsMustApplyLessThan(Boolean value) {
            addCriterion("is_must_apply <", value, "isMustApply");
            return (Criteria) this;
        }

        public Criteria andIsMustApplyLessThanOrEqualTo(Boolean value) {
            addCriterion("is_must_apply <=", value, "isMustApply");
            return (Criteria) this;
        }

        public Criteria andIsMustApplyIn(List<Boolean> values) {
            addCriterion("is_must_apply in", values, "isMustApply");
            return (Criteria) this;
        }

        public Criteria andIsMustApplyNotIn(List<Boolean> values) {
            addCriterion("is_must_apply not in", values, "isMustApply");
            return (Criteria) this;
        }

        public Criteria andIsMustApplyBetween(Boolean value1, Boolean value2) {
            addCriterion("is_must_apply between", value1, value2, "isMustApply");
            return (Criteria) this;
        }

        public Criteria andIsMustApplyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_must_apply not between", value1, value2, "isMustApply");
            return (Criteria) this;
        }

        public Criteria andAffordCostTypeIsNull() {
            addCriterion("afford_cost_type is null");
            return (Criteria) this;
        }

        public Criteria andAffordCostTypeIsNotNull() {
            addCriterion("afford_cost_type is not null");
            return (Criteria) this;
        }

        public Criteria andAffordCostTypeEqualTo(Byte value) {
            addCriterion("afford_cost_type =", value, "affordCostType");
            return (Criteria) this;
        }

        public Criteria andAffordCostTypeNotEqualTo(Byte value) {
            addCriterion("afford_cost_type <>", value, "affordCostType");
            return (Criteria) this;
        }

        public Criteria andAffordCostTypeGreaterThan(Byte value) {
            addCriterion("afford_cost_type >", value, "affordCostType");
            return (Criteria) this;
        }

        public Criteria andAffordCostTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("afford_cost_type >=", value, "affordCostType");
            return (Criteria) this;
        }

        public Criteria andAffordCostTypeLessThan(Byte value) {
            addCriterion("afford_cost_type <", value, "affordCostType");
            return (Criteria) this;
        }

        public Criteria andAffordCostTypeLessThanOrEqualTo(Byte value) {
            addCriterion("afford_cost_type <=", value, "affordCostType");
            return (Criteria) this;
        }

        public Criteria andAffordCostTypeIn(List<Byte> values) {
            addCriterion("afford_cost_type in", values, "affordCostType");
            return (Criteria) this;
        }

        public Criteria andAffordCostTypeNotIn(List<Byte> values) {
            addCriterion("afford_cost_type not in", values, "affordCostType");
            return (Criteria) this;
        }

        public Criteria andAffordCostTypeBetween(Byte value1, Byte value2) {
            addCriterion("afford_cost_type between", value1, value2, "affordCostType");
            return (Criteria) this;
        }

        public Criteria andAffordCostTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("afford_cost_type not between", value1, value2, "affordCostType");
            return (Criteria) this;
        }

        public Criteria andAffordCostValueIsNull() {
            addCriterion("afford_cost_value is null");
            return (Criteria) this;
        }

        public Criteria andAffordCostValueIsNotNull() {
            addCriterion("afford_cost_value is not null");
            return (Criteria) this;
        }

        public Criteria andAffordCostValueEqualTo(BigDecimal value) {
            addCriterion("afford_cost_value =", value, "affordCostValue");
            return (Criteria) this;
        }

        public Criteria andAffordCostValueNotEqualTo(BigDecimal value) {
            addCriterion("afford_cost_value <>", value, "affordCostValue");
            return (Criteria) this;
        }

        public Criteria andAffordCostValueGreaterThan(BigDecimal value) {
            addCriterion("afford_cost_value >", value, "affordCostValue");
            return (Criteria) this;
        }

        public Criteria andAffordCostValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("afford_cost_value >=", value, "affordCostValue");
            return (Criteria) this;
        }

        public Criteria andAffordCostValueLessThan(BigDecimal value) {
            addCriterion("afford_cost_value <", value, "affordCostValue");
            return (Criteria) this;
        }

        public Criteria andAffordCostValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("afford_cost_value <=", value, "affordCostValue");
            return (Criteria) this;
        }

        public Criteria andAffordCostValueIn(List<BigDecimal> values) {
            addCriterion("afford_cost_value in", values, "affordCostValue");
            return (Criteria) this;
        }

        public Criteria andAffordCostValueNotIn(List<BigDecimal> values) {
            addCriterion("afford_cost_value not in", values, "affordCostValue");
            return (Criteria) this;
        }

        public Criteria andAffordCostValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("afford_cost_value between", value1, value2, "affordCostValue");
            return (Criteria) this;
        }

        public Criteria andAffordCostValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("afford_cost_value not between", value1, value2, "affordCostValue");
            return (Criteria) this;
        }

        public Criteria andCouponDispatchTypeIsNull() {
            addCriterion("coupon_dispatch_type is null");
            return (Criteria) this;
        }

        public Criteria andCouponDispatchTypeIsNotNull() {
            addCriterion("coupon_dispatch_type is not null");
            return (Criteria) this;
        }

        public Criteria andCouponDispatchTypeEqualTo(Byte value) {
            addCriterion("coupon_dispatch_type =", value, "couponDispatchType");
            return (Criteria) this;
        }

        public Criteria andCouponDispatchTypeNotEqualTo(Byte value) {
            addCriterion("coupon_dispatch_type <>", value, "couponDispatchType");
            return (Criteria) this;
        }

        public Criteria andCouponDispatchTypeGreaterThan(Byte value) {
            addCriterion("coupon_dispatch_type >", value, "couponDispatchType");
            return (Criteria) this;
        }

        public Criteria andCouponDispatchTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("coupon_dispatch_type >=", value, "couponDispatchType");
            return (Criteria) this;
        }

        public Criteria andCouponDispatchTypeLessThan(Byte value) {
            addCriterion("coupon_dispatch_type <", value, "couponDispatchType");
            return (Criteria) this;
        }

        public Criteria andCouponDispatchTypeLessThanOrEqualTo(Byte value) {
            addCriterion("coupon_dispatch_type <=", value, "couponDispatchType");
            return (Criteria) this;
        }

        public Criteria andCouponDispatchTypeIn(List<Byte> values) {
            addCriterion("coupon_dispatch_type in", values, "couponDispatchType");
            return (Criteria) this;
        }

        public Criteria andCouponDispatchTypeNotIn(List<Byte> values) {
            addCriterion("coupon_dispatch_type not in", values, "couponDispatchType");
            return (Criteria) this;
        }

        public Criteria andCouponDispatchTypeBetween(Byte value1, Byte value2) {
            addCriterion("coupon_dispatch_type between", value1, value2, "couponDispatchType");
            return (Criteria) this;
        }

        public Criteria andCouponDispatchTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("coupon_dispatch_type not between", value1, value2, "couponDispatchType");
            return (Criteria) this;
        }

        public Criteria andIssueStartTimeIsNull() {
            addCriterion("issue_start_time is null");
            return (Criteria) this;
        }

        public Criteria andIssueStartTimeIsNotNull() {
            addCriterion("issue_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andIssueStartTimeEqualTo(Date value) {
            addCriterion("issue_start_time =", value, "issueStartTime");
            return (Criteria) this;
        }

        public Criteria andIssueStartTimeNotEqualTo(Date value) {
            addCriterion("issue_start_time <>", value, "issueStartTime");
            return (Criteria) this;
        }

        public Criteria andIssueStartTimeGreaterThan(Date value) {
            addCriterion("issue_start_time >", value, "issueStartTime");
            return (Criteria) this;
        }

        public Criteria andIssueStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("issue_start_time >=", value, "issueStartTime");
            return (Criteria) this;
        }

        public Criteria andIssueStartTimeLessThan(Date value) {
            addCriterion("issue_start_time <", value, "issueStartTime");
            return (Criteria) this;
        }

        public Criteria andIssueStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("issue_start_time <=", value, "issueStartTime");
            return (Criteria) this;
        }

        public Criteria andIssueStartTimeIn(List<Date> values) {
            addCriterion("issue_start_time in", values, "issueStartTime");
            return (Criteria) this;
        }

        public Criteria andIssueStartTimeNotIn(List<Date> values) {
            addCriterion("issue_start_time not in", values, "issueStartTime");
            return (Criteria) this;
        }

        public Criteria andIssueStartTimeBetween(Date value1, Date value2) {
            addCriterion("issue_start_time between", value1, value2, "issueStartTime");
            return (Criteria) this;
        }

        public Criteria andIssueStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("issue_start_time not between", value1, value2, "issueStartTime");
            return (Criteria) this;
        }

        public Criteria andIssueEndTimeIsNull() {
            addCriterion("issue_end_time is null");
            return (Criteria) this;
        }

        public Criteria andIssueEndTimeIsNotNull() {
            addCriterion("issue_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andIssueEndTimeEqualTo(Date value) {
            addCriterion("issue_end_time =", value, "issueEndTime");
            return (Criteria) this;
        }

        public Criteria andIssueEndTimeNotEqualTo(Date value) {
            addCriterion("issue_end_time <>", value, "issueEndTime");
            return (Criteria) this;
        }

        public Criteria andIssueEndTimeGreaterThan(Date value) {
            addCriterion("issue_end_time >", value, "issueEndTime");
            return (Criteria) this;
        }

        public Criteria andIssueEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("issue_end_time >=", value, "issueEndTime");
            return (Criteria) this;
        }

        public Criteria andIssueEndTimeLessThan(Date value) {
            addCriterion("issue_end_time <", value, "issueEndTime");
            return (Criteria) this;
        }

        public Criteria andIssueEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("issue_end_time <=", value, "issueEndTime");
            return (Criteria) this;
        }

        public Criteria andIssueEndTimeIn(List<Date> values) {
            addCriterion("issue_end_time in", values, "issueEndTime");
            return (Criteria) this;
        }

        public Criteria andIssueEndTimeNotIn(List<Date> values) {
            addCriterion("issue_end_time not in", values, "issueEndTime");
            return (Criteria) this;
        }

        public Criteria andIssueEndTimeBetween(Date value1, Date value2) {
            addCriterion("issue_end_time between", value1, value2, "issueEndTime");
            return (Criteria) this;
        }

        public Criteria andIssueEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("issue_end_time not between", value1, value2, "issueEndTime");
            return (Criteria) this;
        }

        public Criteria andIssuedTotalAmountIsNull() {
            addCriterion("issued_total_amount is null");
            return (Criteria) this;
        }

        public Criteria andIssuedTotalAmountIsNotNull() {
            addCriterion("issued_total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andIssuedTotalAmountEqualTo(Integer value) {
            addCriterion("issued_total_amount =", value, "issuedTotalAmount");
            return (Criteria) this;
        }

        public Criteria andIssuedTotalAmountNotEqualTo(Integer value) {
            addCriterion("issued_total_amount <>", value, "issuedTotalAmount");
            return (Criteria) this;
        }

        public Criteria andIssuedTotalAmountGreaterThan(Integer value) {
            addCriterion("issued_total_amount >", value, "issuedTotalAmount");
            return (Criteria) this;
        }

        public Criteria andIssuedTotalAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("issued_total_amount >=", value, "issuedTotalAmount");
            return (Criteria) this;
        }

        public Criteria andIssuedTotalAmountLessThan(Integer value) {
            addCriterion("issued_total_amount <", value, "issuedTotalAmount");
            return (Criteria) this;
        }

        public Criteria andIssuedTotalAmountLessThanOrEqualTo(Integer value) {
            addCriterion("issued_total_amount <=", value, "issuedTotalAmount");
            return (Criteria) this;
        }

        public Criteria andIssuedTotalAmountIn(List<Integer> values) {
            addCriterion("issued_total_amount in", values, "issuedTotalAmount");
            return (Criteria) this;
        }

        public Criteria andIssuedTotalAmountNotIn(List<Integer> values) {
            addCriterion("issued_total_amount not in", values, "issuedTotalAmount");
            return (Criteria) this;
        }

        public Criteria andIssuedTotalAmountBetween(Integer value1, Integer value2) {
            addCriterion("issued_total_amount between", value1, value2, "issuedTotalAmount");
            return (Criteria) this;
        }

        public Criteria andIssuedTotalAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("issued_total_amount not between", value1, value2, "issuedTotalAmount");
            return (Criteria) this;
        }

        public Criteria andScopeTypeIsNull() {
            addCriterion("scope_type is null");
            return (Criteria) this;
        }

        public Criteria andScopeTypeIsNotNull() {
            addCriterion("scope_type is not null");
            return (Criteria) this;
        }

        public Criteria andScopeTypeEqualTo(Byte value) {
            addCriterion("scope_type =", value, "scopeType");
            return (Criteria) this;
        }

        public Criteria andScopeTypeNotEqualTo(Byte value) {
            addCriterion("scope_type <>", value, "scopeType");
            return (Criteria) this;
        }

        public Criteria andScopeTypeGreaterThan(Byte value) {
            addCriterion("scope_type >", value, "scopeType");
            return (Criteria) this;
        }

        public Criteria andScopeTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("scope_type >=", value, "scopeType");
            return (Criteria) this;
        }

        public Criteria andScopeTypeLessThan(Byte value) {
            addCriterion("scope_type <", value, "scopeType");
            return (Criteria) this;
        }

        public Criteria andScopeTypeLessThanOrEqualTo(Byte value) {
            addCriterion("scope_type <=", value, "scopeType");
            return (Criteria) this;
        }

        public Criteria andScopeTypeIn(List<Byte> values) {
            addCriterion("scope_type in", values, "scopeType");
            return (Criteria) this;
        }

        public Criteria andScopeTypeNotIn(List<Byte> values) {
            addCriterion("scope_type not in", values, "scopeType");
            return (Criteria) this;
        }

        public Criteria andScopeTypeBetween(Byte value1, Byte value2) {
            addCriterion("scope_type between", value1, value2, "scopeType");
            return (Criteria) this;
        }

        public Criteria andScopeTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("scope_type not between", value1, value2, "scopeType");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountIsNull() {
            addCriterion("promotion_amount is null");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountIsNotNull() {
            addCriterion("promotion_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountEqualTo(BigDecimal value) {
            addCriterion("promotion_amount =", value, "promotionAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountNotEqualTo(BigDecimal value) {
            addCriterion("promotion_amount <>", value, "promotionAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountGreaterThan(BigDecimal value) {
            addCriterion("promotion_amount >", value, "promotionAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("promotion_amount >=", value, "promotionAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountLessThan(BigDecimal value) {
            addCriterion("promotion_amount <", value, "promotionAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("promotion_amount <=", value, "promotionAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountIn(List<BigDecimal> values) {
            addCriterion("promotion_amount in", values, "promotionAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountNotIn(List<BigDecimal> values) {
            addCriterion("promotion_amount not in", values, "promotionAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("promotion_amount between", value1, value2, "promotionAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("promotion_amount not between", value1, value2, "promotionAmount");
            return (Criteria) this;
        }

        public Criteria andOrderFullAmountIsNull() {
            addCriterion("order_full_amount is null");
            return (Criteria) this;
        }

        public Criteria andOrderFullAmountIsNotNull() {
            addCriterion("order_full_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOrderFullAmountEqualTo(BigDecimal value) {
            addCriterion("order_full_amount =", value, "orderFullAmount");
            return (Criteria) this;
        }

        public Criteria andOrderFullAmountNotEqualTo(BigDecimal value) {
            addCriterion("order_full_amount <>", value, "orderFullAmount");
            return (Criteria) this;
        }

        public Criteria andOrderFullAmountGreaterThan(BigDecimal value) {
            addCriterion("order_full_amount >", value, "orderFullAmount");
            return (Criteria) this;
        }

        public Criteria andOrderFullAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_full_amount >=", value, "orderFullAmount");
            return (Criteria) this;
        }

        public Criteria andOrderFullAmountLessThan(BigDecimal value) {
            addCriterion("order_full_amount <", value, "orderFullAmount");
            return (Criteria) this;
        }

        public Criteria andOrderFullAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_full_amount <=", value, "orderFullAmount");
            return (Criteria) this;
        }

        public Criteria andOrderFullAmountIn(List<BigDecimal> values) {
            addCriterion("order_full_amount in", values, "orderFullAmount");
            return (Criteria) this;
        }

        public Criteria andOrderFullAmountNotIn(List<BigDecimal> values) {
            addCriterion("order_full_amount not in", values, "orderFullAmount");
            return (Criteria) this;
        }

        public Criteria andOrderFullAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_full_amount between", value1, value2, "orderFullAmount");
            return (Criteria) this;
        }

        public Criteria andOrderFullAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_full_amount not between", value1, value2, "orderFullAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionMaxAmountIsNull() {
            addCriterion("promotion_max_amount is null");
            return (Criteria) this;
        }

        public Criteria andPromotionMaxAmountIsNotNull() {
            addCriterion("promotion_max_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionMaxAmountEqualTo(BigDecimal value) {
            addCriterion("promotion_max_amount =", value, "promotionMaxAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionMaxAmountNotEqualTo(BigDecimal value) {
            addCriterion("promotion_max_amount <>", value, "promotionMaxAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionMaxAmountGreaterThan(BigDecimal value) {
            addCriterion("promotion_max_amount >", value, "promotionMaxAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionMaxAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("promotion_max_amount >=", value, "promotionMaxAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionMaxAmountLessThan(BigDecimal value) {
            addCriterion("promotion_max_amount <", value, "promotionMaxAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionMaxAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("promotion_max_amount <=", value, "promotionMaxAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionMaxAmountIn(List<BigDecimal> values) {
            addCriterion("promotion_max_amount in", values, "promotionMaxAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionMaxAmountNotIn(List<BigDecimal> values) {
            addCriterion("promotion_max_amount not in", values, "promotionMaxAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionMaxAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("promotion_max_amount between", value1, value2, "promotionMaxAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionMaxAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("promotion_max_amount not between", value1, value2, "promotionMaxAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIsNull() {
            addCriterion("discount_amount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIsNotNull() {
            addCriterion("discount_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountEqualTo(BigDecimal value) {
            addCriterion("discount_amount =", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotEqualTo(BigDecimal value) {
            addCriterion("discount_amount <>", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountGreaterThan(BigDecimal value) {
            addCriterion("discount_amount >", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_amount >=", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountLessThan(BigDecimal value) {
            addCriterion("discount_amount <", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_amount <=", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIn(List<BigDecimal> values) {
            addCriterion("discount_amount in", values, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotIn(List<BigDecimal> values) {
            addCriterion("discount_amount not in", values, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_amount between", value1, value2, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_amount not between", value1, value2, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andGiftNameIsNull() {
            addCriterion("gift_name is null");
            return (Criteria) this;
        }

        public Criteria andGiftNameIsNotNull() {
            addCriterion("gift_name is not null");
            return (Criteria) this;
        }

        public Criteria andGiftNameEqualTo(String value) {
            addCriterion("gift_name =", value, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameNotEqualTo(String value) {
            addCriterion("gift_name <>", value, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameGreaterThan(String value) {
            addCriterion("gift_name >", value, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameGreaterThanOrEqualTo(String value) {
            addCriterion("gift_name >=", value, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameLessThan(String value) {
            addCriterion("gift_name <", value, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameLessThanOrEqualTo(String value) {
            addCriterion("gift_name <=", value, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameLike(String value) {
            addCriterion("gift_name like", value, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameNotLike(String value) {
            addCriterion("gift_name not like", value, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameIn(List<String> values) {
            addCriterion("gift_name in", values, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameNotIn(List<String> values) {
            addCriterion("gift_name not in", values, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameBetween(String value1, String value2) {
            addCriterion("gift_name between", value1, value2, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameNotBetween(String value1, String value2) {
            addCriterion("gift_name not between", value1, value2, "giftName");
            return (Criteria) this;
        }

        public Criteria andPromotionScopeAmountIsNull() {
            addCriterion("promotion_scope_amount is null");
            return (Criteria) this;
        }

        public Criteria andPromotionScopeAmountIsNotNull() {
            addCriterion("promotion_scope_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionScopeAmountEqualTo(String value) {
            addCriterion("promotion_scope_amount =", value, "promotionScopeAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionScopeAmountNotEqualTo(String value) {
            addCriterion("promotion_scope_amount <>", value, "promotionScopeAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionScopeAmountGreaterThan(String value) {
            addCriterion("promotion_scope_amount >", value, "promotionScopeAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionScopeAmountGreaterThanOrEqualTo(String value) {
            addCriterion("promotion_scope_amount >=", value, "promotionScopeAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionScopeAmountLessThan(String value) {
            addCriterion("promotion_scope_amount <", value, "promotionScopeAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionScopeAmountLessThanOrEqualTo(String value) {
            addCriterion("promotion_scope_amount <=", value, "promotionScopeAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionScopeAmountLike(String value) {
            addCriterion("promotion_scope_amount like", value, "promotionScopeAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionScopeAmountNotLike(String value) {
            addCriterion("promotion_scope_amount not like", value, "promotionScopeAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionScopeAmountIn(List<String> values) {
            addCriterion("promotion_scope_amount in", values, "promotionScopeAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionScopeAmountNotIn(List<String> values) {
            addCriterion("promotion_scope_amount not in", values, "promotionScopeAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionScopeAmountBetween(String value1, String value2) {
            addCriterion("promotion_scope_amount between", value1, value2, "promotionScopeAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionScopeAmountNotBetween(String value1, String value2) {
            addCriterion("promotion_scope_amount not between", value1, value2, "promotionScopeAmount");
            return (Criteria) this;
        }

        public Criteria andApplyAuditNameIsNull() {
            addCriterion("apply_audit_name is null");
            return (Criteria) this;
        }

        public Criteria andApplyAuditNameIsNotNull() {
            addCriterion("apply_audit_name is not null");
            return (Criteria) this;
        }

        public Criteria andApplyAuditNameEqualTo(String value) {
            addCriterion("apply_audit_name =", value, "applyAuditName");
            return (Criteria) this;
        }

        public Criteria andApplyAuditNameNotEqualTo(String value) {
            addCriterion("apply_audit_name <>", value, "applyAuditName");
            return (Criteria) this;
        }

        public Criteria andApplyAuditNameGreaterThan(String value) {
            addCriterion("apply_audit_name >", value, "applyAuditName");
            return (Criteria) this;
        }

        public Criteria andApplyAuditNameGreaterThanOrEqualTo(String value) {
            addCriterion("apply_audit_name >=", value, "applyAuditName");
            return (Criteria) this;
        }

        public Criteria andApplyAuditNameLessThan(String value) {
            addCriterion("apply_audit_name <", value, "applyAuditName");
            return (Criteria) this;
        }

        public Criteria andApplyAuditNameLessThanOrEqualTo(String value) {
            addCriterion("apply_audit_name <=", value, "applyAuditName");
            return (Criteria) this;
        }

        public Criteria andApplyAuditNameLike(String value) {
            addCriterion("apply_audit_name like", value, "applyAuditName");
            return (Criteria) this;
        }

        public Criteria andApplyAuditNameNotLike(String value) {
            addCriterion("apply_audit_name not like", value, "applyAuditName");
            return (Criteria) this;
        }

        public Criteria andApplyAuditNameIn(List<String> values) {
            addCriterion("apply_audit_name in", values, "applyAuditName");
            return (Criteria) this;
        }

        public Criteria andApplyAuditNameNotIn(List<String> values) {
            addCriterion("apply_audit_name not in", values, "applyAuditName");
            return (Criteria) this;
        }

        public Criteria andApplyAuditNameBetween(String value1, String value2) {
            addCriterion("apply_audit_name between", value1, value2, "applyAuditName");
            return (Criteria) this;
        }

        public Criteria andApplyAuditNameNotBetween(String value1, String value2) {
            addCriterion("apply_audit_name not between", value1, value2, "applyAuditName");
            return (Criteria) this;
        }

        public Criteria andApplyAuditTimeIsNull() {
            addCriterion("apply_audit_time is null");
            return (Criteria) this;
        }

        public Criteria andApplyAuditTimeIsNotNull() {
            addCriterion("apply_audit_time is not null");
            return (Criteria) this;
        }

        public Criteria andApplyAuditTimeEqualTo(Date value) {
            addCriterion("apply_audit_time =", value, "applyAuditTime");
            return (Criteria) this;
        }

        public Criteria andApplyAuditTimeNotEqualTo(Date value) {
            addCriterion("apply_audit_time <>", value, "applyAuditTime");
            return (Criteria) this;
        }

        public Criteria andApplyAuditTimeGreaterThan(Date value) {
            addCriterion("apply_audit_time >", value, "applyAuditTime");
            return (Criteria) this;
        }

        public Criteria andApplyAuditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("apply_audit_time >=", value, "applyAuditTime");
            return (Criteria) this;
        }

        public Criteria andApplyAuditTimeLessThan(Date value) {
            addCriterion("apply_audit_time <", value, "applyAuditTime");
            return (Criteria) this;
        }

        public Criteria andApplyAuditTimeLessThanOrEqualTo(Date value) {
            addCriterion("apply_audit_time <=", value, "applyAuditTime");
            return (Criteria) this;
        }

        public Criteria andApplyAuditTimeIn(List<Date> values) {
            addCriterion("apply_audit_time in", values, "applyAuditTime");
            return (Criteria) this;
        }

        public Criteria andApplyAuditTimeNotIn(List<Date> values) {
            addCriterion("apply_audit_time not in", values, "applyAuditTime");
            return (Criteria) this;
        }

        public Criteria andApplyAuditTimeBetween(Date value1, Date value2) {
            addCriterion("apply_audit_time between", value1, value2, "applyAuditTime");
            return (Criteria) this;
        }

        public Criteria andApplyAuditTimeNotBetween(Date value1, Date value2) {
            addCriterion("apply_audit_time not between", value1, value2, "applyAuditTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("create_user like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("create_user not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameIsNull() {
            addCriterion("create_user_name is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameIsNotNull() {
            addCriterion("create_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameEqualTo(String value) {
            addCriterion("create_user_name =", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameNotEqualTo(String value) {
            addCriterion("create_user_name <>", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameGreaterThan(String value) {
            addCriterion("create_user_name >", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("create_user_name >=", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameLessThan(String value) {
            addCriterion("create_user_name <", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameLessThanOrEqualTo(String value) {
            addCriterion("create_user_name <=", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameLike(String value) {
            addCriterion("create_user_name like", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameNotLike(String value) {
            addCriterion("create_user_name not like", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameIn(List<String> values) {
            addCriterion("create_user_name in", values, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameNotIn(List<String> values) {
            addCriterion("create_user_name not in", values, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameBetween(String value1, String value2) {
            addCriterion("create_user_name between", value1, value2, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameNotBetween(String value1, String value2) {
            addCriterion("create_user_name not between", value1, value2, "createUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("update_user is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("update_user is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("update_user =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("update_user <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("update_user >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("update_user >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("update_user <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("update_user <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("update_user like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("update_user not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("update_user in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("update_user not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("update_user between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("update_user not between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameIsNull() {
            addCriterion("update_user_name is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameIsNotNull() {
            addCriterion("update_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameEqualTo(String value) {
            addCriterion("update_user_name =", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameNotEqualTo(String value) {
            addCriterion("update_user_name <>", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameGreaterThan(String value) {
            addCriterion("update_user_name >", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("update_user_name >=", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameLessThan(String value) {
            addCriterion("update_user_name <", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameLessThanOrEqualTo(String value) {
            addCriterion("update_user_name <=", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameLike(String value) {
            addCriterion("update_user_name like", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameNotLike(String value) {
            addCriterion("update_user_name not like", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameIn(List<String> values) {
            addCriterion("update_user_name in", values, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameNotIn(List<String> values) {
            addCriterion("update_user_name not in", values, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameBetween(String value1, String value2) {
            addCriterion("update_user_name between", value1, value2, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameNotBetween(String value1, String value2) {
            addCriterion("update_user_name not between", value1, value2, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(Boolean value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(Boolean value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(Boolean value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(Boolean value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<Boolean> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<Boolean> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNull() {
            addCriterion("audit_status is null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNotNull() {
            addCriterion("audit_status is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusEqualTo(Byte value) {
            addCriterion("audit_status =", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotEqualTo(Byte value) {
            addCriterion("audit_status <>", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThan(Byte value) {
            addCriterion("audit_status >", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("audit_status >=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThan(Byte value) {
            addCriterion("audit_status <", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThanOrEqualTo(Byte value) {
            addCriterion("audit_status <=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIn(List<Byte> values) {
            addCriterion("audit_status in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotIn(List<Byte> values) {
            addCriterion("audit_status not in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusBetween(Byte value1, Byte value2) {
            addCriterion("audit_status between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("audit_status not between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andRebateSenderIsNull() {
            addCriterion("rebate_sender is null");
            return (Criteria) this;
        }

        public Criteria andRebateSenderIsNotNull() {
            addCriterion("rebate_sender is not null");
            return (Criteria) this;
        }

        public Criteria andRebateSenderEqualTo(Byte value) {
            addCriterion("rebate_sender =", value, "rebateSender");
            return (Criteria) this;
        }

        public Criteria andRebateSenderNotEqualTo(Byte value) {
            addCriterion("rebate_sender <>", value, "rebateSender");
            return (Criteria) this;
        }

        public Criteria andRebateSenderGreaterThan(Byte value) {
            addCriterion("rebate_sender >", value, "rebateSender");
            return (Criteria) this;
        }

        public Criteria andRebateSenderGreaterThanOrEqualTo(Byte value) {
            addCriterion("rebate_sender >=", value, "rebateSender");
            return (Criteria) this;
        }

        public Criteria andRebateSenderLessThan(Byte value) {
            addCriterion("rebate_sender <", value, "rebateSender");
            return (Criteria) this;
        }

        public Criteria andRebateSenderLessThanOrEqualTo(Byte value) {
            addCriterion("rebate_sender <=", value, "rebateSender");
            return (Criteria) this;
        }

        public Criteria andRebateSenderIn(List<Byte> values) {
            addCriterion("rebate_sender in", values, "rebateSender");
            return (Criteria) this;
        }

        public Criteria andRebateSenderNotIn(List<Byte> values) {
            addCriterion("rebate_sender not in", values, "rebateSender");
            return (Criteria) this;
        }

        public Criteria andRebateSenderBetween(Byte value1, Byte value2) {
            addCriterion("rebate_sender between", value1, value2, "rebateSender");
            return (Criteria) this;
        }

        public Criteria andRebateSenderNotBetween(Byte value1, Byte value2) {
            addCriterion("rebate_sender not between", value1, value2, "rebateSender");
            return (Criteria) this;
        }

        public Criteria andExtRelationIdIsNull() {
            addCriterion("ext_relation_id is null");
            return (Criteria) this;
        }

        public Criteria andExtRelationIdIsNotNull() {
            addCriterion("ext_relation_id is not null");
            return (Criteria) this;
        }

        public Criteria andExtRelationIdEqualTo(String value) {
            addCriterion("ext_relation_id =", value, "extRelationId");
            return (Criteria) this;
        }

        public Criteria andExtRelationIdNotEqualTo(String value) {
            addCriterion("ext_relation_id <>", value, "extRelationId");
            return (Criteria) this;
        }

        public Criteria andExtRelationIdGreaterThan(String value) {
            addCriterion("ext_relation_id >", value, "extRelationId");
            return (Criteria) this;
        }

        public Criteria andExtRelationIdGreaterThanOrEqualTo(String value) {
            addCriterion("ext_relation_id >=", value, "extRelationId");
            return (Criteria) this;
        }

        public Criteria andExtRelationIdLessThan(String value) {
            addCriterion("ext_relation_id <", value, "extRelationId");
            return (Criteria) this;
        }

        public Criteria andExtRelationIdLessThanOrEqualTo(String value) {
            addCriterion("ext_relation_id <=", value, "extRelationId");
            return (Criteria) this;
        }

        public Criteria andExtRelationIdLike(String value) {
            addCriterion("ext_relation_id like", value, "extRelationId");
            return (Criteria) this;
        }

        public Criteria andExtRelationIdNotLike(String value) {
            addCriterion("ext_relation_id not like", value, "extRelationId");
            return (Criteria) this;
        }

        public Criteria andExtRelationIdIn(List<String> values) {
            addCriterion("ext_relation_id in", values, "extRelationId");
            return (Criteria) this;
        }

        public Criteria andExtRelationIdNotIn(List<String> values) {
            addCriterion("ext_relation_id not in", values, "extRelationId");
            return (Criteria) this;
        }

        public Criteria andExtRelationIdBetween(String value1, String value2) {
            addCriterion("ext_relation_id between", value1, value2, "extRelationId");
            return (Criteria) this;
        }

        public Criteria andExtRelationIdNotBetween(String value1, String value2) {
            addCriterion("ext_relation_id not between", value1, value2, "extRelationId");
            return (Criteria) this;
        }

        public Criteria andExtRelationNameIsNull() {
            addCriterion("ext_relation_name is null");
            return (Criteria) this;
        }

        public Criteria andExtRelationNameIsNotNull() {
            addCriterion("ext_relation_name is not null");
            return (Criteria) this;
        }

        public Criteria andExtRelationNameEqualTo(String value) {
            addCriterion("ext_relation_name =", value, "extRelationName");
            return (Criteria) this;
        }

        public Criteria andExtRelationNameNotEqualTo(String value) {
            addCriterion("ext_relation_name <>", value, "extRelationName");
            return (Criteria) this;
        }

        public Criteria andExtRelationNameGreaterThan(String value) {
            addCriterion("ext_relation_name >", value, "extRelationName");
            return (Criteria) this;
        }

        public Criteria andExtRelationNameGreaterThanOrEqualTo(String value) {
            addCriterion("ext_relation_name >=", value, "extRelationName");
            return (Criteria) this;
        }

        public Criteria andExtRelationNameLessThan(String value) {
            addCriterion("ext_relation_name <", value, "extRelationName");
            return (Criteria) this;
        }

        public Criteria andExtRelationNameLessThanOrEqualTo(String value) {
            addCriterion("ext_relation_name <=", value, "extRelationName");
            return (Criteria) this;
        }

        public Criteria andExtRelationNameLike(String value) {
            addCriterion("ext_relation_name like", value, "extRelationName");
            return (Criteria) this;
        }

        public Criteria andExtRelationNameNotLike(String value) {
            addCriterion("ext_relation_name not like", value, "extRelationName");
            return (Criteria) this;
        }

        public Criteria andExtRelationNameIn(List<String> values) {
            addCriterion("ext_relation_name in", values, "extRelationName");
            return (Criteria) this;
        }

        public Criteria andExtRelationNameNotIn(List<String> values) {
            addCriterion("ext_relation_name not in", values, "extRelationName");
            return (Criteria) this;
        }

        public Criteria andExtRelationNameBetween(String value1, String value2) {
            addCriterion("ext_relation_name between", value1, value2, "extRelationName");
            return (Criteria) this;
        }

        public Criteria andExtRelationNameNotBetween(String value1, String value2) {
            addCriterion("ext_relation_name not between", value1, value2, "extRelationName");
            return (Criteria) this;
        }

        public Criteria andProcessDataFlagIsNull() {
            addCriterion("process_data_flag is null");
            return (Criteria) this;
        }

        public Criteria andProcessDataFlagIsNotNull() {
            addCriterion("process_data_flag is not null");
            return (Criteria) this;
        }

        public Criteria andProcessDataFlagEqualTo(Byte value) {
            addCriterion("process_data_flag =", value, "processDataFlag");
            return (Criteria) this;
        }

        public Criteria andProcessDataFlagNotEqualTo(Byte value) {
            addCriterion("process_data_flag <>", value, "processDataFlag");
            return (Criteria) this;
        }

        public Criteria andProcessDataFlagGreaterThan(Byte value) {
            addCriterion("process_data_flag >", value, "processDataFlag");
            return (Criteria) this;
        }

        public Criteria andProcessDataFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("process_data_flag >=", value, "processDataFlag");
            return (Criteria) this;
        }

        public Criteria andProcessDataFlagLessThan(Byte value) {
            addCriterion("process_data_flag <", value, "processDataFlag");
            return (Criteria) this;
        }

        public Criteria andProcessDataFlagLessThanOrEqualTo(Byte value) {
            addCriterion("process_data_flag <=", value, "processDataFlag");
            return (Criteria) this;
        }

        public Criteria andProcessDataFlagIn(List<Byte> values) {
            addCriterion("process_data_flag in", values, "processDataFlag");
            return (Criteria) this;
        }

        public Criteria andProcessDataFlagNotIn(List<Byte> values) {
            addCriterion("process_data_flag not in", values, "processDataFlag");
            return (Criteria) this;
        }

        public Criteria andProcessDataFlagBetween(Byte value1, Byte value2) {
            addCriterion("process_data_flag between", value1, value2, "processDataFlag");
            return (Criteria) this;
        }

        public Criteria andProcessDataFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("process_data_flag not between", value1, value2, "processDataFlag");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}