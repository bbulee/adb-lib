package org.fengzibin.adb.impl;

import org.fengzibin.adb.IADB;

/**
 * @author fengzibin
 */
public class ADBFactory {
	public static IADB getNewClient(String ip, int port) {
		return new ADBC(ip, port);
	}

	public static IADB getLocalClient(int port) {
		return new ADBC("127.0.0.1", port);
	}
}
