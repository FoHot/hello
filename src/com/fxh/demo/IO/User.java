package com.fxh.demo.IO;

import java.io.Serializable;

public class User implements Serializable {
	private String name;
	
	private String descr;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", descr=" + descr + "]";
	}
	
}
