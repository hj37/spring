package com.spring.ex01;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

//���α׷��� �����Ű�� ������ 

public class PersonTest {	//PersonTestŬ������ PersonServiceImplŬ������ ������
							//PersonServiceImplŬ������ ������
							//�����ϴ� PersonServiceImpl������ �����ϰ� ���� 
							//DI (�����ϴ� ��ü�� �����������̳ʿ� ���� �����ϰ� ����) 
	public static void main(String[] args) {
		//PersonTest.class���� ����� ~~ 
		//������ �����̳� ������ �ϴ� ��ü�� �����ɶ�
		//�����̳ʴ� person.xml������ bean�±׸� �о� �鿩�� ��ü ������
		//������ �����̳� ������ �ϴ� ������ ���� �صд�.
		XmlBeanFactory factory
		= new XmlBeanFactory(new FileSystemResource("person.xml"));
		
		//�����������̳� ������ �ϴ� ��ü �޸� ������ ������ 
		//PersonServiceImpl��ü�� ��� PersonTestŬ������ ����(����) 
		PersonServiceImpl person = 
				(PersonServiceImpl)factory.getBean("personService1");	//��ü�� ���� �� ����ϴ� �޼ҵ� 
		
		person.sayHello();//���Թ��� PersonServiceImpl��ü�� �޼ҵ� ȣ�� 
		
	}

}
