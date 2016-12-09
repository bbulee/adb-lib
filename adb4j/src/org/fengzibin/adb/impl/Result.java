package org.fengzibin.adb.impl;

import java.util.List;

import org.fengzibin.adb.IDevice;

/**
 * @author fengzibin
 */
public final class Result implements org.fengzibin.adb.IResult {
	byte[] msgBody;
	boolean status;

	public Result() {
	}

	public boolean verify(byte[] bytes) {
		if (bytes.length >= 8 && Integer.parseInt(new String(bytes, 4, 4), 16) == bytes.length - 8) {
			if ("OKAY".equals(new String(bytes, 0, 4)))
				status = true;
			else
				status = false;
			msgBody = new byte[bytes.length - 8];
			System.arraycopy(bytes, 8, msgBody, 0, bytes.length - 8);
			return true;
		} else {
			return false;
		}

	}

	public List<IDevice> parseDevice(){
		return null;
	}

}
