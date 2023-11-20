package kr.or.ddit.study05.homework;

import java.util.Random;
import java.util.Scanner;

public class HomeWork5 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork5 obj = new HomeWork5();
		obj.process();
	}

	private void process() {
		String[] words = { "apple", "banana", "melon", "strawberry" };
		int ran = new Random().nextInt(words.length);
		String ans = words[ran];
		// 단어 문자들 섞기
		char[] cArray = ans.toCharArray(); //문자열을 하나하나쪼개서 배열로 넣기
		for(int i=0; i<100000; i++) {
			int suffle =new Random().nextInt(ans.length());
			char temp = cArray[0];
			cArray[0] = cArray[suffle];
			cArray[suffle] = temp;
		}
		/*
		 * 맞출때 까지 실행할 것. .
		 * 맞출 경우 종료 후 실행 횟수 출력
		 */
		for(int i=0; i<cArray.length; i++) {
			System.out.print(cArray[i]);
		}
			int x=0; // 횟수측정변수

	  while(true) {
		  String quiz = sc.nextLine();
		  x++; //횟수를 측정
		  if(quiz.equals(ans)) {
			  System.out.println("정답입니다."+x+"번 만에 맞추셨습니다.")
			  ;
			  break;
		  }else {
			  System.out.println("틀렸습니다.");
		  }
	  }
		}
	}



