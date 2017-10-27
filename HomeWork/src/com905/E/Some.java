package com905.E;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class Some {
	public static void main(String[] args) {
		ExecutorService exe=Executors.newFixedThreadPool(2);
		Callable<Double> callable=new add(1.2, 4.2);
		FutureTask<Double> futureTask=(FutureTask<Double>) exe.submit(callable);
		try {
			System.out.println(futureTask.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		exe.shutdown();
	}
}

class add implements Callable<Double>{
	Double a;
	Double b;
	
	public add(Double a, Double b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public Double call() throws Exception {
		System.out.println("hey hey hey");
		return a+b;
	}
	
}