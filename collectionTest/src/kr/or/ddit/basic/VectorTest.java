package kr.or.ddit.basic;

import java.util.Vector;

public class VectorTest {
	public static void main(String[] args) {
		//Vector는 자바의 초기부터 지원하는 객체로 동기화 처리가 되어 있다.
		//객체 생성
		Vector v1 = new Vector();
		System.out.println("처음 크기 : " + v1.size());
		
		/*데이터 추가하기 1: add(추가할 데이터)
				==> 반환값 : 추가성공(true), 추가실패(false) */
		
		v1.add("aaaa");
		System.out.println("현재 크기 : " + v1.size());
		
		v1.add(new Integer(111)); // 숫자의 객체화 방법(1)
		v1.add(Integer.valueOf(200)); // 숫자의 객체화 방법(2)
		//예전에는 필수로 위 두가지방법을 썼어야했지만
		
		v1.add(123); //boxing : 일반데이터를 객체화시켜주는 작업 
		//요즘은 위와같이 써도 자동으로 객체화 시켜줌 : auto boxing ==> auto unboxing
		v1.add('a');
		v1.add(true);
		
		boolean r = v1.add(3.14); 
		
		System.out.println("반환값 =>" + r);
		System.out.println("현재 크기 : " + v1.size());
 		
		/*데이터 추가하기 2 : addElement(추가할 데이터) add랑 똑같은기능. 옛날에 씀.
		        ==>  이전 버전의 프로그램과의 호환성을 위해서 남아 있는 메서드*/
		v1.addElement("CCC");
		System.out.println("v =>" +v1.toString());
		System.out.println("v =>" +v1); //toString() 생략가능
		
		/*데이터 추가하기 3 : add(index, 데이터)
		        ==> 'index' 번째에 '데이터'를 끼워 넣는다. */
		v1.add(1,"KKK");
		System.out.println("v1 =>" + v1);
		
		/* 데이터 꺼내오기 get(index)
		       ==> 'index'번째의 데이터를 꺼내서 가져오기 */
		System.out.println("0번째 데이터 : " + v1.get(0));
		int iTemp = (int) v1.get(2);
		System.out.println("2번째 데이터: " + iTemp);
		
		/* 데이터 수정하기 : set(index, 새로운 데이터)
		         ==> 'index'번째의 데이터를 '새로운 데이터'로 변경한다.
		         ==> 반환값 : 변경되기 전의 원래의 데이터  */
		
		String sTemp = (String) v1.set(0, "zzzz");
		System.out.println("V1=>" + v1);
		System.out.println("원래의 데이터 : " + sTemp);
		
		/* 데이터 삭제하기1 : remove(index)
		         ==> 'index'번째의 데이터를 삭제한다. 
		         ==> 반환값 : 삭제된 데이터  */
		v1.remove(0);
		System.out.println("v1 => " + v1);
		
		iTemp = (int)v1.remove(2);
		System.out.println("삭제 후 v1 => " + v1);
		System.out.println("삭제된 데이터 => " + iTemp);
		System.out.println();
		
		/* 데이터 삭제하기 2 : remove(삭제할데이터)
		       ==> '삭제할 데이터'를 찾아서 삭제한다.
		       ==> '삭제할 데이터'가 여러개면 이 중에 제일 첫번째로 검색된 자료가 삭제된다.
		       ==> 반환값 : 삭제 성공(true), 삭제실패(false) 
		       ==> '삭제할 데이터'가 '정수형'이거나 'char형'일 경우에는 반드시
		            객체로 변환해서 사용해야 한다.*/
		
		v1.remove("CCC");
		System.out.println("CCC 삭제 후 v1 => " + v1);
		
//		v1.remove(123); //오류가 나는 이유 : 인덱스로 인식, 객체화 해야함
//		v1.remove(new Integer(123)); //객체화 방법1 ==> 1.9버전부터는 비추천
		v1.remove(Integer.valueOf(123)); //객체화 방법2
		System.out.println("123 삭제 후 v1 => " + v1);
		
//		v1.remove('a'); //char형은 실제 값이 저장될때는 소문자 a의 코드값(97)으로 저장
		v1.remove(Character.valueOf('a'));
		System.out.println("a 삭제 후 v1 => " + v1);
		
		v1.remove(true);
		v1.remove(3.14);
		System.out.println("삭제후 v1 => " + v1);
		
		//전체 데이터 삭제하기 : clear();
		v1.clear();
		System.out.println("clear 삭제 후 v1 => " + v1);
		System.out.println("----------------------------------");
		
		/*
	        제네릭 타입(Generic Type) ==> 클래스 내부에서 사용할 데이터의 타입을
	        객체를 생성할때 외부에서 지정해주는 기법으로 객체를 선언할 때 <> 괄호 안에 그 객체의
	        내부에서 사용할 데이터의 타입을 지정해 주는것을 말한다.
	        
	    - 이런식으로 선언하게 되면 그 지정한 데이터 타입 이외의 다른 종류의 데이터를 저장할 수 없다.
	    - 이 때 제네릭으로 선언 될 수 있는 데이터 타입은 '클래스형'으로 지정해야 한다.
	         그래서 int는 Integer, boolean은 Boolean, char는 Character 등으로 대체해서 
	         사용해야 한다.
		 */
		
		Vector<Integer> v2 = new Vector<Integer>(); //int형 자료만 저장할 수 있는 Vector
		Vector<String> v3 = new Vector<String>(); //String형만 저장할 수 있는 Vector
		
		v3.add("안녕하세요");
//		v3.add(100);	// 오류 : 다른 종류의 데이터를 저장할 수 없다.
		
		String sTemp2 = v3.get(0);
		
		Vector<Vector> vv = new Vector<Vector>(); //배열로 보면 2차원배열과 비슷
		Vector<Vector<Vector>> vvv = new Vector<Vector<Vector>>(); //3차원 배열과 비슷
		System.out.println("----------------------------------");
		
		v3.clear();
		System.out.println("v3의 size => "+ v3.size());
	
		v3.add("AAA");
		v3.add("BBB");
		v3.add("CCC");
		v3.add("DDD");
		v3.add("EEE");
		
		Vector<String> v4 = new Vector<String> ();
		v4.add("BBB");
		v4.add("DDD");
		
		System.out.println("v3 => " + v3);
		System.out.println("v4 => " + v4);
	
		/* 데이터 삭제하기 3 : removeAll(Collection 객체);
			    ==> Vector의 데이터 중에서 'Collection객체'가 가지고 있는 모든 데이터를
			               삭제한다.
			    ==> 반환값 : 성공(true), 실패(false)  */
		v3.removeAll(v4);
		System.out.println("v3 => " + v3);
	
		// 벡터의 데이터 전체를 순서대로 가져와 사용하려면 반복문을 이용한다. (주로 for문 사용)
		v3.clear();
		v3.add("AAA");
		v3.add("BBB");
		v3.add("CCC");
		v3.add("DDD");
		v3.add("EEE");
		
		for(int i=0; i<v3.size(); i++) {
			System.out.println(i + "번째 데이터 : " + v3.get(i));
		}
		System.out.println();
		
		//향상된 for문
		for(String str : v3) { //컬렉션 뿐만 아니라 배열도 넣어서 가능
			System.out.println(str);
		}
	
	
	
	
	}
}
