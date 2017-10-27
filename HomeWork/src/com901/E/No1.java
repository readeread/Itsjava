package com901.E;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class No1 {

	public static void main(String[] args) {
		No1 no1=new No1();
		
		no1.no1();
	}
	
	/*使用BufferedOutputStream类和BufferedInputStream类实现文件复制，即复制
	fos.dat文件为fos_copy3.dat文件*/
	public void no1()
	{
		String path="E:\\HaHa\\fos.dat";
		String path1="E:\\HaHa\\fos_copy3.dat";
		
		FileOutputStream fos=null;
		BufferedOutputStream bos=null;
		FileInputStream fis=null;
		BufferedInputStream bis=null;
		
		try {
			fos = new FileOutputStream(path1);
			System.out.println(fos);
			bos=new BufferedOutputStream(fos);
		
			fis=new FileInputStream(path);
			bis=new BufferedInputStream(fis);
			
			int len=0;
			byte[] s=new byte[1024];
			
			while((len=bis.read(s))!=-1)
			{
				bos.write(s, 0, len);
				bos.flush();
			}
		} catch (FileNotFoundException e) {
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
		
	}
}
