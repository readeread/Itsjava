/*8��ʹ������ģʽ�������������飬�����޷�ȷ����δ������������飬��Ҫ�ڵ��ø÷���ʱָ������Ĵ�����Ϊ��*/
package com817.Exc8;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		double[] arr= {1.1,2,15,45,45,2.2+2};
		double[] arr1= {8,5,6,378,5,4,5,3,5,4};
		
//		addArray add=new addArray();
		
		
		Handle.handle(arr,new DoArray() {
			@Override
			public void doit(double[] arr) {
				Arrays.sort(arr);
				
				for(double i:arr) 
				{
					System.out.print(i+" ");
				}
				System.out.println();				
			}
			
		});
		
//		DoArray sort=new MaxArray();//��������
		Handle.handle(arr1, new DoArray() {//�̳�DoArray���½�����

			@Override
			public void doit(double[] arr) {
				double sum=0;
				for(double i:arr)
				{
					sum+=i;
				}
				System.out.println("all is: "+sum);				
			}
			
		});
		
	}

}
