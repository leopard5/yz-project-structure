package com.yz.demo.biz.util;

import java.io.Serializable;

public class CouponCodes implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 优惠券券码
	 */
	private String codeNo;

	public String getCodeNo() {
		return codeNo;
	}

	public void setCodeNo(String codeNo) {
		this.codeNo = codeNo;
	}
	
}
