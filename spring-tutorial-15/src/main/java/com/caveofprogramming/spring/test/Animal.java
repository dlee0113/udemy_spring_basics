package com.caveofprogramming.spring.test;

public class Animal {
	private String type;
	private String size;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	@Override
	public String toString() {
		return "Animal [type=" + type + ", size=" + size +"]";
	}
}
