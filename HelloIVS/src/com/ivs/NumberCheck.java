package com.ivs;

import java.util.Scanner;

public class NumberCheck {
	int num;
	public void input() {
		System.out.println("Gia tri cua num la: ");
		Scanner ip = new Scanner(System.in);
		num = ip.nextInt();
	}
	public void isPositive() {
		if (num==0) {
			System.out.println("Num la so 0");
		}else if(num>0)
		{
			System.out.println("Num la so lon hon 0");
		}else {
			System.out.println("Num la so nho hon 0");
		}
	}
	public void isOdd() {
		if (num%2==0) {
			System.out.println("Num la so chan");
		}else if(num%2==1)
		{
			System.out.println("Num la so le");
		}
	}
	public static void main(String[] args) {
		NumberCheck nc = new NumberCheck();
		nc.input();
		nc.isPositive();
		nc.isOdd();
		
	}
}
