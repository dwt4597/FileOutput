package com.biz.fileread;

import java.io.*;

public class FileReader02 {

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
		
		// TextFile을 읽을때는 FileReader를, 다른 reader에 연결해서
		// 읽는것이 편리하다.
		BufferedReader buffer;
		
		try {
			
			//FileReader로 읽을 파일을 open 하고
			
			fr = new FileReader(readFile);
			// 그 정보를 BufferedReader에게 전달하면
			//	BufferedReader는 모든 파일을 읽어서
			// 메모리 buffer에 저장해 둔다.
			buffer = new BufferedReader(fr);
			// 버퍼에서 파일 내용 읽기
			/*
			String s = buffer.readLine();
			System.out.println(s);
			
			s = buffer.readLine();
			System.out.println(s);
			
			s = buffer.readLine();
			System.out.println(s);
			
			s = buffer.readLine();
			System.out.println(s);
			*/
			
			while(true) {
				//버파가 한 라인을 읽어서 문자열로 return
				String strLine = buffer.readLine();
				// 만약 버퍼가 return 한 문자열이 null이면
				// 더이상 읽을 내용이 없다는 것이다.
				if(strLine == null) { //읽을 값이 없으면, strLine에 null을 넣는다(시스템에서?)
				//그래서 읽기를 종료 (break)
					break;
				}
				//Null이 아니면, console에 내용을 보여라.
				System.out.println(strLine);
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
