package com.fxh.demo;

import org.junit.Test;

public class ClassDemo {

	@Test
	public void test01() {
		TestDemo demo = TestDemo.geTestDemo();
		TestDemo demo1 = TestDemo.geTestDemo();
		System.out.println(demo);
		System.out.println(demo1);
		System.out.println(demo1);
	}
	
}
