package com.caveofprogramming.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/caveofprogramming/spring/test/beans/beans.xml");
		
		// Since bean scope is singletone, both person1 and person2 refer to the same object
		Person person1 = (Person)context.getBean("person");
		Person person2 = (Person)context.getBean("person");
		
		// Both person1 and person2 are updated
		person1.setTaxId(666);

		System.out.println(person1);
		System.out.println(person1);

		((ClassPathXmlApplicationContext)context).close();
	}

}
