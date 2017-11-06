package com.yz.demo.resp;

public enum DemoResultCode {
	// 操作成功标识
	SUCCESS("200", "Success"),
    // 系统异常标识
	SYS_ERROR("500", "服务器异常，请稍后再试！"),

    USER_NOT_EXIST("-401", "用户不存在"),
    NO_PERMISSION("-402",  "没有此操作权限"),
    NO_LOGGED_IN("-403",  "用户未登录"),
    
    EXTERNAL_SYSTEM_ERROR("1000",  "调用外部系统[%s]出错"),
    
	//----------------------------------------
	// 通用异常 
	// 区间：10001-10050
	//----------------------------------------
    COMMON_PARAM_NULL("10001",    "必要参数%s为空！"),
    COMMON_PARAM_INVALID("10002", "参数%s无效！"),
    CONTAINS_ILLEGAL_CHARACTERS("10003", "%s含有非法字符"),
    DATA_NOT_EXIST("10004", "%s不存在"),
    NO_PERMISSION_OPERATE("10005",  "没有%s的操作权限"),
    CAN_NOT_BE_OPERATE("10006",  "%s不能%s"),
    FIELD_NOT_ALLOWED_EMPTY("10010", "%s不能为空"),
	FIELD_VALUE_MUST_LARGE_THAN("10011", "%s必须大于%s"),
	FIELD_VALUE_MUST_LESS_THAN("10012", "%s必须小于%s"),
	DATA_EXIST("10013", "%s已存在"),
	FIELD_NOT_EMAIL("10013", "%s格式错误"),
	FIELD_NOT_MOBILE("10014", "%s格式错误"),
	FIELD_NOT_ID_NUM("10015", "%s格式错误"),
	FIELD_NOT_DATE("10016", "%s格式错误"),
	FIELD_LENGTH_MUST_LESS("10017", "%s必须小于%d"),
	FIELD_LENGTH_MUST_MORE("10018", "%s必须大于%d"),
	FIELD_LENGTH_MUST_BETWEEN("10019", "%s长度必须大于%d和小于%d"),
	FILED_NOT_IN_ENUM_VALUES("10020", "不支持的%s"),
	FIELD_NOT_BOTH_BE_EMPTY("10021", "%s不能同时为空"),
	MUST_BE_INTEGER_MULTIPLE("10022", "%s必须是%s的整数倍"),
	UPLOAD_PICTURES_ERROR("10023", "上传图片出错，%s"),
	
	FIELD_VALUE_MUST_GE_THAN("10023", "%s必须大于等于%s"),
	FIELD_VALUE_MUST_LE_THAN("10024", "%s必须小于等于%s"),
	FIELD_VALUE_MUST_DONE("10025", "%s还未%s"),
	
	TIME_MUST_LARGE_THAN("10030", "%s必须晚于%s"),
	TIME_VALUE_MUST_LESS_THAN("10031", "%s必须早于%s"),
	INVALID_CHANGE_STATUS("10032","%s更新状态非法"),
	FIELD_DIGITAL("10033", "获取商品信息出错"),
	LENGTH_MUST_LESS("10034", "%s必须小于%s"),
	LENGTH_MUST_MORE("10035", "%s必须大于%s"),
	NO_DATA_FOUND("10036","暂无数据"),
	PARAM_REPEAT("10037", "%s有重复数据"),
	STATUS_ERROR("10038", "%s状态只有是%s才能%s"),
	AUDIT_STATUS_ERROR("10039", "%s审核状态只有是%s才能%s"),

	STATUS_SAVED_OFFLINE_ERROR("10040", "店铺活动状态是已保存、已下线状态才能%s"),
	STATUS_SAVED_ERROR("10041", "红星活动状态只有是已保存状态才能%s"),
	STATUS_INITIAL_ERROR("10042", "活动审核状态只有是初始状态才能%s"),

