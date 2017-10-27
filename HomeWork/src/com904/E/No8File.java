package com904.E;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*编写一个FileCopy类，可以进行多线程复制文件。并把复制文件进度，使用百分比显示
出来。注意，这里所说的多线程并不是使用多线程复制同一个文件，而是可以使用这个
FileCopy，可以同时复制多个文件。提示： 把FileCopy类，定义成为Thread类的子
类，在run方法里面实现复制的功能。 FileCopy类中，有两个属性，一个是src 源文件，
一个是dest目标文件*/
public class No8File {

	public static void main(String[] args) {
		FileCopy fc1=new FileCopy(new File("E:\\HaHa\\haha.zip"),new File("E:\\\\BaiduNetdiskDownload\\\\第8章：泛型(day14).zip"));
		FileCopy fc2=new FileCopy(new File("E:\\HaHa\\hahaa.zip"),new File("E:\\\\BaiduNetdiskDownload\\\\第8章：泛型(day14).zip"));
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

				System.out.printf("%s,当前的进度为：%9.2f%% \n",Thread.currentThread().getName(),lengs);
//				System.out.println(Thread.currentThread().getName()+"当前的进度为："+lengs+"%");
				
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