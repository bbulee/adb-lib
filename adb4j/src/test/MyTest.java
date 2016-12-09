package test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import org.fengzibin.adb.impl.ADBClient;
import org.fengzibin.adb.protocol.ICommands;

public class MyTest {

	public static void main(String[] args) throws UnknownHostException, IOException {
		ADBClient adbc = new ADBClient("127.0.0.1",5037);
		adbc.version();
		adbc.version();
	}

}
