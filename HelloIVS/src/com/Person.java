package com;

public class Person{
	String name;
	String address;
	public Person (String name, String address)
	{
		this.name=name;
		this.address=address;
		
	}
	public void info() {
		System.out.println(name+"is at"+address);
	}
}