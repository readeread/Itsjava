package com830.E;

import java.io.File;
import java.io.FileFilter;

//5. ʹ��FileFilter�����������ļ��е��ļ���ֻ���ļ����а���Array���ļ���
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
			System.out.println("�����ڵ�");
		}
		
		/*if(file.isFile())
		{
			System.out.println("���Ǹ��ļ�");
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
