package com905.E;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Some1 {
	public static void main(String[] args) {
		URL url;
		InputStream is=null;
		BufferedInputStream bis=null;
		BufferedOutputStream bos=null;
		OutputStream os=null;
		long t=System.currentTimeMillis();
		try {
//			url = new URL("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1504614205584&di=c657832e92844378c3e8651f00dd6cf6&imgtype=0&src=http%3A%2F%2Fpic.jj20.com%2Fup%2Fallimg%2F811%2F0Z514102309%2F140Z5102309-2.jpg");
			url=new URL("http://dl142.80s.im:920/1709/[妖S记]第35集/[妖S记]第35集_bd.mp4");
			
//			URLConnection urlc=url.openConnection();
			
			is=url.openStream();
//			is=new FileInputStream("E:\\BaiduNetdiskDownload\\第8章：泛型(day14).zip");
			bis=new BufferedInputStream(is);
			
			os=new FileOutputStream("D:\\quanli.mp4");
			bos=new BufferedOutputStream(os);
			
			int len=0;
			byte[] b=new byte[1024];
			
			while((len=bis.read(b))!=-1)
			{
				bos.write(b, 0, len);
			}
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(bos!=null)
			{
				try {
					bos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(bis!=null)
			{
				try {
					bis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		System.out.println(System.currentTimeMillis()-t);
		File fiel=new File("E:\\\\BaiduNetdiskDownload\\");
		long s=fiel.length();
		System.out.println(s);
	}
}
