package com.caveofprogramming.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/caveofprogramming/spring/test/beans/beans.xml");
		
		Jungle jungle = (Jungle)context.getBean("jungle");
		System.out.println(jungle);
		
		for (Animal animal: jungle.getAnimals()) {
			if (animal.getSize().equals("small")) {
				System.out.println("Small Animal");
				System.out.println(animal);
			}
		}
		
		((ClassPathXmlApplicationContext)context).close();
	}
}
