//23-11-16-7(1)
package kr.or.ddit.study06.sec06.test02;

import java.util.Scanner;


public class GetterSetterExam02 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	/*
	 * Phone 클래스에
	 * 
	 * 핸드폰번호
	 * 이름
	 * 그룹
	 * 단축키
	 * 
	 */
	
	/*
	 * 1.전화번호 추가. (필수)
	 * 2.전화번호 전체 조회. (필수)
	 * 3.전화번호 수정 (출력 후 골라서! -3,4번은 심화과제)
	 * 4.전화번호 삭제
	 * 5.종료
	 * 
	 * 파일 두개 패키지 채로 제출! 폴더이름 : test02(이성경)
	 */ 
		
		GetterSetterExam02 obj = new GetterSetterExam02();
		Phone[] arr = new Phone[10];
		int num = 0;
		while(true) {
			obj.printMenu();
			int sel = sc.nextInt();
			if(sel == 1) {
				Phone p = obj.inputPhone(); 
				arr[num++] = p;
			}
			if(sel ==2) obj.printPhone(arr);
			if(sel ==3) obj.updatePhone(arr);
			if(sel ==4) obj.deletePhone(arr);
			if(sel ==5) break;
//			else System.out.println("잘못 입력하셨습니다.");
			
		}
	}
	
	public void printMenu() {
		System.out.println("* 1. 전화번호 추가 .\r\n" + 
				"* 2. 전화번호 전체 조회 .\r\n" +
	        	"* 3. 전화번호 수정 .\r\n" +
	            "* 4. 전화번호 삭제. \r\n" +
	            "* 5. 종료");
	}
	public Phone inputPhone() { 
		Phone p = new Phone();//객체생성
		System.out.print("핸드폰 번호: ");
		p.setNumber(sc.next()); 
	
		System.out.print("이름 : ");
		p.setName(sc.next()); 
		
		System.out.print("그룹 : ");
		p.setGroup(sc.next());
		
		System.out.print("단축키:");
		p.setShortk(sc.next());
		
		return p;
	}
	public void deletePhone(Phone[] arr) {
//     	for(int i=0; i<arr.length; i++) {
//			Phone p = arr[i];
////			System.out.printf("%d. 번호 : %s  %s %s %s \n",i,p.number,p.name,p.group,p.shortk); //물음표 부분 완성하기. p.<-이게 아닐수있음!
//			 //물음표 부분 완성하기. p.<-이게 아닐수있음!
//     	}
//			int sel = sc.nextInt();
//			Phone p = arr[sel];
//			p = null; //이렇게 이용하면삭제!
	    printPhone(arr);
	    int sel = sc.nextInt() - 1;
	    arr[sel] = null;
	    System.out.println();
	
	
	}
	     	
	public void updatePhone(Phone[] arr) {
		printPhone(arr);
		System.out.println("수정할 번호를 선택하세요.");
		int sel = sc.nextInt()-1;
		Phone p = arr[sel];
		System.out.print("핸드폰 번호: ");
		p.setNumber(sc.next()); 
	
		System.out.print("이름 : ");
		p.setName(sc.next()); 
		
		System.out.print("그룹 : ");
		p.setGroup(sc.next());
		
		System.out.print("단축키:");
		p.setShortk(sc.next());
		
	}
	
	
	public void printPhone(Phone[] arr) {
		int num = 1;
		System.out.println("전화번호\t이름\t그룹\t단축키");
		for (Phone phone : arr) {
			if(phone == null) break;
			System.out.print(num+". ");
			System.out.println(phone);
			num++;
			//System.out.println(num+". "+p.getNumber() + "\t" +p.getName() +"\t"+p.get
	}		//num++;
	
}

}

