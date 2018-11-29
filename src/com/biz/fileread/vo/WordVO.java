package com.biz.fileread.vo;

public class WordVO {

	// 2rodml member변수를 선언하고
	private String strEng;
	private String strKor;

	// member변수에 값을 저장, 읽기를 수행하기 위해
	// getter와 setter를 생성.
	public String getStrEng() {
		return strEng;
	}

	public void setStrEng(String strEng) {
		this.strEng = strEng;
	}

	public String getStrKor() {
		return strKor;
	}

	public void setStrKor(String strKor) {
		this.strKor = strKor;
	}

}
