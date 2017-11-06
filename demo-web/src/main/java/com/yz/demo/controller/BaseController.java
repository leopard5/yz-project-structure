package com.yz.demo.controller;

import com.alibaba.fastjson.JSON;
import com.yz.demo.resp.DemoResult;
import com.yz.demo.resp.MmcResultCode;
import com.yz.demo.vo.UserVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class BaseController {
    private final Logger logger = LoggerFactory.getLogger(BaseController.class);

    // session key
    @Value("${user.key}")
    private String userKey;

    protected HttpServletRequest request;
    protected HttpServletResponse response;
    protected HttpSession session;

    @ModelAttribute
    public void setReqAndRes(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
        this.session = request.getSession(false);
    }

    /**
     * 获取登录用户
     *
     * @param result
     * @return
     */
    protected UserVo getUser(DemoResult<?> result) {
        Object object = session.getAttribute(userKey);
        UserVo userVo = null;

        if (null != object) {
            logger.info("user：" + object.toString());
            return JSON.parseObject(object.toString(), UserVo.class);
        }
        return userVo;
    }

    /**
     * req封装请求用户信息
     *
     * @param result
     * @return
     */
    protected void getBaseReq(DemoResult<?> result) {
        try {
            UserVo userVo = this.getUser(result);
            if (null == userVo) {
                result.setCode(MmcResultCode.USER_NOT_EXIST.getCode());
                result.setMessage(MmcResultCode.USER_NOT_EXIST.getMessage());
            }

        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            result.setCode(MmcResultCode.SYS_ERROR.getCode());
            result.setMessage(MmcResultCode.SYS_ERROR.getMessage());
        }
    }

}
