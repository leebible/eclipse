//23-11-24-금

package kr.or.ddit.study11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class DateExample {
	boolean debug = true;
	public static void main(String[] args) {
		DateExample de = new DateExample();
//		de.dateMethod1();
//		de.dateMethod2();
//		de.dateMethod3();
//		de.dateMethod4();
//		de.dateMethod5();
//		de.dateMethod6();
		
	}
	
	private void dateMethod6() {
		Calendar cal = Calendar.getInstance(); //싱글톤..?
//		cal.set(Calendar.YEAR, 1990);
//		cal.set(Calendar.MONTH, 11); // 0 Jan 1 Feb ..0부터 시작함
//		cal.set(Calendar.DATE, 1); 
		cal.set(Calendar.DATE, 2); 
		
		int day = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(day);
		
		cal.add(Calendar.DATE, -10);
		cal.add(Calendar.YEAR, 0);
		cal.add(Calendar.HOUR, 0);
		cal.add(Calendar.MINUTE, 0);
	
		Date date = cal.getTime();
		System.out.println(date);
	}

	private void dateMethod5() {
		Date date = new Date();
		long time = date.getTime()+86400l*1000*100;
		Date add = new Date(time);
//		System.out.println(add);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
//		String date1 = sdf.format(add);
		System.out.println(sdf.format(add));
		
		
		//2023.12.01 <- 출력 되도록 해볼것.
	}

	private void dateMethod4() { // 실수할 확률 적음
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm");
		Date date = new Date();
		System.out.println(date);
		String date_Str = sdf.format(date);
		System.out.println(date_Str);
	}

	private void dateMethod3()   { //실수할 확률이 높기에 try catch문(에러체크용) 생성 
		String dateStr = "2023-11-24 09:00";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
	
		try {
			Date date = sdf.parse(dateStr);
			Date cur = new Date();
			long time = cur.getTime() - date.getTime();
			int min = (int)(time/1000/60);
			System.out.println(min + "분 지각입니다.");
			
		}catch (ParseException e) {
			e.printStackTrace();
		}
		
		
	}
	

	private void dateMethod2() {
		String dateStr = "2023-11-24";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			//어제 시간
			Date yesterDay = sdf.parse(dateStr);

			//현재 시간
			Date date = new Date();
			System.out.println(yesterDay);
			// 1일 10시간 30분 15초 형태로 나타내 볼것

			long time = (date.getTime() - yesterDay.getTime())/1000;
			int day = 60*60*24;
			int days = (int)time/day;
			time = time%day;
			System.out.println(days+"일");
		
			int hour = 60*60;
			int hours = (int)time/hour;
			time = time%hour;
			System.out.println(hours+"시간, ");

			int min = 60;
			int mins = (int)time/min;
			time = min%min;
			System.out.println(mins+"분, ");
			System.out.println(time+"초 ");
			
			System.out.println(time);
			
		
		} catch (ParseException e) {
			e.printStackTrace();
		}
	
	}	

	public void dateMethod1() {
		if(debug)System.out.println("dateMethod1");
		
		Date d1 = new Date();
		System.out.println("현재 시간");
		System.out.println(d1);
		
		try {
		Thread.sleep(1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		Date d2 = new Date();
		System.out.println(d2);
		// 1970년 부터 현재까지 진행된 시간.
		System.out.println(d2.getTime());
		System.out.println(d1.getTime());
		
		long time = d2.getTime() - d1.getTime();
		System.out.println(time+"ms");
	}
}
