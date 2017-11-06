package com.yz.demo.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.yz.demo.resp.DemoResult;
import com.yz.demo.resp.MmcResultCode;
import com.yz.demo.util.FileUtil;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class TestBase {
	private static final String SUCCESS_FLAG = "200";

	public void print(String name, Object msg) {
		System.out.println(name + "=======" + msg);
	}

	public void printAndAssertEquals(DemoResult<?> result) {
		System.out.println("--------------------打印开始--------------------");
		System.out.println(JSON.toJSONString(result, SerializerFeature.WriteMapNullValue));
		assertEquals(SUCCESS_FLAG, result.getCode());
		System.out.println("--------------------打印结束--------------------");
	}


	public void printAndAssertEquals(DemoResult<?> result, MmcResultCode errorCode) {
		System.out.println("--------------------打印开始--------------------");
		System.out.println(JSON.toJSONString(result, SerializerFeature.WriteMapNullValue));
		assertEquals(errorCode.getCode(), result.getCode());
		System.out.println("--------------------打印结束--------------------");
	}

	public <T> T readJsonFile(String path, Class<?> clazz) {
		String jsonContext = "";
		try {
			jsonContext = FileUtil.getResourceContent(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Object obj = JSON.parseObject(jsonContext, clazz);
		return (T)obj;
	}

	public <T> T readJsonFile(String path, TypeReference<T> type) {
		String jsonContext = "";
		try {
			jsonContext = FileUtil.getResourceContent(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Object obj = JSON.parseObject(jsonContext, type);
		return (T)obj;
	}


	public void out(Object obj) {
		System.out.println(JSON.toJSONString(obj));
	}
}