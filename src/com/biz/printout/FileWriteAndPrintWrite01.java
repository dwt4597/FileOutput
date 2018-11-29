package com.biz.printout;

import java.io.*;

public class FileWriteAndPrintWrite01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String printFile = "D:/bizwork/workutf/ExFiles/filePrint01.txt";

		FileWriter fw;
		PrintWriter pw;

		try {
			// filewriter는 '추가'기능이 있음(실행때마다 추가되는거), 대신 불편함, 몇몇 언어들은 깨짐
			// pw는 간단한 대신 추가기능이 x. 그래서 끼워넣어서 둘이합쳐서? 사용.
			
			// 순서 지켜야함.
			// 1. fileWriter를 append 모드로 시작하고
			fw = new FileWriter(printFile, true);
			// 2. FileWriter를 PrinterWriter에 연결하면
			pw = new PrintWriter(fw);
			// 3. PrintWriter의 print() 메서드를 사용해서
			// 파일을 저장할 수 있다.

			for (int i = 0; i < 10; i++) {
				pw.println("우리나라만세 : " + i);

			}
			pw.close();
			fw.close();
			System.out.println("완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
