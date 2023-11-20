package kr.or.ddit.study04.sec02;

import java.util.Scanner;

public class ForExample02 {
Scanner sc = new Scanner(System.in);

public static void main(String[] args) {
	ForExample02 obj = new ForExample02();
//	obj.method1();
	obj.method2();
}

private void method2() {

	for (int h = 0; h < 5; h++) {
		for (int w = 0; w < 5; w++) {
			System.out.print("*");
		}
		System.out.println();
	}

	for (int h = 0; h < 5; h++) {
		for (int w = 0; w < h + 1; w++) {
			System.out.print("*");
		}
		System.out.println("");
	}

	for (int h = 5; h > 0; h--) {
		for (int w = 0; w < h - 1; w++) {
			System.out.print("*");
		}
		System.out.println("");
	}
}

private void method1() {
	/*
	 * 구구단 전체 출력 2중 포문
	 */

	for (int dan = 2; dan < 10; dan++) {
		for (int j = 1; j < 10; j++) {
			System.out.println(dan + "X" + j + "=" + dan * j);
		}
		System.out.println("");
	}
}
}
