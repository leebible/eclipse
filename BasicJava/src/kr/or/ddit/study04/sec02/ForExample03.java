package kr.or.ddit.study04.sec02;

import java.util.Scanner;

public class ForExample03 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ForExample03 obj = new ForExample03();
//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
//		obj.method5();
//		obj.method6();
		obj.method7();
		
	}

	private void method7() {
		for(int i=0;i<10;i++) {
			if(i>8) {
				continue;
			}
			System.out.println("i값은 : "+i);
		}
	}

	private void method6() {
		/*
		 * 숫자를 입력 받고 해당 숫자까지의 곱을 구해보자.
		 * 
		 * ex ) 5 -> 1*2*3*4*5
		 * 
		 */
		
		int num = sc.nextInt();
		int gop = 1;
		for(int i=1;i<=num;i++){
			gop *= i;
			
	}
		System.out.println(gop); }
	

	private void method5() {
/*
 * 소문자 문자열을 입력받고 모음을 제거하자.
 * apple -> ppl		
 * 
 * aeiou
 */
		String str = sc.nextLine();
		String result = "";
		for (int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(c =='a' || c=='e' || c=='i' || c=='o' || c=='u' ) {
				continue; //<-이걸 쓰면 else 안써도 됌!
			//}else {
			}result += str.charAt(i);
		

	}
		System.out.println(result);
		}

	private void method4() {
		/*
		 * 스캐너를 통해 숫자를 입력받고 홀수라면 1부터 해당 숫자까지 홀수의 합. 짝수라면 2부터 해당 숫자까지 짝수의 합.
		 * 
		 * ex ) 9 1~9 까지 홀수의 합.
		 * 
		 */
		int num = sc.nextInt();
		int sum = 0;
		if (num % 2 == 0) {
			for (int j = 2; j <= num; j = j + 2) {
				sum += j;

			}
		} else {
			for (int j = 1; j <= num; j = j + 2) {
				sum += j;
			}
		}
		System.out.println(sum);

	}

	private void method3() {
		/*
		 * 여러 문자를 입력 받아. a -> A 변환
		 * 
		 * A -> a 변환
		 */
		String str = sc.nextLine();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			int cp = 'a' - 'A';
			char change = ' ';
			if ('a' <= c && c <= 'z') {
				change = (char) (c - cp);
			}
			if ('A' <= c && c <= 'Z') {
				change = (char) (c + cp);
			}
			System.out.print(change);
		}
	}

	private void method2() {
		/*
		 * a->A 변환,
		 * 
		 * A->a 변환.
		 */

		char c = sc.nextLine().charAt(0);
		int cp = 'a' - 'A';
//		System.out.println(cp);
		if ('a' <= c && c <= 'z') {
			System.out.println("소문자->대문자");
			char change = (char) (c - cp);
			System.out.println(change);
		}
		if ('A' <= c && c <= 'Z') {
			System.out.println("대문자->소문자");
			char change = (char) (c + cp);
			System.out.println(change);
		}
	}

	private void method1() {
		/*
		 * a~z 까지 출력해주는 프로그램 만들기.
		 */

//		char c = 'a';
//		int i = c + 2;
//		char c2 = (char) i;
//		for (int j = 0; j < 26; j++){
//			System.out.println((char) (c + j));
//		}
		for (char c = 'a'; c <= 'z'; c++) {
			System.out.println(c + "\t");
		}

	}

}
