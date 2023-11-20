package kr.or.ddit.study05.sec02;

import java.util.Scanner;

public class ArrayExample01 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayExample01 obj = new ArrayExample01();
//		obj.method1();
//		obj.method2();
//		obj.method3();
		obj.method4();
		
	}

	private void method4() {
		/* 국어, 영어, 수학 입력받고
		 * 총점과 평균 얼마인지 배열로 구하기
		 */
		
		int sum = 0;
		double avg = 0;
		int[] arr = new int[3];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		avg = sum/3.0;
		System.out.println("합계: "+sum);
		System.out.println("평균 : "+avg);
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//	}
	}

	private void method3() {
/*
 * 배열선언 후 값을 scanner 통해 저장.
 * 
 * 전체 배열 출력해보기	
 */	
		String[] arr = new String[3];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextLine();
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
//		 string[] namee = new string[2];
//			String n1 = sc.nextLine();
//			String n2 = sc.nextLine();
//			String n3 = sc.nextLine();
//			String[] nam = {n1,n2,n3};
//			
//			for(int i=0; i<name.length; i++) {
//				String[] name = new String[i];
//				System.out.println(name[i]);
//			}
	}
	private void method2() {
		/*
		 * String[] name = new String[2];
		 * 
		 * name[0] = "홍길동";
		 * name[1] = "강감찬"ㅣ
		 * 
		 */
		String[] name = {"홍길동", "강감찬"};
		// arr.length 배열 길이
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i]);
		}
		
		/*
		 * int a;
		 * a=10;
		 * 
		 * int a = 10;
		 */
	}

	private void method1() {
		/*
		 * char		<- 배열 타입
		 * []		<- 변수 앞이나 뒤에  (웬만하면 앞에 붙이는게 나음!)
		 * alpabet 	<- 변수명
		 * new		<- 객체 생성
		 * char		<- 배열 타입
		 * [26]		<- 생성 숫자
		 */
		char[] alpabet = new char[26];
		for(int i=0; i<alpabet.length; i++) {
			alpabet[i] = (char)(i+65);
		}
		for(int i=0; i<alpabet.length; i++) {
			System.out.println(alpabet[i]);
		}
	}
}
