package kr.or.ddit.study02.sec3;

import java.util.Scanner;

public class ScannerTest {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ScannerTest obj = new ScannerTest();
		//obj.method1();
		//obj.method2();
		//obj.method3();
		 obj.method4();
	
//		System.out.println("입력받은 문자 값입니다."+s);
		;
	}

	private void method1() {
		System.out.println("메소드1입니다.");
		System.out.println("문자를 입력해보세요.");
		String s = sc.nextLine();
		System.out.println("입력받은 문자 값입니다." + s);

	}

	private void method2() {
		System.out.println("메소드2입니다.");
		/*
		 * 줄바꿈 기능 없음 system.out.print();
		 */
		System.out.print("홍길동");
		System.out.print("대전");
		System.out.print("중구");
		System.out.print("계룡로");
		/*
		 * 줄바꿈 기능 없음 system.out.println();
		 */
		System.out.println("홍길동");
		System.out.println("대전");
		System.out.println("중구");
		System.out.println("계룡로");

		/*
		 * 형식지정 문자열
		 * %[[-|0]n]d : 10진 정수 
		 * - : 왼쪽 정렬 
		 * 0 : 남는 왼쪽 빈공간에 0 채움 
		 * System.out.printf()
		 */
		System.out.printf("나이 : %d  \n", 20);
		System.out.printf("나이 : %8d  \n", 20);
		System.out.printf("나이 : %-8d  \n", 20);
		System.out.printf("나이 : %08d  \n", 20);

		/*
		 * 형식지정 문자열 
		 * %[[-|0]n].pf : 실수 
		 * 0 : 전체 자리수
		 * p : 소수점 이하의 자리수
		 */
		System.out.printf("키 : %8.2f  \n", 177.8);
		System.out.printf("키 : %-8.2f  \n", 177.8);
		System.out.printf("키 : %08.2f  \n", 177.8);

		/*
		 * 형식지정 문자열 
		 * %[[-|0]n]s : 문자열 
		 */
//		System.out.printf("이름 : %s \n", 어);
}
	
private void method3() {
	/*
	 * 이름 나이 키 입력 받아서 출력 해보기.
	 */

	System.out.print("이름 : ");
	String name = sc.nextLine();
	//System.out.println("이름 : " + name);
	
	System.out.print("나이 : ");
	int age = sc.nextInt();
	//System.out.println("나이 : " + age);
	
	System.out.print("키 : ");
	int key = sc.nextInt();
	System.out.printf("이름 : %s  나이 : %d  키 : %d ", name, age, key);
	}

private void method4() {
	/*
	 * 국어, 영어, 수학 점수 입력 받고
	 * 각 점수 출력 후 총점, 평균 출력. 
	 */
	
	System.out.print("국어 : ");
	int kor = sc.nextInt();
	System.out.print("영어 : ");
	int eng = sc.nextInt();
	System.out.print("수학 : ");
	int math = sc.nextInt();
	int sum = kor+eng+math;
	double avg = (kor+eng+math)/3.0;
	System.out.printf("총점 : %d  평균 : %.1f ", sum , avg);
	
}
}

