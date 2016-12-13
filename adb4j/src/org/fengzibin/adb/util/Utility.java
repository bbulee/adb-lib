package org.fengzibin.adb.util;
/** 
* @author fengzibin
*/
public final class Utility {
	public static String getCmdPrefix(String cmd){
		return String.format("%04x", cmd.length());
	}
}
