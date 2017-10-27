package com906.E;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class No2_clind {

	public static void main(String[] args) {
		
		Socket socket=null;
		OutputStream os=null;
		InputStream is=null;
		
		try {
			socket=new Socket("localhost",8889);
			
//			while(true)
			{
				new Thread(new ServerReads(socket)).start();
				new Thread(new ServerWrites(socket)).start();
				
			}
			
			/*is=socket.getInputStream();
			os=socket.getOutputStream();
			
			Scanner in=new Scanner(System.in);
			String content=in.nextLine();
			os.write(content.getBytes());
			
			int len=0;
			byte[] b=new byte[1024];
			while((len=is.read(b))!=-1)
			{
				System.out.println(new String(b,0,len));
			}*/
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally 
		{
			System.out.println("111");
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
