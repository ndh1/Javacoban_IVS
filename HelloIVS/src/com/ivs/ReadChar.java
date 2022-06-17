package com.ivs;

import java.util.Scanner;

public class ReadChar {
	byte a;
	
	public static void main(String[] args) {
		ReadChar rc = new ReadChar();
		rc.Nhap();
		rc.Epkieu();
		}
	public void Nhap() {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhap a = ");
		a = ip.nextByte();
	}
	public void Epkieu() {
		System.out.println(new String(new byte[] {a}));
		
	}
	
}
