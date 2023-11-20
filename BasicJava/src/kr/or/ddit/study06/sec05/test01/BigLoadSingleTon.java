//23-11-16-3

package kr.or.ddit.study06.sec05.test01;

public class BigLoadSingleTon {
	private static BigLoadSingleTon instance=null;
	public static long sum = 0;
	
	public BigLoadSingleTon() { //실험하느라 public한거지 원래는 private!
		// thread.sleep 에 빨간줄 뜨면 F2키 누른뒤 -> surround
//		try { 
//			Thread.sleep(5000);
//		}catch (InterruptedException e) {
//			e.printStackTrace();
	for(long i =1; i<100000000L; i++) {
		sum+=i;
	}
	}

	public static BigLoadSingleTon getInstance() {
		if(instance == null) {
			instance = new BigLoadSingleTon();
		}
		return instance;
	}
}
