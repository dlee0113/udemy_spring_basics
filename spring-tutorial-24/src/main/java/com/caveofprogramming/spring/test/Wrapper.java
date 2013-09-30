package com.caveofprogramming.spring.test;

import org.springframework.beans.factory.annotation.Autowired;

public class Wrapper {
	private Foo foo;
	
	@Autowired
	public void setFoo(Foo foo) {
		this.foo = foo;
	}
	
	public void getFooAction() {
		foo.action();
	}
}
