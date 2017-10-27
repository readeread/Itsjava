/*��5����дһ����Army,����һ֧���ӣ��������һ��������Weapon����w�������洢�þ�����
ӵ�е����������������໹�ṩһ�����췽�����ڹ��췽����ͨ����һ��int���͵Ĳ�����
�޶���������ӵ�е������������,������һ��С����ʼ������w�����໹�ṩһ������
addWeapon(Weapon wa),��ʾ�Ѳ���wa��������������뵽����w�С���������л�����
��������attackAll()��moveAll()����w������ ������������������ ����*/
package com817.Exc3;

public class Army {
	private Weapon[] w;
	
	public Army(int a)
	{
		w=new Weapon[a];
	}
	
	public void addWeapon(Weapon wa)
	{
		int i=0;
		for(;i<w.length;i++) 
		{
			if(w[i]==null)
			{
				w[i]=wa;				
				break;
			}
		}
		if(i==w.length)
		{
			System.out.println("full!!!!!!!!��������������������������������������������������������!!");
		}
	}
	
	public void attackAll()
	{
		for(int i=0;i<w.length;i++)
		{
			if(w[i]!=null)
			{
				w[i].attack();
			}
		}
	}
	
	public void moveAll()
	{
		for(int i=0;i<w.length;i++)
		{
			if(w[i]!=null)
			{
				w[i].move();
			}
		}
	}

	public Weapon[] getW() {
		return w;
	}

	public void setW(Weapon[] w) {
		this.w = w;
	}
	
}
