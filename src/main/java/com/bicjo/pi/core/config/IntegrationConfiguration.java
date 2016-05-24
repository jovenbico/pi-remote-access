package com.bicjo.pi.core.config;

import org.apache.camel.component.slack.SlackComponent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IntegrationConfiguration {

	@Bean
	public SlackComponent slackComponent() {
		SlackComponent component = new SlackComponent();

		component.setWebhookUrl("https://hooks.slack.com/services/");

		return component;
	}

}
