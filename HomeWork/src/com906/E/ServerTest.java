package com906.E;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerTest {

	public static void main(String[] args) {
		ServerSocket ss=null;
		Socket socket=null;
		
		try {
			ss=new ServerSocket(8889);
			
			while(true)
			{
				System.out.println("i'am server");
				socket=ss.accept();
				
				
				new Thread(new ServerRead(socket)).start();
				new Thread(new ServerWrite(socket)).start();
				
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally 
		{
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

class ServerRead implements Runnable{
	Socket socket;
	
	public ServerRead(Socket socket) {
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
				System.out.println(new String(b,0,len));
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
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

class ServerWrite implements Runnable{
	Socket socket;

	public ServerWrite(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		OutputStream os=null;
		
		try {
			os=socket.getOutputStream();
			
			Scanner in=new Scanner(System.in);
			
			while(true)
			{
				String con=in.nextLine();
				os.write(con.getBytes());
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(os!=null)
			{
				try {
					os.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}