//1��ʵ��һ������Ԫ������ΪE�������Stack<E>�ࡣ�ṩpush(ѹ��)��pop(����)���ж��Ƿ�Ϊ��isEmpty()������
package com825.E;

import java.util.Arrays;

public class Stack<E> {
	E[] array;
	
	@SuppressWarnings("unchecked")
	public Stack(int a) {
		array=(E[]) new Object[a];
	}
	
	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<>(12);
		stack.push(1);
		stack.push(1);
		stack.push(1);
		
		System.out.println(stack);
		stack.pop();
		
		System.out.println(stack);
	}
	
	void push(E e)
	{
		if(array[array.length-1]==null)
		{
			for(int i=0;i<array.length;i++)
			{
				if(array[i]==null)
				{
					array[i]=e;
					break;
				}
			}
		}else {
			System.out.println("�ռ��Ѿ����� �޷����");
		}
			
		
	}
	
	E pop()
	{
		E e=null;
		if(!isEmpty())
		{
			for(int i=1;i<array.length;i++)
			{
				if(array[i]==null)
				{
					e=array[i-1];
					array[i-1]=null;
					break;
				}
			}
		}else {
			System.out.println("û��Ԫ��û��ȡ��");
		}
		return e;
	}
	
	boolean isEmpty()
	{
		if(array[0]==null)
		{
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		return "Stack [array=" + Arrays.toString(array) + "]";
	}
	
	
}
