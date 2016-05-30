package com.bicjo.pi.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

import com.bicjo.pi.service.WhatIsMyIPScheduler;
import com.bicjo.pi.service.WhatIsMyIPService;

public class WhatIsMyIPSchedulerImpl implements WhatIsMyIPScheduler {

	private final Logger LOG = Logger.getLogger(getClass());

	@Autowired
	private WhatIsMyIPService whatIsMyIPService;

	@Scheduled(cron = "0 0 * * * *") // every hour of every day.
	@Override
	public void checkIp() {
		LOG.info(whatIsMyIPService != null);
		whatIsMyIPService.checkIP();
	}

}
