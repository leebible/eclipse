package kr.or.ddit.study02.homework;

import java.util.Date;

public class HomeWork1 {
	public static void main(String[] args) {
		Date date = new Date();
		long time = date.getTime() / 1000;
		/*
		 * date란 객체는 1970년 기준 시간으로 부터 지난시간을 가져옵니다. 오늘 날짜는 1970년 기준 시간을 기준으로 현재
		 * 
		 * 몇년 몇월 몇일이... 몇초가 지났는지 출력해보세요.
		 */
//		int sec = 1;
//		int min = sec * 60;// 1*60= 60초
//		int hour = min * 60; // 60*60= 3600초
//		int day = hour * 24; // 60*60*24=86400초
//		int year = day * 365;// 60*60*24*365=31,536,000초
//		System.out.println(day);
////	
//		
//		int years = (int) (time / year);
//		System.out.println(years+"년이 지났습니다");
//
//		int days = (int) (time / day) - (years * 365);
////		System.out.println(days + "일이 지났습니다");
//
//		int hours = (int) (time / hour) - (years * 365 * 24) - (days * 24);
////		System.out.println(hours + "시간이 지났습니다");
//
//		int mins = (int) (time / min) - (years * 365 * 24 * 60) - (days * 24 * 60) - (hours * 60);
////		System.out.println(mins + "분이 지났습니다");
//
//		int secs = (int) (time / sec) - (years * year) - (days * day) - (hours * hour) - (mins * min);
////		System.out.println(secs + "초가 지났습니다");
//
////	    int secs = (int)(time/sec)-(years*365*24*60*60)-(days*24*60*60)-(hours*60*60)-(mins*60);
////	    System.out.println(secs+"초가 지났습니다");
//
//		System.out.println(years + "년 " + days + "일 " + hours + "시간 " + mins + "분 " + secs + "초가 지났습니다.");

		int min = 60;
		int hour = min*60;
		int day = hour*24;
		int year = day*365;

		int years = (int) (time/year);
		time = time%year;
	
		int days = (int) (time/day);
		time = time%day;

		int hours = (int) (time/hour);
		time = time%hour;
	
		int mins = (int) (time/min);
		time = time%min;
		
		int secs = (int) time;
		System.out.println("1970년 부터 "+years+"년"+days+"일"+hours+"시간"+mins+"분"+secs+"초가 지났습니다.");
		
		
	
		
	}
}


