package com.ivs;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Main {
	public static void main(String[] args) {
		String txt = "nguyen van a";
		try {
			FileWriter fw = new FileWriter("data.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(txt);
			bw.close();
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
