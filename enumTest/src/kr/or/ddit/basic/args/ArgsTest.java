//23.12.26 화요일
package kr.or.ddit.basic.args;

/*
 	가변인자 ==> 메서드의 인자의 개수가 실행될 때마다 다를 때 사용한다.
 	
 	- 가변인자는 메서드 안에서 배열로 처리된다.
 	- 가변인자는 메서드에서 한 개만 사용할 수 있다. 
 	
 */



public class ArgsTest {
	//매개변수로 받은 정수들의 합계를 구하는 메서드 만들기
	//(이 정수의 갯수는 상호아에 따라 달라질 수 있다.)
	
	// 배열을 이용한 메서드
	public int sumArr(int[] data) {
		int sum = 0;
		for(int num : data) {
			sum += num;
		}
		return sum;
	}
	
	// 가변인자를 이용한 메서드
	public int sumArg(int... data) {
		int sum = 0;
		for(int num : data) {
			sum += num;
		}
		return sum;
	}
	
	// 가변인자와 일반 매개변수를 같이 사용할 경우에는 가변 인자를 제일 뒤쪽에 배치해야 한다.
	// sumArg2(1,2,3,4,5,6);
	// pullic String sumArgs(int... data, int name) { //불가
	// public String sumArgs2(int name, int... data) {
	public String sumArg2(String name, int... data) {
		int sum = 0;
		for(int num : data) {
			sum += num;
		}
		return name + "님 점수 : " + sum;
	}
	
	
	public static void main(String[] args) {
		ArgsTest test = new ArgsTest();
		
		int[] numArr = {100,200,300}; //배열 초기화방법1 :선언과 동시에 초기화할때만 사용가능
//		int[] numArr2 = new int[] {100,200,300}; //배열 초기화방법2 : 동시 + 나중에 초기화할때 모두 사용 가능
		int[] numArr2 = null;
		numArr2 = new int[] {100,200,300};
		
		System.out.println(test.sumArr(numArr));
		System.out.println(test.sumArr(new int[]{1,2,3,4,5}));
		System.out.println();
		
		System.out.println(test.sumArg(100,200,300));
		System.out.println(test.sumArg(1,2,3,4,5));
		System.out.println();
		
		System.out.println(test.sumArg2("홍길동",1,2,3,4,5,6));
		
	}
}
