package com.fxh.demo.work;

public class XiaoTask implements Runnable {

	private Resourse res;
	
	public XiaoTask(Resourse res) {
		super();
		this.setRes(res);
	}

	public XiaoTask() {
		super();
	}
	
	public Resourse getRes() {
		return res;
	}
	
	public void setRes(Resourse res) {
		this.res = res;
	}

	@Override
	public void run() {
		while(true) {
			synchronized (res) {
				if(res.getBool() == false) {
					try {
						res.wait();
						System.out.println("消费者等待");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("消费者唤醒生产者");
				}
				System.out.println("生产者开始干活");
				if(res.getBool()){
					System.out.println(res);
					res.setBool(false);
				}else {
					System.out.println("生产者唤醒消费者");
					res.setBool(true);
				}
			}
		}
	}

}
