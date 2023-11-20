//23-11-16-2
package kr.or.ddit.study06.sec05.test02;

import java.util.Date;

import kr.or.ddit.study06.sec05.test01.BigLoadSingleTon;

public class CallSingleTon {
	public static void main(String[] args) {
		//싱글톤 객체 가져오기
		SingleTon st = SingleTon.getInstance();
		
		
		Date d1 = new Date();
		
		System.out.println("싱글톤 호출 시작");
		BigLoadSingleTon bs = BigLoadSingleTon.getInstance();
		BigLoadSingleTon bs2 = BigLoadSingleTon.getInstance();
		BigLoadSingleTon bs3 = BigLoadSingleTon.getInstance();
		System.out.println("싱글톤 호출 끝");
		Date d2 = new Date();
		
		long time = d2.getTime() - d1.getTime();
		System.out.println(time+"ms");

		
		d1 = new Date();
		System.out.println("싱글톤 호출 시작");
		BigLoadSingleTon bs_ = new BigLoadSingleTon();
		BigLoadSingleTon bs2_ = new BigLoadSingleTon();
		BigLoadSingleTon bs3_ = new BigLoadSingleTon();
		System.out.println("싱글톤 호출 끝");
		d2 = new Date();
		
		time = d2.getTime() - d1.getTime();
		System.out.println(time+"ms");
	}
}
