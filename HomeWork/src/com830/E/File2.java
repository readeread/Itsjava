package com830.E;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*�Ӽ�������һ���ļ������ж����Ƿ���ڣ����ж���ΪĿ¼�������ļ����������
�������ļ�������޸�ʱ���ӡ�����������Ŀ¼����Ŀ¼�������ļ�����ӡ������
2.
*/
public class File2 {

	public static void main(String[] args) {
		File1 ff=new File1();
		
		 Scanner input=new Scanner(System.in);
		 String str=input.nextLine();
		 
		 File file=new File("D:\\",str);
		 
		 if(file.exists())
		 {
			 if(file.isDirectory())
			 {
				 File1.traval(file);
			 }
			 else
			 {
				 System.out.println(file.lastModified());
			 }
		 }
		 else
		 {
			 System.out.println("�ļ����ļ��в�����");
		 }
	}

}
