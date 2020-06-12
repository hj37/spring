package com.spring.ex02;

public class PersonServiceImpl implements PersonService{

	private String name;
	private int age;
	
	//name을 매개변수로 전달받아 변수값을 초기화 시키는 생성자 
	
	public PersonServiceImpl(String name) {
		this.name = name;
	}
	
	
	public PersonServiceImpl(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	@Override
	public void sayHello() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		
	}

	
	
	
}
