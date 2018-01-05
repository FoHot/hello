package com.fxh.demo.thread;

public class ThreadDemo extends Thread {

	/*public static void main(String[] args) throws Exception {
		//线程方法在哪个线程就是那个线程调用
		
		//创建线程
		MyThread myThread = new MyThread();
		//设置分线程名称
		myThread.setName("分线程");
		//开启线程
		myThread.start();
		
		
//		MyThread.sleep(10000L);
		
		
		//获取当前线程
		Thread thread = Thread.currentThread();
		//获取线程名称
		String name2 = thread.getName();
		System.out.println(name2);
		}*/
	/*public static void main(String[] args) throws Exception {
		// 解耦 实现接口 不是继承类
		MyTask myTask = new MyTask();
		Thread thread = new Thread(myTask,"任务线程");
		thread.start();
		//如果创建了thread并且给了实现runnable接口的对象，线程就会自动寻找对象的run方法
		//并且把run方法放入线程
	}*/
	public static void main(String[] args) throws Exception {
		new Thread("任务线程") {
			@Override
			public void run() {
				System.out.println("线程"+"--------"+this.getName());
			}
		}.start();
		Runnable task = new Runnable() {
			@Override
			public void run() {
				System.out.println("分线程"+"----"+Thread.currentThread().getName());
			}
		};
		new Thread(task, "匿名线程").start();
	}
}
