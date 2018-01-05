package com.fxh.demo.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

public class ObjectStreamDemo {
	//静态成员变量不能够被保存
	//非静态成员变量用transient修饰也可以不被序列化
	@Test
	public void test01() throws Exception, Exception {
		User user = new User();
		user.setName("asd");
		user.setDescr("12312");
		
		ObjectOutputStream oos = 
				new ObjectOutputStream(new FileOutputStream("d:/user.object"));
		
		oos.writeObject(user);
		oos.close();
		
	}
	@Test
	public void test02() throws Exception, Exception {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/user.object"));
		
		User readObject = (User) ois.readObject();
		System.out.println(readObject);
		ois.close();

		
	}
}
