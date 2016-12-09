

/**
 * @author windboy E-mail: 136464153@qq.com
 * @version 0.1 Android Device
 */
public interface Device {

	/**
	 * Run 'command arg1 arg2 ...' in a shell on the device, and return its
	 * output and error streams. Note that arguments must be separated by
	 * spaces. If an argument contains a space, it must be quoted with
	 * double-quotes. Arguments cannot contain double quotes or things will go
	 * very wrong.
	 * 
	 * Note that this is the non-interactive version of "adb shell"
	 * 
	 * @param cmd
	 * @param args
	 * @return
	 * 
	 * 
	 */

	public Result shell(String cmd, String args[]);

	/**
	 * Ask adbd to remount the device's filesystem in read-write mode, instead
	 * of read-only. This is usually necessary before performing an "adb sync"
	 * or "adb push" request.
	 */

	public Result remount();

	/**
	 * Get SN for this devices
	 * 
	 * @return
	 */
	public String getSerialNumber();
	
	public void getTransport();
}
