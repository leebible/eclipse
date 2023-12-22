package kr.or.ddit.basic;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest03 {
	public static void main(String[] args) {
		/*  문제2) 5명의 별명을 입력 받아 ArrayList에 저장하고
	        이들 중에서 별명의 길이가 제일 긴 별명을 출력하시오.
	     (단, 각 별명의 길이는 모두 다르게 입력한다.)	*/
		
//		Scanner sc = new Scanner(System.in);
//		ArrayList<String> names = new ArrayList();
//
//		String max = "";
//		for (int i = 0; i < 5; i++) {
//			String name = sc.nextLine();
//			names.add(name);
//			if (names.get(i).length() > max.length()) {
//				max = names.get(i);
//			}
//		}
//			System.out.println("별명의 길이가 제일 긴 별명 : "+max);
		
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<String>();
		for(int i=1;i<=5;i++) {
			System.out.print(i+"번째 별명을 입력하세요 :");
			String name = sc.nextLine();
			names.add(name);
		}
		
		//제일 긴 별명이 저장될 변수를 선언하고, List의 첫번째 데이터로 초기화를 한다.
		String max = names.get(0);
		for(int i=1; i<names.size();i++) {
			if( max.length() <names.get(i).length()) {
				max = names.get(i);
			}
		}
		System.out.println("제일 긴 별명 : " + max);
		
		
		
		
		
		
		
		
		
	}
}
		

		
