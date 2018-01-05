package com.fxh.demo.work;

public class ThreadDemo {
	
	public static void main(String[] args) {
		//创建resourse
		Resourse resourse = new Resourse();
		//生产任务
		ShengTask shengTask = new ShengTask();
		//消费任务
		XiaoTask xiaoTask = new XiaoTask();
		//两个线程
		Thread shengShread = new Thread(shengTask);
		Thread xiaoShread = new Thread(xiaoTask);
		//开启线程
		shengShread.start();
		xiaoShread.start();
	}
	
}
