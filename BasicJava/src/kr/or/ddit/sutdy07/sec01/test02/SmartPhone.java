package kr.or.ddit.sutdy07.sec01.test02;

public class SmartPhone extends Phone {

	public void touch() {
		System.out.println("터치 기능");
	}

	@Override
	public void camera() {
		super.camera(); // super <- 부모 클래스

		System.out.println("1000만 화소 사진 가능");
	}
}