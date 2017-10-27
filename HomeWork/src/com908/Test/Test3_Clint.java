package com908.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Test3_Clint {

	public static void main(String[] args) {
		Socket socket=null;
		FileInputStream fis=null;
		OutputStream os=null;
		
		try {
			socket=new Socket("127.0.0.1", 6666);
			
			fis=new FileInputStream("E:\\j.jpg");
			os=socket.getOutputStream();
			
			int len=0;
			byte[] b=new byte[1024];
			while((len=fis.read(b))!=-1)
			{
				os.write(b,0,len);
			}

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
			if(os!=null)
			{
				try {
					os.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(fis!=null)
			{
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	}

}