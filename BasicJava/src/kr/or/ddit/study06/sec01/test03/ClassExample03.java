//23.11.13

package kr.or.ddit.study06.sec01.test03;

public class ClassExample03 {
	public static void main(String[] args) {

		/*
		 * Pen 클래스 만들기 색갈, 길이, 이름
		 */
		Pen pen1 = new Pen(); // prod1이라는 객체를 만든것
		pen1.color = "Red";
		pen1.length = 50;
		pen1.name = "빨강";
		
		Pen pen2 = new Pen(); // prod1이라는 객체를 만든것
		pen2.color = "Red";
		pen2.length = 50;
		pen2.name = "빨강";
		
		System.out.println(pen1);
		System.out.println(pen2);

	}
}
