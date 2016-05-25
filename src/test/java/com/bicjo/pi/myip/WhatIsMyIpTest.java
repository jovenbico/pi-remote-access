package com.bicjo.pi.myip;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.bicjo.pi.BaseTest;

public class WhatIsMyIpTest extends BaseTest {

	@Autowired
	private WhatIsMyIp whatIsMyIp;

	@Test
	public void getPublicIP_test() {
		LOG.debug(whatIsMyIp.getPublicIP());
		// LOG.debug(whatIsMyIp.getPublicIP());
		// LOG.debug(whatIsMyIp.getPublicIP());
	}
}