	DUPLICATE_NAME("10046", "%s名称已经存在"),
	COMMON_PARAM_MUST_SELECTED("10043","%s必选"),
	OBJECT_INVALID("10044", "%s已失效"),
	COMMON_MESSAGE("10045", "%s"),
	
	
	//----------------------------------------
	// api调用异常 
	// 区间：10051-10099
	//----------------------------------------
	API_INVLID_SIGN("10100", "签名错误"),
	API_INVLID_FROM("10101", "没有权限访问"),
	API_INVLID_DATA("10102", "请求数据错误"),
	API_NOT_SUPPORT_METHOD("10103", "只接受Post请求"),
	API_INVLID_DATA_FORMAT("10104", "数据格式不符合要求"),
	API_INVLID_API("10105", "api【%s】不存在"),
	
	//****************************************
	// 业务异常 
	// 区间：10100-10999
	//****************************************
	NOT_ENOUGH_STOCK("10101", "SKU:%s 库存不足错误"),
	ITEM_PROMOTION_NOT_ENOUGH_STOCK("10102","爆款商品库存仅剩%s件 价签码:%s"),
	ITEM_PROMOTION_PURCHASE_LIMIT_FULL("10103","用户限购数量仅剩%s件 价签码:%s"),
	MALL_STOCK_NOT_ENOUGH("10104","商场可核销数量不足 券ID:%s"),
	CAN_NOT_USE_ITEM_PROMOTION("10105","改价后不能使用爆品 价签码:%s"),
	ITEM_PROMOTION_EXPIRED("10106","爆品已失效 价签码:%s"),
	USER_NOT_BOOKING("10107","用户未预定"),
	USER_BOOKING_ONLY_ONECE("10108","预定商品只能预定一次"),
	PROMOTION_STATUS_NOT_VALID("10108","促销已失效"),
	INVALID_COUPON_STATUS("10109","券状态非法"),
	NOT_USED_COUPON_STATUS("10110","券%s，不是未使用状态"),
	COUPON_PER_ORDER_LIMIT("10111","该券每订单限制最多使用%s张"),
	PROMOTION_STATUS_INVALID("10208","促销状态非法，促销已过期或未开始"),
	//----------------------------------------
	// 活动异常 
	// 区间：10200-10299
	//----------------------------------------
    ACTIVITY_NOT_EXIST("10200", "活动不存在"),
    ACTIVITY_NO_UPDATE_AUTHORITY("10201", "活动已进入审核或者已开始状态，不可以更新"),
    ACTIVITY_PARAMS_IS_EMPTY("10202", "活动参数不能为空"),
    ACTIVITY_ISSUED_NOT_EXIST("10203", "活动下发对象不能为空"),
    ACTIVITY_OWNER_TYPE_IS_EMPTY("10204", "活动拥有者类型不能为空"),
    ACTIVITY_NO_UPDATE_AUTHORITY_CREATE("10205", "只有活动创建者可以更新该活动"),
    ACTIVITY_MARKET_IS_EMPTY("10206", "该商场不存在"),
	ACTIVITY_STATUS_ERROR("10207", "活动必须在[报名中]或[进行中]才能新增下发!"),
	ACTIVITY_TEMPLATE_NOT_EXIST("10208", "活动模板不存在"),
	ACTIVITY_TEMPLATE_EXIST("10209", "活动模板已存在"),
	ACTIVITY_TEMPLATE_NAME_EXIST("10210", "活动模板名已存在"),
	ACTIVITY_ORDER_INFO_FAIL("10211", "查询订单金额接口调用失败"),
    //----------------------------------------
	// 优惠券异常 
	// 区间：10300-10399
	//----------------------------------------
    COUPON_DISCOUNT_BETWEEN_AND("10301", "折扣券折扣必须在（0和1之间）"),
    COUPON_NOT_ACTIVE ("10302", "优惠券未到生效期 不能领取"),
    COUPON_TAKE_ONLY_ONLINE ("10303", "只有线上优惠券才能被领取"),
//    COUPON_ISSUED_TIME_NOT_REACHED("10304", "优惠券发券时间未到"),
//    COUPON_ISSUED_TIME_HAS_EXPIRED("10305", "优惠券发券时间已过"),
    COUPON_TAKEN_OVER("10306", "优惠券已经被领完"),
    COUPON_ALREADY_TAKEN("10307", "用户已领券"),
    COUPON_CODE_USED("10308", "此券码已经被绑定过，不可再次绑定"),
    COUPON_CODE_NOT_EXIST("10309", "此券码不存在"),
    COUPON_STATUS_NOT_EDIT("10310", "状态不是%s状态不能编辑优惠券"),
    COUPON_AUDIT_STATUS_NOT_EDIT("10311", "审核状态只有是初始状态[0]才能编辑优惠券"),
    COUPON_OFFLINE_TAKE_ONCE("10312", "每种线下券一个用户只能绑定一张"),
    COUPON_ONLY_OFFLINE_EXPORT("10313", "只有线下券才能导出"),
    COUPON_ONLY_STATUS_EXPORT("10314", "只有状态为[报名中][进行中][已上线]的线下券才能导出"),
    COUPON_NOT_STARTED("10315", "促销还未生效"),
	COUPON_ALREADY_OVER("10316", "促销已经结束"),
	COUPON_NOT_APPLICABLE("10317", "所选商品不满足此优惠券的适用条件"),
	COUPON_SHORTAGE("10318", "券数量不足！"),
	COUPON_OUT_OF_COMMISSION("10319", "券的状态不在[进行中]，不能使用！"),

