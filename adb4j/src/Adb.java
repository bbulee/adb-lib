import java.util.List;

/** 
* @author windboy E-mail: 136464153@qq.com
* @version 0.1 
* Adb 
*/
public interface Adb {
	public Result version();
	public Result kill();
	public List<Device> devices();
	public Result trackDevices();
	public Result connectToDevice(Device device);
}
