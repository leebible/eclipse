//23.11.13

package kr.or.ddit.study06.sec01.test02;

public class ClassExample02 {
public static void main(String[] args) {
	/*
	 * Book 이라는 클래스 만들어보고
	 * Book 이라는 필드 값에
	 * 각각
	 * 가격, 이름, 저자  새엇ㅇ해보기
	 */
	Book book1 =new Book(); //prod1이라는 객체를 만든것
	book1.price = 5000;
	book1.name = "황금종이";
	book1.writer = "조정래";

//	Book book1 =new Book(); //prod1이라는 객체를 만든것
	
//	Book book1 =new Book(); //prod1이라는 객체를 만든것
	System.out.println(book1);
//	System.out.println(book2);
//	System.out.println(book3);
}
}
