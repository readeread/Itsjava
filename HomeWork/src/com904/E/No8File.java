package com904.E;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*��дһ��FileCopy�࣬���Խ��ж��̸߳����ļ������Ѹ����ļ����ȣ�ʹ�ðٷֱ���ʾ
������ע�⣬������˵�Ķ��̲߳�����ʹ�ö��̸߳���ͬһ���ļ������ǿ���ʹ�����
FileCopy������ͬʱ���ƶ���ļ�����ʾ�� ��FileCopy�࣬�����ΪThread�����
�࣬��run��������ʵ�ָ��ƵĹ��ܡ� FileCopy���У����������ԣ�һ����src Դ�ļ���
һ����destĿ���ļ�*/
public class No8File {

	public static void main(String[] args) {
		FileCopy fc1=new FileCopy(new File("E:\\HaHa\\haha.zip"),new File("E:\\\\BaiduNetdiskDownload\\\\��8�£�����(day14).zip"));
		FileCopy fc2=new FileCopy(new File("E:\\HaHa\\hahaa.zip"),new File("E:\\\\BaiduNetdiskDownload\\\\��8�£�����(day14).zip"));
		fc1.start();
		fc2.start();
	}

}

class FileCopy extends Thread{
	private File dest;
	private File src;
	
	public FileCopy(File dest, File src) {
		this.dest = dest;
		this.src = src;
	}
	
	@Override
	public void run() {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		try {
			fis=new FileInputStream(src);
			fos=new FileOutputStream(dest);
			
			long leng=src.length();
			long leng1=0;
			double lengs=0;
			int len=0;
			byte[] bytes=new byte[1024];
			
			while((len=fis.read(bytes))!=-1)
			{
				fos.write(bytes, 0, len);
				
				leng1+=len;
				lengs=((double)leng1/(double)leng)*100;

				System.out.printf("%s,��ǰ�Ľ���Ϊ��%9.2f%% \n",Thread.currentThread().getName(),lengs);
//				System.out.println(Thread.currentThread().getName()+"��ǰ�Ľ���Ϊ��"+lengs+"%");
				
				if(leng==leng1)
				{
					System.out.println("done!!!");
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}