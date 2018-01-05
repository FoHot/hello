package com.fxh.demo.thread;

public class MyTask implements Runnable {

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name);
		
		System.out.println("任务");
	}

}
