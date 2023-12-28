//23-12-27 수
package kr.or.ddit.basic;

public class ThreadTest01 {
	public static void main(String[] args) {
		// '*'문자 200개 출력, '$'문자 200개 출력
		// 싱글 스레드
		
		for(int i=1; i<=200; i++) {
			System.out.println("*");
		}
		System.out.println();
		System.out.println();
		
		for(int j=1; j<=200; j++) {
			System.out.println("$");
		}
		
	}
}
