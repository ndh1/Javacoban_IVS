package com.ivs;

import java.util.Scanner;

public class Maxnumber {
	float a;
	float b;
	public static void main(String[] args) {
		Maxnumber max = new Maxnumber();
		max.Nhap();
		max.Sosanh();
	}
	public void Sosanh() {
		float max;
		if(a>b) {
			System.out.println("A lon hon b");
		}else if(a<b){
			System.out.println("B lon hon A");
		}else {
			System.out.println("2 So bang nhau");
		}
	}
	public void Nhap() {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhap a");
		a=ip.nextFloat();
		System.out.println("Nhap b");
		b=ip.nextFloat();
	}
}
