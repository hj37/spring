package com.spring.ex01;

public class PersonServiceImpl implements PersonService{

	private String name;
	private int age;
	
	//setter메소드중에 setName()메소드 추가 
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void sayHello() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		
	}
	
	
}
