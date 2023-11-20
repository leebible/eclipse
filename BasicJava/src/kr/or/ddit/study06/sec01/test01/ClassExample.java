//23.11.13
package kr.or.ddit.study06.sec01.test01;

public class ClassExample {
	public static void main(String[] args) {
		Product prod1 =new Product(); //prod1이라는 객체를 만든것
		prod1.prodname = "컴퓨터";
		prod1.prodno = 101;
		Product prod2 =new Product();
		prod2.prodname = "TV";
		Product prod3 =new Product();
		prod3.prodname = "스마트폰";
		
		System.out.println(prod1);
		System.out.println(prod2);
		System.out.println(prod3);
	}
}
