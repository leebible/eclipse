package kr.or.ddit.study06.homework;
//문제 2 – main 메서드에서 실행시켰을 때 제조사, 생산년도, 크기를 출력하는 Tv클래스를 생성하시오.
public class TV {

	public static void main(String[] args) {
		TV tv = new TV();
		tv.method1("삼성",20231114,"45inch");
	}
	public void method1(String made,int date,String size) {
		
		System.out.println("제조사 : " +made +", 생산년도 : "+date+", 크기 : "+size);
	}
}
