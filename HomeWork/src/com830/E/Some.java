package com830.E;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class Some {
	static int i=0;
	public static void main(String[] args) {
		String path="E:\\Class\\Day\\aa\\";
		
		File file1=new File(path);
		
		File file2=new File(path,"ha.java");
		
		File file3 = null;
		try {
			file3=file2.createTempFile("aas",".tt",file1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		file1.delete();
		file2.delete();
		file3.delete();
		
		/*File[] files=file1.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				return pathname.isDirectory();
			}
		});
		
		
		
		for(File s:files)
		{
			s.delete();
			System.out.println(s);
		}*/

		System.out.println(file2);
		System.out.println(file1);
		deleJava(file1);
	}
	
	public static void dele(File file)
	{
		File[] files=file.listFiles();
		
		for(File f:files)
		{
			if(f.isDirectory())
			{
				dele(f);
			}
			else
			{
				f.delete();
			}
		}
		
		System.out.println(i++);
		file.delete();
	}
	public static void deleJava(File file)
	{
		File[] files=file.listFiles();
		
		for(File f:files)
		{
			if(f.isDirectory())
			{
				deleJava(f);
			}
			else
			{
				if(f.getName().endsWith(".java"))
				{
					System.out.println("hi:--"+f);
				}
			}
		}
		
	}
}
