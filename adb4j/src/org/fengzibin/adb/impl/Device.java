package org.fengzibin.adb.impl;

import java.io.DataInputStream;
import java.io.DataOutputStream;

import org.fengzibin.adb.IDevice;
import org.fengzibin.adb.IResult;

/**
 * @author fengzibin
 */
public abstract class Device implements IDevice {

	private String serialNumber;
	private Status status;

	Device(String serialNumber, Status status) {
		this.serialNumber = serialNumber;
		this.status = status;
	}

	@Override
	public IResult shell(String cmd, String... args) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IResult shell(DataInputStream dis, DataOutputStream dos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSerialNumber() {
		return this.serialNumber;
	}

}
