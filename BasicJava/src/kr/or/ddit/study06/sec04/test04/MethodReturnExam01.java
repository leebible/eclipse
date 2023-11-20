//23.11.15

package kr.or.ddit.study06.sec04.test04;

import java.util.Scanner;

public class MethodReturnExam01 {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		MethodReturnExam01 m = new MethodReturnExam01();
//		m.printTest();
		/*
		 * 1을 입력하면 출력 1 ->
		 * 3을 입력하면 출력 1,2,3
		 */
//		m.printTest2(1);
		m.addNum(500);
		int result = m.addNum(12);
		System.out.println("더한 결과 값은 : " + result);
		
	}
	
	public void printTest() {
		System.out.println("출력 1");
		if(false) return; //return : 메소드가 끝나는걸 의미
		System.out.println("출력 2");
		
	}

	public void printTest2(int num) {
		System.out.println("출력 1");
		if(num==1) return;
		System.out.println("출력 2");
		if(num==2) return; 
		System.out.println("출력 3");
		if(num==3) return; 
		System.out.println("출력 4");
		if(num==4) return; 
		
	}

	/*
	 * 100 
	 * 1~n 값을 더하다가 
	 * 100보다 커지면 현재까지 더해진 값을 리턴해보기
	 * 만약에 100보다 커지지 않으면 n 까지 전체합을 리턴
	 */
	public int addNum(int n) {
		int sum = 0;
		for(int i=1;i<=n;i++) {
			sum += i;
			if(sum>100) return sum;
		}
		return sum;
	}

}
