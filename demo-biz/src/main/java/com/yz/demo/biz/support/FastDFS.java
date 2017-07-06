package com.yz.demo.biz.support;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.alibaba.fastjson.JSONObject;
import com.chinaredstar.perseus.utils.JsonUtil;

@Service("fastDFS")
public class FastDFS {

	@Value("${fastDFS.url}")
	private String url;
	@Value("${fastDFS.appName}")
	private String appName;
	
	public String fastDFS(InputStream inputStream, final long a, final String fileName,
			RestTemplate restTemplate, String userId) {
		MultiValueMap map = new LinkedMultiValueMap<>();
		map.add("userId", userId);
		map.add("appName", appName);
		map.add("file", new InputStreamResource(inputStream) {
			@Override
			public String getFilename() {
				return fileName;
			}

			@Override
			public long contentLength() throws IOException {
				return a;
			}
		});
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.MULTIPART_FORM_DATA);
		HttpEntity entity = new HttpEntity(map, headers);
		ResponseEntity<Object> resultResponseEntity = restTemplate.postForEntity(url, entity, Object.class);
		Object result = resultResponseEntity.getBody();
		String json = JsonUtil.toJson(result, true);
		return json;
	}

	/**
	 * json处理
	 * 
	 * @param data
	 * @return
	 */
	public static String jsonManage(String data, String key) {
		String fileUrl = "";
		JSONObject parseObject = JSONObject.parseObject(data);
		if (parseObject != null) {
			String value = parseObject.getString("value");
			JSONObject jsonObject = JSONObject.parseObject(value);
			if (jsonObject != null) {
				fileUrl = jsonObject.getString(key);
			}
		}
		return fileUrl;
	}
}
