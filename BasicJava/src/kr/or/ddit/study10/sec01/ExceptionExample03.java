package kr.or.ddit.study10.sec01;

import java.util.Scanner;

public class ExceptionExample03 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ExceptionExample03 obj = new ExceptionExample03();
		obj.test1();
	}

	private void test1() {
		test2();
		
	}

	private void test2() {
		test3();
		
	}
	private void test3() {
		System.out.println("문자를 입력해주세요");
//			int num = sc.nextInt();
		try {
			String str = sc.next();
			int num = Integer.parseInt(str);
		}catch (NumberFormatException e) {
			System.out.println("문자만 입력하세요.");
		}catch (Exception e) {
		}
		System.out.println("프로그램 실행 되고 있음.");
	}
	

	
}
