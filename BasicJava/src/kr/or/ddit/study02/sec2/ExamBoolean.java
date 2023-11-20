package kr.or.ddit.study02.sec2;

public class ExamBoolean {
	public static void main(String[] args) {
		boolean flag = false;
		
		int age = 10;
		
		flag = age>=18; 
		if(flag) {
			System.out.println("성년입니다.");
		}else {
			System.out.println("미성년자 입니다");
		}
	}
}
