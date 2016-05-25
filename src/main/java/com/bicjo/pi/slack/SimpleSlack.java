package com.bicjo.pi.slack;

import org.apache.log4j.Logger;

public class SimpleSlack implements Slack {

	private final Logger LOG = Logger.getLogger(getClass());

	private final String WEBHOOK_URL;

	public SimpleSlack(String webkhookURL) {
		this.WEBHOOK_URL = webkhookURL;
		LOG.debug("webhook: " + WEBHOOK_URL);
	}

	@Override
	public void sendMessage(String message) {
	}

}
