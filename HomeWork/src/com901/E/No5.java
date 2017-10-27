package com901.E;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/*�����ļ���d:/hcjava���������ļ������ļ������ݵ�d:/hcjava_copy������ʾ���漰��
���ļ����ơ�Ŀ¼�Ĵ������ݹ��ʹ�ã�*/
public class No5 {

	public static void main(String[] args) {
		No5 n=new No5();
		File dest=new File("E:\\HaHa\\");
		File src=new File("E:\\HaHa_copy\\");
		n.traval(dest,src);
	}
	
	public void traval(File file,File src) 
	{
		File[] files=file.listFiles();
		for(int i=0;i<files.length;i++)
		{
			if(files[i].isDirectory())
			{
				String str=files[i].getName();
				File scr1=new File(src.getAbsolutePath()+"\\"+str+"\\");
//				System.out.println(scr1.getAbsolutePath());
				scr1.mkdirs();
				traval(new File(files[i].getAbsolutePath()+"\\"),scr1);
			}
			else
			{

					RandomAccessFile raf=null;
					RandomAccessFile raf1=null;
					
					
					try {
						raf=new RandomAccessFile(files[i], "r");
						String str=src.getAbsolutePath()+"\\"+files[i].getName();
						File f=new File(str);
						f.createNewFile();
						raf1=new RandomAccessFile(f, "rw");
						
						int len=0;
						byte[] b=new byte[1024];
						while((len=raf.read(b))!=-1)
						{
							raf1.write(b, 0, len);
						}
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}
			}
		}
	}
}
