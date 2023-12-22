package kr.or.ddit.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;


public class LottoTest {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		LottoTest start = new LottoTest();
		System.out.println();
		
		while(true) {
		System.out.println(""
				+ "        ==========================\r\n" + 
				"         	Lotto 프로그램\r\n" + 
				"	--------------------------\r\n" + 
				"	 1. Lotto 구입\r\n" + 
				"	 2. 프로그램 종료\r\n" + 
				"	==========================		");
		
		System.out.print("메뉴 선택 :");
		int sel = sc.nextInt();
			switch (sel) {
			case 1:
				start.process1();
				continue;
			case 2:
				System.out.println("감사합니다.");
				break;
			}
			break;
		}
	}
	
	

	private void process1() {
			while(true) {
			System.out.println("Lotto 구입 시작");
			System.out.println();
			System.out.println("(1000원에 로또번호 하나입니다.)");
			System.out.print("금앱 입력  :");
			int cash = sc.nextInt();
			int qty = 0; // 로또 장수
			int ret = 0; // 거스름돈
			if (cash < 1000) {
				System.out.println();
				System.out.println("입력 금액이 너무 적습니다. 로또번호 구입 실패!!!");
				System.out.println();
				return;
			}
			if (cash % 1000 == 0 && cash <= 100000) {
				qty = cash / 1000;
			} else if (cash > 100000) {
				qty = 100;
				ret = cash - 100000;
			} else {
				qty = cash / 1000;
				ret = cash % 1000;
			}

			System.out.println("행운의 로또번호는 아래와 같습니다.");
			for (int i = 1; i < qty + 1; i++) {
				HashSet<Integer> lotto = new HashSet<Integer>();
				while (lotto.size() < 6) {
					lotto.add((int) (Math.random() * (45 - 1 + 1) + 1));
				}
				ArrayList List = new ArrayList(lotto);
				Collections.sort(List);
				System.out.println(List);

			}
			System.out.println();
			System.out.println("받은 금액은 " + cash + "원이고, 거스름돈은" + ret + "원 입니다.");
			System.out.println();
			break;
		}
	}
	
	
	
	
}