//23-11-14-화  4)

package kr.or.ddit.study06.sec03.test02;

public class Menu {
	/*
	 * 가게이름, 가격, 메뉴이름
	 * 을 필드로 선언하고
	 * 
	 * 생성자를 통해서 데이터를 넣어 볼것.
	 * 
	 * 생성자 만드는 법
	 * 	클래스명(입력할 파라미터1, 2, 3) {
	 * 		this.param1 = param1;
	 *  }
	 */
	String store;
	int price;
	String menu;
	Menu(String store, int price, String menu) {
		this.store = store; 
		this.price = price;
		this.menu = menu;
	} // ctrl + shift + s -> generate constructor using fields 누르면
	// 위에 것들이 자동 호출 됌!!
}
	 

