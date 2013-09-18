package com.caveofprogramming.spring.test;

import java.util.List;

public class Basket {
	private String name;
	private List<String> items;
	
	public Basket(String name, List<String> items) {
		this.name = name;
		this.items = items;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(name);
		sb.append(" contains:\n");
		
		for(String item: items) {
			sb.append(item);
			sb.append("\n");
		}
		
		return sb.toString();
	}
}
