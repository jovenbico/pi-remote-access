package com.bicjo.pi.slack;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;

public class SimpleSlack implements Slack {

	private final Logger LOG = Logger.getLogger(getClass());

	private final String WEBHOOK_URL;

	public SimpleSlack(String webkhookURL) {
		this.WEBHOOK_URL = webkhookURL;
	}

	@Override
	public void sendMessage(String message) {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost(WEBHOOK_URL);
		CloseableHttpResponse response = null;

		try {

			response = httpclient.execute(httpPost);
			HttpEntity entity = response.getEntity();

			LOG.debug(EntityUtils.toString(entity));

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
	}

}
