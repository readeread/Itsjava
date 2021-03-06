package com906.E;
/*1、 使用基于TCP的Java Socket编程，完成如下功能：
1) 要求从客户端录入几个字符，发送到服务器端。
2) 由服务器端将接收到的字符进行输出。
3) 服务器端向客户端发出“您的信息已收到”作为响应。
4) 客户端接收服务器端的响应信息。*/

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class No1 {

	public static void main(String[] args) {
		ServerSocket ss=null;
		Socket socket=null;
		OutputStream os=null;
		InputStream is=null;
		
		try {
			ss=new ServerSocket(8889);
			socket=ss.accept();
			
			is=socket.getInputStream();
			os=socket.getOutputStream();
			
			int len=0;
			byte[] b=new byte[1024];
			while((len=is.read(b))!=-1)
			{
				System.out.println(new String(b,0,len));
				socket.shutdownInput();
			}
			os.write("我已经收到了".getBytes());
				
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
