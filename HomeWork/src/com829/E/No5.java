package com829.E;

/*5�����Զ����쳣�����������Զ����쳣��MyException1 ��MyException2��
Ҫ��
1) MyException1 Ϊ�Ѽ���쳣��MyException2 Ϊδ����쳣
2) �������쳣�������������캯����һ���޲Σ���һ�����ַ���������������ʾ����
�쳣����ϸ��Ϣ��*/
public class No5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}

class MyException1 extends Exception
{
    public MyException1 (){
    }
    public MyException1 (String message){
        super(message);
    }
}

class MyException2 extends RuntimeException
{
    public MyException2 (){
    	
    }
    public MyException2 (String message){
        super(message);
    }
}