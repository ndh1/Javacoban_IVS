package com.ivs;

import java.util.Scanner;

public class Smenu7 {
	int n; //n là số thứ tự trong menu
	boolean a=true; //a để kiểm tra có dùng thêm món khác không
	public void Nhap()
	{
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập đồ uống từ 0 đến 9 trên menu");
		n=ip.nextInt();
	}
	public void XuatMenu() {
		//Xuất Menu ra
		System.out.println("Mời bạn chọn món");
		System.out.println("Menu Coffe");
		System.out.println("1.AmeriCano 1.25$");
		System.out.println("2.Espresso 2.50$");
		System.out.println("3.Ristretto 3.10$");
		System.out.println("4.Mocha 4.50$");
		System.out.println("5.Latte 5.10$");
		System.out.println("6.Vienna 6.27$");
		System.out.println("7.Glace 7.80$");
		System.out.println("8.Cappucino 8.25$");
		System.out.println("9.Macchiato 9.50$");
		System.out.println("0.Con Panna 0.95$");
	}

	public void XuatCoffe()
	{
		//Xuất giá tiền loại coffe
				switch(n) {
				case 1:
					System.out.println("1.25$");
					break;
				case 2:
					System.out.println("2.50$");
					break;
				case 3:
					System.out.println("3.10$");
					break;
				case 4:
					System.out.println("4.50$");
					break;
				case 5:
					System.out.println("5.10$");
					break;
				case 6:
					System.out.println("6.27$");
					break;
				case 7:
					System.out.println("7.80$");
					break;
				case 8:
					System.out.println("8.25$");
					break;
				case 9:
					System.out.println("9.50$");
					break;
				case 0:
					System.out.println("0.95$");
					break;
				default:
					System.out.println("Nhập khùng điên dì v bớt quậy đi");
					break;
			}
				


		
	}
	public void KiemtraOrderthem() {
		Scanner ip = new Scanner(System.in);
		int b;
		System.out.println("Bạn có muốn order thêm loại coffe nào hông nè ?");
		System.out.println("Không thì bấm phím 0 để thoát chương trình,ngược lại thì bấm phím 1 ?");
		b=ip.nextInt();
		do {
			if (b==1)
			{	
				a=true;
				Nhap();
				XuatCoffe();
				KiemtraOrderthem();
			}

		} while (a==false);
			
	}
	public static void main(String[] args) {
		Smenu7 menu7= new Smenu7();
		menu7.XuatMenu();
		menu7.Nhap();
		menu7.XuatCoffe();
		menu7.KiemtraOrderthem();
		
	}
}
