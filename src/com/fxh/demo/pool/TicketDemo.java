package com.fxh.demo.pool;

public class TicketDemo {

	public static void main(String[] args) {
		SellTicketDemo std = new SellTicketDemo();
		Thread thread1 = new Thread(std,"窗口1");
		Thread thread2 = new Thread(std,"窗口2");
		Thread thread3 = new Thread(std,"窗口3");
		thread1.start();
		thread2.start();
		thread3.start();
	}
	
}
