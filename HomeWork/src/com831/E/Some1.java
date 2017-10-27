package com831.E;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Some1 {

	public static void main(String[] args) {
		String str="E:\\Class\\Day\\aa\\hello.txt";
		String str1="E:\\BaiduNetdiskDownload\\µÚ10ÕÂ£ºIO(day15-day16).zip";
//		fwd(str1);
		long t=System.currentTimeMillis();
		frd(str1);     
		System.out.println(System.currentTimeMillis()-t);
	}
	
	public static void frd(String strss)
	{
		
		FileReader frd=null;
		try {
			System.out.println("ÕæµÄÂð£¿"+strss);
			File file=new File(strss);
			frd=new FileReader(file);
			char[] cbu=new char[1024];
			
			int len=0;
			while((len=frd.read(cbu))!=-1)
			{
				fwd(new String(cbu,0,len));
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(frd!=null)
			{
				try {
					frd.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void fwd(String str)
	{
		FileWriter fwd=null;
		try {
			String str1="E:\\BaiduNetdiskDownload\\dadele.zip";
			fwd=new FileWriter(str1);
			
			fwd.append(str);
//			fwd.append("hahahahahahahhaahahahahahahah");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fwd!=null)
			{
				try {
					fwd.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}


}
