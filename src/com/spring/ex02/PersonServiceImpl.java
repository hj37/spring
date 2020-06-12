package com.spring.ex02;

public class PersonServiceImpl implements PersonService{

	private String name;
	private int age;
	
	//name�� �Ű������� ���޹޾� �������� �ʱ�ȭ ��Ű�� ������ 
	
	public PersonServiceImpl(String name) {
		this.name = name;
	}
	
	
	public PersonServiceImpl(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	@Override
	public void sayHello() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		
	}

	
	
	
}
