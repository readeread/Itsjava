package com830.E;

import java.io.File;
import java.io.IOException;

/*�ڵ���D���´���һ���ļ�ΪHelloWorld.txt�ļ����ж������ļ�����Ŀ¼���ڴ���һ
��Ŀ¼IOTest,֮��HelloWorld.txt�ƶ���IOTestĿ¼��ȥ��֮�����IOTest���Ŀ¼��
���ļ�*/

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
			System.out.println("���Ǹ��ļ�");
		}else
		{
			System.out.println("���Ǹ��ļ���");
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
