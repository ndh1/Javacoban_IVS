package com.ivs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PTB1 {
	int a,b;
	public void nhap() {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhap A");
		a = ip.nextInt();
		System.out.println("Nhap B");
		b = ip.nextInt();
		
	}
	public void giaiPhuongTrinh() {
		float x;
		x=(float)-b/a;
		DecimalFormat decimalFormat = new DecimalFormat("#.##");  
		System.out.println("X = "+decimalFormat.format(x));
	}
	public static void main(String[] args) {
		PTB1 pt1 = new PTB1();
		pt1.nhap();
		pt1.giaiPhuongTrinh();
	}
}
