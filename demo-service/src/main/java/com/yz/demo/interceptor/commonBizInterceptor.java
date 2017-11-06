package com.chinaredstar.mms.service.interceptor;

import java.lang.reflect.Method;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.yz.demo.biz.exception.CommonBizException;
import com.yz.demo.resp.DemoResult;
import com.yz.demo.resp.MmcResultCode;
import com.chinaredstar.perseus.utils.JsonUtil;

@Component
@Aspect
@Order(1) 
public class commonBizInterceptor {
	private final Logger logger = LoggerFactory.getLogger(commonBizInterceptor.class);

	@Around("execution(* com.yz.demo.service..*.*(..))")
	//@Around("execution(* com.yz.demo.service.client.impl.*.*(..))")
	public Object intercept(ProceedingJoinPoint pjp) throws Throwable {	
		Class<?> targetClass = pjp.getTarget().getClass();
		MethodSignature signature = (MethodSignature) pjp.getSignature();
		Method method = targetClass.getMethod(signature.getName(), signature.getParameterTypes());
		Object[] args = pjp.getArgs();

		StringBuilder log = new StringBuilder(">>> Start Method ")
				.append(method.getName()).append(" with args : ");
		for (int i = 0; i < args.length; i++) {
			Object arg = args[i];
			if (i > 0) {
				log.append(", ");
			}
			log.append(JsonUtil.toJson(arg, false));
		}
		logger.info(log.toString());
		
		Object ret = null;
		try {			
		    ret = pjp.proceed(args);
		} catch (CommonBizException e) {
			logger.warn(e.getMessage() + " Input parameters=" + JsonUtil.toJson(args, false), e);	
			
			DemoResult<Object> r = DemoResult.newSuccess();
			r.setErrorCode(e.getMmcResultCode());
			r.setMessage(e.getErrorMsg());
			ret = r;				
		} catch (Exception e) {
			logger.error(e.getMessage() + " Input parameters=" + JsonUtil.toJson(args, false), e);	
			
			DemoResult<Object> r = DemoResult.newSuccess();
			r.setErrorCode(MmcResultCode.SYS_ERROR);			
			ret = r;
		}

		log = new StringBuilder(">>> Finish Method ")
				.append(method.getName()).append(" with return : ").append(JsonUtil.toJson(ret, false));
		logger.info(log.toString());
		return ret;
	}		
}
