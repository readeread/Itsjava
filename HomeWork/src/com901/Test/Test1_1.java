package com901.Test;

/*��һ�����б�дһ�������������������һ���ַ��������Ƿ����ĳ���ַ���
 * ������ڣ��򷵻�����ַ����ַ������е�һ�γ��ֵ�λ�ã��±꣩�����򣬷���-1��
 * Ҫ�������ַ�������ַ����Բ�����ʽ���ݸ��÷�����������������Ϊnull�����׳�IllegalArgumentException�쳣��

�����main�������Ը��ֿ��ܳ��ֵ����������֤�÷�����д���Ƿ���ȷ
���磺�ַ������ڣ��ַ����ڣ����������Ϊnull�ȡ�*/
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
			throw new IllegalArgumentException("����Ϊ���쳣");
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
