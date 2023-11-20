package kr.or.ddit.study10.sec02;

import java.util.Scanner;

public class ExceptionExample06 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ExceptionExample06 obj = new ExceptionExample06();
		while(true) {
		System.out.println("닉네임 입력 : ");
		String nick = sc.next();		
		
		try {
			checkNickName(nick);
			break;
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
	
	public static void checkNickName(String name){
		if(name.contains("바보")) {
			throw new NickNameException();
		}
		if(name.length() > 10) {
			throw new NickNameException();
		}
	}
}

class NickNameException extends RuntimeException{
		public NickNameException() {
			super("잘못된 변명입니다.");
		}
	}
