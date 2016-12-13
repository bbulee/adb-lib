package org.fengzibin.adb.protocol;
/** 
* @author fengzibin
*/
public interface IServices {
	public Object execute(String cmd);
	public Object execute(String cmd ,String arg1);
	public Object execute(String cmd ,String arg1,String arg2);
}
