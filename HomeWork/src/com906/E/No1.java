package com906.E;
/*1�� ʹ�û���TCP��Java Socket��̣�������¹��ܣ�
1) Ҫ��ӿͻ���¼�뼸���ַ������͵��������ˡ�
2) �ɷ������˽����յ����ַ����������
3) ����������ͻ��˷�����������Ϣ���յ�����Ϊ��Ӧ��
4) �ͻ��˽��շ������˵���Ӧ��Ϣ��*/

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
			os.write("���Ѿ��յ���".getBytes());
				
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