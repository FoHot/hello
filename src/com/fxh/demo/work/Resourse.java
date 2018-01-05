package com.fxh.demo.work;

public class Resourse {
	
	private String name;
	
	private Integer age;
	
	private Boolean bool = false;

	public Boolean getBool() {
		return bool;
	}

	public void setBool(Boolean bool) {
		this.bool = bool;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Resourse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Resourse(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}
