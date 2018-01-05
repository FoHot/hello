package com.fxh.demo.IO;

import java.io.Serializable;
public class Person implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	
	private Integer age;
	
	private String sex;

	private int i ;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}

}
