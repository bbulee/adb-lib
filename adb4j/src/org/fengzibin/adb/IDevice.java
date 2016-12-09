package org.fengzibin.adb;

import java.io.DataInputStream;
import java.io.DataOutputStream;

/**
 * @author fengzibin
 */
public interface IDevice {
	enum Status {
device;
	}

	public IResult shell(String cmd, String... args);

	public IResult shell(DataInputStream dis, DataOutputStream dos);

	public String getSerialNumber();
}
