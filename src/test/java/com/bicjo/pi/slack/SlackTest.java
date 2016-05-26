package com.bicjo.pi.slack;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.bicjo.pi.BaseTest;

public class SlackTest extends BaseTest {

	@Autowired
	private Slack slack;

	@Test
	public void sendMessage_ok() {
		slack.sendMessage("pi-slack-bot");
	}

}
