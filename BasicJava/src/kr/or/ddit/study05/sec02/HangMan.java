//23.11.13 1~5장까지 나갔고 이제 6장부터시작

package kr.or.ddit.study05.sec02;

import java.util.Arrays;
import java.util.Scanner;

public class HangMan {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HangMan obj = new HangMan();
		obj.process();
	}

	public void process() {
		/*
		 * 문자열 맞추는 게임 □□□□□ ex) 정답 : apple a 입력시 a□□□□ 완료 될때까지 시행
		 */
		int x = 0;
		String question = "apple";
		char[] answer = new char[question.length()];
		for (int i = 0; i < question.length(); i++) {
			answer[i] = '□';
		}
		System.out.println(Arrays.toString(answer));
		while (true) {
			for (int i = 0; i < question.length(); i++) {
				System.out.print(answer[i]);
				// 빈칸출력
			}
			System.out.println();
			// 문자열 입력 받기.
			System.out.println("단어를 맞춰 보세요 (입력 문자 하나) : ");
			String str = sc.nextLine();
			// 문자열에서 문자 첫번째 문자 하나 꺼내기.
			char ch = str.charAt(0);
			// 같은 문자열이 있다면 빈칸을 영어로 바꿔주기.
			for (int i = 0; i < question.length(); i++) {
				if (ch == question.charAt(i)) {
					x++;
					answer[i] = ch;
				}
			}
			String compare = "";
			for (int i = 0; i < answer.length; i++) {
				compare += answer[i];
			}
			if (compare.equals(question)) {
				break;
			}
			// 정답을 맞춘다면 완료.
		}
		// 실행하는데 걸린 횟수 출력 해주기.
		System.out.println("정답입니다. 시행 횟수는 : "+ x +"번 입니다.");
	}
}


