package com.bicjo.pi.service.impl;

import java.util.concurrent.atomic.AtomicReference;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.bicjo.pi.myip.WhatIsMyIp;
import com.bicjo.pi.service.WhatIsMyIPService;
import com.bicjo.pi.slack.Slack;

@Service
public class WhatIsMyIPServiceImpl implements WhatIsMyIPService {

	private AtomicReference<String> currentIP = new AtomicReference<>();

	@Autowired
	private WhatIsMyIp whatIsMyIp;

	@Autowired
	private Slack slack;

	@Override
	public void checkIP() {
		String publicIP = whatIsMyIp.getPublicIP();

		if (isPublicIPChange(publicIP)) {
			currentIP.set(publicIP);
			sendSlackNotification(publicIP);
		}
	}

	private boolean isPublicIPChange(String publicIP) {
		boolean hasChanged = false;
		String ip = currentIP.get();

		if (!StringUtils.isEmpty(publicIP)) {
			hasChanged = !publicIP.equals(ip);
		}

		return hasChanged;
	}

	private void sendSlackNotification(String publicIP) {
		slack.sendMessage("The public IP: " + publicIP);
	}

}
