package com.caveofprogramming.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/caveofprogramming/spring/test/beans/beans.xml");
		AnimalSound animalSound = (AnimalSound)context.getBean("animalSound");
		
		animalSound.makeDogSound();
		animalSound.makeCatSound();
		animalSound.makeBirdSound();
		
		((ClassPathXmlApplicationContext)context).close();
	}
}
