package kr.or.ddit.study06.sec06.test04;

import java.util.Scanner;

import kr.or.ddit.study06.sec06.test03.Prod;

public class Practice04 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * 책 1. 전체조회 2. 신규 책 등록 3. 책 정보 변경 4. 책 정보 삭제
		 */
		/*
		 * 심화과제 1번힌트 : array copy 이용..?. 기존배열 복사? 선언하고 다시 넣고..?
		 * 
		 * 2번힌트 : for문 이용해서 똑같이 땡기면 됌
		 * 
		 * 1. 초기 배열 5개 5개보다 증가 한다면 5개 추가
		 * 
		 * 2. 책 정보 삭제시 빈 공간 앞으로 당겨오기 ex) b1 b2 b3 b4 null 1. b2 삭제 2. b1 null b3 b4 null
		 * 3. b1 b3 b4 null null
		 * 
		 */
		Practice04 obj = new Practice04();
		Book[] arr = new Book[10];
		int num = 0;
		while (true) {
			obj.printMenu();
			int sel = sc.nextInt();
			if (sel == 1)
				obj.printBook(arr);
			if (sel == 2) {
				Book b = obj.inputBook();
				arr[num++] = b;
			}
			if (sel == 3)
				obj.updateBook(arr);
			if (sel == 4)
				obj.deleteBook(arr);
			if (sel == 5)
				break;
//		else System.out.println("잘못 입력하셨습니다.");

		}
	}

	public void printMenu() {
		System.out.println(
				"* 1. 전체조회 .\r\n" + "* 2. 신규 책 등록 .\r\n" + "* 3. 전화번호 수정 .\r\n" + "* 4. 전화번호 삭제. \r\n" + "* 5. 종료");
	}

	public Book inputBook() {
		Book p = new Book();// 객체생성
		System.out.print("책 제목: ");
		p.setName(sc.next());

		System.out.print("작가: ");
		p.setWriter(sc.next());

		System.out.print("책종류: ");
		p.setSort(sc.next());

		System.out.print("가격:");
		p.setPrice(sc.nextInt());

		return p;
	}

	public void deleteBook(Book[] arr) {
		printBook(arr);
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

	public void updateBook(Book[] arr) {
		printBook(arr);
		System.out.println("수정할 상품번호를 선택해 주세요.");

		// 업데이트 될 상품 정보
		Book sel = null;
		int no = sc.nextInt();
		for (Book b : arr) {
			if (b == null)
				continue;
			if (b.getNo() == no) {
				sel = b;
			}
		}
	}

	public void printBook(Book[] arr) {
		System.out.println("   책이름\t작가\t책종류\t가격");
		for (Book book : arr) {
			if (book == null)
				break;
			System.out.println(book);
			// System.out.println(num+". "+p.getNumber() + "\t" +p.getName() +"\t"+p.get
		} // num++;

	}

}