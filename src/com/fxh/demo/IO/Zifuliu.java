package com.fxh.demo.IO;

import static org.junit.Assert.*;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class Zifuliu {
	@Test
	public void test01() throws Exception {
		
		FileOutputStream fos = new FileOutputStream("D:/三.txt");
		fos.write('1');
		fos.close();
	}
	@Test
	public void test02() throws Exception {
		FileInputStream fis = new FileInputStream("D:/三.txt");
		byte[] bytes = new byte[1024];
		int read = 0;
		while((read = fis.read(bytes)) != -1) {
			System.out.println(new String(bytes));
		}
		fis.close();
	}
	
	@Test
	public void test03() throws Exception {
		FileWriter fw = new FileWriter("d:/qqqqqq.txt");
		fw.write("lalalalalalalalalalal");
		fw.flush();
		fw.close();
	}
	@Test
	public void test04() throws Exception {
		FileReader fr = new FileReader("d:/qqqqqq.txt");
		char[] chars = new char[1024];
		int i = 0;
		while((i = fr.read(chars)) != -1) {
			System.out.println(new String(chars));
		}
	}
	@Test
	public void test05() throws Exception {
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:/qqqqqq.txt"));
		bos.write(98);
		bos.flush();
		bos.close();
	}
	@Test
	public void test06() throws Exception {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:/qqqqqq.txt"));
		byte[] bytes = new byte[1024];
		int read = 0;
		while((read = bis.read(bytes)) != -1) {
			System.out.println(new String(bytes));
		}
		bis.close();
	}
	@Test
	public void test07() throws Exception {
		BufferedWriter bw = new BufferedWriter(new FileWriter("D:/123.txt"));
		bw.write("zhsdfgnskfjgsklfgfn");
		bw.flush();
		bw.close();
	}
	@Test
	public void test08() throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("D:/123.txt"));
		char[] chars = new char[2048];
		int i = 0;
		while((i = br.read(chars)) != -1) {
			System.out.println(new String(chars));
		}
		br.close();
	}
}
