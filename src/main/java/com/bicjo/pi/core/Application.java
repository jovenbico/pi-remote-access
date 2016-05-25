package com.bicjo.pi.core;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.bicjo.pi.core.config.CoreConfiguration;
import com.bicjo.pi.core.config.IntegrationConfiguration;

@EnableScheduling
@SpringBootApplication(scanBasePackageClasses = { CoreConfiguration.class, IntegrationConfiguration.class })
public class Application {

	private final Logger LOG = Logger.getLogger(Application.class);

	public Application() {
		LOG.debug("application starts...");
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
