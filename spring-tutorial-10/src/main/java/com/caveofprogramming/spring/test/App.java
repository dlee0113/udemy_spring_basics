package com.caveofprogramming.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/caveofprogramming/spring/test/beans/beans.xml");
		
		// If bean scope is singleton, person1 and person2 refer to the same object.
		// If bean scope is prototype, person1 and person2 refer to a new object, respectively.
		Person person1 = (Person)context.getBean("person");
		Person person2 = (Person)context.getBean("person");
		
		System.out.println("person1: " + person1);
		System.out.println("person2: " + person2);
		
		// Since person1 and person2 are 2 different objects, only person1 is changed.
		person1.setId(000);

		System.out.println("person1: " + person1);
		System.out.println("person2: " + person2);
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
