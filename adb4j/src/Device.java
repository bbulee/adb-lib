import java.io.DataInputStream;
import java.io.DataOutputStream;

/** 
* @author fengzibin
*/
public interface Device {
	
	public Result shell(String cmd, String... args);
	
	public Result shell(DataInputStream dis,DataOutputStream dos);
	
	public String getSerialNumber();
}
