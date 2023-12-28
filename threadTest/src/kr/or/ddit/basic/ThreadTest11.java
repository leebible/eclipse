//23.12.28 목요일 (5)
package kr.or.ddit.basic;
/* 
 	Thread의 stop()메서드를 호출하면 스레드가 즉시 멈춘다.
 	이 때 사용하던 자원을 정리하지 못하고 스레드가 종료되어 다른 프로그램이나
 	스레드에 영향을 줄 수 있다.
 	그래서 stop()메서드는 비추천으로 되어있다.
 */

public class ThreadTest11 {
	public static void main(String[] args) {
		/*
		ThreadStopTest01 th1 = new ThreadStopTest01();
		th1.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		
		//th1.stop(); //비추천되는 메소드
		th1.setStop(true);
		*/
		
		//interrupt()메서드를 이용한 스레드 멈추기
		ThreadStopTest02 th2 = new ThreadStopTest02();
		th2.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			//내용이 없으니 다음으로 넘어감
		}
		th2.interrupt();
	}
}

// interrupt() 메서드를 이용하여 스레드를 멈추게하는 연습용 스레드
class ThreadStopTest02 extends Thread{
	@Override
	public void run() {
		// 방법 1 ==> interrupt()메서드와 sleep()메서드를 이용하는 방법
		/*try {
			while(true) {
				System.out.println("실행 중");
				Thread.sleep(3000); // 일시 정지 상태에서 interrupt()메서드가 호출되면 InterruptedException 발생
			}
		} catch (InterruptedException e) {
			//내용이 없으니 다음으로 넘어감
		}*/
		
		// 방법2
		while(true) {
			System.out.println("Thread 실행 중");
			
			// interrupt()메서드가 호출되었는지 검사한다.
			
			// 검사 방법 1 ==> Thread의 인스턴스 메서드인 isInterrupted() 메서드를 이용한다.
			//			==> isInterrupted()메서드는 interrupt()메서드가 호출되면 true를 반환함
			/*if(this.isInterrupted()) {
				break;
			}*/
		
		
			// 검사 방법 2 ==> Thread의 정적 메서드인 interrupted()메서드를 이용한다.
			//		    ==> interrupted()메서드도 interrupt()메서드가 호출되면 true를 반환
			if(Thread.interrupted()) {
				break;
			}
		}
		
		System.out.println("자원 정리");
		System.out.println("스레드 종료");
	}
}


// 스레드를 멈추게하는 연습용 스레드
class ThreadStopTest01 extends Thread{
	private boolean stop;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	@Override
	public void run() {
		while(!stop) {
			System.out.println("스레드 실행중");
		}
		
		System.out.println("자원 정리");
		System.out.println("스레드 종료");
	}
}
