package com906.E;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

/*4、使用基于UDP的Java Socket编程，完成在线咨询功能
1) 客户向咨询人员咨询。
2) 咨询人员给出回答。
3) 客户和咨询人员可以一直沟通，直到客户发送bye给咨询人员。*/
public class No4_UDPother {

	public static void main(String[] args) {
		DatagramSocket ds = null;
		try {
			ds=new DatagramSocket(8889);
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		new Thread(new ClindPackage(ds,true)).start();
		new Thread(new ClindPackage(ds,false)).start();
	}

}

class ClindPackage implements Runnable{
	static InetAddress ia;
	static int port;
	static Scanner in=new Scanner(System.in);
	
	DatagramSocket ds;
	boolean mark;
	
	
	public ClindPackage(DatagramSocket ds, boolean mark) {
		this.ds = ds;
		this.mark = mark;
	}

	@Override
	public void run() {
		if(mark)
		{
			receive();
		}
		else
		{
			send();
		}
	}
	
	public void receive()
	{
		byte[] b=new byte[4028];
		DatagramPacket dpIn=null;
		dpIn=new DatagramPacket(b, b.length);
		
		try {
			while(true)
			{
				System.out.println("clind read ready");
				ds.receive(dpIn);
				System.out.println("clind read go");
				String content=new String(dpIn.getData(),0,dpIn.getLength());
				System.out.println(content);
				
				ia=dpIn.getAddress();
				port=dpIn.getPort();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void send()
	{
		
		DatagramPacket dpOut=null;
		InetAddress ias=null;
		try {
			
			while(true)
			{
				System.out.println("ready clind send");
				String content=in.nextLine();
				System.out.println("clind send go");
				
				byte[] b=content.getBytes();
				if(ia==null)
				{
//					System.out.println("nu;;;;;;");
					ias=InetAddress.getLocalHost();
					dpOut=new DatagramPacket(b, b.length, ias, 8888);
				}
				else
				{
//					System.out.println("other   00000");
					System.out.println(ia+"   "+port);
					dpOut=new DatagramPacket(b, b.length, ia, port);
				}
//				System.out.println("clind final");
				ds.send(dpOut);
				
				
				if(content.equals("bye"))
				{
					ds.close();
				}
			}
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}