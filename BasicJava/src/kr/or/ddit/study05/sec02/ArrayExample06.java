//23-11-10 금(3)
package kr.or.ddit.study05.sec02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample06 {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		ArrayExample06 obj = new ArrayExample06();
		obj.method1();
	}
	
	private void method1() {
		/*
		 * 5명의 국어 영어 수학 점수를
		 * 2차원 배열을 이용해 선언 및 값을 저장 하세요.
		 * score <-
		 * 스캐너 x
		 * 
		 * 5명의 이름을 저장한 배열 선언.
		 * name <-
		 */
		int[][] score = { {90,65,77,0,0,1},
				          {85,92,72,0,0,1},
				          {69,82,79,0,0,1},
				          {100,69,87,0,0,1},
				          {90,65,67,0,0,1},
		                };
		String [] name = {"미연","민니","소연","우기","슈화"};
		/*
		 * 총점, 평균, 등수 구하기
		 */
		/*
		 * 1. 총점 구하기 11:10분까지
		 */
		for (int i = 0; i < score.length; i++) {

			/*
			 * 1번방법) int[] arr = score[i]; int sum = arr[0]+arr[1]+arr[2]; arr[3] = sum;
			 */
			/*
			 * 2번방법) int sum = score[i][0]+score[i][1]+score[i][2]; score[i][3]=sum;
			 */
			score[i][3] = score[i][0] + score[i][1] + score[i][2];
			score[i][4] = score[i][3] / 3;
		}

		// 등수 구하기.
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score.length; j++) {
				if (score[i][3] < score[j][3]) score[i][5]++;
			}
		}

		for(int i=0;i<score.length;i++) {
			System.out.println(Arrays.toString(score[i]));
		}
		
		// 각 값 알아보기
//		System.out.println(Arrays.toString(score));
//		System.out.println(Arrays.toString(score[0]));
//		System.out.println(score[1]);
//		System.out.println(score[2]);
//		System.out.println(score[3]);
//		System.out.println(score[4]);
		
		for (int i = 0; i < score.length; i++) {
			System.out.print(name[i] + " : \t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println();
		}
		/*
		 * 등수 순서대로 출력해보기
		 * 정렬 알고리즘 적용
		 */
		for (int i = 0; i < score.length; i++) {
			for (int j = i + 1; j < score[i].length - 1; j++) {
				if (score[i][5] > score[j][5]) {
					int[] temp = score[i];
					score[i] = score[j];
					score[j] = temp;
				}
			}
			System.out.println(Arrays.toString(score[i]));
		}
		//이기현님이 하신것 가져옴,,,,,,,
		System.out.println();
		System.out.println();

		System.out.println("\t\t\t성적표 ");
		System.out.println("------------------------------------------------------");
		System.out.println("이름\t 국어\t 영어\t 수학\t 총함\t 평군\t 석차\t");
		System.out.println("------------------------------------------------------");
		for (int i = 0; i < score.length; i++) {
			System.out.print(name[i] + " : \t");
			for(int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}

			System.out.println();
		}
	}
	}

			
			
//			int sum = 0;
//			double avg = 0;
//			for (int j = 0; j < score[i].length; j++) {
//				sum += score[i][j];
//				avg = sum/3.0;
//			}
//			System.out.println((i + 1) + "번학생의 총점 : " + sum + "점, " + " 평균 :"+avg+"점, "+" 등수 :");
//		}
//	
//	}


