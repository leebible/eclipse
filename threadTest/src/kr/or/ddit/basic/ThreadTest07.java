//23.12.27 수요일
package kr.or.ddit.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import javax.swing.JOptionPane;

/*
 컴퓨터와 가위 바위 보를 진행하는 프로그램을 작성하시오.
 
 컴퓨터의 가위 바위 보는 난수를 이용해서 구하고 
 사용자의 입력은 showInputDialog()메서드를 이용해서 입력받는다.
 
 입력 시간은 5초로 제한하고 카운트 다운을 한다.
 5초안에 입력이 없으면 게임에 진것으로 처리한다.
 5초안에 입력이 완료되면 승패를 구해서 출력한다.
 
 결과 예시
 1) 5초 안에 입력을 못했을 때
 	-- 결  과 --
 	시간 초과로 당신이 졌습니다.
 2) 5초 안에 입력을 완료했을 때
    -- 결 과 --
         컴퓨터 : 가위
   	 사용자 : 바위
   	 결 과 : 당신이 이겼습니다.
 */

public class ThreadTest07 {
	
	public static void main(String[] args) {
		Thread th1 = new InputData();
		Thread th2 = new CountDown();
		
		new ThreadTest07();
		th1.start();
		th2.start();
	}
}


class InputData extends Thread{
	static List<String> strList;
	public static boolean Check = false;
	
	@Override
	public void run() {
		random();
		String com = strList.get(0);
		System.out.println("컴퓨터의 난수 >> "+com);
		
		
		String str = JOptionPane.showInputDialog("가위바위보 중에 선택하세요.");
		Check = true;
		System.out.println("-- 결  과 --");
		System.out.println("컴퓨터: " + com);
		System.out.println("사용자: " + str);
		if(com.equals(str)) System.out.println("결 과 : 비겼습니다.");
		else if(com.equals("바위") && str.equals("가위") ||
		   com.equals("가위") && str.equals("보")	  ||
		   com.equals("보") && str.equals("바위")) 
			System.out.println("결 과 : 당신이 졌습니다.");
		else System.out.println("결 과 : 당신이 이겼습니다.");
	}
	
	private void random() {
		Set<String> strSet = new HashSet<String>();
//		Random r = new Random();
//		int ran = r.nextInt(3)+1;
//		String str;
			strSet.add("가위");
			strSet.add("바위");
			strSet.add("보");
//			System.out.println(strSet);
			
			//만들어진 난수를 List에 저장하기
		strList = new ArrayList<String>(strSet);
		
		//만들어진 난수를 섞어준다.
		Collections.shuffle(strList);
		}
	}


class CountDown extends Thread{
	@Override
	public void run() {
		for(int i=5; i>=1; i--) {
			if(InputData.Check==true)
				
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				
			}
		}
		System.out.println("-- 결  과 --\r\n" + 
				"시간 초과로 당신이 졌습니다.");
		System.exit(0);
	}
}


