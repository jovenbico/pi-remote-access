package com.bicjo.pi.core.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.bicjo.pi.slack.SimpleSlack;
import com.bicjo.pi.slack.Slack;

@Configuration
@PropertySource("classpath:slack.properties")
public class IntegrationConfiguration {

	@Autowired
	Environment env;

	@Bean
	public Slack slack() {
		Slack slack = new SimpleSlack(env.getProperty("webhook.url"));
		return slack;
	}

}
