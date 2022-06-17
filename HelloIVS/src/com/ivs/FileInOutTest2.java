package com.ivs;

import java.io.*;
import java.util.Scanner;

public class FileInOutTest2 {
	InputStream is = System.in;
	Scanner sc = new Scanner(System.in);
	final String filename = "C:/Users/admin/Desktop/Work/HelloIVS/data.txt";

	public void testWriteToFile() {
		while (true) {
			try {
				System.out.print("Nhap ky tu: ");
				char kt = sc.next().charAt(0);
				if (kt == '~')
					break;
				FileOutputStream fw = new FileOutputStream(filename, true);
				fw.write(kt);
				fw.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

	public void testReadFromFile() {
		try {

//			FileInputStream fw = new FileInputStream(filename);
//			int i;
//
//			while ((i = fw.read()) != -1) {
//				System.out.print((char) i + " ");
//			}
//			fw.close();
			FileInputStream fw = new FileInputStream(filename);
			byte[] bytes = new byte[fw.available()];
			int len = fw.read(bytes);
			String ketqua = new String(bytes, 0, len);
			System.out.print(ketqua);
			
			fw.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	public void addCustomer() {
		while (true) {
			try {
				FileOutputStream fw = new FileOutputStream(filename, true);
				DataOutputStream data = new DataOutputStream(fw);
				int no = 0;
				System.out.print("Nhap ma khach hang: ");
				String ma = sc.nextLine();
				System.out.print("Nhap ho ten khach hang: ");
				String ten = sc.nextLine();
				System.out.print("Nhap dia chi khach hang: ");
				String dc = sc.nextLine();
				System.out.print("Nhap danh so khach hang: ");
				Long ds = sc.nextLong();
				System.out.print("Nhap ~ de dung: ");
				char kt = sc.next().charAt(0);
				if (kt == '~')
					break;
				sc.nextLine();
				String giatri = new String(no+ma + " " + ten + " " + dc + " " + ds+"\n");
				byte[] b = giatri.getBytes();
				data.write(b);
				data.flush();
				data.close();
				no++;
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

	public void listCustomer() {
			try {
				FileInputStream fw = new FileInputStream(filename);
				DataInputStream data = new DataInputStream(fw);
				int row = 0;
				System.out.printf("|%3s | %-10s | %10s | %-15s | %8s|%n", //
						"No", "MAKH", "HO TEN", "DIA CHI", "DOANH SO");

				System.out.printf("|%3s | %-10s | %10s | %-15s | %8s|%n", //
						"--", "---------", "----------", "----------", "------");
				byte[] bytes = new byte[fw.available()];
				int len = fw.read(bytes);
				String ketqua = new String(bytes, 0, len);
				System.out.print(ketqua);
				
				
				data.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInOutTest2 file = new FileInOutTest2();
		// file.testWriteToFile();
		file.addCustomer();
		file.listCustomer();
		file.testReadFromFile();

	}

}