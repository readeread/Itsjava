package com904.E;
/*4. 利用多线程求解某范围素数,每个线程负责 1000范围：线程1找1-1000；
线程 2 找 1001-2000；
线程 3 找 2001-3000。
编程程序将每个线程找到的素数及时打印*/
public class No4 extends Thread {
	static int y=0;
	Integer x=1;
	int s;
	
	public No4(int s) {
		this.s = s;
	}

	public static void main(String[] args) {
		new No4(0).start();
		System.out.println("adddddddddddddddddddddddddddddds"+Thread.activeCount());
		new No4(1000).start();
		new No4(2000).start();
		
		/*if(Thread.activeCount()==1)
			System.out.println("ddddddddddddddddddddddddddddddddddddddddddddddddddddddd");
		System.out.println("哈哈哈哈："+y);*/
	}

	@Override
	public void run() {
		/*synchronized(x)*/ {

			for(int i=1+s;i<=1000+s;i++)
			{
				int j=0;
				for(j=2;j<i;j++)
				{
					if(i%j==0)
					{
						break;
					}
				}
				if(i==j)
					{
					y++;
					System.out.println(i);
					}
			}
		}
				
	}
	
	
}