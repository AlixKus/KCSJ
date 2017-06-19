package com.lk.Model;

import java.io.Serializable;

public class Student implements Serializable {

	private static final long serialVersionUID = 2120869894112984147L;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private int id;
	private String name;

	// 节省文章长度，get set 方法省略
}