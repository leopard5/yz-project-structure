package com.yz.demo.dubbo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.dubbo.rpc.Result;
import com.alibaba.fastjson.JSON;
import com.yz.demo.resp.DemoResult;
import com.yz.demo.resp.MmcResultCode;

public class InvokeLogWoker implements Runnable {
	private final Logger logger = LoggerFactory.getLogger(InvokeLogWoker.class);
	
	private Object[] arguments;
	private String api;
	private String serviceName;
	private String serverIP;
	private String from;
	private String invokerIP;
	private long requestTime;
	private long returnTime;
	private Result result;
	private Throwable exception;

	public InvokeLogWoker(
			final Object[] arguments,
			final String api,
			final String serviceName,
			final String serverIP,
			final String from,
			final String invokerIP,
			final long requestTime,
			final long returnTime,
			final Result result,
			final Throwable ex

	)
	{
		this.arguments = arguments;
		this.api = api;
		this.serviceName = serviceName;
		this.serverIP = serverIP;
		this.from = from;
		this.invokerIP = invokerIP;
		this.requestTime = requestTime;
		this.returnTime = returnTime;
		this.exception = ex;
		this.result = result;
	}
	
	@Override
	public void run() {
		try {
			String message = JSON.toJSONString(arguments);
			String status = "";
			String returnMessage = null;
			String returnData = null;
			if (result == null) {
				if (exception != null) {
					logger.error("异常", exception);
				}
				else {
					returnMessage = "没有异常，没有返回值，不可能，请检查代码";
				}
			}
			else {
				Object bizResult = result.getValue();
				if (bizResult == null) {
					Throwable bizException = result.getException();
					if (bizException != null) {
						returnMessage = bizException.toString();
						returnData = "";
						logger.error("bizException异常", exception);
					}
				}
				else {
					DemoResult<?> message2 = (DemoResult<?>) result.getValue();
					status = message2.getCode();
					returnMessage = message2.getMessage();
					if (status.equals("200")) {
						if (status.equals(MmcResultCode.SYS_ERROR.getCode())) {
							if (exception != null) {
								returnData = "";
								logger.error("bizException异常", exception);
							}
						}
						else if (message2.getDataMap() != null) {
							returnData = JSON.toJSONString(message2.getDataMap());
						}
					}
				}
			}

			logger.info("LogFilter api=" + JSON.toJSONString(api));
			logger.info("LogFilter message=" + JSON.toJSONString(message));
			logger.info("LogFilter requestTime=" + requestTime );
			logger.info("LogFilter returnTime=" + returnTime );
			logger.info("LogFilter invokerIP=" + invokerIP );
			logger.info("LogFilter serverIP=" + serverIP );
			logger.info("LogFilter returnData=" + returnData );
		} catch (Exception e) {
			logger.error("run", "记录日志错误", e);
		}
	}
}
