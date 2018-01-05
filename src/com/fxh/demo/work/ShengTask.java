package com.fxh.demo.work;

public class ShengTask implements Runnable {
	
	private Resourse res;
	

	public ShengTask(Resourse res) {
		super();
		this.setRes(res);
	}

	public ShengTask() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Resourse getRes() {
		return res;
	}
	
	public void setRes(Resourse res) {
		this.res = res;
	}
	
	@Override
	public void run() {
		int num = 0;
		while(true) {
			synchronized (res) {
				System.out.println("生产者拿到锁");
				if(res.getBool()) {
					try {
						System.out.println("生产者等待");
						res.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("生产者被唤醒");
				}
				System.out.println("生产者开始干活");
				if(num % 2 == 0) {
					res.setName("张三");
					res.setAge(13);
				}else {
					res.setName("李四");
					res.setAge(14);
				}
				num++;
				res.setBool(true);
				System.out.println("生产者唤醒消费者");
			}
		}
	}
}
 