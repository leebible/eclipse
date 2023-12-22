package kr.or.ddit.basic;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class PhonBookTestTeacher {
	private Scanner scan;
	private HashMap<String, Phone> phoneBookMap;
	
	//생성자
	public PhonBookTestTeacher() {
		scan = new Scanner(System.in);
		phoneBookMap = new HashMap<String, Phone>();
	}
	
	public static void main(String[] args) {
		new PhonBookTestTeacher().startPhneBook();
	}

	//시작메서드
	private void startPhneBook() {
		System.out.println();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("              전 화 번 호 관 리 프 로 그 램 ");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");

		while(true) {
			int choice = displayMenu();
			
			switch(choice) {
				case 1 :	//등록
					insert(); 
					break;
				case 2 :	//수정
					update();
					break;
				case 3 :
					delete();//삭제
					break;
				case 4 :
					search();//검색
					break;
				case 5 :
					displayAll();//전체 출력
					break;
				case 0 :	//종료
					System.out.println("프로그램을 종료합니다.");
					return;
				default :
					System.out.println("작업 번호를 잘못 입력했습니다.");
					System.out.println("다시 입력하세요.");
					break;
			}
		}
	
	}
	
	//전화번호 정보를 검색하는 메서드
	private void search() {
		System.out.println();
		System.out.println("검색할 전화번호 정보를 입력하세요.");
		System.out.print("이 름 :");
		String name = scan.next();
		if(!phoneBookMap.containsKey(name)) {
			System.out.println(name + "님의 전화번호 정보가 없습니다.");
			return;
		}
		Phone p =phoneBookMap.get(name);
		System.out.println(name + "님의 전화번호 정보");
		System.out.println("-----------------------");
		System.out.println("이  름: " +p.getName());
		System.out.println("전  화: " +p.getTel());
		System.out.println("주  소: " +p.getAddr());
		System.out.println("-----------------------");
		System.out.println();
	}

	//전화번호 정보를 삭제하는 메서드
	private void delete() {
		System.out.println();
		System.out.println("삭제할 전화번호 정보를 입력하세요.");
		System.out.print("이 름 :");
		String name = scan.next();
		
		//해당 이름이 등록되어 있지 않으면 삭제 작업을 못한다.
		if(!phoneBookMap.containsKey(name)) {
			System.out.println(name + "님의 전화번호 정보가 없습니다.");
			return;
		}
		phoneBookMap.remove(name);
		System.out.println(name + "님의 전화번호 정보 삭제 성공 !!!");
	
	}

	//전화번호 정보를 수정하는 메서드
	private void update() {
		System.out.println("수정할 전화번호 정보를 입력하세요.");
		System.out.println("이 름 :");
		String name = scan.next();
		
		//해당 이름이 등록되어 있지 않으면 수정 작업을 못한다.
		if(!phoneBookMap.containsKey(name)) {
			System.out.println(name + "님의 전화번호 정보가 없습니다.");
			return;
		}
		
		System.out.println("새로운 전화번호 :");
		String newTel = scan.next();
		
		scan.nextLine(); //입력 버퍼 비우기.
		System.out.println("새로운 주소 :");
		String newAddr = scan.nextLine();
		
		//같은 key값에 새로운 전화번호 정보를 저장한다. (수정작업)
		phoneBookMap.put(name, new Phone(name, newTel, newAddr));
		System.out.println(name + "님의 전화번호 정보 수정 완료 !!!");
	}
	//전체 자료를 출력하는 메서드
	private void displayAll() {
		System.out.println();
		
		//Map의 전체 key값과 정보구하기
		Set<String> phoneKeySet = phoneBookMap.keySet();
		
		System.out.println("----------------------------------------");
		System.out.println("번호\t이름\t전화번호\t\t주소");
		System.out.println("----------------------------------------");
		
		if(phoneKeySet.size()==0) {
			System.out.println(" 등록된 전화번호 정보가 없습니다.");
		}else {
			int num = 0;
			//key값 개수만큼 반복
			for(String name : phoneKeySet) {
				num++; //번호 증가
				//key값(name)을 이용하여 value값(Phone객체)를 구한다.
				Phone p =phoneBookMap.get(name);
				System.out.println(num + "\t" + p.getName() + "\t" + p.getTel()  + "\t" + p.getAddr());
			}
		}
		System.out.println("----------------------------------------");
		System.out.println("출력 끝");
		
	}
	
	//새로운 전화번호 정보를 등록하는 메서드(중복불가)
	private void insert() {
		System.out.println();
		System.out.println("새롭게 등록할 전화번호 정보를 입력하세요.");
		System.out.print("이 름 :");
		String name = scan.nextLine();
		
		//이미 등록된 사람인지 검사
		if(phoneBookMap.containsKey(name)) {
			System.out.println(name + "님의 전화번호 정보가 이미 있습니다.");
			System.out.println("등록 작업을 마칩니다.");
			return; //else{}를 안쓰는대신 return; 을 써주면 됨.
		}
		
		scan.nextLine();
		System.out.print("전화번호 :");
		String tel = scan.nextLine();
		
		System.out.print("주 소 :");
		String addr = scan.nextLine();
		
		//입력 받은 자료를 이용하여 Phone 객체를 생성하고
		//생성된 Phone객체를 Map에 추가한다.
		/*Phone p = new Phone(name, tel, addr);
		phoneBookMap.put(name, p);*/
		
		//위코드 대신 아래코드로 쓸수 있음
		phoneBookMap.put(name, new Phone(name,tel,addr));
		System.out.println("'" + name + "' 전화번호 등록 완료!!!");
		
	}
	/*
	 Scanner 메서드들의 특징
	 - next(), nextInt(), nextDouble() .. 
	   : 사이띄기, Tab키, Enter키를 구분문자로 분리해서 분리된 자료만 읽어간다.
	 - nextLine() : 한줄 단위로 읽어간다. 
	      즉, 자료를 입력하고 Enter키를 누르면 Enter키까지 읽어가서 Enter키를 뺀 나머지 데이터를 반환한다.
	 */

	//메뉴를 출력하고 작업 번호를 입력받아 반환하는 메서드
	private int displayMenu() {
		System.out.println();
		System.out.println("	메  뉴");
		System.out.println("1. 전화번호 등록");
		System.out.println("2. 전화번호 수정");
		System.out.println("3. 전화번호 삭제");
		System.out.println("4. 전화번호 검색");
		System.out.println("5. 전화번호 전체 출력");
		System.out.println("0. 프로그램 종료");
		System.out.println("------------------	");
		System.out.println("번호 입력 >>");
		return scan.nextInt();
	}
	
}
