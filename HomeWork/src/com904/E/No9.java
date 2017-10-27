package com904.E;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*多线程复制一个文件。提示：使用多线程复制同一个文件，首先考虑到，文
件分段。分段后，每一个线程负责复制一段内容。这时，可以使用RandomAccessFile
来实现分段*/
public class No9 {

	public static void main(String[] args) {
		String path="E:\\第8章：泛型(day14).zip";
		String dest="E:\\a.zip";
		File file=new File(path);
		File fileDest=new File(dest);
		
		long length=file.length();
		long len1=length*(1/3);
		long len2=length*(2/3);
		
		ExecutorService es=Executors.newFixedThreadPool(3);

		Runnable th1=new Copyy(file, fileDest, 0, len1);
		Runnable th2=new Copyy(file, fileDest, len1, len2);
		Runnable th3=new Copyy(file, fileDest, len2, length);

		es.submit(th2);
		es.submit(th1);
		es.submit(th3);
		
		/*es.execute(th1);
		es.execute(th2);
		es.execute(th3);*/
		
		es.shutdown();
	}

}

class Copyy implements Runnable{
	File src;
	File dest;
	long start;
	long end;
	
	public Copyy(File src, File dest, long start, long end) {
		this.src = src;
		this.dest = dest;
		this.start = start;
		this.end = end;
	}

	@Override
	public void run() {
		RandomAccessFile is=null;
		RandomAccessFile os=null;
		
		try {
			is=new RandomAccessFile(src,"rw");
			os=new RandomAccessFile(dest,"rw");
			int len=0;
			byte[] b=new byte[1024];
			
			is.seek(start);
			while((len=is.read(b))!=-1)
			{
				/*if(is.getFilePointer()>=len1)
				{
					long temp=is.getFilePointer()-1024;
					is.seek(temp);
					len=is.read(b, 0, (int)(len1-temp));
					os.write(b);
				}else*/
				os.write(b, 0, len);
				if(is.getFilePointer()>=end)
				{
					break;
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(is!=null)
			{
				try {
					is.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(os!=null)
			{
				try {
					os.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}	
}