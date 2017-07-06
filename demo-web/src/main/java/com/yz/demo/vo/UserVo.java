package com.yz.demo.vo;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel("用户信息类")
public class UserVo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 用户openid
     */
    @ApiModelProperty("用户id")
    private String userOpenId;
    /**
     * 用户名称
     */
    @ApiModelProperty("用户名称")
    private String userName;
    /**
     * 1、平台 2、商场 3、商户
     */
    @ApiModelProperty("1、平台 2、商场 3、商户")
    private Byte ownerType;
    /**
     * ownerType=1 平台id ownerType=2 商场id ownerType=3 商户id
     */
    @ApiModelProperty("ownerType=1 平台id ownerType=2 商场id ownerType=3 商户id")
    private String ownerId;
    /**
     * ownerType=1 平台名称 ownerType=2 商场名称 ownerType=3 商户名称
     */
    @ApiModelProperty("ownerType=1 平台名称 ownerType=2 商场名称 ownerType=3 商户名称")
    private String ownerName;
    /**
     * 商场id，B端用户使用
     */
    @ApiModelProperty("商场id，B端用户使用")
    private String marketId;
    /**
     * 角色，B端用户使用
     */
    @ApiModelProperty("角色，B端用户使用")
    private String rolesName;

    public UserVo() {

    }

    public String getUserOpenId() {
        return userOpenId;
    }

    public void setUserOpenId(String userOpenId) {
        this.userOpenId = userOpenId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public String getMarketId() {
        return marketId;
    }

    public void setMarketId(String marketId) {
        this.marketId = marketId;
    }

    public String getRolesName() {
        return rolesName;
    }

    public void setRolesName(String rolesName) {
        this.rolesName = rolesName;
    }

    @Override
    public String toString() {
        return "UserVo{" +
                "userOpenId='" + userOpenId + '\'' +
                ", userName='" + userName + '\'' +
                ", ownerType=" + ownerType +
                ", ownerId='" + ownerId + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", marketId='" + marketId + '\'' +
                ", rolesName='" + rolesName + '\'' +
                '}';
    }
}
