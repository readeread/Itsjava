package com825.Test;

public class DVD {
	private int id;
	private String name;
	private  int lendCount=0 ;
	private String lendDate ;
	private String status;
	
	public DVD() {};
	public DVD(int id, String name, int lendCount, String lendDate, String status) {
		this.id = id;
		this.name = name;
		this.lendDate = lendDate;
		this.status = status;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLendCount() {
		return lendCount;
	}
	public void setLendCount(int lendCount) {
		this.lendCount = lendCount;
	}
	public String getLendDate() {
		return lendDate;
	}
	public void setLendDate(String lendDate) {
		this.lendDate = lendDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
		
}
