package com.caveofprogramming.spring.test;

import java.util.List;

public class Jungle {
	private List<Animal> animals;

	public List<Animal> getAnimals() {
		return animals;
	}

	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for(Animal animal: animals) {
			sb.append(animal);
			sb.append("\n");
		}
		
		return sb.toString();
	}
}
