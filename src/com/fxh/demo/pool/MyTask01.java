package com.fxh.demo.pool;

import java.util.concurrent.Callable;

public class MyTask01 implements Callable<String> {

	@Override
	public String call() throws Exception {
		System.out.println(Thread.currentThread().getName());
		System.out.println("MyTask01");
		return "哈哈";
	}

}
