package kr.or.ddit.basic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class PhoneBookTest {
	HashMap<String, Phone> pb = new HashMap<String, Phone>();
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new PhoneBookTest().phoneStart();
	}

	private void phoneStart() {
		while(true) {
			int sel = Menu();
			switch(sel) {
			case 1: //등록
				insert();
				break;
			case 2: //수정
				update();
				break;
			case 3: //삭제
				remove();
				break;
			case 4: //검색
				search();
				break;
			case 5: //전체 출력
				printlist();
				break;
			case 0: //종료
				System.out.println();
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				break;
			}
		}
		
	}
	private void search() {
		System.out.print("검색할 이름 : ");
		String searchName = sc.next();
		
		Phone phone = pb.get(searchName);
		if(phone !=null) {
			System.out.println("----------------------------------------");
			System.out.println("이름\t전화번호\t\t주소");
			System.out.println("----------------------------------------");
			System.out.println(phone.getName() + "\t" + phone.getTel() + "\t" + phone.getAddr());
		}else {
			System.out.println("전화번호 정보가 없습니다.");
		}
		}
	
	private void update() {
		System.out.print("수정할 이름: ");
		String updateName = sc.next();
		Phone updatePhone = pb.get(updateName);
		
		if(updatePhone != null) {
			System.out.print("새로운 전화번호 : ");
			String updateTel = sc.next();
			System.out.print("새로운 주소  : ");
			String updateAdd = sc.next();
			
			updatePhone.setTel(updateTel);
			updatePhone.setAddr(updateAdd);
			System.out.println();
		}
		else
		 System.out.println("해당 정보가 없습니다.");
	}
	private void remove() {
		System.out.print("삭제할 이름: ");
		String deletename = sc.next();
		Phone deletePhone = pb.get(deletename);
		
		if(deletePhone!=null) {
		Phone dp = pb.remove(deletename);
		System.out.println("삭제가 완료되었습니다.");
		}
		else
			System.out.println("해당 정보가 없습니다.");
	}
	
	private void insert() {
		System.out.println("새롭게 등록할 전화번호 정보를 입력하세요. ");
		
		System.out.print("이름 >> ");
		String name = sc.next();
		boolean tf = pb.containsKey(name);
		if(tf == true) System.out.println("'"+name+"'은 이미 등록된 사람입니다.");
		if(tf == false) {
		System.out.print("전화번호 >> ");
		String tel = sc.next();
		
		System.out.print("주소 >> ");
		String address = sc.next();
		
		
		Phone np = new Phone(name,tel,address);
		pb.put(np.getName(),np);
		System.out.println("'"+name+"' 전화번호 등록 완료!!");
		}
		}
		
	private void printlist() {
		System.out.println("----------------------------------------");
		System.out.println("번호\t이름\t전화번호\t\t주소");
		System.out.println("----------------------------------------");
		int i=0;
		for(Phone value : pb.values()) {
			i++;
			System.out.print(i+"\t");
			System.out.println(value);
		}
		System.out.println("----------------------------------------");
		System.out.println("출력 끝");
	}
	
	
	private int Menu() {
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
		return sc.nextInt();
	}
	
}

 class Phone{
	private String name;
	private String tel;
	private String address;
	
	public Phone(String name, String tel, String address) {
		this.name = name;
		this.tel = tel;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddr() {
		return address;
	}
	public void setAddr(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return  name + "\t" + tel + "\t" + address;
	}
	
	
}