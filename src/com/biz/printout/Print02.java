package com.biz.printout;

import java.io.*;
import java.util.*;

public class Print02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String printFile = "D:\\bizwork\\workutf\\ExFiles\\my.txt";

		printFile = "D:/bizwork/workutf/ExFiles/my.txt";

		InputStream in = System.in;
		Scanner s = new Scanner(in);

		// 1.PrintWriter를 이용해서 객체를 선언
		PrintWriter pw; // =null이 생략되어있음;

		// 2. 객체를 초기화
		try {
			// Printwriter를 사용해서 file을 생성하려면
			// 객체 초기화문을 반드시 try..catch 문으로
			// 감싸줘야한다.
			// ( pw = new PrintWriter(printFile);만 작성하면 빨간밑줄 -> 마우스올려서 ->try ...catch
			pw = new PrintWriter(printFile);
			for (int i = 0; i < 100; i++) {
				int rndNum = (int) (Math.random() * 100) + 1;
				pw.println(rndNum);
			}
			pw.close();
			System.out.println("파일 저장 완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
