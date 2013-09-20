package com.caveofprogramming.spring.test;


public class AnimalSound {
	private Dog dog;
	private Cat cat;

	public void setDog(Dog dog) {
		this.dog = dog;
	}

	public void setCat(Cat cat) {
		this.cat = cat;
	}
	
	public void makeDogSound(String sound) {
		dog.makeSound(sound);
	}
	
	public void makeCatSound(String sound) {
		cat.makeSound(sound);
	}
}
