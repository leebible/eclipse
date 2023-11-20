package kr.or.ddit.study06.homework;

import java.util.Scanner;

//문제 3 – 세 과목의 성적을 입력 받고 총점과 합을 출력할 수 있는 Grade class를 설계하시오.
public class Grade {

	static Scanner sc = new Scanner(System.in);
	int kor =0;
	int math =0;
	int eng =0;

	public static void main(String[] args) {
		Grade obj = new Grade();
		System.out.print("국어점수를 입력하세요. : ");
		int kor = sc.nextInt();
		System.out.print("수학점수를 입력하세요. : ");
		int math = sc.nextInt();
		System.out.print("영어점수를 입력하세요. : ");
		int eng = sc.nextInt();
		System.out.println("국어: "+kor+",  수학: "+math+",  영어: "+eng);
		int sum = obj.sum(kor,math,eng);
		System.out.println("총점 : " + sum+"점");
	}
	public int sum(int kor, int math, int eng) {
		return kor + math + eng;
	}
	}
