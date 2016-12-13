package org.fengzibin.adb.impl;

import java.util.ArrayList;
import java.util.List;

import org.fengzibin.adb.IDevice;
import org.fengzibin.adb.IResult;

/**
 * @author fengzibin
 */
public final class Result implements IResult {
	byte[] msgBody;
	boolean status;

	protected Result() {
	}

	protected boolean verify(byte[] bytes) {
		if (bytes.length >= 8 && Integer.parseInt(new String(bytes, 4, 4), 16) == bytes.length - 8) {
			if ("OKAY".equals(new String(bytes, 0, 4)))
				status = true;
			else
				status = false;
			msgBody = new byte[bytes.length - 8];
			System.arraycopy(bytes, 8, msgBody, 0, bytes.length - 8);
			
		} else {
			msgBody="error message received! ".getBytes();
			
		}
		return status;
	}

	protected List<IDevice> parseDevice(){
		ArrayList<IDevice> list= new ArrayList<IDevice>();
		String body =new String(msgBody);
		String[] line = body.split("\n");
		for(int i =0;i<line.length;i++){
			String[] pro = line[i].split("\t");
			list.add(new AndroidDevice(pro[i],IDevice.Status.device));
		}
		
		return list;
	}

}
