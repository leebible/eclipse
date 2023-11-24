package kr.or.ddit.study11.homework;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class HomeworkCalendar {
	public static void main(String[] args) {
		HomeworkCalendar obj = new HomeworkCalendar();
		obj.process();
	}

	private void process() {
		/*
		 * 년 월을 스캐너를 통해 입력 받고 달력을 출력해 볼 것.
		 * 다음달, 이전달
		 */
//		이전달 , 다음달  add(Calendar.???)
		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		System.out.println("연도를 입력하세요.");
		cal.set(Calendar.YEAR,sc.nextInt());
		System.out.println("월을 입력하세요.");
		cal.set(Calendar.MONTH,sc.nextInt()-1);
		cal.set(Calendar.DATE, 1);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.print(" 오늘은 몇요일? : ");
		System.out.println(week); 
		
		int dayOfMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.print("입력된 달의 끝날짜 : ");
		System.out.println(dayOfMonth);
		
		
		System.out.print("전체 출력:");
		Date date = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		System.out.println(sdf.format(date));
		
		System.out.println("일"+"\t"+"월"+"\t"+"화"+"\t"+"수"+"\t"+"목"+"\t"+"금"+"\t"+"토"+"\t");
		
		for(int i=1; i<week; i++) {
			System.out.print("\t");
		}
		
		for(int i=1; i<=dayOfMonth; i++) {
				System.out.print(i + "\t");
				if(i==(8-week)) { //i==4
					System.out.println("\n");
				}else if((week)%7==0) System.out.println("\n");
				week++;	
		}
				
				
	}
}
