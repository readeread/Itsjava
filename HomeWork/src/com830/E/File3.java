package com830.E;

import java.io.File;
import java.io.IOException;

//3. 递归实现列出当前工程下所有.Java文件，并统计出文件数。
public class File3 {

	public static void main(String[] args) {
		// 方法一
		File s=new File("");
		File s1=new File(s.getAbsolutePath());
		try {
			System.out.println(s.getCanonicalPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//方法二
		String path=System.getProperty("user.dir");//user.dir指定了当前的路径 
		File file=new File(path);
		
		System.out.println("一共有："+traval(s1,0));
	}

	public static int traval(File file,int a)
	{
		File[] files=file.listFiles();
		
		for(File f:files)
		{
			if(f.isDirectory())
			{
				a=traval(f,a);
			}
			else
			{
				if(f.getName().endsWith(".java"))
				{
					a++;
				}
			}
		}
		return a;
	}
}
