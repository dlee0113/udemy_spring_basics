package com.caveofprogramming.spring.test;


public class AnimalSound {
	private Dog dog;
	private Cat cat;
	private Bird bird;
	
	public void setDog(Dog dog) {
		this.dog = dog;
	}

	public void setCat(Cat cat) {
		this.cat = cat;
	}
	
	public void setBird(Bird bird) {
		this.bird = bird;
	}
	
	public void makeDogSound() {
		dog.makeSound();
	}
	
	public void makeCatSound() {
		cat.makeSound();
	}
	
	public void makeBirdSound() {
		bird.makeSound();
	}
}
