package com901.E;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

//2. ʹ��UTF-8�ı��룬����ַ����������ı��ļ�utf8.dat������Ϊ����ǰ���¹⡱ ��
//3. ʹ��UTF-8�ı��룬��ȡutf8.dat�����ݣ�����ӡ��ʾ��
public class No2 {

	public static void main(String[] args) {
		OutputStream os=null;
		OutputStreamWriter osw=null;
		InputStream is=null;
		InputStreamReader isr=null;
		try {
			os = new FileOutputStream("E:\\HaHa\\utf8.dat");
			osw=new OutputStreamWriter(os, "UTF-8");
			
			is=new FileInputStream("E:\\\\HaHa\\\\utf8.dat");
			isr=new InputStreamReader(is,"UTF-8");
			
			String str="��ǰ���¹�";
			
			osw.write(str);
			osw.flush();//ˢ��
			
			int len=0;
			char[] ch=new char[1024];
			while((len=isr.read())!=-1)
			{
				System.out.print((char)len);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(osw!=null)
			{
				try {
					osw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(isr!=null)
			{
				try {
					isr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}