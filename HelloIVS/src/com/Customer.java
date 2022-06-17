package com;

public class Customer extends Person {
	long buy;
	String phone;
	public Customer(String name, String address, long buy, String phone) {
		super(name,address);
		this.buy=buy;
		this.phone=phone;
	}

	public void info() {
		super.info();
		System.out.println("Buy:"+buy+",has phone:"+phone);
	}
	public static void main(String args[])
	{
		Customer cus1 = new Customer("Tom"," Disney Land",100,"09123456789");
		cus1.info();
	}
}	

