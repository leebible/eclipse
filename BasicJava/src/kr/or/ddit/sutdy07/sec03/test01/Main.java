package kr.or.ddit.sutdy07.sec03.test01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Animal animal = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 고양이");
		System.out.println("2. 강아지");
		int select = sc.nextInt();
		if(select == 1) {
			animal = new Cat();
		}
		if(select == 2) {
			animal = new Dog();
		}
		animal.cry();
	}
}
