package com901.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*将三个文本文件中的数据写到一个文件中
需求：
1）把附件中的1.txt 2.txt 3.txt 的内容写到4.txt里面。*/

public class Test1_2 {

	public static void main(String[] args) {
		String path="E:\\第四周试题附件\\";
		String path1="1.txt";
		String path2="2.txt";
		String path3="3.txt";
		String path4="4.txt";
		
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fw=new FileWriter(path+path4,true);
			
			int len=0;
			char[] ch=new char[512];
			
			fr = new FileReader(path+path1);
			while((len=fr.read(ch))!=-1)
			{
				fw.write(new String(ch,0,len));
			}
			
			fr.close();
			
			fr = new FileReader(path+path2);
			while((len=fr.read(ch))!=-1)
			{
				fw.write(new String(ch,0,len));
			}
			
			fr.close();
			fr = new FileReader(path+path3);
			while((len=fr.read(ch))!=-1)
			{
				fw.write(new String(ch,0,len));
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fr!=null)
			{
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(fw!=null)
			{
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	}

}
