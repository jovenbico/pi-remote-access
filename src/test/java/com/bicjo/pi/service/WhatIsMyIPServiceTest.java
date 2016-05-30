package com.bicjo.pi.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.bicjo.pi.BaseTest;

public class WhatIsMyIPServiceTest extends BaseTest {

	@Autowired
	private WhatIsMyIPService whatIsMyIPService;

	@Test
	public void checkIP_test() {
		assertNotNull(whatIsMyIPService);

		whatIsMyIPService.checkIP();
	}
}
