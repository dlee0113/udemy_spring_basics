package com.caveofprogramming.spring.test;

import java.util.HashMap;
import java.util.Map;

public class Jungle {
	
	private Map<String, Animal> animals = new HashMap<String, Animal>();
	
	public void setAnimals(Map<String, Animal> animals) {
		this.animals = animals;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for(Map.Entry<String, Animal> entry: animals.entrySet()) {
			sb.append(entry.getKey() + ": " + entry.getValue() + "\n");
		}
		
		return sb.toString();
	}
}
