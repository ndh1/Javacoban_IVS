package com.ivs;
import java.lang.*;
import java.util.Scanner;

public class PTB2 {
	int a,b,c;
	public void nhap() {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhap a");
		a = ip.nextInt();
		System.out.println("Nhap b");
		b = ip.nextInt();
		System.out.println("Nhap c");
		c = ip.nextInt();
	}
	public void ketqua() {
		double delta = Math.pow(b,2)-4*a*c;
		double x = -b/2*a;
		double x1 = (-b + Math.sqrt(delta))/(2*a);
		double x2 = (-b + Math.sqrt(delta))/(2*a);
		if(delta<0)
			System.out.println("Phương trình vô nghiệm");
		else if (delta==0)
			System.out.println("Phương trình có nghiệm kép x1=x2="+x);
		else
			System.out.println("Phương trình có 2 nghiệm x1="+x1+";x2="+x2);
	}
	public static void main(String[] args) {
		PTB2 gpt = new PTB2();
		gpt.nhap();
		gpt.ketqua();
	}
}
