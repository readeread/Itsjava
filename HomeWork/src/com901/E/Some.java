package com901.E;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Some {

	public static void main(String[] args) {
		Some some=new Some();
		String path="E:\\HaHa\\¹��.txt";
		
		
//		some.o1(path);
		some.o2();
	}
	
	public void o2()
	{
		Properties ppt=new Properties();
		ppt.setProperty("zhang", "151551");
		ppt.setProperty("san", "151551");
		ppt.setProperty("feng", "151551");
		
		OutputStream os = null;
		try {
			os = new FileOutputStream("phone.properties");
			ppt.store(os, "�绰����");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		Properties ppt1=new Properties();
		InputStream is=null;
		try {
			is = new FileInputStream("phone.properties");
			
			ppt1.load(is);
			
			System.out.println(ppt1.getProperty("zhang","aa"));
			System.out.println(ppt1.getProperty("san","aa"));
			System.out.println(ppt1.getProperty("an","aa"));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
	}
	
	public void o1(String path)
	{
		FileReader fr=null;
		BufferedReader br = null;
		FileWriter fw=null;
		BufferedWriter bw=null;
		
		String path1=path.replaceAll("\\.", "_copy.");
		System.out.println(path1);
		
		try {
			fr = new FileReader(path);
			br=new BufferedReader(fr);
			
			fw=new FileWriter(path1);
			bw=new BufferedWriter(fw);
			
			int len=0;
			
			while((len=br.read())!=-1)
			{
				bw.write((char)len);
			}
			
//			bw.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			if(br!=null)
			{
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(fr!=null)
			{
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}if(bw!=null)
			{
				try {
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(fw!=null)
			{
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}

}
