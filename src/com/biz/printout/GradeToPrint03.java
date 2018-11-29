package com.biz.printout;

import java.io.*;

public class GradeToPrint03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String saveFile = "D:/bizwork/workutf/ExFiles/gradeList.txt";
		// 파일 저장을 위한 객체 선언
		PrintWriter pw;
		try {
			// 파일 저장을 위한 객체 생성 = 파일을 저장하기(쓰기) 위해 open(create)
			pw = new PrintWriter(saveFile);
			for (int i = 0; i < 30; i++) {
				pw.print(i + 1); // 학번 생성 후 기록.
				pw.print(":");

				// 1번 과목 점수
				int intKor = ((int) (Math.random() * (100 - 50 + 1)) + 50);
				pw.print(intKor);
				pw.print(":");

				// 2번 과목 점수
				int intEng = ((int) (Math.random() * (100 - 50 + 1)) + 50);
				pw.print(intEng);
				pw.print(":");
				// 3번 과목 점수
				int intMath = ((int) (Math.random() * (100 - 50 + 1)) + 50);
				pw.print(intMath);
				pw.print(":");

				// 총점도 기록해달라.
				int intSum = intKor;
				intSum += intEng;
				intSum += intMath;

				pw.println(intSum);
			}
			// 파일정보 닫기 - 기록된 항목들이 파일에 저장됨
			pw.close();
			System.out.println("저성적 정보 저장 완료");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
