package com821.Test;

public  interface USB {
	void open();
	void close();
}

class Mouse implements USB{

	@Override
	public void open() {
		System.out.println("mouse open!");
	}

	@Override
	public void close() {
		System.out.println("mouse close");
	}
	
}

class Keyboard implements USB{

	@Override
	public void open() {
		System.out.println("key open!");
	}

	@Override
	public void close() {
		System.out.println("key close");		
	}
}


