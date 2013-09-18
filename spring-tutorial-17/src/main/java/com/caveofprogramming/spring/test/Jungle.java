package com.caveofprogramming.spring.test;

import java.util.HashMap;
import java.util.Map;

public class Jungle {
	private Map<String, String> animalFoods = new HashMap<String, String>();
	
	public void setAnimalFoods(Map<String, String> animalFoods) {
		this.animalFoods = animalFoods;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Animal Foods Map\n");
		for(Map.Entry<String, String> entry: animalFoods.entrySet()) {
			sb.append(entry.getKey() + ": " + entry.getValue() + "\n");
		}
		
		return sb.toString();
	}
}
