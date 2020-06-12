package com.spring.ex01;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

//프로그램을 실행시키는 시작점 

public class PersonTest {	//PersonTest클래스는 PersonServiceImpl클래스를 의존함
							//PersonServiceImpl클래스를 의존함
							//의존하는 PersonServiceImpl개겣를 주입하고 있음 
							//DI (의존하는 객체를 스프링컨테이너에 의해 주입하고 있음) 
	public static void main(String[] args) {
		//PersonTest.class파일 실행시 ~~ 
		//스프링 컨테이너 역할을 하는 객체가 생성될때
		//컨테이너는 person.xml파일의 bean태그를 읽어 들여서 객체 생성후
		//스프링 컨테이너 역할을 하는 공간에 저장 해둔다.
		XmlBeanFactory factory
		= new XmlBeanFactory(new FileSystemResource("person.xml"));
		
		//스프링컨테이너 역할을 하는 객체 메모리 공간에 생성된 
		//PersonServiceImpl객체를 얻어 PersonTest클래스에 주입(저장) 
		PersonServiceImpl person = 
				(PersonServiceImpl)factory.getBean("personService1");	//객체를 얻을 때 사용하는 메소드 
		
		person.sayHello();//주입받은 PersonServiceImpl객체의 메소드 호출 
		
	}

}
