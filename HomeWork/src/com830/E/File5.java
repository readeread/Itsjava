package com830.E;

import java.io.File;
import java.io.FileFilter;

//5. 使用FileFilter过滤器过滤文件夹的文件，只显文件名中包含Array的文件。
public class File5 {

	public static void main(String[] args) {
		File file=new File("E:\\Class\\Day\\8.8day\\");
		
		File[] files=file.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				
					if(pathname.getName().contains("Array"))
						return true;
					else return false;

				
			}
		});		
		files=file.listFiles(h->h.getName().contains("Array"));
		for(File f:files)
		{
			System.out.println(f.getName());
		}
		
		gall(file);
	}
	 
	public static void gall(File file)
	{
		if(file==null&&file.exists())
		{
			System.out.println("不存在滴");
		}
		
		/*if(file.isFile())
		{
			System.out.println("这是个文件");
			return;
		}*/
		
		if(file.getName().contains("Array"))
		{
			System.out.println(file.getName());
		}
		
		
		if(file.isDirectory())
		{
			for(File fd:file.listFiles())
			{
				gall(fd);
			}
		}
		
	}

}
