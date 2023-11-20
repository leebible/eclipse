package kr.or.ddit.study06.sec06.test03;

import java.util.Scanner;

public class Answer01 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Answer01 a = new Answer01();
		a.start();
	}
	
	public void start() {

		Prod[] arr = new Prod[10];
		while (true) {
			print();
			int select = sc.nextInt();
			if (select == 1) printProdList(arr);
			if (select == 2) insertProd(arr);
			if (select == 3) updateProd(arr);
			if (select == 4) deleteProd(arr);
			if (select == 5) break;
		}
	}

	private void deleteProd(Prod[] arr) {
		printProdList(arr);
		System.out.println("삭제할 상품번호를 선택해 주세요.");
		int no = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null)
				continue;
			if (arr[i].getNo() == no) {
				arr[i] = null;
			}
		}
	}

	private void updateProd(Prod[] arr) {
		// 상품 전체 출력
		printProdList(arr);
		System.out.println("수정할 상품번호를 선택해 주세요.");

		// 업데이트 될 상품 정보
		Prod sel = null;
		int no = sc.nextInt();
		for (Prod p : arr) {
			if (p == null) continue;
			if (p.getNo() == no) {
				sel = p;
			}
		}
		System.out.println("이름");
		sel.setName(sc.next());
		System.out.println("가격");
		sel.setPrice(sc.nextInt());
		System.out.println("수량");
		sel.setQty(sc.nextInt());
		System.out.println("종류");
		sel.setSort(sc.next());

	}

	int num = 1; // 전역변수

	private void insertProd(Prod[] arr) {
		Prod prod = new Prod();
		System.out.println("이름");
		prod.setName(sc.next());
		System.out.println("가격");
		prod.setPrice(sc.nextInt());
		System.out.println("수량");
		prod.setQty(sc.nextInt());
		System.out.println("종류");
		prod.setSort(sc.next());
		arr[num++] = prod;
	}

	public void printProdList(Prod[] arr) {
		System.out.println("상품이름\t상품종류\t상품가격 \t재고수량");
		for (Prod prod : arr) {
			if (prod == null)
				break;
			System.out.println(prod);
		}
	}

	public void print() {
		System.out.println(
				"* 1. 상품조회 .\r\n" + "* 2. 상품 신규 등록.\r\n" + "* 3. 상품 정보 변경.\r\n" + "* 4. 상품 삭제. \r\n" + "* 5. 종료 ");

	}

}