package com825.Test;

public class DVDManager {
	public boolean addDVD()
	{
		DVD dvd=new DVD();
		DVDDB dvds=new DVDDB();
		DVD[] ss= dvds.getDvd();
		
		if(ss.length==100)
		{
			System.out.println("full!!");
			return false;
		}
		
		
		DVD[] sss=new DVD[ss.length+1];

		//复制
		int k=0;
		for(DVD i:ss)
		{
			sss[k++]=i;
		}
		
		sss[k]=dvd;
		dvds.setDvd(sss);
		return true;
	}
	
	public void seeDVD()
	{
		DVDDB dvds=new DVDDB();
		DVD[] ss= dvds.getDvd();
		for(DVD i:ss)
		{
			System.out.println(ss);
		}
	}
	
	public void delate(int a)
	{
		DVDDB dvds=new DVDDB();
		DVD[] ss= dvds.getDvd();
		
		if(a>ss.length) 
		{
			System.out.println("不存在");
			return;
		}
		
		DVD[] sss=new DVD[ss.length-1];
		for(int i=0;i<ss.length;i++)
		{
			if(a-1==i) continue;
			sss[i]=ss[i];
		}
		
		dvds.setDvd(sss);
	}
	
	public void lend(int a)
	{
		DVDDB dvds=new DVDDB();
		DVD[] ss= dvds.getDvd();
		
		if(a>ss.length) 
		{
			System.out.println("不存在");
			return;
		}
		
		for(int i=0;i<ss.length;i++)
		{
			if(a-1==i) 
			{
				ss[i].setStatus("已近借出去");
				
				int a1=ss[i].getLendCount();
				ss[i].setLendCount(a1);
				break;
			}
			
		}
	}
	
	public void back(int a)
	{
		DVDDB dvds=new DVDDB();
		DVD[] ss= dvds.getDvd();
		
		if(a>ss.length) 
		{
			System.out.println("不存在");
			return;
		}
		
		for(int i=0;i<ss.length;i++)
		{
			if(a-1==i) 
			{
				ss[i].setStatus("可接");
				break;
			}
			
		}
	}
}
