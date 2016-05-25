package com.bicjo.pi.myip;

public class SimpleWhatIsMyIp implements WhatIsMyIp {

	private final String WHAT_IS_MY_IP_URL;

	public SimpleWhatIsMyIp(String whatIsMyIp) {
		this.WHAT_IS_MY_IP_URL = whatIsMyIp;
	}

	@Override
	public String getPublicIP() {
		// TODO Auto-generated method stub
		return null;
	}

}
