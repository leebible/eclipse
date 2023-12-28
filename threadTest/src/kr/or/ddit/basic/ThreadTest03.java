//23-12-27 수
package kr.or.ddit.basic;

public class ThreadTest03 {
	public static void main(String[] args) {
		//스레드가 수행되는 시간을 체크해 보자
		Thread th = new Thread(new MyRunner());
		
		// 1970년 1월 1일 0시 0분 0초(표준시간)부터 경과한 시간을 밀리세컨드 단위로 반환한다.
		long startTime = System.currentTimeMillis();
		
		th.start();
		
		try {
			th.join(); //현재 위치에서 대상이 되는 스레드(변수 th)가 실행이 끝날때까지 기다린다.(스레드에서 제공)
		}catch (InterruptedException e) {
			
		}
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("경과 시간 :" + (endTime-startTime));
	}
}


class MyRunner implements Runnable{
	@Override
	public void run() {
		long sum = 0L;
		for(long i=1L; i<=1_000_000_000L; i++) { //숫자 안에 있는 _는 문자로 취급되지 않는다.
			sum += i;
		}
		System.out.println("합계 : " + sum);
	}
}