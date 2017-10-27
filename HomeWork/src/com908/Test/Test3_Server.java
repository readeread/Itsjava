package com908.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*3、编写一个TCP服务端和客户端，实现如下功能：
（1）、客户端把文件上传到服务器。
（2）、服务端把客户端上传上来的文件进行保存。*/

public class Test3_Server {

	public static void main(String[] args) {
		ServerSocket ss=null;
		Socket socket=null;
		InputStream is=null;
		FileOutputStream fos=null;
		File file=null;
		
		try {
			ss=new ServerSocket(6666);
			socket=ss.accept();
			
			is=socket.getInputStream();
			file=new File("E:\\jjj.jpg");
			fos=new FileOutputStream(file);
			
			int len=0;
			byte[] b=new byte[1024];
			
			while((len=is.read(b))!=-1)
			{
				System.out.println(new String(b,0,len));
				fos.write(b, 0, len);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(socket!=null)
			{
				try {
					socket.close();
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
			if(fos!=null)
			{
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