	//----------------------------------------
	// 促销异常 
	// 区间：10400-10499
	//----------------------------------------
    PROMOTION_NOT_EXIST("10400", "促销不存在"),
    PROMOTION_INVALID_TIME("10401", "促销时间必须在活动时间内"),
    PROMOTION_INVALID_STRATEGE("10402", "促销策略错误"),
    PROMOTION_VALUE_MUST_MORE("10403", "%s必须大于等于%d"),
	//----------------------------------------
	// 商品促销异常 
	// 区间：10500-10599
	//----------------------------------------
    ITEM_PROMOTION_NOT_EXIST("10500", "商品促销不存在"),
    ITEM_PROMOTION_WRONG_FORMAT("10501", "%s格式错误"),
    ITEM_PROMOTION_VALUE_MUST_BETWEEN("10502", "%s必须大于等于%d和小于等于%d"),
    ITEM_PROMOTION_VALUE_MUST_MORE("10503", "%s必须大于等于%d"),
    ITEM_PROMOTION_VALUE_MUST_LESS("10504", "%s必须小于%d"),
    ITEM_PROMOTION_STATUS_SAVED_OFFLINE_ERROR("10505", "店铺活动状态是已保存、已下线状态才能%s商品促销"),
    ITEM_PROMOTION_STATUS_SAVED_ERROR("10506", "红星活动状态只有是已保存状态才能%s商品促销"),
    ITEM_PROMOTION_STATUS_INITIAL_ERROR("10507", "活动审核状态只有是初始状态才能%s促销"),
    ITEM_PROMOTION_IS_BOOKING_ERROR("10508", "用户已经预定此商品促销"),
    ITEM_PROMOTION_NOT_REQUIRED_ERROR("10509", "此商品促销不需要付费预定"),
    ITEM_PROMOTION_BOOKING_DATE_ERROR("10510", "此商品促销不在付费预定时间段内"),
    ITEM_PROMOTION_INVENTORY_SHORTAGE_ERROR("10511", "此商品促销库存不足"),
    ITEM_PROMOTION_INCORRECT_AMOUNT_ERROR("10512", "此商品促销预定金额错误"),
    CAN_NOT_CREATE_LIMITED_PURCHASE("10513", "不能创建限时购"),
	ITEM_PROMOTION_BOOKING_NOT_START("10514","预定商品活动未开始"),
	ITEM_PROMOTION_BOOKING_HAS_ENDED("10515","预定商品活动已结束"),
	ITEM_PROMOTION_STATUS_NOT_VALID("10516","商品促销状态非法"),
	ITEM_PROMOTION_BOOKING_STATUS_INVALID("10517","活动%s"),

