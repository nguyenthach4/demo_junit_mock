package com.udacity.timezones.dto;

public class Student {

	private String code;

	private String name;

	private int age;

	public Student() {
		super();
	}

	public Student(String code, String name, int age) {
		super();
		this.code = code;
		this.name = name;
		this.age = age;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
