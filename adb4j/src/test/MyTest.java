package test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import fengzibin.adb.protocal.ICommands;

public class MyTest {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket as = new Socket("127.0.0.1",5037);
		InputStream is =as.getInputStream();
		OutputStream os = as.getOutputStream();
		os.write(new String("0014host-usb:get-product").getBytes("UTF-8"));
		//os.write(new String("000Chost:devices").getBytes("UTF-8"));
		//os.write(new String("000Cframebuffer:").getBytes("UTF-8"));
		int data;
		StringBuffer sb = new StringBuffer();
		while((data=is.read())!=-1){
			System.out.print((char)data);
		}
		//as.close();
	}

}
