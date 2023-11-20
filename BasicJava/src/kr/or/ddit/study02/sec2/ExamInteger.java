package kr.or.ddit.study02.sec2;

public class ExamInteger {
	public static void main(String[] args) {
		/*
		 * 4byte 정수형 변수 -2^31~ (2^31-1)
		 * 
		 */

		int i1 = 100000;
		int i2 = 30;

		int result = i1 + i2;
		System.out.println(i1+", "+ i2);
		System.out.println(result);
		
		/*
		 * 2byte 정수형 변수
		 * -2^15~ (2^15-1)
		 */
		short sh1=10000;
		/*
		 * 1byte 정수형 변수
		 * 
		 * -2^7~ (2^7-1)
		 */
		byte bte =127;
		
		/*
		 * 8byte 정수형 변수
		 * -2^63~ (2^63-1)
		 * 
		 */
		long l = 10000000000l;
		System.out.println("short값입니다 : "+sh1+ " byte값입니다 : "+bte+" long값입니다 : "+l);
	}
}
