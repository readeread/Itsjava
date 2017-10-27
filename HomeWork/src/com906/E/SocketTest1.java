package com906.E;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SocketTest1 {

	public static void main(String[] args) {
		
		Socket socket=null;
		OutputStream os=null;
		try {
			socket=new Socket("127.0.0.1", 8889);

//			while(true)
			{
				new Thread(new ServerRead(socket)).start();
				new Thread(new ServerWrite(socket)).start();
			}
			
			
			/*os=socket.getOutputStream();
			
			Scanner in=new Scanner(System.in);
			while(true)
			{
				String con=in.nextLine();
				os.write(con.getBytes());
			}*/
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
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
		}
	}

}

