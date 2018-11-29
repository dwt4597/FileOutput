package com.biz.printout;

import java.io.*;

public class Print03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String printFile = "D:/bizwork/workutf/ExFiles/my1.txt";
		PrintWriter pw;
		try {
			pw = new PrintWriter(printFile);
			pw.println("반갑습니다");
			pw.println("우리나라만세");
			pw.close();
			System.out.println("파일저장완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
