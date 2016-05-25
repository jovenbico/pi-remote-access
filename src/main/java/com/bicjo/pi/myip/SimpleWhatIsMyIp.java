package com.bicjo.pi.myip;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class SimpleWhatIsMyIp implements WhatIsMyIp {

	// private final Logger LOG = Logger.getLogger(getClass());
	private final String WHAT_IS_MY_IP_URL;

	public SimpleWhatIsMyIp(String whatIsMyIp) {
		this.WHAT_IS_MY_IP_URL = whatIsMyIp;
	}

	@Override
	public String getPublicIP() {
		String publicIP = null;

		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpGet httpget = new HttpGet(WHAT_IS_MY_IP_URL);
		CloseableHttpResponse response = null;

		try {

			response = httpclient.execute(httpget);
			HttpEntity entity = response.getEntity();

			publicIP = EntityUtils.toString(entity);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (response != null) {
				try {
					response.close();
				} catch (IOException e) {
				}
			}
		}

		return publicIP;
	}

}
