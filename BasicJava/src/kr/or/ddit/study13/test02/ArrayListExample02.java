// 2023-11-22

package kr.or.ddit.study13.test02;

import java.util.ArrayList;
import java.util.Scanner;

import kr.or.ddit.study06.sec06.test03.Prod;
	
public class ArrayListExample02 {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayListExample02 ale = new ArrayListExample02();
			ale.process();
		}
		
		private void process() {
			/*
			 * n명의 국어 영어 수학 점수를
			 * 리스트를 이용해 선언 및 값을 저장 하세요.
			 * 
			 * Student 클래스 만들어서 리스트에 넣을것.
			 * 
			 */ 
			ArrayList list = new ArrayList();
			for(int i=0; i<list.size(); i++) {
			Student s = (Student)list.get(i);
			}
		END : while(true) {	
			printMenu();
			int select = sc.nextInt();
			switch(select) {
			case 1 : 
				Student s1 = insertStudent();
//				list.add(s);
				break;
			case 2 :
				printStudent(list);
				break;
			case 3:
				updateStudent(list);
				break;
			case 4:
				deleteStudent(list);
				break;
			case 5:
				break END;
			default :
				System.out.println("잘못 입력 되었습니다.");
				break;
			
			}
		}
	}
				
		
		public void printStudent(ArrayList list) {
				System.out.println("No\t|학생이름\t|국어점수\t|수학점수 \t|영어점수\t|총점\t|평균\t|순위");
				for(int i=0; i<list.size(); i++) {
					Student s = (Student) list.get(i);
					System.out.println(i+"."+s);
				}
		}
		
		public Student insertStudent() {
			System.out.println("이름을 입력하세요.");
			String name = sc.next();
			System.out.println("국어 점수를 입력하세요.");
			int kor = sc.nextInt();
			System.out.println("영어 점수를 입력하세요.");
			int eng = sc.nextInt();
			System.out.println("수학 점수를입력하세요.");
			int math = sc.nextInt();
			return new Student(name, kor, eng, math);
		}
			/*
			 * 1. 학생추가
			 * 2. 학생 조회
			 * 3. 학생 수정
			 * 4. 학생 삭제 
			 */
		public Student updateStudent(ArrayList list) {
			printStudent(list);
			System.out.println("수정할 학생정보를 선택하세요.");
			int sel = sc.nextInt()-1;
//			Student s = arr[sel];
			System.out.println("학생이름 :");
			String name = sc.next();
			
			System.out.println("국어점수 :");
			int kor= sc.nextInt();
			
			System.out.println("영어점수 :");
			int eng= sc.nextInt();
			
			System.out.println("수학점수 :");
			int math= sc.nextInt();
			return new Student(name, kor, eng, math);
			
	}
		
		public void deleteStudent(ArrayList list) {
				printStudent(list);
				System.out.println("삭제할 학생번호를 선택해 주세요.");
				int no = sc.nextInt();
				int index = sc.nextInt();
				Student student = (Student) list.remove(index);
				System.out.println("삭제 완료 되었습니다.");
//				System.out.println(s);
		}
		
		
			public void printMenu() {
				System.out.println("* 1. 학생추가 .\r\n" + 
						"* 2. 학생 조회.\r\n" +
			        	"* 3. 학생 수정.\r\n" +
			            "* 4. 학생 삭제. \r\n" );
			}
			
	
	}

