package com829.E;

/*5、（自定义异常）创建两个自定义异常类MyException1 和MyException2。
要求：
1) MyException1 为已检查异常，MyException2 为未检查异常
2) 这两个异常均具有两个构造函数，一个无参，另一个带字符串参数，参数表示产生
异常的详细信息。*/
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