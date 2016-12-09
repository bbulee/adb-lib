package org.fengzibin.adb.protocol;
/** 
* @author windboy E-mail: 136464153@qq.com
* @version 0.1 
*/
public interface IServices {
	public Object execute(String cmd);
	public Object execute(String cmd ,String arg1);
	public Object execute(String cmd ,String arg1,String arg2);
}
