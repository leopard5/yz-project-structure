package com.yz.demo.req;

import java.io.Serializable;

public class UserGeneralDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String ownerId;
	private Byte ownerType;
	private String operator;
	private String operatorName;
	private String mallId;

	public UserGeneralDTO() {
	}

	public UserGeneralDTO(Integer id, String ownerId, Byte ownerType, String operator, String operatorName,
						  String mallId) {
		this.id = id;
		this.ownerId = ownerId;
		this.ownerType = ownerType;
		this.operator = operator;
		this.operatorName = operatorName;
		this.mallId = mallId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public Byte getOwnerType() {
		return ownerType;
	}

	public void setOwnerType(Byte ownerType) {
		this.ownerType = ownerType;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public String getMallId() {
		return mallId;
	}

	public void setMallId(String mallId) {
		this.mallId = mallId;
	}


}
