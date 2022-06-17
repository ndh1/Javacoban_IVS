package com.ivs;

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class FileInOutTest {
	

		String id;
		String hoten;
		String diachi;
		String doanhso;

	
	private final static String FILE_URL ="C:/Users/admin/Desktop/Work/HelloIVS/data.txt";
	 
	    public static void main(String[] args) throws IOException {
	    	FileInOutTest abc = new FileInOutTest();
	    	abc.addCustomer();
	    	abc.Xuat();
	    }
	    
	    
	    public void addCustomer() throws IOException {
	    	Scanner ip = new Scanner(System.in);
	    	int n;
	    	
	    	System.out.println("Nhập số lượng khách hàng muốn nhập nè ^.^");
	    	n=ip.nextInt();
	    	ip.nextLine();
	    	System.out.println("Số lượng khách hàng nhập là:"+n);
	    	String []a = new String[n];

	    	for(int i=0;i<=n-1;i++)
	    	{
	    		System.out.println("Nhap id");
				a[i] = ip.nextLine();
//		    	System.out.println("Nhap fullname");
//				a[i+1] = ip.nextLine();
//				System.out.println("Nhap dia chi");
//				a[i+2] = ip.nextLine();
//				System.out.println("Nhap doanh so");
//				a[i+3]=ip.nextLine();
	    	}
	    	ArrayList<String> AA = new ArrayList<String>(Arrays.asList(a));

	    	
	    	
	    	ArrayList<String> data = AA;
	        Scanner sc = new Scanner(System.in);
	        File file = new File(FILE_URL);
	        OutputStream outputStream = new FileOutputStream(file);
	        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
	    	
	        for (String item: data){
	            outputStreamWriter.write(item);
	            // Dùng để xuống hàng
	            outputStreamWriter.write("\n");
	        }
	        // Đây là phương thức quan trọng!
	        // Nó sẽ bắt chương trình chờ ghi dữ liệu xong thì mới kết thúc chương trình.
	        outputStreamWriter.flush();
	    }
	    
	    
	    public void Xuat() throws IOException {
	        File file = new File(FILE_URL);
	        InputStream inputStream = new FileInputStream(file);
	        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
	        BufferedReader reader = new BufferedReader(inputStreamReader);
	        String line = "";
	        while((line = reader.readLine()) != null){
	            System.out.println(line);
	        }
	    }
	}

