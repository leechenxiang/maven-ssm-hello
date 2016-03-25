package com.lee.ssm.bean;

public class User {

	private int id;
	private String username;
	private int age;
	private String sex;
	
	public User() {
		super();
	}

	public User(String username, int age, String sex) {
		super();
		this.username = username;
		this.age = age;
		this.sex = sex;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return username;
	}
	public void setName(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + username + ", age=" + age + ", sex="
				+ sex + "]";
	}
	
}
