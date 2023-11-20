package kr.or.ddit.study04.homework;

import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork4 obj = new HomeWork4();
//		obj.process();
		obj.process2();
	}

	private void process2() {
		/*
		 * 각 변수에 로또 숫자 6개 넣을것
		 */
		int a1 = 0;
		int a2 = 0; 
		int a3 = 0;
		int a4 = 0;
		int a5 = 0;
		int a6 = 0;

	while(true) {	for (int i = 0; i < 6; i++) {
			int random = new Random().nextInt(45) + 1; // nextInt(45) 0~44의 값 ! 그래서 1을 더해줌
			if (i == 0) a1 = random; // if/for/while 모두 중괄호가 없어도 한줄까지(;까지)는 if문 안에 들어있다고 인식!
			if (i == 1) a2 = random;
			if (i == 2) a3 = random;
			if (i == 3) a4 = random;
			if (i == 4) a5 = random;
			if (i == 5) a6 = random;
		for (int j = 0; j < i; j++) {
					if (j == 0) {
					if (a1 == random) {
						i--;
						break;
					}
				}
				if (j == 1) {
					if (a2 == random) {
						i--;
						break;
//						a2 = new Random().nextInt(45) + 1;
//						continue;
					}
				}
				{
					if (j == 2) {
						if(a3==random) {
							i--;
							break;
						
//						while (a3 == a1 || a3 == a2) {
//							a3 = new Random().nextInt(45) + 1;
//							continue;
						}
					}
					if (j == 3) {
						if(a4==random) {
							i--;
							break;
//						while (a4 == a1 || a4 == a2 || a4 == a3) {
//							a4 = new Random().nextInt(45) + 1;
//							continue;
						}
					}

					if (j == 4) {
						if(a5==random) {
							i--;
							break;
							
//						while (a5 == a1 || a5 == a2 || a5 == a3 || a5 == a4) {
//							a5 = new Random().nextInt(45) + 1;
//							continue;
						}
					}
					if (j == 5) {
						if(a6==random) {
							i--;
							break;
//						while (a6 == a1 || a6 == a2 || a6 == a3 || a6 == a4 || a6 == a5) {
//							a6 = new Random().nextInt(45) + 1;
//							continue;
						}

					}
				}
			}

		}
		System.out.println(a1 + " " + a2+ " " + a3 + " " + a4 + " " + a5 + " " + a6); 
		}
	}
	
	



	private void process() {
		// 숫자 맞추기 게임을 완성해보자.

		int random = new Random().nextInt(100);
		int t = 0;
		while (true) {
			int num = sc.nextInt();
			t++;
			if (num > random) {
				System.out.println("DOWN");
			} else if (num < random) {
				System.out.println("UP");
			} else {
				System.out.println("정답은" + random + "입니다.");
				System.out.println(t + "번만에 정답을 맞췄습니다");
				break;
			}

		}

	}
}
