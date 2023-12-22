package kr.or.ddit.basic;

import java.util.ArrayList;
import java.util.Scanner;

/*
   		문제1) 5명의 사람 이름을 입력받아 ArrayList에 저장한 후에
   		         이들 중에서 '김'씨 성의 이름을 모두 출력하시오.
   		    (단, 입력은 Scanner객체를 이용한다.)
   		    
   		문제2) 5명의 별명을 입력 받아 ArrayList에 저장하고
   		        이들 중에서 별명의 길이가 제일 긴 별명을 출력하시오.
   		     (단, 각 별명의 길이는 모두 다르게 입력한다.)
   		     
   		문제3) '문제2'에서 입력하는 별명의 길이가 같은것이 있을 수 있을때
   		        결과를 출력하시오. (제일 긴별명이 두개면 두개다 출력하기)
 */

public class ArrayListTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> names = new ArrayList();

		for (int i = 0; i < 5; i++) {
			System.out.println(i + "번째 이름 :");
			String name = sc.nextLine();
			names.add(name);
		}
//		내가 푼 과제
//		for (String name : names) {
//			if (name.contains("김")) {
//				System.out.println("김씨 이름 출력 : "+name);
//			}

		for (int i = 0; i < names.size(); i++) {
//			방법1
			if(names.get(i).substring(0,1).equals("김")){
				System.out.println(names.get(i));
			}
//			방법2
			if (names.get(i).charAt(0) == '김') {
				System.out.println(names.get(i));
			}
//			방법3
			if ( names.get(i).startsWith("김")) {
				System.out.println(names.get(i));
			}
//			방법4
			if ( names.get(i).indexOf("김")==0) {
				System.out.println(names.get(i));
			}
		}
	}
}
