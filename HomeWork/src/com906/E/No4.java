package com906.E;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

/*4��ʹ�û���UDP��Java Socket��̣����������ѯ����
1) �ͻ�����ѯ��Ա��ѯ��
2) ��ѯ��Ա�����ش�
3) �ͻ�����ѯ��Ա����һֱ��ͨ��ֱ���ͻ�����bye����ѯ��Ա��*/
public class No4 {

	public static void main(String[] args) {
		DatagramSocket ds = null;
		try {
			ds=new DatagramSocket(8888);
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		new Thread(new ServerPackage(ds,true)).start();
		new Thread(new ServerPackage(ds,false)).start();
	}

}

class ServerPackage implements Runnable{

	static InetAddress ia;
	static int port;
	static Scanner in=new Scanner(System.in);
	
	boolean mark;
	DatagramSocket ds;
	
	public ServerPackage(DatagramSocket ds, boolean mark) {
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
				System.out.println("ready server read");
				ds.receive(dpIn);
				System.out.println("go");
				String content=new String(dpIn.getData(),0,dpIn.getLength());
				System.out.println(content);
				ia=dpIn.getAddress();
				port=dpIn.getPort();
				
				if(content.equals("bye"))
				{
					ds.close();
				}
				
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void send()
	{
		
		DatagramPacket dpOut=null;
		try {
			
			while(true)
			{
				System.out.println("server send ready");
				String content=in.nextLine();
				System.out.println("server send go");
				
				if(ia==null)
				{
					System.out.println("nulll!!!");
					continue;
				}
				System.out.println("buxing ");
				
				byte[] b=content.getBytes();
				dpOut=new DatagramPacket(b, b.length, ia, port);
				
				ds.send(dpOut);
			}
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}