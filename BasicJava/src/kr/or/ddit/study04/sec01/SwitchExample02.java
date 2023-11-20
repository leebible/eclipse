package kr.or.ddit.study04.sec01;

import java.util.Scanner;

public class SwitchExample02 {
	Scanner sc = new Scanner(System.in);

public static void main(String[] args) {
	SwitchExample02 obj = new SwitchExample02();
	obj.method1();
}

private void method1() {
	/*
	 * 점수를 입력받아서 A~F 학점 출력하기.
	 */
	
	int score = sc.nextInt();
	
	switch(score/10) {
	case 10: 	case 9: 
		System.out.println("B학점");
		break;
	case 8: 
		System.out.println("C학점");
		break;
	case 7: 
		System.out.println("D학점");
		break;
	default: 
		System.out.println("F학점");
		break;
	}
	
  }
	}
	