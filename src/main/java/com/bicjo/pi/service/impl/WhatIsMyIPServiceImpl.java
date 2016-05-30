package com.bicjo.pi.service.impl;

import java.util.concurrent.atomic.AtomicReference;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
		String ip = currentIP.get();

		String publicIP = whatIsMyIp.getPublicIP();

		if (!publicIP.equals(ip)) {
			currentIP.set(publicIP);
			slack.sendMessage("new public IP: " + publicIP);
		}
	}

}
