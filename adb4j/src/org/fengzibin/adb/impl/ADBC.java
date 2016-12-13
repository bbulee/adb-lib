package org.fengzibin.adb.impl;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.List;

import org.fengzibin.adb.IADB;
import org.fengzibin.adb.IDevice;
import org.fengzibin.adb.protocol.ICommands;
import org.fengzibin.adb.util.Utility;

/**
 * @author fengzibin
 */
public final class ADBC implements IADB {

	SocketAddress host;
	Socket socket;
	int timeout = 6000;

	public static IADB getNewClient(String ip, int port) {
		return new ADBC(ip, port);
	}

	public static IADB getLocalClient(int port) {
		return new ADBC("127.0.0.1", port);
	}

	private ADBC(String ip, int port) {
		this.setHost(ip, port);
	}

	public void setHost(String ip, int port) {
		this.host = new InetSocketAddress(ip, port);
	}

	@Override
	public Result version() {
		byte[] bytes = send(ICommands.HOST_VERSION);
		System.out.println(new String(bytes));
		return null;
	}

	@Override
	public Result kill() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IDevice> devices() {
		byte[] bytes = send("host:devices");
		Result ret = new Result();
		if (ret.verify(bytes)) {

		}
		return ret.parseDevice();
	}

	/**
	 * 
	 * @param cmd
	 * @return
	 */
	private byte[] send(String cmd) {
		socket = new Socket();
		try {
			socket.connect(host, timeout);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		StringBuffer ret = new StringBuffer();
		DataOutputStream dos = null;
		DataInputStream dis = null;
		try {
			dos = new DataOutputStream(socket.getOutputStream());
			dis = new DataInputStream(socket.getInputStream());
			dos.writeBytes(Utility.getCMDLengthStr(cmd) + cmd);
			int b;
			while ((b = dis.read()) != -1) {
				ret.append((char) b);
			}
			dos.close();
			dis.close();
			socket.close();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			dis = null;
			dos = null;
			socket = null;
		}

		return ret.toString().getBytes();
	}
}
