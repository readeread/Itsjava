package com824.Exc;
//1��дһ�����з��͵Ľӿڣ��ӿ�ӵ������������setT(T t); T getT(); print();����ʵ���࣬����ʵ���ࡣ
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