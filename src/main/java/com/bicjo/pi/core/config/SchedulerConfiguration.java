package com.bicjo.pi.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.bicjo.pi.service.WhatIsMyIPScheduler;
import com.bicjo.pi.service.impl.WhatIsMyIPSchedulerImpl;

@Configuration
@EnableScheduling
public class SchedulerConfiguration {

	@Bean
	public WhatIsMyIPScheduler whatIsMyIPScheduler() {
		return new WhatIsMyIPSchedulerImpl();
	}

}
