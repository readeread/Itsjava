/*8、使用命令模式，处理两个数组，但是无法确定如何处理这两个数组，需要在调用该方法时指定具体的处理行为。*/
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
		
//		DoArray sort=new MaxArray();//排序数组
		Handle.handle(arr1, new DoArray() {//继承DoArray再新建对象

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
