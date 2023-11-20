//23.11.13

package kr.or.ddit.study06.sec01.test04;

public class ClassExample04 {
	public static void main(String[] args) {
		/*
		 * Menu 클래스 생성
		 * 0. 가게이름
		 * 1. 가격
		 * 2. 이름
		 */
		Menu m1 = new Menu();
		m1.name = "갈비탕";
		m1.price = 13000;
		Menu m2 = new Menu();
		m2.name = "등심돈까스";
		m2.price = 8000;
		System.out.println(m1);
		System.out.println(m2);
		
	}
}
