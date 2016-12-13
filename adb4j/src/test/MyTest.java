package test;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.List;

import org.fengzibin.adb.IADB;
import org.fengzibin.adb.IDevice;
import org.fengzibin.adb.impl.ADBC;

public class MyTest {

	public static void main(String[] args) throws UnknownHostException, IOException {
		IADB adbc = ADBC.getLocalClient(5037);
		List<IDevice> list = adbc.devices();
		for (IDevice device : list) {
			System.out.println(device.getSerialNumber());
		}
	}

}
