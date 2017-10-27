package com817.Exc8;

import java.util.Arrays;

public interface DoArray {
	void doit(double[] arr);
}


class addArray implements DoArray{

	@Override
	public void doit(double[] arr) {
		double sum=0;
		for(double i:arr)
		{
			sum+=i;
		}
		System.out.println("all is: "+sum);
	}
	
}

class MaxArray implements DoArray{

	@Override
	public void doit(double[] arr) {
		Arrays.sort(arr);
		
		for(double i:arr) 
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
}