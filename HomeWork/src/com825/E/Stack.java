//1、实现一个管理元素类型为E的数组的Stack<E>类。提供push(压入)、pop(弹出)和判断是否为空isEmpty()方法。
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
			System.out.println("空间已经满了 无法添加");
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
			System.out.println("没有元素没法取出");
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
