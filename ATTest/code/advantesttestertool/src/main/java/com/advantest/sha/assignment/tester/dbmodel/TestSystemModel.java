package com.advantest.sha.assignment.tester.dbmodel;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import com.advantest.sha.assignment.tester.utils.SupportedOS;

public class TestSystemModel {
	private String id;
	private String name;
	private SupportedOS supportedOS;
	private boolean isBusy;
	private Map<String, DeviceModel> devices;

	private TestSystemModel() {
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public SupportedOS getSupportedOS() {
		return supportedOS;
	}

	public boolean isBusy() {
		return isBusy;
	}

	public Map<String, DeviceModel> getDevices() {
		return devices;
	}

	public void setBusy(final boolean isBusy) {
		this.isBusy = isBusy;
	}

	public static class Builder {
		private String id;
		private String name;
		private SupportedOS supportedOS;
		private Map<String, DeviceModel> devices;

		public Builder(final SupportedOS supportedOS) {
			this.id = UUID.randomUUID().toString();
			this.supportedOS = supportedOS;
			this.devices = new HashMap<>();
		}

		public Builder withName(final String name) {
			this.name = name;
			return this;
		}

		public Builder addDevice(final DeviceModel device) {
			this.devices.put(device.getName(), device);
			return this;
		}

		public TestSystemModel build() {
			TestSystemModel testSystem = new TestSystemModel();
			testSystem.id = this.id;
			testSystem.name = this.name;
			testSystem.supportedOS = this.supportedOS;
			testSystem.devices = this.devices;
			return testSystem;
		}
	}
}
