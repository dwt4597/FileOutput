package com.biz.fileread.exec;

import java.io.*;
import java.util.*;

import com.biz.fileread.vo.*;

public class WordService {

	private String readFile;
	private List<WordVO> wordList;
	private WordVO wordVO;

	// WordService 클래스의 생성자
	// WordService w = new WordWervice()문장이
	// 어디에선가 실행되면 호출되는 method
	public WordService() {
		readFile = "D:/bizwork/workutf/ExFiles/영단어.txt";
		wordList = new ArrayList();
	}

	public void makeWordList() {
		// TODO 영단어.tx 파일을 읽어서
		// 영문자와 한글풀이를 분해한 후
		// wordList에 담아 놓기

		// Text파일을 읽기위한 객체.
		FileReader fr;
		// Text파일을 문자열단위로 변환해서 읽기 위한 객체
		BufferedReader buffer;

		try {
			// TODO 파일 읽기 객체 초기화, 생성
			fr = new FileReader(readFile);
			buffer = new BufferedReader(fr);
			Scanner scanner = new Scanner(System.in);
			// TODO 문자열을 읽어서 wordList에 담기
			while (true) {

				// 한 라인씩 문자열로 읽기
				String strWord = buffer.readLine();

				// strWord가 null이면
				// buffer에 더이상 읽을 내용이 없으면
				if (strWord == null) {
					break;
				}

				// strWord가 null이 아닌경우 계속...

				// strWord에 담긴 문자열을 : 을 기준으로
				// 분해해서 영단어 한글 풀이를 분해해서
				// strWords 문자열 배열에 담아라.
				String[] strWords = strWord.split(":");

				// WordVO를 선언 생성해서
				// WordVO는 단어 한개의 영단어와 한글 풀이를
				// 담을 바구니 클래스다.
				WordVO vo = new WordVO();

				// 영단어와 한글 풀이를 변수에 setting
				vo.setStrEng(strWords[0]);
				vo.setStrKor(strWords[1]);

				wordList.add(vo);
			}

			buffer.close();
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // try end

		// 단어장이 wordList에 만들어진 상태이다.
		// wordList를 사용해서
		// 단어 게임을 만들어본다.

	}

	public void playGame() {

		// TODO 게임시작부분
		Scanner scanner = new Scanner(System.in);
		int intPass = 0;
		int intFail = 0;
		while (true) {
			// TODO 단어게임용 데이터 만들기
			// 같은 단어가 나오지 않도록 wordList를 뒤섞기
			Collections.shuffle(wordList);

			// 이 중에서 0번 위치의 단어 1개를 추출.
			WordVO vo = wordList.get(0);

			// 임의의 위치에서 1개의 단어를 추출.
			// 1. wordList가 몇개인가?
			int wordCount = wordList.size();

			// 2. 0부터 wordCount -1까지 중
			// 임의의 숫자 1개를 생성
			int intIndex = (int) (Math.random() * wordCount);
			// 3. 생성된 intIndex 위치의 단어 1개를 추출
			vo = wordList.get(intIndex);
			// TODO 단어게임 시작
			System.out.println("다음 풀이에 맞는 영단어를 입력하세요.");
			System.out.println(vo.getStrKor());
			System.out.print("단어(종료하려면 --end) >> ");

			// scanner처럼 장치와 관련된 클래스는, 한 코드에서
			// 여러번 다시 생성하는것이 좋지 않다.
			// Scanner scanner = new Scanner(System.in);
			// >>while문이 시작되기 전으로 이동한다
			// while문 안에서는 scanner를 계속 재활용한다.
			String inputEng = scanner.nextLine();

			if (inputEng.equals("--end")) {
				break;
			}
			// TODO 정오 판별
			if (inputEng.equalsIgnoreCase(vo.getStrEng())) {
				System.out.println("참 잘했다.");
				intPass++;
			} else {
				System.out.println("좀더 생각해보시지!!!");

				System.out.println("누적 틀린 개수" + (intFail + 1) + "\n" + "!!!!틀린개수 5개가되면, 종료됨.");
				System.out.println("정답 : " + vo.getStrEng());
				intFail++;
			}
			// TODO 결과표시
			System.out.println("-------------------------------");
			System.out.println("맞은개수 : " + intPass);
			System.out.println("틀린 개수 : " + intFail);
			System.out.println("===============================");

			if (intFail > 4) {
				break;
			}
		}
		System.out.println("GAME OVER..");
		/*
		 * 맞은개수가 몇개? 틀린 개수가 몇개? 몇개 이상 틀리면 강제 종료
		 * 
		 * 문제를 푸는 제한 시간 틀린 문제들만 다시 보여주기, 후 틀린문제들만 재시험
		 * 
		 */
	}

	public void getWord() {

		Collections.shuffle(wordList);
		int wordCount = wordList.size();
		int intIndex = (int) (Math.random() * wordCount);
		wordVO = wordList.get(intIndex);
		// --- 단어추출했음

	}

	public void shuffWord() {
		String[] s = wordVO.getStrEng().split("");
		List<String> shuffWord = Arrays.asList(s);
		Collections.shuffle(shuffWord);

		System.out.println(wordVO.getStrKor());
		System.out.println(shuffWord);
	}
}
