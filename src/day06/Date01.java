package day06;

import java.util.Calendar;
import java.util.Date;

public class Date01 {

	public static void main(String[] args) {
		/* 날짜 / 시간 클래스
		 * Date 클래스 => Deprecated(비권장)
		 * Calendar => Date 후속작, 추상클래스 => 객체를 생성할 수 없음.
		 * new 키워드로 객체 생성이 불가능
		 * getInstance() 메서드를 이요하여 객체를 얻어 옴 
		 */
		
		Date d = new Date();
		System.out.println(d);
//		d.getDate();
		Calendar c = Calendar.getInstance(); // 오늘 날짜
		System.out.println(c);
		System.out.println("---------------");
		// month 0 ~ 11 +1 표현
		int year = c.get(Calendar.YEAR);
		System.out.println(year);
		int month = c.get(Calendar.MONTH) + 1;
		System.out.println(month);
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		int week = c.get(Calendar.DAY_OF_WEEK);
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int AmPm = c.get(Calendar.AM_PM);
		// 일 = 1...
		System.out.println(week);
		System.out.println(year+"-"+month+"-"+day);
		
		// 2024-10-7(월) 오후 3:51
		int num = c.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		char sun = ' ';
		String am_pm = AmPm == 1 ? "오후" : "오전";
		switch(num) {
		case 1: sun = '월'; break;
		case 2: sun = '화'; break;
		case 3: sun = '수'; break;
		case 4: sun = '목'; break;
		case 5: sun = '금'; break;
		case 6: sun = '토'; break;
		case 7: sun = '일'; break;
		default: System.out.println("error");
			
		}
		System.out.println(year+"-"+month+"-"+day+"("+sun+") "+am_pm+" "+hour+":"+minute);
		
		
		
	}

}
