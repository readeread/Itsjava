package com830.E;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*从键盘输入一个文件名，判断其是否存在，并判断其为目录，还是文件，如果是文
件，把文件的最后修改时间打印出来，如果是目录，把目录的所有文件名打印出来。
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
			 System.out.println("文件或文件夹不存在");
		 }
	}

}
