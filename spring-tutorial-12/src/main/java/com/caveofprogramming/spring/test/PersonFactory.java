package com.caveofprogramming.spring.test;

public class PersonFactory {
	// This method gets called whenever person bean gets instantiated.
	public Person createPerson(int id, String name) {
		System.out.println("Using factory to create person.");
		return new Person(id, name);
	}
}
