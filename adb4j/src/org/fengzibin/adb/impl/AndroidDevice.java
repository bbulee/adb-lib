package org.fengzibin.adb.impl;

import java.io.DataInputStream;
import java.io.DataOutputStream;

import org.fengzibin.adb.Result;

/** 
* @author fengzibin
*/
public final class AndroidDevice extends Device {

	private AndroidDevice(String serialNumber, Status status) {
		super(serialNumber, status);
		// TODO Auto-generated constructor stub
	}

}
