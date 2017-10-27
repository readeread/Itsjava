package com824.Exc;
//1、写一个带有泛型的接口，接口拥有三个方法：setT(T t); T getT(); print();创建实现类，调用实现类。
interface DIY<T> {
	void setT(T t);
	T getT(); 
	void print();
}

public class TDIY<T> implements DIY<T>{
	private T t;
	
	public static void main(String[] args) {
		TDIY<String> t=new TDIY<>(); 
		t.setT("hahaha");
		t.print();
	}
	
	@Override
	public void setT(T t) {
		this.t=t;
	}

	@Override
	public T getT() {
		return this.t;
	}

	@Override
	public void print() {
		System.out.println(t);
	}
}