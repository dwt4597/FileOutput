package com.biz.fileout;

import java.io.*;

public class testtt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String writerFile = "	\"D:/bizwork/workutf/ExFiles/gugudanfileW01.txt\";\r\n"; 
		try {
			FileWriter fw = new FileWriter(writerFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

}
