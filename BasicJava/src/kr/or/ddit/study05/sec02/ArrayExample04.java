//23-11-10 금(1)
package kr.or.ddit.study05.sec02;

import java.util.Scanner;

public class ArrayExample04 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayExample04 obj = new ArrayExample04();
//		obj.method1();
//		obj.method2();
//		obj.method3();
		obj.method4();
	}

	private void method4() {
		int[][] scores = new int[3][3];
		/*
		 * 스캐너를 통해 1,2,3 학생에 국어, 영어, 수학 점수 입력 받기
		 */
		for (int i = 0; i < scores.length; i++) {
			System.out.println((i + 1) + " 학생의 국어, 영어, 수학 점수 입력 : ");
			int kscore = sc.nextInt();
			int escore = sc.nextInt();
			int mscore = sc.nextInt();
			scores[i][0] = kscore;
			scores[i][1] = escore;
			scores[i][2] = mscore;

		}

	}

	private void method3() {
		int[] s1 = { 85, 90, 77, 0 }; //국어, 영어, 수학
		int[] s2 = { 91, 76, 68, 0 };
		int[] s3 = { 100, 90, 89, 0 };

		int[][] scores = new int[3][4];
		scores[0] = s1; //첫번째학생
		scores[1] = s2;
		scores[2] = s3;
		
		/*
		 * 1번째 학생에 영어
		 * 2번째 학생에 영어 수학점
		 * 3번째 학생에 국어점수 각각 출력해보기.
		 */
		int s1e = scores[0][1]; // 첫번째 학생의 영어점수
		int s2e = scores[1][1]; // 두번째 학생의 영어점수
		int s2m = scores[1][2]; // 두번째 학생의 수학점수
		int s3k = scores[2][0]; // 세번째 학생의 국어점수
	
	}

	private void method2() {
		int[] s1 = { 85, 90, 77, 0 };
		int[] s2 = { 91, 76, 68, 0 };
		int[] s3 = { 100, 90, 89, 0 };

		/*
		 * 2차원배열
		 * 
		 * int[][] <- 타입 
		 * scores <- 변수명 
		 * new <- 객체 생성 
		 * int[3] <- 1차원 배열의 수  [3] <- 1차원 배열
		 * 길이;
		 */
		int[][] scores = new int[3][4];
		scores[0] = s1;
		scores[1] = s2;
		scores[2] = s3;
		
		//총점 구하기
		for(int i=0;i<scores.length;i++) {
			int sum =0;
			for(int j=0;j<scores[i].length;j++) {
				sum+=scores[i][j];
			}
			scores[i][3] = sum;
			System.out.println(sum);
		}
		//출력하기
		for(int i=0; i<scores.length;i++) {
			for(int j=0; j<scores[i].length-1; j++) {
				System.out.print(scores[i][j]+"\t");
			}
			System.out.println("총점 : " +scores[i][3]/3.0);
 		}
	}

	private void method1() {
		/*
		 * 학생 3명의 국어, 영어, 수학 점수 저장해보기. 스캐너 사용x
		 */

		// String[] name = {"A", "B", "C"};
		int[] s1 = { 85, 90, 77 };
		int[] s2 = { 91, 76, 68 };
		int[] s3 = { 100, 90, 89 };

		/*
		 * s1 출력 예시 85,90,77 평균 : 77.4
		 */
		double sum1 = 0;
//		double avg = 0;
		for (int i = 0; i < s1.length; i++) {
			sum1 += s1[i];
//			avg = sum1 / s1.length;
		}
		double sum2 = 0;
		for (int i = 0; i < s1.length; i++) {
			sum2 += s2[i];
//			avg = sum2 / s1.length;
		}
		double sum3 = 0;
		for (int i = 0; i < s1.length; i++) {
			sum3 += s3[i];
//			avg = sum3 / s1.length;
		}

		// 출력하기
		for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i] + "\t");
		}
		System.out.println("총점:" + sum1 / s1.length);

		for (int i = 0; i < s1.length; i++) {
			System.out.println(s2[i] + "\t");
		}
		System.out.println("총점:" + sum2 / s1.length);

		for (int i = 0; i < s1.length; i++) {
			System.out.println(s3[i] + "\t");
		}
		System.out.println("총점:" + sum3 / s1.length);

	}
}
