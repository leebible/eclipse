//23-11-10 금
package kr.or.ddit.study05.homework;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork7 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork7 obj = new HomeWork7();
//		obj.method1();
//		obj.mehtod2();
	}

	private void method1() {

		int[][] score = { { 90, 65, 77, 0, 0, 1 },
				{ 85, 92, 72, 0, 0, 1 },
				{ 69, 82, 79, 0, 0, 1 },
				{ 100, 69, 87, 0, 0, 1 }, 
				{ 90, 65, 67, 0, 0, 1 }, };
		String[] name = { "미연", "민니", "소연", "우기", "슈화" };

		for (int i = 0; i < score.length; i++) {

			score[i][3] = score[i][0] + score[i][1] + score[i][2];
			score[i][4] = score[i][3] / 3;
		}

		// 등수 구하기.
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score.length; j++) {
				if (score[i][3] < score[j][3])
					score[i][5]++;
			}
		}

		// 삽입정렬
		for (int i = 0; i < score.length; i++) {
			for (int j = i + 1; j < score[i].length - 1; j++) {
				if (score[i][5] > score[j][5]) {
					int[] temp1 = score[i];
					score[i] = score[j];
					score[j] = temp1;

					String temp2 = name[i];
					name[i] = name[j];
					name[j] = temp2;
				}
			}
			System.out.print(name[i] + " : \t");
			System.out.println(Arrays.toString(score[i]));
		}
	}
		
		private void method2() {
			
			int[][] score = { { 90, 65, 77, 0, 0, 1 },
					{ 85, 92, 72, 0, 0, 1 },
					{ 69, 82, 79, 0, 0, 1 },
					{ 100, 69, 87, 0, 0, 1 }, 
					{ 90, 65, 67, 0, 0, 1 }, };
			String[] name = { "미연", "민니", "소연", "우기", "슈화" };

			for (int i = 0; i < score.length; i++) {

				score[i][3] = score[i][0] + score[i][1] + score[i][2];
				score[i][4] = score[i][3] / 3;
			}

			// 등수 구하기.
			for (int i = 0; i < score.length; i++) {
				for (int j = 0; j < score.length; j++) {
					if (score[i][3] < score[j][3])
						score[i][5]++;
				}
			}
			// 버블 정렬
			for (int i = 0; i < score.length - 1; i++) {
				for (int j = 0; i < score.length - 1; j++) {
					if (score[j][5] > score[j + 1][5]) {
						int[] temp = score[j];
						score[j] = score[j + 1];
						score[j + 1] = temp;

						String temps = name[j];
						name[j] = name[j + 1];
						name[j + 1] = temps;
					}
				}
			}
		}
	}