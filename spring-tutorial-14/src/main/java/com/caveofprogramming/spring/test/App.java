package com.caveofprogramming.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/caveofprogramming/spring/test/beans/beans.xml");
		
		Basket basket1 = (Basket) context.getBean("basket1");
		System.out.println(basket1);
		
		Basket basket2 = (Basket) context.getBean("basket2");
		System.out.println(basket2);
		
		((ClassPathXmlApplicationContext)context).close();
	}
}
