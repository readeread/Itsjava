package com819.Exc1;

interface TransFun{
	Integer convert(String str);
}

public class TransFunction {

	public static void main(String[] args) {
		TransFun transFun=new TransFun() {
			public Integer convert(String str)
			{
				return Integer.valueOf(str);
			}
		};
		
		TransFun test1=str->Integer.valueOf(str);
		
		TransFun test2=Integer::valueOf;
		
		Integer integ=test1.convert("789");
		Integer integ1=test2.convert("123");
		Integer integ2=transFun.convert("456");
		
		
		System.out.println(integ1);
		System.out.println(integ);
		System.out.println(integ2);
	}

}
