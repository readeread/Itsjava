package com906.E;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UTDTest2 {

	public static void main(String[] args) {
		DatagramSocket ds=null;
		DatagramPacket dp=null;
		
		DatagramPacket dpout=null;
		InetAddress ia=null;
		
		try {
			ds=new DatagramSocket(9998);
			ia=InetAddress.getLocalHost();

			
			byte[] outdata="hello i'am god".getBytes();
			dpout=new DatagramPacket(outdata, outdata.length, ia,9999);
			ds.send(dpout);
			
			byte[] b=new byte[4028];
			dp=new DatagramPacket(b, b.length);
			ds.receive(dp);
			String content=new String(dp.getData(),0,dp.getLength());
			System.out.println(content);
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
