package kr.or.ddit.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class HotelTest {
	private Scanner scan;
	private HashMap<Integer, Room> RoomMap;

	// 생성자
	public HotelTest() {
		scan = new Scanner(System.in);
		RoomMap = new HashMap<Integer, Room>();
	}

	public static void main(String[] args) {
		new HotelTest().start();
	}

	private void start() {
		createroom(); //객실 생성
		System.out.println();
		System.out.println("*********************************************");
		System.out.println("       호텔문을 열었습니다. 어서오십시요.");
		System.out.println("*********************************************");

		while (true) {
			int choice = displayMenu();
			switch (choice) {
			case 1: // 체크인
				checkin();
				break;
			case 2: // 체크아웃
				checkout();
				break;
			case 3: // 객실상태
				status();
				break;
			case 4: // 업무종료
				System.out.println("*********************************************");
				System.out.println("       호텔문을 닫았습니다.");
				System.out.println("*********************************************");
				return;
			default:
				break;
			}
		}
	}

	//체크아웃 하는 메서드
	private void checkout() {
		System.out.println("----------------------------------------------");
		System.out.println("   체크아웃 작업");
		System.out.println("----------------------------------------------");
		System.out.println("체크아웃 할 방 번호를 입력하세요.");
		System.out.println("방번호 입력 >>");
		int outnum = scan.nextInt();
		
		if (!RoomMap.containsKey(outnum)) {
			System.out.println(outnum + "호 객실은 존재하지 않습니다.");
			return;
		}
		if(RoomMap.get(outnum).getClient()=="-") {
			System.out.println(outnum+"호 객실에는 체크인 한 사람이 없습니다.");
			return;
		}
		System.out.println(outnum+"호 객실의 "+RoomMap.get(outnum).getClient()+"님 체크아웃을 완료하였습니다.");
		RoomMap.get(outnum).setClient("-");
		
	}
	
	//현재 객실 정보 출력
	private void status() {
		//Map을 List로 만들기
		List<Integer> setList = new ArrayList(RoomMap.keySet());
		Collections.sort(setList);
		
		System.out.println("----------------------------------------------");
		System.out.println("		현재 객실 상태");
		System.out.println("----------------------------------------------");
		System.out.println("방 번호	 방 종류	 투숙객 이름");
		System.out.println("----------------------------------------------");
		for (int num : setList) {
			Room r = RoomMap.get(num);
			System.out.println(num + "\t" + r.getType() + "\t" + r.getClient());
		}

	}
	
	
	//객실 생성
	private void createroom() {
		for (int num = 201; num < 210; num++) {
			Room r = new Room(num, "싱글룸", "-");
			RoomMap.put(num, r);
		}
		for (int num = 301; num < 310; num++) {
			Room r = new Room(num, "더블룸", "-");
			RoomMap.put(num, r);
		}
		for (int num = 401; num < 410; num++) {
			Room r = new Room(num, "스위트룸",  "-");
			RoomMap.put(num, r);
		}
	}

	// 체크인 작업을 하는 메서드(중복불가)
	private void checkin() {
		System.out.println("----------------------------------------------");
		System.out.println("   체크인 작업");
		System.out.println("----------------------------------------------");
		System.out.println(" * 201~209 : 싱글룸");
		System.out.println(" * 301~309 : 더블룸");
		System.out.println(" * 401~409 : 스위트룸");
		System.out.println("----------------------------------------------");
		System.out.println("방 번호 입력 >>");
		int newnum = scan.nextInt();

		// 객실 존재 여부 검사
		if (!RoomMap.containsKey(newnum)) {
			System.out.println(newnum + "호 객실은 존재하지 않습니다.");
			return;
		}
		System.out.println("누구를 체크인 하시겠습니까?");
		System.out.print("이  름:");
		String newname = scan.next();
		RoomMap.get(newnum).setClient(newname);
		System.out.println("체크인이 완료되었습니다.");

	}

	// 메뉴를 출력하고 작업 번호를 입력받아 반환하는 메서드
	private int displayMenu() {
		System.out.println();
		System.out.println("-----------------------------------------------------------");
		System.out.println("어떤 업무를 하시겠습니까?");
		System.out.println("1. 체크인    2. 체크아웃    3. 객실상태    4. 업무종료");
		System.out.println("-----------------------------------------------------------");
		System.out.println("선택>>");
		return scan.nextInt();
	}

}

class Room {
	int number;
	String type;
	String client;

	public Room(int number, String type, String client) {
		this.number = number;
		this.type = type;
		this.client = client;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "Room [number=" + number + ", type=" + type + ", client=" + client + "]";
	}

}
