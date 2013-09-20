package com.caveofprogramming.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/caveofprogramming/spring/test/beans/beans.xml");
		
		AnimalSound animal = (AnimalSound)context.getBean("animalSound");
		
		animal.makeDogSound("woof");
		animal.makeCatSound("nya");
		
		((ClassPathXmlApplicationContext)context).close();
	}
}
