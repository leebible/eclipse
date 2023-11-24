package kr.or.ddit.sutdy07.sec02.test04;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	/*
	 * 상품 클래스
	 * Prod
	 * 이름, 가격
	 * 
	 * 전자제품
	 * ElectroniProd
	 * 이름, 가격, 전압, 전력 소비량
	 * 
	 * FoodProd
	 * 이름, 가격, 유통기한
	 */
		Prod prod = null;
		System.out.println("1. 전자제품");
		System.out.println("2. 음식");
		
		int select = sc.nextInt();
		if(select==1) {
			System.out.println("전자제품");
			prod = new ElectroniProd();
			ElectroniProd ep = new ElectroniProd();
			ep.setName("이름");
			ep.setPrice(10000);
			ep.setVoltage(10000);
			ep.setConsumption(10000);
			System.out.println(ep);
		}
		if(select==2) {
			System.out.println("음식");
			FoodProd fp = new FoodProd();
			prod.setName("이름");
			prod.setPrice(10000);
		}
		
		
}
}
