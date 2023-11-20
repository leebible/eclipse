//23-11-16-6(1)
package kr.or.ddit.study06.sec06.test01;

import java.util.Scanner;

public class GetterSetterExam01 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	/*
	 * 멤버에 이름, 나이, 국가, 메일 필드 만들것.
	 * 
	 */

	/*
	 * 스캐너를 통해 각 데이터 입력 받기.
	 */

	/*
	 * 1. 멤버 추가, 2. 멤버 조회. -> 입력된 멤버 정보 출력하기 3. 종료
	 */
	Member[] arr = new Member[10];
	int cnt = 0;
	GetterSetterExam01 obj = new GetterSetterExam01();
	
	while(true) {
		System.out.println("1. 멤버 추가");
		System.out.println("2. 멤버 조회");
		System.out.println("3. 종료");
		int sel = sc.nextInt();
		if(sel == 1) {
			Member m = obj.inputMember(); //멤버 가지고왔으니 0번째부터 차례로 넣어줘야함
			arr[cnt++] = m;
		}else if(sel ==2) {
			obj.printMember(arr);
		}else if(sel ==3 ) {
			System.out.println("프로그램을 종료합니다.");
			break;
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
}

/**
 * 멤버 데이터 입력 받고
 * 생성된 멤버를 return 할 것.
 */
	public Member inputMember() { //멤버도 하나의 타입
		System.out.print("이름:");
		String name  = sc.next(); 
		System.out.print("나이:");
		int age = sc.nextInt();
//		if(age<0) {
//			System.out.println("0보다 작은수는 입력할 수 없습니다.");
//			age = sc.nextInt();
//		}
		System.out.print("국가:");
		String nation = sc.next();
		System.out.print("메일:");
		String mail = sc.next();
		
		Member m = new Member();//객체생성
		//멤버라는 데이터를 입력받음
		m.name = name; //클래스에서 private로 묶었기때문에 m."set"Name set을추가
		m.age = age; // 반대로 가져오는 방법은 getName 으로!
		m.nation = nation;
		m.mail = mail;
		return m;
	}
/**
 * 멤버 데이터 파라미터로 받고
 * 출력
 * 
 */

	public void printMember(Member[] arr) {
		for (Member member : arr) {
			if(member == null) break;
			System.out.println(member);
		}
		
	}
	
}

