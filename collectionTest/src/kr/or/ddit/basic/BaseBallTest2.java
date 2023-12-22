package kr.or.ddit.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class BaseBallTest2 {
	
		private List<Integer> numList; //난수를 저장할 List
		private List<Integer> userList; //사용자가 입력한 값이 저장될 List
		Scanner sc = new Scanner(System.in);
		int strike, ball; //스트라이크와 볼의 개수가 저장될 변수 선언
		
	public static void main(String[] args) {
		System.out.println("dd");
			HashSet<Integer> testSet = new HashSet<Integer>(); //난수 저장할 List 선언
			ArrayList userList = new ArrayList(); //사용자값 저장할 List 선언
			
		new BaseBallTest2().startGame(); 
		}

	//게임이 시작되는 메서드
	private void startGame() {
		// 난수 만드는 메서드 호출
		createNum();
		
		// 확인용 출력
		System.out.println("컴퓨터의 난수 >>" + numList);
		
		int cnt = 0;	//몇번만에 맞췄는지를 저장하는 변수
		do {
			cnt++;
			//사용자 입력 메서드 호출
			inputNum();
			//볼카운트 하는 메서드 호출
			ballcount();
		}while(strike < 3);
		System.out.println();
		System.out.println("축하합니다.");
		System.out.println("당신은" + cnt + "번째 만에 맞췄습니다.");
	}
	
	private void createNum() {
		Set<Integer> numSet = new HashSet<Integer>();
		
		//난수 3개 만들기..
		while(numSet.size() <3) {
			numSet.add( (int)(Math.random() * 9 + 1) );
		}
		
		//만들어진 난수를 List에 저장하기
		numList = new ArrayList<Integer>(numSet);
		Collections.shuffle(numList);
		
		System.out.println(numList);
	}
	
	
	
	//사용자로부터 3개의 정수를 입력받아 리스트에 저장하는 메서드
	// ==> 입력한 정수들은 서로 중복되지 않아야 한다.
	private void inputNum() {
		int n1, n2, n3;
		
		do {
			System.out.println("숫자 입력>> ");
			n1 = sc.nextInt();
			n2 = sc.nextInt();
			n3 = sc.nextInt();
			
			if(n1==n2 || n1==n3 || n2==n3) {
				System.out.println("중복되는 숫자는 입력할 수 없습니다. 다시 입력하세요.");
			}
		}while(n1==n2 || n1==n3 || n2==n3);
		
		userList = new ArrayList<Integer>();
		userList.add(n1);
		userList.add(n2);
		userList.add(n3);
	}
	
	private void ballcount() {
		strike = 0;
		ball = 0;
		
		for(int i=0; i<numList.size(); i++){
			for(int j=0;j<userList.size();j++){
				if(numList.get(i) == userList.get(j)) { //값이 같은지 검사
					if(i==j) strike++;
					else ball++;
				}
			}
		}
		System.out.println(userList.get(0) + " " + userList.get(1)
				+ " " +userList.get(2) + " ==> " + strike + "S " + ball + "B");
	}
	}