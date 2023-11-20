package kr.or.ddit.study06.sec06.test03;

import java.util.Scanner;

public class Practice01 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		/*
		 * 편의점
		 * 1. 상품조회
		 * 2. 상품 신규 등록
		 * 3. 상품 정보 변경
		 * 4. 상품 삭제
		 * 
		 */
		Practice01 obj = new Practice01();
		Prod[] arr = new Prod[10];
		 
		int num = 0;
		while(true) {
			obj.printMenu();
			int sel = sc.nextInt();
			if(sel == 1) obj.printProd(arr);
			if(sel == 2) {
				Prod p = obj.inputProd();
				arr[num++] = p;}
			if(sel == 3) obj.updateProd(arr);
			if(sel == 4) obj.deleteProd(arr);
		}
	}
	public void printProd(Prod[] arr) {
		System.out.println("No\t|상품이름\t|상품종류\t|상품가격 \t|재고수량");
		for(Prod prod : arr) {
			if(prod == null) continue;
			System.out.println(prod);
		}
	}
		public void deleteProd(Prod[] arr) {
			  printProd(arr);
				System.out.println("삭제할 상품번호를 선택해 주세요.");
				int no = sc.nextInt();
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] == null)
						continue;
					if (arr[i].getNo() == no) {
						arr[i] = null;
					}
				}
//			    int sel = sc.nextInt() - 1;
//			    arr[sel] = null;
//			    System.out.println();
		}
	
		public void updateProd(Prod[] arr) {
			printProd(arr);
			System.out.println("수정할 상품을 선택하세요.");
			int sel = sc.nextInt()-1;
			Prod p = arr[sel];
			System.out.println("상품이름 :");
			p.setName(sc.next());
			
			System.out.println("상품종류 :");
			p.setSort(sc.next());
			
			System.out.println("상품가격 :");
			p.setPrice(sc.nextInt());
			
			System.out.println("재고수량 :");
			p.setQty(sc.nextInt());
			
	}
	
	public Prod inputProd() {
		Prod p = new Prod();
		System.out.print("상품이름 :");
		p.setName(sc.next());
		
		System.out.print("상품종류 :");
		p.setSort(sc.next());
		
		System.out.print("상품가격 :");
		p.setPrice(sc.nextInt());
		
		System.out.print("재고수량 :");
		p.setQty(sc.nextInt());
		
		return p;
	}
	
	public void printMenu() {
		System.out.println("* 1. 상품조회 .\r\n" + 
				"* 2. 상품 신규 등록.\r\n" +
	        	"* 3. 상품 정보 변경.\r\n" +
	            "* 4. 상품 삭제. \r\n" );
	}
	
}
