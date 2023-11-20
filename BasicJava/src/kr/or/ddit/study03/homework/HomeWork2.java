package kr.or.ddit.study03.homework;

import java.util.Scanner;

public class HomeWork2 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork2 obj = new HomeWork2();
		obj.method1();
	}
		private void method1() {
			
			System.out.println("입력해주세요");
		int year = sc.nextInt();
		boolean a = year%4==0;
		boolean b = year%100!=0;
		boolean c = year%400==0;
		
		
		// if(c || (a && b) <- 이렇게 하는게 더 정확 (선생님답)
		if(a && b || c) {
			System.out.println("윤년입니다.");
		
		}else {
			System.out.println("평년입니다.");
		}
				String str = "15";
						boolean value =Boolean.parseBoolean(str);
	}
}
