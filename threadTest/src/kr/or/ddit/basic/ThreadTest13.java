//23.12.28 목요일 (7)
package kr.or.ddit.basic;

import java.util.ArrayList;
import java.util.List;


/*
 10마리의 말들이 경주하는 경마 프로그램 작성하기

말은 Horse2라는 이름의 스레드 클래스로 구성하고,
이 클래스는 말이름(String), 말의 위치(int), 등수(int)를 멤버변수로 갖는다.
그리고, 이 클래스에는 등수를 오름차순으로 처리할 수 있는 
기능이 있다.( Comparable 인터페이스 구현) //내부정렬

경기 구간은 1~50구간으로 되어 있다.
//출력할 값을 말의 위치에 저장하하면 됨. 출력하는것도 스레드로 만들면 됨
//Horse2스레드의 객체가 10개있어야하고, 위치 출력하는 스레드가 또하나 있어야함.

경기 중 중간 중간에 각 말들의 위치를 나타내시오.
예)
01번말 --->----------------------------------------------
02번말 ----->--------------------------------------------
...
10번말 ----------->--------------------------------------


경기가 끝나면 등수 순으로 출력한다.

 */
public class ThreadTest13 {
	public static void main(String[] args) {
		Horse2[] Horse2Arr = new Horse2[] {
				new Horse2("01번말"),
				new Horse2("02번말"),
				new Horse2("03번말"),
				new Horse2("04번말"),
				new Horse2("05번말"),
				new Horse2("06번말"),
				new Horse2("07번말"),
				new Horse2("08번말"),
				new Horse2("09번말"),
				new Horse2("10번말")
		};
		for(Horse2 hs : Horse2Arr) {
			hs.start();
		}
		
		for(Horse2 hs : Horse2Arr) {
			try {
				hs.join();
			} catch (InterruptedException e) {
			}
		}
		
		System.out.println();
		System.out.println("경기 결과");
		System.out.println("-- 순위 --");
		for(int rank=1; rank<11; rank++) {
			System.out.println(rank+"등 :"+Horse2.strRank.get(rank-1));
		}
		
		System.out.println();
	}
}






//스레드
class Horse2 extends Thread{
	static List<String> strRank = new ArrayList<>();
	public static int rank; //등수
	private String Horse2; //말이름
	static public int cur; //현재위치
	
	public Horse2(String Horse2) {
		this.Horse2 = Horse2;
	}
	
	
	@Override
	public void run() {
	
		 List<String> bar = new ArrayList<>();
			for(int i=1; i<=50; i++) {
				bar.add("-");
			}
			for(int cur=1; cur<50; cur++) {
				bar.set(cur, ">");
				bar.set(cur-1, "-");
				try {
					Thread.sleep((int)(Math.random()*400));
				} catch (InterruptedException e) {
				}
				
				//System.out.println(Horse2+bar);
				System.out.print(Horse2);
				for(String b : bar) { 
						System.out.print(b);
				}
				System.out.println();
			}
			
			//출력이 끝난 순서대로 이름 추가
			strRank.add(Horse2);
			System.out.println(Horse2 + "출력 끝");
	
	}
	
	}

// 완성 못함......

