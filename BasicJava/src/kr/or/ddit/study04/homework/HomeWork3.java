package kr.or.ddit.study04.homework;

import java.util.Scanner;

public class HomeWork3 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork3 obj = new HomeWork3();
	obj.method1();
//	obj.method2();
//	obj.method3();
//	obj.method4();

	}


	
	private void method4() {
//		6)
//	     *
//	    ***
//	   *****
//	  *******
//	 *********
		System.out.println("method4");
		for (int h = 0; h < 5; h++) {// { 줄수
			for (int w = 0; w < 4-h ; w++) {// 공백출력
				System.out.print(" ");
			}

			for (int w = 0; w < 2*h+1; w++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	private void method3() {
//	    5)
//	   	 *
//	    **
//	   ***
//	  ****
//	 *****
		System.out.println("method3");
		for (int h = 0; h < 5; h++) {// { 줄수
			for (int w = 0; w < 4-h; w++) {// 공백출력
				System.out.print(" ");
			}

			for (int w = 0; w < h+1; w++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	private void method2() {
//		4)
//     *****
//      ****
//       ***
//        **
//         *
		System.out.println("method2");
		for (int h = 0; h < 5; h++) {
			for (int w = 0; w < h; w++) {
				System.out.print(" ");
			}

			for (int w = 0; w < 5 - h; w++) {
				System.out.print("*");
			}
			System.out.println("");

		}
	}

	private void method1() {
//3)
//*****
//****
//***
//**
//*
		System.out.println("method1");
		for (int h = 5; h > 0; h--) {
			for (int w = 0; w < h; w++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
