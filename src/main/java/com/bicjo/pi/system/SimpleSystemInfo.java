package com.bicjo.pi.system;

import java.io.IOException;

import com.pi4j.system.SystemInfo;

public class SimpleSystemInfo {

	public void temperatureInfo() {
		try {
			// TODO refactor system-info
			SystemInfo.getCpuTemperature();
		} catch (NumberFormatException | IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}

}
