package com.ivs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
class InitArray
{
    int [] Element;
}
class IOArray extends InitArray
{
    void input_file() throws FileNotFoundException
    {
        FileInputStream fi = new FileInputStream("C:/Users/admin/Desktop/Work/HelloIVS/data.txt");
        Scanner inp = new Scanner(fi,"UTF-8");
        String temp = inp.nextLine(); //doc dong mang trong file
        inp.close();
        String [] item = temp.split(" "); //tach chuoi thanh cac phan tu chuoi
        Element = new int[item.length];
        for(int i=0; i<item.length; i++) //doi kiem string sang int cua cac phan tu
            Element[i] = Integer.parseInt(item[i]);
    }
    void output_file() throws IOException
    {
        FileOutputStream fo = new FileOutputStream("C:/Users/admin/Desktop/Work/HelloIVS/data.txt");
        PrintWriter out = new PrintWriter(fo);
        for (int i=0; i<Element.length; i++)
            out.printf("%-5d",Element[i]);
        out.close();
    }
}
 
class SortArray extends InitArray
{
    public void sort(IOArray A) //phuong thuc sap xep
    {
        Arrays.sort(A.Element);
    }
}
 
public class Array
{
    public static void main(String[] args) throws IOException
    {
        IOArray Arr = new IOArray();
        Arr.input_file(); //nhap tu file
        SortArray SArr = new SortArray();
        SArr.sort(Arr); //sap xep
        Arr.output_file(); //xuat ra file
        System.out.println("nSucces ! Open file output.txt to view");
    }
}
