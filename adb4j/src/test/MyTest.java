package test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import org.fengzibin.adb.IADB;
import org.fengzibin.adb.impl.ADBClient;
import org.fengzibin.adb.protocol.ICommands;

public class MyTest {

	public static void main(String[] args) throws UnknownHostException, IOException {
		IADB adbc = new ADBClient("localhost",5037);
		adbc.version();
		adbc.version();
		adbc.devices();
		System.out.println("090abd9f	device\n".length());
	}

}
