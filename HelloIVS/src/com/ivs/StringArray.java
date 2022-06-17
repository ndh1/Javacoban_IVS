package com.ivs;

import java.util.Scanner;

public class StringArray {
	int[]a = new int[] {1,2,3,4,5};
	int i;
	public static void main(String[] args) {
		
		StringArray Sa = new StringArray();
		Sa.nhapi();
		Sa.giatriitrongmang();
		
	}
	public void nhapi() {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhap i");
		i=ip.nextInt();
	}
	public void giatriitrongmang() {
		for(int j=0;j<=a.length-1;j++)
		{
			if (j==i) {
				System.out.println(a[j]);	
			}
			
		}
	}
}
