package kr.or.ddit.basic;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListSortTest02 {
	public static void main(String[] args) {
		ArrayList<Member> memList = new ArrayList<Member>();
		
		memList.add( new Member(1, "홍길동", "010-1111-1111"));
		memList.add( new Member(5, "이순신", "010-2222-1111"));
		memList.add( new Member(9, "성춘향", "010-3333-1111"));
		memList.add( new Member(3, "강감찬", "010-4444-1111"));
		memList.add( new Member(6, "일지매", "010-5555-1111"));
		memList.add( new Member(2, "변학도", "010-6666-1111"));
		
		System.out.println("정렬 전 ");
		for(Member mem : memList) {
			System.out.println(mem);
		}
		System.out.println("--------------------------------");
		Collections.sort(memList);
		//sort에 에러가 나는 이유? member라고하는 객체에 내부정렬기준이 있어야함.
		//public int compareTo(Member mem) 만들어줌.
		
		System.out.println("정렬 후 " );
		for(Member mem : memList) {
			System.out.println(mem);
		}
		System.out.println();
		
		System.out.println("정렬 전 ");
		for(Member mem : memList) {
			System.out.println(mem);
		}
		System.out.println("--------------------------------");
		
		// Member의 회원번호를 내림차순으로 정렬하는 외부 정렬 클래스를 작성하고
		// 이 외부 정렬 기준을 적용해서 출력하시오. (클래스명 : SortNumDesc)
		Collections.sort(memList, new SortNumDesc());
		
		System.out.println("정렬 후 :" + memList);
		for(Member mem : memList) {
			System.out.println(mem);
		}
		System.out.println();
	}
	
}

class SortNumDesc implements Comparator<Member>{
	//회원번호를 내림차순으로 정렬하는 기준 만들기
	@Override
	public int compare(Member m1, Member m2) {
/* 성경:	return m2.getNum() - m1.getNum(); */
/*선생님1: if(m1.getNum() > m2.getNum()) {
			return -1;
		}else if(m1.getNum() < m2.getNum()) {
			return 1;
		}else {
			return 0;
		} */
/*선생님2:  Wrapper클래스 이용하기 방법1 
		return new Integer(m1.getNum()).compareTo(m2.getNum())*-1; 내림차순이니 -1을 곱해줘서 부호 바꾸기 */
/*선생님3:  Wrapper클래스 이용하기 방법2 */
		return Integer.compare(m1.getNum(),m2.getNum()) * -1;
		
	}
	
}

//Member 클래스 작성 ==> 회원 이름을 기준으로 오름차순이 되도록 내부 정렬 기준을 추가해 보기
//				 ==> Comparable 인터페이스를 구현해야 한다.
class Member implements Comparable<Member>{
	private int num; 	 //회원번호
	private String name; //회원이름
	private String tel;  //전화번호
	
	//생성자
	public Member(int num, String name, String tel) {
		super();
		this.num = num;
		this.name = name;
		this.tel = tel;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
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

	@Override
	public String toString() {
		return "Member [num=" + num + ", name=" + name + ", tel=" + tel + "]";
	}

	// 회원 이름의 오름차순 정렬 기준 만들기
	@Override
	public int compareTo(Member mem) {
			//비교대상 : 1.클래스 자신(this.)
//		if(this.getName().compareTo(mem.getName()) > 0) {
//			retu-rn 1;
//		}else if(this.getName().compareTo(mem.getName()) < 0) {
//			return -1;
//		}else {
//			return 0;
//		}
		
		return this.getName().compareTo(mem.getName()); //위 주석처리한대로 써도 되고 이렇게 한줄로도 가능
	}
	
	
	
}