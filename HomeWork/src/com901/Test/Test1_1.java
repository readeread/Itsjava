package com901.Test;

/*在一个类中编写一个方法，这个方法搜索一个字符数组中是否存在某个字符，
 * 如果存在，则返回这个字符在字符数组中第一次出现的位置（下标），否则，返回-1。
 * 要搜索的字符数组和字符都以参数形式传递给该方法，如果传入的数组为null，就抛出IllegalArgumentException异常。

在类的main方法中以各种可能出现的情况测试验证该方法编写的是否正确
例如：字符不存在，字符存在，传入的数组为null等。*/
public class Test1_1 {

	public static void main(String[] args) {
		Test1_1 t=new Test1_1();
		
		char[] chs= {'a','c',' ','4','f','s','a'};
		char[] cs={};
		char[] css=null;
		
		try {
			System.out.println(t.show(chs, 'b'));
			System.out.println(t.show(chs, 'a'));
			System.out.println(t.show(chs, ' '));
			System.out.println(t.show(cs, ' '));
			System.out.println(t.show(css, ' '));
			
		}catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
	}

	public int show(char[] chs,char a)
	{
		if(chs==null)
		{
			throw new IllegalArgumentException("数组为空异常");
		}
		
		
		int i=0;
		for(;i<chs.length;i++)
		{
			if(chs[i]==a)
			{
				break;
			}
		}
		
		if(i==chs.length)
		{
			return -1;
		}
		else
		{
			return i;
		}
	}
}
