package com830.E;

import java.io.File;
import java.io.IOException;

/*在电脑D盘下创建一个文件为HelloWorld.txt文件，判断他是文件还是目录，在创建一
个目录IOTest,之后将HelloWorld.txt移动到IOTest目录下去；之后遍历IOTest这个目录下
的文件*/

public class File1 {
	public static void main(String[] args) {
		String path="D:\\";
		File file1=new File(path);		
		
		File file2=new File(file1,"HelloWorld.txt");
		try {
			file2.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		if(file2.isFile())
		{
			System.out.println("这是个文件");
		}else
		{
			System.out.println("这是个文件夹");
		}
		
		
		//wenjian
		File file3=new File(path,"IOTest\\");
		file3.mkdir();
		
		System.out.println(file3);
		System.out.println(file2.renameTo(new File(file3+"\\\\"+file2.getName())));
		
		traval(file3);
	}
	
	public static void traval(File file)
	{
		File[] files=file.listFiles();
		
		for(File f:files)
		{
			if(f.isDirectory())
			{
				traval(f);
			}
			else
			{
				System.out.println(f.getName());
			}
		}
	}
	
}
