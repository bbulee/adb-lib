package org.fengzibin.adb;

import java.util.List;

/**
 * @author fengzibin
 */
public interface IADB {

	public void setHost(String hostIp, int port);

	/**
	 * get adb version
	 * @return
	 */
	public String version();

	/**
	 * kill adb-server
	 * @return
	 */
	public void kill();

	
	/**
	 * list all devices attached
	 * @return
	 */
	public List<IDevice> devices();
}
