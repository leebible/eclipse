package kr.or.ddit.study04.homework;

import java.util.Scanner;

public class selfHomeWork3 {
Scanner sc = new Scanner(System.in);


public static void main(String[] args) {
	selfHomeWork3 obj = new selfHomeWork3();
//	obj.method1();
	obj.method2();
//	obj.method3();
//	obj.method4();

}

private void method4() {
	for (int h = 1; h < 6; h++) {// { 줄수
		for (int w = 0; w < 5 - h; w++) {// 공백출력
			System.out.print(" ");
		}

		for (int a = 0; a < (h * 2) - 1; a++) {
			System.out.print("*");
		}
		System.out.println("");
	}
}

private void method3() {
//	for (int h = 5; h > 0; h--) {//{ 줄수
//		for (int w = 1; w < h; w++) {// 공백출력
//			System.out.print(" ");
//		}
//			
//		for (int a = 1; a >0; a--) {
//			for (int star=6;star>h;star--)
//			System.out.print("*");}
//		System.out.println("");
//	}	
	for (int h = 2; h < 7; h++) {// { 줄수
		for (int w = 0; w < 6 - h; w++) {// 공백출력
			System.out.print(" ");
		}

		for (int a = 0; a < h - 1; a++) {
			System.out.print("*");
		}
		System.out.println("");
	}
}

private void method2() {
	for (int a = 0; a < 5; a++) {
		for (int b = 1; b < a + 1; b++) {
			System.out.print("");
		}
		

		for (int h = a; h <= a; h++) {// { 줄수
			for (int w = 5; w > h; w--) // 공백출력
				System.out.print("*");
		}
		System.out.println("");

	}
}


private void method1() {
	for(int h=5;h>0;h--) {
		for(int w=0;w<h;w++) {
			System.out.print("*");
		}
		System.out.println("");
	}
}
}
