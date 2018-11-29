package com.biz.fileread;

import java.io.*;

public class FileReader01 {

	/*
	 * 파일을 저장할때는 몇개(라인)를 저장할 지 알고있다.
	 * 하지만 읽을때는 몇개가 저장되어 있는지 모르는 경우가 대부분이다.(다른사람의 파일을 '읽을'때)
	 * 그래서 읽을때는 읽는 방법을 연구할 필요가 있다.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String readFile = "D:/bizwork/workutf/ExFiles/gradeList.txt";
		
		//파일을 읽기 위한 FileReader 객체 선언
		FileReader fr;
		
		try {
			//저장할 땐, 몇개 저장할지 알고있다. (gradetoprint03에서 이 부분.)
			//
			fr = new FileReader(readFile);
			// 파일을 읽을때 몇개(몇 라인)이나 일거양 될지 모르는 상황에서
			// 읽을 라인을 설정하는 좋은 방법이 아니다.
			for (int i = 0 ; i<30; i++) {
				int intRead = fr.read();
				System.out.print((char)intRead);
			
			}
			
			//파일을 읽을때는 while() 반복문을 사용해서 읽는 것이
			// 기본 코드 원칙이다.
			while(true) {
				int intRead = fr.read();
				if(intRead < 0) {  
					break;
				}
				System.out.print((char) intRead);
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
