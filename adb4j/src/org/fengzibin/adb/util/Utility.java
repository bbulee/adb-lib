package org.fengzibin.adb.util;
/** 
* @author fengzibin
*/
public final class Utility {
	public static String getCMDLengthStr(String cmd){
		return String.format("%04x", cmd.length());
	}
}
