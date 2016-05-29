package com.bicjo.pi.service.impl;

import org.apache.log4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;

import com.bicjo.pi.service.WhatIsMyIPScheduler;

public class WhatIsMyIPSchedulerImpl implements WhatIsMyIPScheduler {

	private final Logger LOG = Logger.getLogger(getClass());

	@Scheduled(cron = "*/5 * * * * *")
	@Override
	public void checkIp() {
		LOG.debug("schedule working...");
	}

}
