package com831.E;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Some {

	public static void main(String[] args) {
		String path="E:\\Class\\Day\\aa\\hello.txt";
		File file1=new File(path);
		
		byte[] by="I love java!".getBytes();
		byte[] by1="I °® java!".getBytes();
		FileOutputStream w=null;
		
		
		
			try {
				w=new FileOutputStream(file1);
				w.write(by);
				w.write(by1);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				if(w!=null)
				{
					try {
						w.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
			byte[] b=new byte[1024];
			FileInputStream in = null;
			try {
				in = new FileInputStream(file1);
				int len=0;
				while((len=in.read(b))!=-1)
				{
					System.out.println(new String(b));
				}
								
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				if(in!=null)
				{
					try {
						in.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		
	}

}
