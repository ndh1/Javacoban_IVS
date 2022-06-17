package com;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.text.html.parser.DTD;

import org.omg.CORBA.portable.InputStream;

public class FileInOutTest {

	public static void testWriteToFile(String filename) {
		Scanner sc = new Scanner(System.in); //Khởi tạo scanner
		while (true) { //Khởi tạo vòng lặp 
			try {
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

	public static void testReadFromFile(String filename) {
		try {
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

	public static void addCustomer(String filename) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				FileOutputStream fw = new FileOutputStream(filename, true);
				DataOutputStream data = new DataOutputStream(fw);
				System.out.print("Nhap ma khach hang: ");
				String ma = sc.nextLine();
				System.out.print("Nhap ho ten khach hang: ");
				String ten = sc.nextLine();
				System.out.print("Nhap dia chi khach hang: ");
				String dc = sc.nextLine();
				System.out.print("Nhap danh so khach hang: ");
				Long ds = sc.nextLong();

				String giatri = new String(ma + "  " + ten + "  " + dc + "  " + ds + "\r\n"); // Gộp các dữ liệu lại thành 1 chuỗi 
				byte[] b = giatri.getBytes();
				data.write(b);
				data.flush();
				data.close();
				System.out.println("Succcess...");
				System.out.print("Nhap ~ de dung: ");
				char kt = sc.next().charAt(0);
				sc.nextLine();
				if (kt == '~')
					break;
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

	public static void listCustomer(String filename) {

		// while (true) {
		try {
			FileInputStream fw = new FileInputStream(filename);
			DataInputStream data = new DataInputStream(fw);

			System.out.printf("|%3s | %-10s | %10s | %-15s |%s\n", //
					"No", "MAKH", "HO TEN", "DIA CHI", "DOANH SO");

			System.out.printf("|%3s | %-10s | %10s | %-15s |%s\n", //
					"--", "---------", "----------", "----------", "------");

			byte[] bytes = new byte[data.available()]; //Khai báo mảng bytes có số lượng giá trị = ???
			int len = data.read(bytes); // ???????
			
			
			String ketqua = new String(bytes, 0, len); // ?????
			
			String[] row = ketqua.split("\r\n"); ///???
			
			
			int stt = 0;
			for (String list : row) {
				String[] colum = list.split("  ");
				stt++;
				String ma = colum[0];
				String ten = colum[1];
				String dc = colum[2];
				Long ds = Long.parseLong(colum[3]);
				System.out.printf("|%3d | %-10s | %10s | %-15s | %s \n", stt, ma, ten, dc, ds);
			}

			data.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		// }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename = "C:/Users/admin/Desktop/Work/HelloIVS/data.txt";
		// file.testWriteToFile();
		addCustomer(filename);
		listCustomer(filename);

	}

}