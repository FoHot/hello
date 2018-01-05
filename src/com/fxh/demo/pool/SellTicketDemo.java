package com.fxh.demo.pool;

public class SellTicketDemo implements Runnable {

	private Integer num = 10;
	
	private Object obj1 = new Object();
	private Object obj2 = new Object();
	
	@Override
	public void run() {
		while(true) {
			num++;
			if(num % 2 == 0) {
				synchronized (obj1) {
					System.out.println("obj1");
					synchronized (obj2) {
						System.out.println("obj2");	
					}
				}
			}else {
				synchronized (obj2) {
					System.out.println("obj2");
					synchronized (obj1) {
						System.out.println("obj1");	
					}
				}
			}
				/*if(num > 0) {
					System.out.println(
							Thread.currentThread().getName()+"卖出第"+ num +"张票,还剩余"+(num-1));
					num--;
				}else {
					break;
				}
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
		}
	}
}
