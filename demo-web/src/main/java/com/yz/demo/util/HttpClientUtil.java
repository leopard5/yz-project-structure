package com.yz.demo.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class HttpClientUtil {
	public static String httpPost(String url, Map<String, String> map) throws Exception {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		// 创建httppost
		HttpPost httppost = new HttpPost(url);

		// 创建参数队列
		List<NameValuePair> formParams = new ArrayList<NameValuePair>();
		for (Map.Entry<String, String> entry : map.entrySet()) {
			formParams.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
		}
		UrlEncodedFormEntity uefEntity = new UrlEncodedFormEntity(formParams, "UTF-8");
		httppost.setEntity(uefEntity);
		CloseableHttpResponse response = httpclient.execute(httppost);
		HttpEntity entity = response.getEntity();
		if (entity != null) {
			return EntityUtils.toString(entity, "UTF-8");
		}
		return null;
	}
}