	//----------------------------------------
	// 订单促销异常 
	// 区间：10600-10699
	//----------------------------------------
    SUBPROMOTION_STATUS_SAVED_OFFLINE_ERROR("10605", "店铺活动状态是已保存、已下线状态才能%s订单促销"),
    SUBPROMOTION_STATUS_SAVED_ERROR("10606", "红星活动状态只有是已保存状态才能%s订单促销"),
    SUBPROMOTION_STATUS_INITIAL_ERROR("10607", "活动审核状态只有是初始状态才能%s促销"),
    
	//----------------------------------------
	// 订单促销异常 
	// 区间：10700-10799
	//----------------------------------------
    
	//----------------------------------------
	// 活动下发异常 
	// 区间：10800-10899
	//----------------------------------------
    ISSUED_MALL_REPETITION("10800","该商场已经下发，请勿重新下发！%s"),
    
    ITEM_PROMOTION_HAVE_PARTICIPATED("10801","此商品促销已经是参加状态，请勿重复参加！%s"),
    SUB_PROMOTION_HAVE_PARTICIPATED("10802","此订单促销已经是参加状态，请勿重复参加！%s"),
    COUPON_HAVE_PARTICIPATED("10803","此优惠券已经是参加状态，请勿重复参加！%s"),
    COUPONPACAGE_HAVE_PARTICIPATED("10822","此券包已经是参加状态，请勿重复参加！%s"),
    COUPONPACAGE_NO_OPERATION("10823","此券包不是未操作状态，不能报名参加！%s"),
    ITEM_PROMOTION_NO_OPERATION("10804","此商品促销不是未操作状态，不能报名参加！%s"),
    SUB_PROMOTION_NO_OPERATION("10805","此订单促销不是未操作状态，不能报名参加！%s"),
    COUPON_NO_OPERATION("10806","此优惠券不是未操作状态，不能报名参加！%s"),
	
	SUB_PROMOTION_COST_EXCEED("10807","订单促销承担比例超过百分比！%s"),
	COUPON_COST_EXCEED("10808","优惠券承担比例超过百分比！%s"),
	ITEM_PROMOTION_COST_EXCEED("10809","商品促销承担比例超过百分比！%s"),
	
	SUB_PROMOTION_IS_NULL("108010","订单促销不存在！"),
	SUB_PROMOTION_TIME_OVER("10811","订单促销报名时间已截至！%s"),
	SUB_PROMOTION_NO_APPLYING("10812","订单促销状态不在报名中或进行中！%s"),
	
	COUPON_IS_NULL("10813","优惠券不存在！"),
	COUPON_TIME_OVER("10814","优惠券报名时间已截至！%s"),
	COUPON_NO_APPLYING("10815","优惠券状态不在报名中或进行中！%s"),
	
	ITEM_PROMOTION_IS_NULL("10816","商品促销不存在！"),
	ITEM_PROMOTION_TIME_OVER("10817","商品促销时间已截至！%s"),
	ITEM_PROMOTION_NO_APPLYING("10818","商品促销状态不在报名中或进行中！%s"),
	
