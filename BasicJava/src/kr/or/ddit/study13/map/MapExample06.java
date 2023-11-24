package kr.or.ddit.study13.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MapExample06 {
	public static void main(String[] args) {
		MapExample06 me = new MapExample06();
		me.process();
	}

	private void process() {
		List<Map<String, Object>> data = dataInput();
		System.out.println("차량 번호를 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		String carNumber = sc.next();
		
		//차 번호를 입력 했을때 주차한 시간을 구하기
		int min = getMin(carNumber,data);
		System.out.println("차량번호  '"+carNumber + "'는  " + min + "분 주차하였습니다.");
		int price = getPrice(min);
		System.out.println("차번호 " + carNumber+" 의 주차요금은  " + price + "원 입니다.");
		
//		String str = "05:34";
//		String str2 = "07:59";
//		int time = getTime(str2) - getTime(str);
		
//		String h1 = str.split(":")[0];
//		String m1 = str.split(":")[1];

		//주차한 시간을 구한 후 요금 정산하기.
		
		
		
	}
	private int getPrice(int min) {
		
		//180분 이내 5000원
		if(1<=min && min<=180) return 5000;
		//180분 이상일때 10분당 600원
		else if(min>180) return 5000+600*(min-180)/10;
		else return 0;
// 선생님 답
//		min = min-180;
//		min = min/10;
//		
//		return 5000+min*600;
	}

	private int getMin(String carNumber, List<Map<String,Object>> data) {

		String temp = "";
		int sum = 0;
		for(int i=0; i<data.size(); i++) {
			Map<String, Object> map = data.get(i);
			String number = (String) map.get("number");
			if(!number.equals(carNumber)) continue;
			
			String inout = (String) map.get("inout");
			if(inout.equals("입차")) {
				temp = (String) map.get("time");
			}
			if(inout.equals("출차")) {
			  String out = (String) map.get("time");
			  int time = getTime(out) - getTime(temp);
			  sum+=time;
			}
			
		 	System.out.println(map);
 		}
		return sum;
	}
	
	public int getTime(String time) {
		String h1 = time.split(":")[0]; //0은 앞
		String m1 = time.split(":")[1]; //1은 뒤
		
		return Integer.parseInt(h1) * 60 + Integer.parseInt(m1);
	}
		
		
	
	public List<Map<String,Object>> dataInput() {
		List<Map<String,Object>> list = new ArrayList();
		Map<String,Object> m1 = new HashMap();
		m1.put("time", "05:34");
		m1.put("number", "5961");
		m1.put("inout", "입차");

		Map<String,Object> m2 = new HashMap();
		m2.put("time", "06:00");
		m2.put("number", "0000");
		m2.put("inout", "입차");
		
		Map<String,Object> m3 = new HashMap();
		m3.put("time", "06:34");
		m3.put("number", "0000");
		m3.put("inout", "출차");
		
		Map<String,Object> m4 = new HashMap();
		m4.put("time", "07:59");
		m4.put("number", "5961");
		m4.put("inout", "출차");
		
		Map<String,Object> m5 = new HashMap();
		m5.put("time", "07:59");
		m5.put("number", "0148");
		m5.put("inout", "입차");
		
		Map<String,Object> m6 = new HashMap();
		m6.put("time", "18:59");
		m6.put("number", "0000");
		m6.put("inout", "입차");
		
		Map<String,Object> m7 = new HashMap();
		m7.put("time", "19:09");
		m7.put("number", "0148");
		m7.put("inout", "출차");
		
		Map<String,Object> m8 = new HashMap();
		m8.put("time", "22:59");
		m8.put("number", "5961");
		m8.put("inout", "입차");
	
		Map<String,Object> m9 = new HashMap();
		m9.put("time", "23:00");
		m9.put("number", "5961");
		m9.put("inout", "출차");
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);
		list.add(m6);
		list.add(m7);
		list.add(m8);
		list.add(m9);

		return list;
	}
	
}
