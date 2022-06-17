package com.ivs;

import java.util.Scanner;

public class Sum {
	int a;
	int b;
	

	public static void main(String[] args) {
		Sum sum = new Sum();
		sum.nhap();
		sum.Cong();
		sum.Tru();
		sum.Nhan();
		sum.ChiaNguyen();
		sum.ChiaDu();
	}
	
	public void nhap() {
		//Khai bao Scanner
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap A");
		a = input.nextInt();
		System.out.println("Nhap B");
		b = input.nextInt();
	}

	public void Cong() {
		System.out.println(a +"+" +b +"="+a+b);
	}

	public void Tru() {
		System.out.println(a +"-" +b +"="+(a-b));
	}

	public void Nhan() {
		System.out.println(a +"*" +b +"="+a*b);
	}

	public void ChiaNguyen() {
		System.out.println(a +"/" +b +"="+(float)a/b);
	}
	public void ChiaDu() {
		System.out.println(a +"/" +b +"="+(float)a%b);
	}
}