	MALL_NO_PARTICIPATE_ACTIVITY("10819", "该商场没有参加任促销！"),
	ISSUED_SHOP_NOT_NULL("10820", "下发的商户不能为空！"),
	ISSUED_SHOP_REPETITION("10821", "该商户已经下发过，请勿重复下发！ 商户ID：%s"), 
	MALL_AUDIT_LOSER("10822","参与平台活动审核失败！商场ID：%s"),
	PLATFOR_AUDIT_LOSER("10823", "平台审核新增商场参与失败！活动ID：%s"),
	STOPED_AND_CANCELED("10824", "商场已中止或已取消该商品促销!%s"),
	SHOP_IS_NULL("10825", "商户不存在！"),
	SHOP_NO_OPERATION("10826", "店铺没有参加活动，不能提报! %s"),
	ADD_ISSUED_REPETITION("10827", "已有新增下发对象未审核，请勿多次新增下发对象!"),
	REPEAT_SUBMIT_AUDIT("10828","请勿重复提交审核！"),
	NO_ISSUED_MALL("10829","%s没有下发给商场！"),
	REPEATEDLY_ISSUED_MALL("10830","请勿重复下发%s!"),
	ACTIVITY_BY_ISSUED("10831","该%s没有被下发！"),
	USABLE_RANGE_ERROR("10832", "%s选择使用范围不规范！"),
	PROMOTION_PRICE_MORE_SKU_PRICE("10833", "促销价不得高于原价的%s"),
	COUPON_COUNT_MORE_ISSUED_AMOUNT("10834", "优惠券可核销数量超过发券总数量！发券总数量为:%s"),
	LARGEST_SHOP_NUMBER("10835", "下发商户不能超过200家！"),
	REQUIRE_BOOKING_ERROR("10836", "预定时间已开始，请勿更新数据！%s"),

	//----------------------------------------
	// 商品提报异常 
	// 区间：10900-10999
	//----------------------------------------
	SKU_IS_NOT_BLANK("10900", "爆品不能为空！"),
	SKU_DATETIME_INTERSECTION("10901", "提报的商品与其他提报的商品有时间交集！ %s"),
	SKU_NUMBER_IS_EQUAL_REPERTORY("10902", "提报数量大于现有库存！"),
	NO_DELETE_SKU("10903", "商品促销正在[进行中]状态，不能删除提报的商品！"),
	NO_UPDATE_SKU("10904", "商品促销正在[进行中]状态，不能编辑提报的商品！"),
	CALL_LONGGUO_FAILURE("10905", "调用龙果分页数据失败！"),
	NO_ADD_SKU_STOCK("10906", "商品促销不在[进行中]状态，不允许追加库存!"),
	SKU_PRICE_MORE_SALE_PRICE("10907", "提报商品的价格不能大于零售价！"),
	SKU_LOCK_UPDATE_ERROR("10908","该商品为锁定编辑状态，请勿做提报操作。"), 
	LIMITED_PURCHASE_ERROR("10909","不能提报线下商品！"),
	SKU_LENGTH_TOO_SHORT("10910", "skuId输入过短,必需大于或者等于三个字符！"),
	SKU_CITY_ERROR("10911", "不是全国通用，城市列表不能为空!"),
	SKU_PROMOTION_PRICE_ERROR("10912", "预定后售价小于销售价，请勿提报！"),
	SKU_CIYT_SURPASS_ERROR("10913","限时购最多选择20个城市，请重新选择城市。 %s"),

	//----------------------------------------
	// 51零元抢购活动异常
	// 区间：11000-11099
	//----------------------------------------
	PRIZE_NOT_EXIST("11001","奖品不存在"),
	ACTIVITY_NOT_START("11002","该产品抢购时间未开始"),
    ACTIVITY_END("11003","该产品抢购时间已结束"),
    PRIZE_NOT_ENOUGH("11004","该产品已抢完"),

    // ---------原促销code码和message信息
	C1013("PROMOTION_1013", "每个用户限制最多领取%d张"),
	C1014("PROMOTION_1014", "%s券已领完"),
	C1015("PROMOTION_1015", "当前时刻不在发券期间内"),
	C1016("PROMOTION_1016", "渠道不存在"),
	C1017("PROMOTION_1017", "活动库存不足"),
	C1018("PROMOTION_1018", "不是付费券类型"),

