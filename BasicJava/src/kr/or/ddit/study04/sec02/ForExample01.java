package kr.or.ddit.study04.sec02;

import java.util.Scanner;

public class ForExample01 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ForExample01 obj = new ForExample01();
//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
		obj.method5();
	}

	private void method5() {
		/*
		 * 1~10까지 짝수의 합 구하기
		 */
		int sum = 0;
		//for(int i=2; i<=10; i=i+2) <- 이렇게 입력해두 댐
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("1~10까지의 짝수의 합은 :" + sum);
		
		
	}

	private void method4() {
		/*
		 * 1~10까지 홀수의 합 구하기
		 */
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 1) {
				sum += i;
			}
		}
		System.out.println("1~10까지의 홀수의 합은 :" + sum);

	}

	private void method3() {
		/*
		 * 입력 받은 단으로 구구단 출력해보기.
		 */
		System.out.print("원하는 단 입력 : ");
		int dan = sc.nextInt();
		for(int i=1; i<10; i++) {
			System.out.println(i+"X"+dan+"="+(dan*i));
		}
		
		
		
	}

	private void method2() {
		/*
		 * sum에 1~10까지의 값을 더할 것.
		 */
		int sum = 0;
		for(int i=1; i<11; i++) {
			sum += i;
			}
			System.out.println("1~10까지의 합은 : "+sum);
			
		
	}

	private void method1() {
		for(int i=0; i<10; i++) {
			System.out.println("현재 i 값은 :  "+i);
		}
	}
}
