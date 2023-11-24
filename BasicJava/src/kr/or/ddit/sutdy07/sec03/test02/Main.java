package kr.or.ddit.sutdy07.sec03.test02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("전화 상담의 분배 방식 선택");
		System.out.println("R: RoundRobin");
		System.out.println("L: LeastJob");
		System.out.println("P: PriorityAllocation");

		Scanner sc = new Scanner(System.in);
		String select = sc.next();
		Schedular schedular = null;
		if(select.equals("R")) {
			schedular = new RoundRobin();
		}
		if(select.equals("L")) {
			schedular = new LeastJob();
		}
		if(select.equals("P")) {
			schedular = new PriorityAllocation();
		}
		schedular.getNextCall();
		schedular.sendCallToAgent();
	}
}
