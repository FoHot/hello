package com.fxh.demo.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.junit.Test;

public class TestDemo {
	
	@Test
	public void test01() throws Exception {
		String name = FilenameUtils.getName("D:/三国演义.txt");
		String nameAfter = FilenameUtils.getExtension("D:/三国演义.txt");
		boolean b = FilenameUtils.isExtension(name, "txt");
		String readFileToString = FileUtils.readFileToString(new File("D:/三国演义.txt"));
		System.out.println(readFileToString);
	}
	
	@Test
	public void test02() throws Exception {
		//FileUtils.writeStringToFile(new File("D:/fxh.txt"),"hello world");
		//String string = FileUtils.readFileToString(new File("D:/fxh.txt"));
		FileUtils.copyDirectory(new File("D:/三国演义"),new File("E:/三国演义"));
	}
	
	//对象序列化
	@Test
	public void test03() throws Exception, Exception {
		Person person = new Person();
		person.setName("张三");
		person.setAge(20);
		person.setSex("男");
		ObjectOutputStream oos = 
				new ObjectOutputStream(new FileOutputStream("D:/Person.object"));
		oos.writeObject(person);
		oos.close();
	}
	//反序列化
	@Test
	public void test04() throws Exception, Exception {
		ObjectInputStream ois = 
				new ObjectInputStream(new FileInputStream("D:/Person.object"));
		Person readObject = (Person) ois.readObject();
		System.out.println(readObject);
		ois.close();
	}
	
}
