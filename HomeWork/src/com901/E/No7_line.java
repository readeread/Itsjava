package com901.E;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class No7_line {
	public static void main(String[] args) {
		No7_line line=new No7_line();
		File file=new File(System.getProperty("user.dir"));
//		line.traval(file,0);
		System.out.println("i "+line.traval(file,0));
	}

	public int traval(File file,int a) 
	{
		File[] files=file.listFiles();
		for(int i=0;i<files.length;i++)
		{
			if(files[i].isDirectory())
			{
				a=traval(files[i],a);
			}
			else
			{
				if(files[i].getName().endsWith(".java"))
				{
					RandomAccessFile raf=null;
					
					try {
						raf=new RandomAccessFile(files[i], "r");
						
						while((raf.readLine())!=null)
						{
//							this.i++;
							a++;
							
						}
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
		return a;
	}
}
