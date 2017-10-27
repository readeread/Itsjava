/*（5）、写一个类Army,代表一支军队，这个类有一个属性是Weapon数组w（用来存储该军队所
拥有的所有武器）；该类还提供一个构造方法，在构造方法里通过传一个int类型的参数来
限定该类所能拥有的最大武器数量,并用这一大小来初始化数组w。该类还提供一个方法
addWeapon(Weapon wa),表示把参数wa所代表的武器加入到数组w中。在这个类中还定义
两个方法attackAll()和moveAll()，让w数组中 的所有武器攻击和移 动。*/
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
			System.out.println("full!!!!!!!!！！！！！！！！！！！！！！！！！！！！！！！！！！！！!!");
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
