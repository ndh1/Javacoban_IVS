package com.ivs;

public class MyProfile {
	final String hoten="Nguyen Dinh Huong";
	final String ngaySinh ="14/04";
	String diaChi="123/5 Chau Van Liem";
	long soDT=918827883;
	public static void main(String[] args) {
		MyProfile huong = new MyProfile();
		huong.myInfo();
		
	}
	public void myInfo() {
		System.out.println(this.hoten +" "+this.ngaySinh+" "+this.diaChi+" "+this.soDT);
	}
}
