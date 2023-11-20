//23-11-14-화 2)

package kr.or.ddit.study06.sec03.test01;

public class Book {
	/*
	 * 가격, 이름, 저자
	 */
	int price;
	String name;
	String writer;

	Book() {
	}

	Book(int price, String name, String writer) {
		this.price = price; //ctrl 누른 후 price 누르면!
		this.name = name; //this는 호출할때 쓰는거
		this.writer = writer;

	}

	@Override
	public String toString() {
		return "Book [price=" + price + ", name=" + name + ", writer=" + writer + "]";
	}

}