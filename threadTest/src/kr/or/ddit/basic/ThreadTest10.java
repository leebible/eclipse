//23.12.28 목요일 (4)
package kr.or.ddit.basic;

// yield() 메서드 연습

public class ThreadTest10 {
	public static void main(String[] args) {
		YieldTest th1 = new YieldTest("1번 스레드");
		YieldTest th2 = new YieldTest("2번 스레드");
		
		th1.start();
		th2.start();
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
		}
		System.out.println("1--------------------------------------");
		th1.work = false;
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
		}
		
		System.out.println("2**************************************");
		th1.work = true;
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
		}
		
		System.out.println("3++++++++++++++++++++++++++++++++++++++");
		th1.stop = true;
		th2.stop = true;
		
	}
}

//yield()메서드 연습용 스레드
class YieldTest extends Thread{
	public boolean stop = false;
	public boolean work = true;
	
	public YieldTest(String name) {
		// this ==> 자기 자신 참조값이 저장된 변수 
		// this() ==> 생성자에서 다른 생성자를 호출할 때 사용
		
		// super ==> 부모 참조값이 저장된 변수
		// super() ==> 부모의 생성자를 호출할 때 사용
		super(name); //스레드의 이름을 설정하는 생성자 호출. (부모 Thread의 참조값)
	}
	
	@Override
	public void run() {
		while(!stop) {	//stop이 true이면 반복문이 종료된다.
			if(work) {
				// getName()메서드 ==> 현재 스레드의 name값을 반환한다.
				System.out.println(getName() + " 작업중 ");
			}else {
				System.out.println(getName() + " 양보! ");
				Thread.yield();
			}
		}
	}
}
