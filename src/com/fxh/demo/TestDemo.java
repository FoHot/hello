package com.fxh.demo;

public class TestDemo {

	public static TestDemo td;
	
	private TestDemo() {
		super();
	}

	//加锁，修饰符synchronized
	public static synchronized TestDemo geTestDemo() {
		if(td == null ) {
			td = new TestDemo();
			return td;
		}else {
			return td;
		}
	}

}
