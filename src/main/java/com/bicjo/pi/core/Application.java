package com.bicjo.pi.core;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bicjo.pi.core.config.CoreConfiguration;
import com.bicjo.pi.core.config.IntegrationConfiguration;

@SpringBootApplication(scanBasePackageClasses = { CoreConfiguration.class, IntegrationConfiguration.class })
public class Application {

	private final Logger LOG = Logger.getLogger(Application.class);

	public Application() {
		LOG.debug("application starts...");
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		// ApplicationContext applicationContext =
		// SpringApplication.run(Application.class, args);
		// String[] beanNames = applicationContext.getBeanDefinitionNames();
		// for (String beanName : beanNames) {
		// LOG.debug("beanName: " + beanName);
		// }
	}

}
