package kr.or.ddit.basic;

import java.util.HashSet;
import java.util.Objects;

public class EqualHashCodeTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setNum(1); //p1. <- p1(참조변수)이 가리키는 영역을 찾아라
		p1.setName("홍길동");
		
		Person p2 = new Person();
//		p2.setNum(2);
//		p2.setName("이순신");
		p2.setNum(1);
		p2.setName("홍길동");
		
		Person p3 = p1;
		
		//true or false?
		System.out.println(p1 == p2); //p1변수에 들어있는 주소값 p2에 들어있는 주소값 비교
		System.out.println(p1 == p3); 
		System.out.println();
		
		System.out.println(p1.equals(p2)); 
		//Person에는 없지만 equals를 쓸수 있었던 이유! : equals라는 메소드는 Object 클래스에 구현이 되어 있음 
		//자바의 모든 객체는 Object를 상속받게 되있다.
		//Object클래스에 구현되어있는 equals는..
		//??도 상속받았는데 값을 비교할수 있도록 재정의한것이다
		System.out.println(p1.equals(p3));
		System.out.println("--------------------------------");
		
		HashSet<Person> testSet = new HashSet<Person>();
	
		
		testSet.add(p1);
		testSet.add(p2);
		System.out.println("set의 개수 :" + testSet.size());
		
		System.out.println("p1=> " + p1.hashCode()); 
		//hashcode라는 메소드를 Set에서 처리할때는 equals로 비교한다....
		System.out.println("p2=> " + p2.hashCode());
		System.out.println("p3=> " + p3.hashCode());
		
		
	}	
}

/*
 - equals()메서드 ==> 두 객체의 내용이 같은지를 비교하는 메서드
 - hashCode()메서드 ==> 두 객체가 같은 객체인지를 비교하는데 사용되는 메서드
 
 - HashMap, Hashtable, HashSet과 같이 Hash로 시작하는 컬렉션 객체들은 
 객체의 의미상 같은지 비교를 위해 hashCode()메서드를 호출하여 비교한다.
 그래서 객체가 같은지 여부를 결정하려면 equals()메서드와 hashCode()메서드를 같이 재정의해야 한다.
 
 - hashCode()메서드에서 사용하는 '해싱 알고리즘'은 서로 다른 객체들에 대해 
 같은 hashCode 값을 만들어 낼 수 있다.
 //비트코인 해싱알고리즘은 자바에서 쓰는 해싱알고리즘보다 훨씬 복잡하다.
      
 */



class Person{ //extends Object 가 생략되어있음
	// 객체는 상속을 한개만 받을수 있음
	// 인터페이스는 무한대로 쓸수 있음
	// 따로 생성자를 만들지 않으면 기본생성자가 만들어짐
	public Person() {
	} //자동으로 만들어지는 생성자 (자동으로 생성되나 보이진 않음)

	private int num;
	private String name;
	
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
	
	@Override
	public int hashCode() { //equals를 적용하지 않고 만든 함수. (alt+shift+s로 자동생성)
		//요즘방식 : 	return Objects.hash(num,name); 
		//예전방식
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + num;
		return result;
	}
	@Override
	public boolean equals(Object obj) { //(alt+shift+s로 자동생성)
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) { //예전방식. 요즘방식 : Objects.equals(this.name, that.name);
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (num != other.num)
			return false;
		return true;
	}
	

	
	
	//객체를 생성하면 클래스가 가지고 있는 멤버변수들이 만들어지는데 this라는 변수가 들어감.
	//this에는 자기자신의 참조값이 들어감
	//this.num = num;<-이
	
	//ctrl+space 후 equals 클릭하면 equals를 재정의 할 수 있다.
//	@Override
//		public boolean equals(Object obj) {  //equals 재ㅓㅈㅇ의
//		//obj에는 어떤종류의 객체도 다 올 수 있다. 
//		//p1.equals(p2) : p2는 equals(Object obj)의 obj이고 p1은 자기 자신(person객체)이다.
//			if(this == obj) return true;//거짓이라면 둘의 참조값이 같지 않다는 것
//			if(obj == null) return false;
//			
//			//같은 유형의 클래스인지 검사
//			if(this.getClass()!=obj.getClass()) return false;
//			
//			// 매개변수의 객체를 현재의 객체 유형으로 형변환 한다.
//			Person that = (Person)obj; //obj를 저장하는데 Person형태로 저장
//			
//			
//			// 멤버 변수의 값들을 비교한다.
//			return this.num == that.num && Objects.equals(this.name, that.name);
//											//Objects라는 라이브러리가 존재함
//		}

//		@Override
//			public int hashCode() { //해시코드 재정의
//			
//				return Objects.hash(num,name); //두 값이 같으면 해시코드가 같아지는것
//			}
//	
}
