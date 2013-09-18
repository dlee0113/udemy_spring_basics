package com.caveofprogramming.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/caveofprogramming/spring/test/beans/beans.xml");
		
		Person person1 = (Person)context.getBean("person1");
		System.out.println(person1);
		
		Person person2 = (Person)context.getBean("person2");
		System.out.println(person2);
		
		Address address1 = (Address)context.getBean("address1");
		System.out.println(address1);
		
		Address address2 = (Address)context.getBean("address2");
		System.out.println(address2);

		((ClassPathXmlApplicationContext)context).close();
	}
}
