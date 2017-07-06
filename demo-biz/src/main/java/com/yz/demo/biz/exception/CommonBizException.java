package com.yz.demo.biz.exception;

import com.yz.demo.exception.BaseException;
import com.yz.demo.resp.MmcResultCode;

public class CommonBizException extends BaseException{
	private static final long serialVersionUID = 1L;
	
	private MmcResultCode mmcResultCode;

    public CommonBizException(String errorCode, String errorMsg, Throwable caused) {
        super(errorCode, errorMsg, caused);
    }

    public CommonBizException(String errorCode, String errorMsg) {
        super(errorCode, errorMsg);
    }

    public CommonBizException(String errorCode, String errorMsg, Object... args) {
        super(errorCode, errorMsg, args);
    }
    
    public CommonBizException(MmcResultCode resultCode){
        this(resultCode.getCode(),resultCode.getMessage());
        this.mmcResultCode = resultCode;
    }

    public CommonBizException(MmcResultCode resultCode, Object... args){
        this(resultCode.getCode(),resultCode.getMessage(), args);
        this.mmcResultCode = resultCode;
    }
    
    public CommonBizException(String errorCode, Throwable caused) {
        super(errorCode, caused);
    }

	public MmcResultCode getMmcResultCode() {
		return mmcResultCode;
	}
	
//	public void setMmcResultCode(MmcResultCode MmcResultCode) {
//		this.mmcResultCode = MmcResultCode;
//	}

}