package com.fxh.demo.pool;

import java.util.concurrent.Callable;

public class Task_5 implements Callable<Integer> {

	private Integer num;
	
	public Task_5(Integer num) {
		this.num = num;
	}

	@Override
	public Integer call() throws Exception {
		System.out.println((1+num)*num/2);
		return 0;
	}
}
