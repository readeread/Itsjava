package com908.Test;
/*1����д�����������������������ĳ���
����ǰ��[12, 45, 11, 20, 67, 2, 1, 12, 6]
�����[1, 2, 6, 11, 12, 12, 20, 45, 67]*/

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
		int[] arr= {12, 45, 11, 20, 67, 2, 1, 12, 6};

		//�Ƚ�����
		for(int i=0;i<arr.length-1;i++)
		{
			//�Ƚϴ���
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