	//----------------------------------------
	// 分摊验证信息
	// 区间：11100-11199
	//----------------------------------------
	FIX_OVERLOAD_MALL_LIMIT("11100","固定分摊超过红星大促总封顶"),
	EXCEPT_NO_SHOP_FOUND("11101","计算异常未找到店铺信息"),
	FIX_OVERLOAD_COMBINE_LIMIT("11102","固定分摊超过联合促销总封顶"),
	FAVOR_AMOUNT_PERCENT_MUST_ONE_DETAIL("11103","优惠金额比例只能设置一条明细"),
	CONSTANT_COND_TYPE_MUST_CONSTANT_LIMIT("11104","按固定值返点条件类型只能为固定值"),
	PLAN_NEED_SAME_COND_TYPE("11105","同一方案销售额条件类型必须相同"),
	PLAN_NOT_EXIST_SAME_COND_VALUE("11106","同一方案不能存在相同的销售额条件"),
	REBATE_LIMIT_PERCENT_NEED_TOTAL_LIMIT("11107","设置每商户补贴上限时必须同时设置本次活动大促总预算"),
	MALL_LESS_REBATE_FEE_CONFIG("11108","商场%s缺少费用项比率配置信息"),
	REBATE_OUT_OF_TOTAL_LIMIT("11109", "超出活动总封顶"),
	REBATE_COND_TYPE_LIMIT_TYPE_NOT_SAME("11110", "销售额条件类别必须与封顶类别一致"),


	//----------------------------------------
	// 在线抽奖项目异常
	// 区间：11200-11299
	//----------------------------------------
	RECORD_NOT_EXIST("11200", "没有找到中奖信息"),
	RECORD_EXPIRED("11203", "中奖已经过期"),
	PRIZE_ACTIVITY_OPERATION_FAILURE("11201","活动%s失败"),
	PRIZE_ACTIVITY_NO_EDITOR("11202","活动在[进行中]不能%s信息"),
	OUT_OF_CHANCE("11210","没有抽奖资格"),

	NO_PRIZEITEM("11211","活动没有设置奖项"),
	OUT_OF_ACTIVITY("11212","不在活动进行中"),
	PRIZE_RATE_OVER("11213","中奖概率不能超过百分比。"),
	PRIZE_ACCUMULATE_RATE_OVER("11214","活动下面所有奖项累加起来的中奖概率已经超过百分比。%s"),
	PRIZE_COUPON_CHANNEL_ERROR("11215","券ID不在抽奖平台渠道。"),

	OUT_OF_DEFAULT_CHANCE("11216","活动没有登陆后抽奖,抱歉，你已经没有抽奖机会"),

	PRIZE_ACTIVITY_TIME_NOT_VALID("11217","活动%s时间不能%s红星奖品券有效期%s时间 券ID:%s"),
	BATCH_UPDATE_LOSS_ITEM("11218","没有更新所有的奖项概率"),
	PRIZE_COUNT_NOT_VALID("11219","活动奖品数量必须大于等于3小于等于7"),
	PRIZE_ITEM_EXIST_PRIZE("11220","奖项下面存在奖品不能直接删除"),
	PRIZE_TYPE_NOTEXIST("11221","不存在这种奖品类型"),
	PRIZE_DATE_ERROR("11222","设置中奖时间有误"),
	THIRDPART_COUPON_TYPE_ERROR("11223","第三方券类型不是线上抽奖"),
	THIRDPART_COUPON_NOT_ONLINE("11224","第三方券未上架"),
	THIRDPART_COUPON_INVENTORY_SHORTAGE("11225", "第三方券库存不足！"),
    ACQUIRE_PRIZE_FAILED("11235","领取奖品失败"),
    ACQUIRE_PRIZE_THIRDPART_FAILED("11236","调用第三方领奖接口失败:%s"),
	//----------------------------------------
	// 券包异常
	// 区间：11300-11399
	//----------------------------------------
	COUPON_PACKAGE_NOT_EXIST("11300", "券包不存在"),
	COUPON_PACKAGE_COUPON_COUNT_LESS("11301", "券包里最少有2个优惠券"),






	;



    public String code;
    public String message;
    
    DemoResultCode(String code, String message) {
        this.code = code;
        this.message = message;
    }
    
	public String getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}
}
