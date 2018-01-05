package com.fxh.demo.pool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.fxh.demo.thread.MyTask;

public class ThreadPool {
	/*public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(3);
		pool.submit(new MyTask());
		pool.submit(new MyTask());
		pool.shutdown();
	}*/
	
	
	
	
	//对于线程池提交的任务可以是runnable接口也可以是callable接口
	
	//runnable接口没有返回值不能抛异常
	
	//callable接口有返回值，可以抛出异常
	
	/*public static void main(String[] args) throws Exception, ExecutionException {
		ExecutorService pool = Executors.newFixedThreadPool(5);
		Future<String> submit = pool.submit(new MyTask01());
		String string = submit.get();
		System.out.println(string);
		pool.shutdown();
	}*/
	public static void main(String[] args) throws Exception, ExecutionException {
		ExecutorService pool = Executors.newFixedThreadPool(5);
		for(int i = 1; i<=5; i++) {
			pool.submit(new Task_5(i*100));
		}
		pool.shutdown();
	}
}
