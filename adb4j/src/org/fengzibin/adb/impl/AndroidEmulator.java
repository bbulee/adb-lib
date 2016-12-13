package org.fengzibin.adb.impl;

import java.io.DataInputStream;
import java.io.DataOutputStream;

import org.fengzibin.adb.IResult;

/** 
* @author fengzibin
*/
public final class AndroidEmulator extends Device {

	AndroidEmulator(String serialNumber, Status status) {
		super(serialNumber, status);
	}

	

}
