package com908.Test;
/*1、请写出对下面数组进行升序排序的程序。
排序前：[12, 45, 11, 20, 67, 2, 1, 12, 6]
排序后：[1, 2, 6, 11, 12, 12, 20, 45, 67]*/

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
		int[] arr= {12, 45, 11, 20, 67, 2, 1, 12, 6};

		//比较轮数
		for(int i=0;i<arr.length-1;i++)
		{
			//比较次数
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
