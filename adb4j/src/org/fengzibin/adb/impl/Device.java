package org.fengzibin.adb.impl;

import java.io.DataInputStream;
import java.io.DataOutputStream;

import org.fengzibin.adb.Result;

/**
 * @author fengzibin
 */
public abstract class Device implements org.fengzibin.adb.Device {

	private String serialNumber;
	private Status status;

	Device(String serialNumber, Status status) {
		this.serialNumber = serialNumber;
		this.status = status;
	}

	@Override
	public Result shell(String cmd, String... args) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result shell(DataInputStream dis, DataOutputStream dos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSerialNumber() {
		// TODO Auto-generated method stub
		return null;
	}

}
