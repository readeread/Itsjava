package com821.Test;

public abstract class Employee {
	private String name;
	private int id;
	
	public abstract void job();
	
	
	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}


public static void main(String[] args) {
	Javaee javaee=new Javaee("jack",123);
	javaee.job();
}

public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}

abstract class  RAD extends Employee{

	public RAD(String name, int id) {
		super(name, id);
	}
	
}

class Javaee extends RAD{

	public Javaee(String name, int id) {
		super(name, id);
	}

	@Override
	public void job() {
		
		System.out.println("javaee����ʦ: "+"Ա���Ĺ����ǣ�"+getId()+"��"+getName()+"Ա������ԭ���Ա�");
	}
	
}
class Android extends RAD{

	public Android(String name, int id) {
		super(name, id);
	}

	@Override
	public void job() {
		
		System.out.println("Android����ʦ: "+"Ա���Ĺ����ǣ�"+getId()+"��"+getName()+"Ա������ԭ���ͷ���");
	}
	
}


abstract class  Maintain extends Employee{

	public Maintain(String name, int id) {
		super(name, id);
	}
	
}

class Net extends Maintain{

	public Net(String name, int id) {
		super(name, id);
	}

	@Override
	public void job() {
		
		System.out.println("Net����ʦ: "+"Ա���Ĺ����ǣ�"+getId()+"��"+getName()+"Ա�������޻�����");
	}
	
}
class Hardware extends Maintain{

	public Hardware(String name, int id) {
		super(name, id);
	}

	@Override
	public void job() {
		
		System.out.println("Hardware����ʦ: "+"Ա���Ĺ����ǣ�"+getId()+"��"+getName()+"Ա�������޸���ӡ��");
	}
	
}
