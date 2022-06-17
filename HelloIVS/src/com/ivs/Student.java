package com.ivs;

import java.util.Scanner;

public class Student {
	String fullname;
	String address;
	int yob;
	
	public static void main(String[] args) {
		Student st = new Student();
		st.Nhap();
		System.out.println("Thong tin vua nhap");
		st.Xuat();
	}
	public void Nhap() {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhap fullname");
		fullname = ip.nextLine();
		System.out.println("Nhap yob");
		yob = ip.nextInt();
		ip.nextLine();
		System.out.println("Nhap address");
		address=ip.nextLine();
	}
	public void Xuat() {
		System.out.printf("Ho va ten %s, Yob:%d, Dia chi:%s ", fullname,yob,address);
		
	}
}
