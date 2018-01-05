package com.fxh.demo.thread;

public class MyThread extends Thread {
	
	@Override
	public void run() {
		String string = Thread.currentThread().getName();
		System.out.println(string);
	}
	
}
