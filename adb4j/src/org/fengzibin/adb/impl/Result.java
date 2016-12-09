package org.fengzibin.adb.impl;
/** 
* @author fengzibin
*/
public final class Result {
	byte[] msg={};
	Result(){
		
	}
	public void append(byte[] newMsg){
		byte[] temp = new byte[msg.length+newMsg.length];
		System.arraycopy(msg, 0, temp, 0, msg.length);
		System.arraycopy(newMsg, 0, temp, msg.length, newMsg.length);
		msg = temp;
	}
	
}
