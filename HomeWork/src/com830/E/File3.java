package com830.E;

import java.io.File;
import java.io.IOException;

//3. �ݹ�ʵ���г���ǰ����������.Java�ļ�����ͳ�Ƴ��ļ�����
public class File3 {

	public static void main(String[] args) {
		// ����һ
		File s=new File("");
		File s1=new File(s.getAbsolutePath());
		try {
			System.out.println(s.getCanonicalPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//������
		String path=System.getProperty("user.dir");//user.dirָ���˵�ǰ��·�� 
		File file=new File(path);
		
		System.out.println("һ���У�"+traval(s1,0));
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
