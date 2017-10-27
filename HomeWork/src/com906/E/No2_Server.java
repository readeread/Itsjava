package com906.E;
//2、单对单聊天，直到其中一方，输入bye时结束对话。

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class No2_Server {

	public static void main(String[] args) {
		ServerSocket ss=null;
		Socket socket=null;
		OutputStream os=null;
		InputStream is=null;
		
		try {
			ss=new ServerSocket(8889);
//			while(true)
			{
				socket=ss.accept();
				
				new Thread(new ServerReads(socket)).start();
				new Thread(new ServerWrites(socket)).start();
				
			}
			
			/*is=socket.getInputStream();
			os=socket.getOutputStream();
			
			int len=0;
			byte[] b=new byte[1024];
			while((len=is.read(b))!=-1)
			{
				System.out.println(new String(b,0,len));
				socket.shutdownInput();
				os.write("我已经收到了".getBytes());
			}*/
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally 
		{
			System.out.println("444");
			/*if(socket!=null)
			{
				try {
					socket.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}*/
			if(os!=null)
			{
				try {
					os.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(is!=null)
			{
				try {
					is.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}
}

class ServerReads implements Runnable{
	Socket socket;
	
	public ServerReads(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		InputStream is=null;
		
		try {
			is=socket.getInputStream();
			
			int len=0;
			byte[] b=new byte[1024];
			
			while((len=is.read(b))!=-1)
			{
				String str=new String(b,0,len);
				System.out.println(str);
				if(str.equals("bye"))
				{
//					ServerWrites.in.close();
					System.out.println("关闭了input");
					socket.shutdownInput();
//					socket.shutdownOutput();
				}
			}
			return;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}/*finally {
			System.out.println("222");
			if(is!=null)
			{
				try {
					is.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(socket!=null)
			{
				try {
					socket.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}*/
		
	}
	
}

class ServerWrites implements Runnable{
	Socket socket;
	static Scanner in=new Scanner(System.in);
	
	public ServerWrites(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		OutputStream os=null;
		
		try {
			os=socket.getOutputStream();
			
			while(true)
			{
				if(socket.isClosed())
				{
					
					System.out.println("你猜");
					return;
				}

				String con=in.nextLine();
				os.write(con.getBytes());
				
				if(con.equals("bye"))
				{
					in.close();
					System.out.println("关闭了output");
					socket.shutdownOutput();
//					socket.shutdownInput();
					return;
				}
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("333");
			if(os!=null)
			{
				try {
					os.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(socket!=null)
			{
				try {
					socket.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
