package kr.or.ddit.basic;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest04 {
	/*
	 * 문제3) '문제2'에서 입력하는 별명의 길이가 같은것이 있을 수 있을때 결과를 출력하시오. (제일 긴별명이 두개면 두개다 출력하기)
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<String> max = new ArrayList<String>();
		for(int i=1; i<=5; i++) {
			System.out.print(i+"번째 별명을 입력하세요:");
			String name = sc.nextLine();
			names.add(name);
		}
		
		int maxlength = names.get(0).length();
		for(int i=1; i<names.size(); i++) {
			if(maxlength<names.get(i).length()) {
				maxlength = names.get(i).length();
			}
		}
		for(String name : names) {
			if(name.length() == maxlength) {
				System.out.println("길이가 긴 별명 : "+name);
			}
		}
		
		
		
		
		
		
//		양샘이 해준답
//		int m =0;
//		for (String string : names) {
//			if(string.length() >m) {
//				max.clear();
//				max.add(string);
//				m = string.length();
//			}
//			else if(string.length() ==m) max.add(string);
//		}
		
		
		
		
		
		
		
		
//		내가 푼답
//		String max2 = "";
//		for (int i = 0; i < 5; i++) {
//			String name = sc.nextLine();
//			names.add(name);
//			if (names.get(i).length() > max2.length()) {
//				max2 = names.get(i);
//			}
//		}
//			max.add(max2);
//		for (int i = 0; i < 5; i++) {
//			if(names.get(i).length() == max2.length() && names.get(i)!=max2) {
//				max.add(names.get(i));
//			}
//		}
//		System.out.println("별명의 길이가 제일 긴 별명 : " + max);
	}
}
