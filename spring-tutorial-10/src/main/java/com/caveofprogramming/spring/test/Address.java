package com.caveofprogramming.spring.test;

public class Address {
	private String street;
	private String zipcode;
	
	public Address(String street, String zipcode) {
		this.street = street;
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", zipcode=" + zipcode + "]";
	}
}
