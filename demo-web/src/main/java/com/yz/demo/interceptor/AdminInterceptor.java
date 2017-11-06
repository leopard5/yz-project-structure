package com.yz.demo.interceptor;

import com.alibaba.fastjson.JSON;
import com.yz.demo.resp.DemoResult;
import com.yz.demo.resp.MmcResultCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Component("adminInterceptor")
public class AdminInterceptor implements HandlerInterceptor {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        try {
            // 打印日志
            logger.info("requestUri：" + request.getRequestURI());
            logger.info("contextPath：" + request.getContextPath());
            logger.info("parameterNames：" + JSON.toJSONString(request.getParameterMap()));

            return true;
        } catch (Exception e) {
            returnErrorJson(response, JSON.toJSONString(DemoResult.newError(MmcResultCode.SYS_ERROR)));
            return false;
        }

    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
    }


    private void returnErrorJson(HttpServletResponse response, String json) throws Exception {
        PrintWriter writer = null;
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json;charset=utf-8");
        try {
            writer = response.getWriter();
            writer.print(json);

        } catch (IOException e) {
            logger.error("response error", e);
        } finally {
            if (writer != null)
                writer.close();
        }
    }

}