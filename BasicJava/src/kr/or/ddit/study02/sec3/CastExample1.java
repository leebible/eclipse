package kr.or.ddit.study02.sec3;

public class CastExample1 {
	public static void main(String[] args) {
		// cast : 강제형변환
		// cast 연산자 타입필요
		// short res = (short)100;

		byte b1 = 10;
		short s1 = 100;

		short res = (short) (s1 + b1);
System.out.println(res);
		double d1 = 34.131251;

//	341.31251
		d1 = d1 * 10;

//	341
		int temp = (int) d1;

//	34.1
		d1 = (double) temp / 10;
		System.out.println(d1);
		
//		소수점 2자리에서 반올림 한 값을출력해볼것.
		double d2 = 2313.1231;
		
		d2 = d2*100;
		
		int temp1 =(int) d2;
		
		d2 = (double) temp1/ 100;
		System.out.println(d2);
		
	}
}
