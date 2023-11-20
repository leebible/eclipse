package kr.or.ddit.study05.sec02;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayExample02 obj = new ArrayExample02();
		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
	}

	private void method4() {
/*
 * 잔돈 반환 프로그램.
 * 
 * 10만 500원.		
 * 
 * 10000원 10개, 500원 	1개
 */
		int[] coin = {50000,10000, 5000, 1000, 500, 100, 10};
		int amt = sc.nextInt();
		for (int i = 0; i < coin.length; i++) {
			// 10000원으로 나누었을때 값이 있는지 없는지 비교.
			if(amt/coin[i] != 0) {
				System.out.println(coin[i]+" : "+amt/coin[i]+"개");
	
				
			}
			// 10000원에 나머지 값을 amt에 저장
			amt = amt%coin[i];
			
//			System.out.println(amt+"\t");
		}
		
	}

	private void method3() {
		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			int random = new Random().nextInt(45) + 1;
			lotto[i] = random;
			for (int j = 0; j < i; j++) {
				if (lotto[j] == random) {
					i--;
					break;
				}
			}
			System.out.print(lotto[i] + "\t");
		}
	}
	

	private void method2() {
		String[] name = { "홍길동", "이순신", "강감찬", "이성계", "세종" };
		int[] score = { 30, 85, 70, 95, 55 };
		for (int i = 0; i < score.length - 1; i++) {
			for (int j = 0; j < score.length - 1; j++) {
				if (score[j] < score[j + 1]) {
					int temp = score[j];
					score[j] = score[j + 1];
					score[j + 1] = temp;

					String temp1 = name[j];
					name[j] = name[j + 1];
					name[j + 1] = temp1;
				}
			}
		}
		for (int i = 0; i < score.length; i++) {
			System.out.println(name[i]+":"+score[i]+"점"+"\t");
		}
	}

	private void method1() {
		/*
		 * 30,85,70,95,55 값을 배열에 저장해보기.
		 */
		int[] score = { 30, 85, 70, 95, 55 };

		/*
		 * 버블 정렬 효율은 좋지 않지만 제일 쉬운 정렬! 퀵정렬이 더 좋은데 알고리즘 복잡함
		 */
		for (int i = 0; i < score.length-1; i++) {
			for (int j = 0; j < score.length-1; j++) {
				if (score[j] < score[j+1]) {
					int temp = score[j];
					score[j] = score[j+1];
					score[j+1] = temp;
				}
			}
		}
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + "\t");
		}
		System.out.println();
//		for (int i = 0; i < score.length; i++) {
//			for (int j = i + 1; j < score[i].length - 1; j++) {
//				if (score[i][5] > score[j][5]) {
//					int[] temp = score[i];
//					score[i] = score[j];
//					score[j] = temp;
		/*
		 * 선택정렬 효율 좋지 않음!
		 */
		for (int i = 0; i < score.length - 1; i++) {
			for (int j = i + 1; j < score.length; j++) {
				if (score[i] > score[j]) {
					int temp = score[i];
					score[i] = score[j];
					score[j] = temp;

				}
			}
		}

		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + "\t");
		}
	}
}
