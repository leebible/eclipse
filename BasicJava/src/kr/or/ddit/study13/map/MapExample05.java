package kr.or.ddit.study13.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MapExample05 {

	public static void main(String[] args) {
		MapExample05 obj = new MapExample05();
		obj.process();
		
	}
	//a. 전체 출력 메소드 만들어보기 list for문으로 꺼내는건 iterator
	private void process() {
		List<Map<String, Object>> data = dataInput();
//		for(int i=0; i<data.size(); i++) {
//			System.out.println(data.get(i));
//		}
		System.out.println("전체 조회");
		printEmpNo(data);
//		printList(data);
//		int sum = sumSalary(data);
		System.out.print("제일 높은 급여 금액:");
		maxSalary(data);
		
		System.out.print("급여 총합을 알고 싶은 부서명을 입력하세요.(영업부,기획부,총무부 中) : ");
		sumSalary(data);

		System.out.println("emp_no를 입력하세요 :");
		allMember(data);
		
		
		}
	
		private void printEmpNo(List<Map<String, Object>> data) {
			int select = sc.nextInt();
			for(int i=0; i<data.size(); i++) {
				Map<String,Object> map = data.get(i);
				int emp_no = (int) map.get("emp_no");
				if(emp_no == select) continue;
				
				Iterator<String> it = map.keySet().iterator();
				while(it.hasNext()) {
					String key = (String) it.next();
					System.out.println(map.get(key)+"\t");
				}
			}
	}
		
		
		private void allMember(List<Map<String, Object>> data) {
			int select = sc.nextInt();
			for(int i=0;i<data.size(); i++) {
				Map<String,Object> map = data.get(i);
				int emp = (int) map.get("emp_no");
				if(emp==select) {
					System.out.println(data.get(i));
					break;
				}
			}
		}
		
		
		

		//for문 이용, (get, salary) 월급에서 max값 구하기
//		max<salary
//		max = salary
//	    500이 될때까지 돌 예정	
		
		
		//c. 입력된 부서 salary 총합 구해보기
//		dept 값 equals로 비교하기
		
		
		//d. 입력된 emp_no정보 전체 출력해보기 (생략해도됨..?)
		
		 
	
	
	Scanner sc = new Scanner(System.in);
	private int sumSalary(List<Map<String, Object>> data) {
		int sum = 0;
		String select = sc.next();
		for(int i=0;i<data.size(); i++) {
			Map<String,Object> map = data.get(i);
			String dept = (String) map.get("dept");
			if(!dept.equals(select)) continue;
			int salary = (int) map.get("salary");
			sum+=salary;
		}
		return sum;
	}

//	b. 월급 제일 많은 사람 정보 출력 해보기 (max만 구하기)
	private int maxSalary(List<Map<String, Object>> data) {
		int max = 0;
		for(int i=0;i<data.size(); i++) {
			Map<String,Object> map = data.get(i);
			int salary = (int) map.get("salary");
			if(max<salary) {
				max = salary;
			}
		}	
		return max;
	}
////
	private void printList(List<Map<String, Object>> data) {
		for(int i=0;i<data.size(); i++) {
			Map<String,Object> map = data.get(i);
			Iterator<String> it = map.keySet().iterator();
			while(it.hasNext()) {
				//emp_no, emp_name, dept, tel, salary <-키값 꺼내옴
				String key = (String) it.next();
				System.out.print(map.get(key)+"\t");
				for(int i1=0;i1<4;i1++) {
				System.out.println();
				}
		}
	}
	}

	public List<Map<String, Object>> dataInput() {
		
		List<Map<String, Object>> list = new ArrayList();
		Map<String, Object> m1 = new HashMap();
		m1.put("emp_no", 100);
	    m1.put("emp_name","장승수");
	    m1.put("dept","영업부");
	    m1.put("tel","010-8422-8117");
	    m1.put("salary",300);

	    Map<String, Object> m2 = new HashMap();
	    m2.put("emp_no", 101);
	    m2.put("emp_name","홍성범");
	    m2.put("dept","기획부");
	    m2.put("tel","010-7562-3217");
	    m2.put("salary",350); 
	    
	    Map<String, Object> m3 = new HashMap();
	    m3.put("emp_no", 102);
	    m3.put("emp_name","이민수");
	    m3.put("dept","기획부");
	    m3.put("tel","010-5562-6677");
	    m3.put("salary",500); 
	    
	    Map<String, Object> m4 = new HashMap();
	    m4.put("emp_no", 103);
	    m4.put("emp_name","강나미");
	    m4.put("dept","영업부");
	    m4.put("tel","010-4442-5614");
	    m4.put("salary",350); 
	    
	    Map<String, Object> m5 = new HashMap();
	    m5.put("emp_no", 109);
	    m5.put("emp_name","민병철");
	    m5.put("dept","총무부");
	    m5.put("tel","010-2542-8211");
	    m5.put("salary",500); 
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);
		
//		int emp_no = (int) m1.get("emp_no");
//		String emp_name = (String) m1.get("emp_name");
//		List<Map<String, Object>> data = dataInput();
//		for(int i=0; i<data.size(); i++) {
//			System.out.println(data.get(i));
		return list;
		}
	}
