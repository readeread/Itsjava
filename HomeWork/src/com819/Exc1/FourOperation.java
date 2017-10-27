package com819.Exc1;

interface IntFunction{
	int operation(int a,int b);
}

public class FourOperation {
	
	public static int process(IntFunction intFunction,int a,int b)
	{
		return intFunction.operation(a,b);
	}

	public static void main(String[] args) {
		int numAdd=process((a,b)->a+b, 4, 5);
		int numMul=process((a,b)->a-b, 4, 5);
		int numSub=process((a,b)->a*b, 4, 5);
		int numDiv=process((a,b)->a/b, 4, 5);
		
		IntFunction a=(c,b)->c+b;
		System.out.println("numAdd: "+a.operation(4, 5));
		
		System.out.println("numAdd: "+numAdd);
		System.out.println("numMul: "+numMul);
		System.out.println("numSub: "+numSub);
		System.out.println("numDiv: "+numDiv);
	}

}
