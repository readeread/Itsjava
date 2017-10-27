package com901.Test;
/*创建购物车实体类，模拟购物车功能
需求：
1)添加商品到购物车（输入商品的编号和数量）
2)删除商品（删除购物车中的指定购物项）
3)修改商品（修改商品的数量）
4)显示所购买的商品信息（按购买商品的总价进行升序显示）*/
public class Shops {
	private int Id;
	private int num;
	private double price;
	
	public Shops(int id, int num, double price) {
		Id = id;
		this.num = num;
		this.price = price;
	}

	public Shops(int id, int num) {
		Id = id;
		this.num = num;
	}

	public Shops() {
	}
	
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Id;
		result = prime * result + num;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shops other = (Shops) obj;
		if (Id != other.Id)
			return false;
		if (num != other.num)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}

}
