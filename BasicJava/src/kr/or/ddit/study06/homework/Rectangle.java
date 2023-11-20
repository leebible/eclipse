//문제 4 – 정수형 원점의 좌표(x,y)와 실수 타입의 가로와 세로를 입력받아 사각형을 만드는 클래스를 설계하고, 3
//개의 사각형을 만든 뒤 첫 번째 사각형에 나머지 두 개의 사각형이 포함되었는지 여부를 판단할 수 있는 메서
//드를 포함시키시오.
package kr.or.ddit.study06.homework;

import java.util.Scanner;

public class Rectangle {
	int x;
	int y;
	int height;
	int width;

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Rectangle obj = new Rectangle();
		
	}

	public void area(int height, int width) {
		x = sc.nextInt();
		y = sc.nextInt();
	}
}
