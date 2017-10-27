package com906.E;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UTDTest {

	public static void main(String[] args) {
		DatagramSocket ds=null;
		DatagramPacket dp=null;		
		DatagramPacket dpout=null;
		
		try {
			ds=new DatagramSocket(9999);
			
			byte[] b=new byte[4028];
		
			dp=new DatagramPacket(b, b.length);
			
			ds.receive(dp);
			
			String content=new String(dp.getData(),0,dp.getLength());
			System.out.println(content);
			
			byte[] outdata="�յ� лл".getBytes();
			dpout=new DatagramPacket(outdata, outdata.length, dp.getAddress(),dp.getPort());
			ds.send(dpout);
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
