//23.12.20 수
package kr.or.ddit.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/*
 	문제) Set을 이용하여 숫자 야구 게임 프로그램을 작성하시오. 컴퓨터의 숫자는 난수를 이용하여 구한다.
 		(스트라이크는 S, 볼은 B로 출력한다.)
 	예) 컴퓨터의 난수 : 9 5 7
 	
 	실행예시)
 	숫자 입력 >> 3 5 6
 	3 5 6 ==> 1S 0B
 	숫자 입력 >> 7 8 9
 	7 8 9 ==> 0S 2B
 	숫자입력 >> 9 7 5
 	9 7 5 ==> 1S 2B
 	숫자입력 >> 9 5 7
 	9 5 7 ==> 3S 0B
 	
 	4번째 만에 맞췄습니다.
 	
 	
 */
public class BaseBallTest {
	
	private List<Integer> numList; //난수를 저장할 List
	private List<Integer> userList; //사용자가 입력한 값이 저장될 List
	Scanner sc = new Scanner(System.in);
	
	int strike, ball; //스트라이크와 볼의 개수가 저장될 변수 선언
	
	
	public static void main(String[] args) {
		HashSet<Integer> testSet = new HashSet<Integer>(); //난수 저장할 List 선언
		ArrayList userList = new ArrayList(); //사용자값 저장할 List 선언
//		BaseBallTest obj = new BaseBallTest();
//		obj.test1(); //내가 초기에 푼 답
//		obj.test2(); //수정한 답

		//샘이 풀어주시는 답
		// BaseBallTest t = new BaseBallTest();
		//t.tartGame();
		new BaseBallTest().startGame(); 
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
			numSet.add((int)Math.random()*9+1);
		}
		
		//만들어진 난수를 List에 저장하기
		numList = new ArrayList<Integer>(numSet);
		
		//만들어진 난수를 섞어준다.
		Collections.shuffle(numList);
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
	
	
	private void test2() {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> testSet = new HashSet<Integer>(); //난수 저장할 List 선언
		ArrayList ul = new ArrayList(); //사용자값 저장할 List 선언
		while (testSet.size() < 3) { //난수(정답)3개 생성
			testSet.add((int) (Math.random() * (9 - 1 + 1) + 1));
		}
		ArrayList<Integer> tl = new ArrayList<Integer>(testSet); //난수 저장된 hashset을 List로
		System.out.println(testSet); //정답
		
		System.out.println("숫자 야구 게임");
		
//		System.out.println("List 데이터 출력하기");
		for (int i = 0; i < tl.size(); i++) { // 인덱스(i)를 사용하기 위해 일반for문 사용
//			System.out.println(i + "번째 데이터 : " + testList.get(i));
		}
//		System.out.println("-----------------------------------------");
		

		//중첩반복문 사용하기
		int i=0; //횟수
		while(true) {
			i++; 
			int strike = 0;
			int ball = 0;
			System.out.println("3개의 숫자를 입력하세요 :");
			
			for(int n=0; n<tl.size(); n++) { //사용자 입력 3번 받기
				ul.add(sc.nextInt());
			}
			
			for(int d=0; d<tl.size(); d++) { // 조건에 부합하면 strike, ball 각각 ++ 해주기
				if(ul.get(d) ==tl.get(d)) strike ++;
				if(ul.get(d) !=tl.get(d) && tl.contains(ul.get(d))) ball++;
			}
			System.out.println(strike+"S, "+ ball+"B");
				if(strike==3) {
					System.out.println("정답!"+i+"번째 만에 맞췄습니다.");
					break;
				}
				else ul.clear();
			}
	}
		
	private void test1() {	
//		초기 코드(조건부분)
//		if(userList.get(0) == testList.get(0)) { strike ++; }
//		if(userList.get(1) == testList.get(1)) { strike ++; }
//		if(userList.get(2) == testList.get(2)) { strike ++; }
//		if(userList.get(0) != testList.get(0) && testList.contains(userList.get(0))) {ball++;}
//		if(userList.get(1) != testList.get(1) && testList.contains(userList.get(1))) {ball++;}
//		if(userList.get(2) != testList.get(2) && testList.contains(userList.get(2))) {ball++;}
//		
//		System.out.println(strike+"S, "+ ball+"B");
//		if(strike==3) {
//			System.out.println(i+"번째 만에 맞췄습니다.");
//			break;}
//		else{ strike =0; ball =0; userList.clear();}
		}
}
		
