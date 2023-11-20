package kr.or.ddit.study11;

import java.util.Scanner;

public class StringTest {
	public static void main(String[] args) {
		StringTest st = new StringTest();
//		st.method1();
//		st.method2();
//		st.method3();
//		st.method4();
//		st.method5();
//		st.method6();
//		st.method7();
//		st.method8();
		st.method9();
	}

	private void method9() {
		System.out.println("안녕");
	}

	private void method8() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("프로그램 종료 하시겠습니까(y/n)");
			String input = sc.next();
			if(input.equalsIgnoreCase("y")) {
				break;
			}
		}
	}
	
	public boolean equalsIgnoreCase(String str1, String str2) {
		str1 = str1.toLowerCase().trim();
		str2 = str2.toLowerCase().trim();
		return str1.equals(str2);
	}

	private void method7() {
		String str = "0123456789";
		String start = "";
		if(str.startsWith(start)) {
		System.out.println("'" + start +"'로 시작하는 문자열.");
		}
		String end = "";
		if(str.startsWith(end)) {
			System.out.println("'" + end +"'로 시작하는 문자열.");
	    }
		File src = new File("D:\D_setting\A_TeachingMaterial\01_BasicJava\workspace\BasicJava\src);
		subList(src);
	}
	
	public void subList(File src) {
		for(File f:src.listFiles()) {
			if(f.isDriectory()) {
				subList(f);
			}
			if(f.getName().endswith(".java")) {
			System.out.println("f");
			System.out.println("자바 파일");
		
		
	}
	private void method6() {
		String str = "0123456789";
//		str = str.substring(3);
	    str = str.substring(3,7);
	    System.out.println(str);
	}

	private void method5() {
		String str = "바보 멍청이 dddd";
		str = str.replace("바보", "**");
		str = str.replace("멍청이", "***");
		System.out.println(str);
		
		String str2 = "100	100	100	11000	1000";
		str2 = str2.replace("\t",",");
		System.out.println(str2);
	}	

	private void method4() {
		String str = "19일 방송계에 따르면 방송통신위원회는 지난 16일 열린 전체회의에서 학교법인 을지학원이 연합뉴스TV의 최다액출자자 변경 승인 심사를 신청했다고 밝혔다.\r\n" + 
				"이에 따라 방통위는 조만간 심사위원회를 구성할 예정인데, 사회적 영향력이 큰 보도전문채널의 최대주주 변경 승인 심사라는 점에서 방송의 공적 책임과 공정성을 실현할 수 있는지 등이 가장 중요한 심사 항목이 될 것으로 보인다.\r\n" + 
				"하지만 박 이사장의 과거 마약 투약 전력 등은 '방송의 공적 책임'이라     ";
		String str2 = "100  100 100 11000    1000\r\n";
		String str3 = "100, 200, 300, 400";
		String[] lines = str3.split(".");
		for(int i=0; i<lines.length; i++) {
			System.out.println((i+1)+". "+lines[i]);
		}
	}

	private void method3() { //trim 제일 중요!!
		String str = "	 aB  cDe   F   \t\r ";
		System.out.println("---------------------");
		System.out.println(str);
		System.out.println("---------------------");
		//**********
		str = str.trim();
		System.out.println(str);
		System.out.println("---------------------");
	}

	private void method2() {
		String str = "aBcDeF";
		System.out.println(str);
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
	}
	
	private void method1() {
		String str = "문자열 테스트 입니다.";
		String search = ".";
		if(str.contains(search)) {
			System.out.println(search +"문구가 포함되어 있습니다.");
		}
	}
	
	
}
